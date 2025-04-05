package sample.application;


import java.io.*;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;



public class HelloController {
    float price = 0;
    String ANSI_RESET = "\u001B[0m";
    String GREEN_BRIGHT = "\033[0;92m";
    String YELLOW_BRIGHT = "\033[0;93m";
    String CYAN_BRIGHT = "\033[0;96m";

    @FXML
    private Button BasketButton;

    @FXML
    private Button BuyButtonAmericano0_35;

    @FXML
    private Button BuyButtonAmericano0_45;

    @FXML
    private Button BuyButtonBangkok;

    @FXML
    private Button BuyButtonCappuccino0_35;

    @FXML
    private Button BuyButtonCappuccino0_45;

    @FXML
    private Button BuyButtonColdTeaJapanLipa;

    @FXML
    private Button BuyButtonColdTeaMilkUlun;

    @FXML
    private Button BuyButtonColdTeaRoybush;

    @FXML
    private Button BuyButtonColdTeaSencha;

    @FXML
    private Button BuyButtonColdTeaWildCherry;

    @FXML
    private Button BuyButtonEspressoTonic;

    @FXML
    private Button BuyButtonFlatWhite0_25;

    @FXML
    private Button BuyButtonFrappeCaramel;

    @FXML
    private Button BuyButtonFrappeChocolate;

    @FXML
    private Button BuyButtonIceAmericano;

    @FXML
    private Button BuyButtonIceLatte;

    @FXML
    private Button BuyButtonLatte0_35;

    @FXML
    private Button BuyButtonLatte0_45;

    @FXML
    private Button BuyButtonRaf0_35;

    @FXML
    private Button BuyButtonRaf0_45;

    @FXML
    private Button BuyButtonRegular0_35;

    @FXML
    private Button BuyButtonRegular0_45;

    @FXML
    private Button BuyButtonSpanishLatte;

    @FXML
    private Button BuyButtonTeaKazakh;

    @FXML
    private Button BuyButtonTeaMalina;

    @FXML
    private Button BuyButtonTeaMarocca;

    @FXML
    private Button BuyButtonTeaOblepiha;

    @FXML
    private Button BuyButtonTeaSmorodina;

    @FXML
    private AnchorPane MainAnchorPane;



