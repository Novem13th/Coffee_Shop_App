package sample.application;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.util.Random;

public class CustomerController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField CustomerNameTxtField;

    @FXML
    private Button ReadyButton;

    @FXML
    void initialize() {
        Random random = new Random();
        int index = random.nextInt(0,1000);
        String stringindex = Integer.toString(index);
        writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\index_temp_list.txt",stringindex);

        ReadyButton.setOnAction(event -> {

            String userInput = CustomerNameTxtField.getText();
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\customername_temp_list.txt",userInput);
            createFile("D:\\!JAVA\\COFFEE HOUSE MENU\\RECEIPTS\\customer_receipt_"+userInput+"_"+index+".txt");
            System.out.println(userInput);

            try {
                System.out.println("Пользователь нажал-а на кнопку \"Готово\".");

                // Загрузка fxml файла и создание нового окна
                FXMLLoader fxmlLoader = new FXMLLoader(FinalApplication.class.getResource("reset.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 500, 520);
                Stage stage = new Stage();
                stage.setTitle("BASKET");
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }


            // Чтение содержимого текстового файла
            String itemContent = readFromFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt");
            String priceContent = readFromFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");
            String totalContent = readFromFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\totalprice_temp_list.txt");

            // Разделение содержимого файлов на строки
            String[] items = itemContent.split("\n");
            String[] prices = priceContent.split("\n");

            // Добавление прочитанного содержимого к receipt
            StringBuilder receipt = new StringBuilder();
            receipt.append("\t\t  Кофе на районе 😎\n")
                    .append("📒 Номер заказа:").append(index).append("\n")
                    .append("⬇️ ------------------------------------------- ⬇️\n")
                    .append("    "+userInput).append(", когда ваш заказ будет готов,\n")
                    .append("    его номер и ваше имя появится на экране.\n")
                    .append("    Вы сможете самостоятельно забрать.\n")
                    .append("    Спасибо что выбрали нас! 💖\n")
                    .append("☕ ------------------------------------------- ☕\n");

            for (int i = 0; i < Math.min(items.length, prices.length); i++) {
                receipt.append(items[i]).append(": ").append(prices[i]).append("\n");
            }

            receipt.append("🪙 Итого: ").append(totalContent)
                    .append("☕ ------------------------------------------- ☕\n")
                    .append("\t\tПриятного аппетита! ✨");

            System.out.println(receipt);

            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\RECEIPTS\\customer_receipt_" + userInput + "_" + index + ".txt", receipt.toString());
        });


    }
    private void createFile(String fileName) {
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.println("Файл создан: " + file.getName());
            } else {
                System.out.println("Файл уже существует.");
            }
        } catch (IOException e) {
            System.out.println("Произошла ошибка при создании файла.");
            e.printStackTrace();
        }
    }

    private void writeToFile(String fileName, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(fileName))) {
            writer.write(text);
            System.out.println("Текст успешно записан в файл.");
        } catch (IOException e) {
            System.out.println("Произошла ошибка при записи в файл.");
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
            System.out.println(content.toString());
        } catch (IOException e) {
            System.out.println("Произошла ошибка при чтении файла.");
            e.printStackTrace();
        }
        return content.toString();
    }
}

