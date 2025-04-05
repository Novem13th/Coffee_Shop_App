package sample.application;

import java.io.*;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class ResetController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private Button GreatButton;

    @FXML
    private TextField IndexTextField;

    @FXML
    private TextField NameTextField;

    @FXML
    void initialize() {

        String index = readFromFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\index_temp_list.txt");
        IndexTextField.setText(index);
        String name = readFromFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\customername_temp_list.txt");
        NameTextField.setText(name);

        GreatButton.setOnAction(actionEvent -> {
            String itemfilepath = "D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt";
            String pricefilepath = "D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt";
            String totalpricefilepath = "D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\totalprice_temp_list.txt";
            String indexpath = "D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\index_temp_list.txt";
            String namepath = "D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\customername_temp_list.txt";
            clearFile(itemfilepath);
            clearFile(pricefilepath);
            clearFile(totalpricefilepath);
            clearFile(indexpath);
            clearFile(namepath);

            // Получаем текущее окно (Stage)
            Stage stage = (Stage) GreatButton.getScene().getWindow();
            // Закрываем окно
            stage.close();
        });
    }

    private static void clearFile(String filePath) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write("");
            System.out.println("Содержимое файла успешно удалено.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при удалении содержимого файла.");
            e.printStackTrace();
        }
    }
    private String readFromFile(String fileName) {
        StringBuilder content = new StringBuilder();
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {
            String line;
            while ((line = reader.readLine()) != null) {
                content.append(line).append("\n");
            }
            System.out.println("Файл успешно прочитан.");
            System.out.println(content);
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла.");
            e.printStackTrace();
        }
        return content.toString();
    }
}