    @FXML
    void initialize() {

;

        //COFFEE LATTE
        BuyButtonLatte0_35.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Латте 0.35\""+ANSI_RESET+"."+"\tЦена: 940.0kzt");
            price = price + 940;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Латте 0.35\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "940\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        BuyButtonLatte0_45.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Латте 0.45\""+ANSI_RESET+"."+"\tЦена: 1150.0kzt");
            price = price + 1150;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Латте 0.45\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1150\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COFFEE CAPPUCCINO
        BuyButtonCappuccino0_35.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Капучино 0.35\""+ANSI_RESET+"."+"\tЦена: 940.0kzt");
            price = price + 940;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Капучино 0.35\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "940\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        BuyButtonCappuccino0_45.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Капучино 0.45\""+ANSI_RESET+"."+"\tЦена: 1150.0kzt");
            price = price + 1150;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Капучино 0.45\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1150\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COFFEE FLAT WHITE
        BuyButtonFlatWhite0_25.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Флэт-Уайт 0.25\""+ANSI_RESET+"."+"\tЦена: 990.0kzt");
            price = price + 990;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Флэт-Уайт 0.25\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "990\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COFFEE RAF
        BuyButtonRaf0_35.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Раф 0.35\""+ANSI_RESET+"."+"\tЦена: 1040.0kzt");
            price = price + 1040;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Раф 0.35\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1040\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        BuyButtonRaf0_45.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Раф 0.45\""+ANSI_RESET+"."+"\tЦена: 1290.0kzt");
            price = price + 1290;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Раф 0.45\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1290\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COFFEE AMERICANO
        BuyButtonAmericano0_35.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Американо 0.35\""+ANSI_RESET+"."+"\tЦена: 840.0kzt");
            price = price + 840;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Американо 0.35\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "840\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        BuyButtonAmericano0_45.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Американо 0.45\""+ANSI_RESET+"."+"\tЦена: 1090.0kzt");
            price = price + 1090;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Американо 0.45\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1090\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COFFEE REGULAR
        BuyButtonRegular0_35.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Регуляр 0.35\""+ANSI_RESET+"."+"\tЦена: 890.0kzt");
            price = price + 890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Регуляр 0.35\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        BuyButtonRegular0_45.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка кофе Регуляр 0.45\""+ANSI_RESET+"."+"\tЦена: 1140.0kzt");
            price = price + 1140;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Кофе \"Регуляр 0.45\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1140\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //TEA SMORODINA
        BuyButtonTeaSmorodina.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка чая Смородиновый\""+ANSI_RESET+"."+"\tЦена: 890.0kzt");
            price = price + 890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Чай \"Смородиновый\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //TEA MALINA
        BuyButtonTeaMalina.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка чая Малиновый\""+ANSI_RESET+"."+"\tЦена: 890.0kzt");
            price = price + 890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Чай \"Малиновый\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //TEA MAROCCA
        BuyButtonTeaMarocca.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка чая Марокка\""+ANSI_RESET+"."+"\tЦена: 890.0kzt");
            price = price + 890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Чай \"Марокка\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //TEA OBLEPIHA
        BuyButtonTeaOblepiha.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка чая Облепиховый\""+ANSI_RESET+"."+"\tЦена: 890.0kzt");
            price = price + 890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Чай \"Облепиха\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //TEA KAZAKH
        BuyButtonTeaKazakh.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка чая Казахский\""+ANSI_RESET+"."+"\tЦена: 790.0kzt");
            price = price + 790;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Чай \"Казахский\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "790\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE ICE LATTE
        BuyButtonIceLatte.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Айс-Латте 0.5\""+ANSI_RESET+"."+"\tЦена: 1290.0kzt");
            price = price + 1290;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Айс-Латте 0.5\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1290\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE ICE AMERICANO
        BuyButtonIceAmericano.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Айс-Американо 0.5\""+ANSI_RESET+"."+"\tЦена: 1190.0kzt");
            price = price + 1190;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Айс-Американо 0.5\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1190\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE ESPRESSO TONIC
        BuyButtonEspressoTonic.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Эспрессо Тоник 0.5\""+ANSI_RESET+"."+"\tЦена: 1590.0kzt");
            price = price + 1590;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Эспрессо Тоник 0.5\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1590\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE FRAPPE CHOCOLATE
        BuyButtonFrappeChocolate.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Фраппе Шоколад 0.5\""+ANSI_RESET+"."+"\tЦена: 1890.0kzt");
            price = price + 1890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Фраппе Шоколад 0.5\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE FRAPPE CARAMEL
        BuyButtonFrappeCaramel.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Фраппе Карамель 0.5\""+ANSI_RESET+"."+"\tЦена: 1890.0kzt");
            price = price + 1890;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Фраппе Карамель 0.5\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1890\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE BANGKOK
        BuyButtonBangkok.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Бангкок 0.5\""+ANSI_RESET+"."+"\tЦена: 2190.0kzt");
            price = price + 2190;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Бангкок 0.5\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "2190\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD COFFEE SPANISH LATTE
        BuyButtonSpanishLatte.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+YELLOW_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодное "+YELLOW_BRIGHT+"кофе Испанское Латте 0.5\""+ANSI_RESET+"."+"\tЦена: 1790.0kzt");
            price = price + 1790;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный кофе \"Испанская Латте\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "1790\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD TEA ROIBUSH
        BuyButtonColdTeaRoybush.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодного "+GREEN_BRIGHT+"чая Ройбуш\""+ANSI_RESET+"."+"\tЦена: 800.0kzt");
            price = price + 800;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный чай \"Ройбуш\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "800\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD TEA SENCHA
        BuyButtonColdTeaSencha.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодного "+GREEN_BRIGHT+"чая Сенча\""+ANSI_RESET+"."+"\tЦена: 800.0kzt");
            price = price + 800;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный чай \"Сенча\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "800\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD TEA MILK ULUN
        BuyButtonColdTeaMilkUlun.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодного "+GREEN_BRIGHT+"чая Молочный Улун\""+ANSI_RESET+"."+"\tЦена: 800.0kzt");
            price = price + 800;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный чай \"Молочный Улун\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "800\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD TEA JAPAN LIPA
        BuyButtonColdTeaJapanLipa.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодного "+GREEN_BRIGHT+"чая Японская Липа\""+ANSI_RESET+"."+"\tЦена: 800.0kzt");
            price = price + 800;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный чай \"Японская Липа\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "800\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });

        //COLD TEA WILD CHERRY
        BuyButtonColdTeaWildCherry.setOnAction(actionEvent -> {
            System.out.println("Пользователь нажал-а на кнопку "+GREEN_BRIGHT+"\"Покупка "+CYAN_BRIGHT+"холодного "+GREEN_BRIGHT+"чая Дикая Вишня\""+ANSI_RESET+"."+"\tЦена: 800.0kzt");
            price = price + 800;
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\item_temp_list.txt", "Холодный чай \"Дикая Вишня\"\n");
            writeToFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt", "800\n");
            readAndProcessFile("D:\\!JAVA\\COFFEE HOUSE MENU\\TEMP FILES\\price_temp_list.txt");

        });


        BasketButton.setOnAction(actionEvent -> {
            try {
                System.out.println("Пользователь нажал-а на кнопку \"Корзина\".");
                
                // Загрузка fxml файла и создание нового окна
                FXMLLoader fxmlLoader = new FXMLLoader(FinalApplication.class.getResource("final-view.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 860, 950);
                Stage stage = new Stage();
                stage.setTitle("BASKET");
                stage.setScene(scene);
                stage.show();

            } catch (IOException e) {
                e.printStackTrace();
            }
        });

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
            //System.out.println("Элементы из массива с числами: ");
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
                //System.out.println(num);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
