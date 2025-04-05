package sample.application;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.RowConstraints;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.stage.Stage;


public class FinalController {


    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button ConfirmButton;

    @FXML
    private TextField FinalPriceTxtField;

    @FXML
    private GridPane ItemAndPriceGrid;

    @FXML
    private AnchorPane MainAnchorPane;

    @FXML
    void initialize() {



        ConfirmButton.setOnAction(actionEvent -> {
            try {
                System.out.println("Пользователь нажал-а на кнопку \"Подтвердить\".");

                // Загрузка fxml файла и создание нового окна
                FXMLLoader fxmlLoader = new FXMLLoader(FinalApplication.class.getResource("customername.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 860, 300);
                Stage stage = new Stage();
                stage.setTitle("CUSTOMERNAME");
                stage.setScene(scene);
                stage.show();
            } catch (IOException e) {
                e.printStackTrace();
            }
        });

        try {



            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");


            BufferedReader itemReader = new BufferedReader(new FileReader("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt"));
            BufferedReader priceReader = new BufferedReader(new FileReader("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt"));

            String item;
            String price;
            int row = 0;

            while ((item = itemReader.readLine()) != null && (price = priceReader.readLine()) != null) {
                Label itemLabel = new Label(" "+item);
                Label priceLabel = new Label(price+"kzt");

                // Устанавливаем шрифт и размер текста для Label
                itemLabel.setFont(new Font("Segoe UI Semibold", 20));
                priceLabel.setFont(new Font("Segoe UI Semibold", 20));
                itemLabel.setTextFill(Color.valueOf("#dcd7c9"));
                priceLabel.setTextFill(Color.valueOf("#dcd7c9"));

                ItemAndPriceGrid.addRow(row++, itemLabel, priceLabel);
            }

            itemReader.close();
            priceReader.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //PRIVATE VOID ДЛЯ ЗАПИСИ
    private void writeToFile(String fileName, String text) {
        try (FileWriter fileWriter = new FileWriter(fileName, true);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            bufferedWriter.write(text);
            bufferedWriter.flush();


        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //PRIVATE VOID ДЛЯ ЧТЕНИЯ И ПРОЦЕССА ФАЙЛА
    private void readAndProcessFile(String filePath) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filePath));
            int lines = 0;
            while (reader.readLine() != null) lines++;
            reader.close();

            int[] array = new int[lines];

            reader = new BufferedReader(new FileReader(filePath));
            for (int i = 0; i < lines; i++) {
                String line = reader.readLine();
                int number = Integer.parseInt(line.trim());
                array[i] = number;
            }
            reader.close();

            // Вывод массива в текстовое поле
            StringBuilder sb = new StringBuilder();

            for (int num : array) {
                sb.append(num).append("\n");
                System.out.println(num);
            }

            int sum = 0;
            for (int i = 0; i < array.length; i++) {
                sum = sum + array[i];
            }
            System.out.println("Финальная сумма: "+sum);
            String stringsumma = String.valueOf(sum);
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\totalprice_temp_list.txt",stringsumma+"kzt\n");

            // Установка текста
            FinalPriceTxtField.setText(stringsumma+"kzt");




        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}