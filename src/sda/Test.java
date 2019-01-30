package sda;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.*;
import java.util.Random;

public class Test extends Application {

    public static void main(String[] args) {
        Application.launch(Test.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {

        Parent root = FXMLLoader.load(getClass().getResource("sda/interface.fxml"));

        File file = new File("sda/reg.txt");
        Scene scene = new Scene(root, 800, 800);
        stage.setTitle("FXML Welcome");
        stage.setScene(scene);
        stage.show();
        Label rollRez = (Label) scene.lookup("#rollRez");
        Label rollRez1 = (Label) scene.lookup("#rollRez1");
        Label login = (Label) scene.lookup("#login");
        Label pswd = (Label) scene.lookup("#password");
        BufferedReader bfLogin = new BufferedReader(new FileReader("sda/reg.txt"));
        String lg = bfLogin.readLine();
        while (lg != null) {
            rollRez.setText(lg);
            rollRez1.setText(lg);
        }

        BufferedReader bfPswd = new BufferedReader(new FileReader("sda/reg.txt"));
        String bfpswd = bfPswd.readLine();

        FileWriter fw = new FileWriter(file);
        fw.write(lg);
        fw.write(bfpswd);
        fw.close();



        Button avtorization = (Button) scene.lookup("#avtorization");
        avtorization.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                String s;
               // if ()
            }
        });
        Button rollButton = (Button) scene.lookup("#rollButton");
        rollButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                int rollRezult = generate();
                rollRez.setText(Integer.toString(rollRezult));
                int rollRezult1 = generate();
                rollRez1.setText(Integer.toString(rollRezult1));
                System.out.println(" Выпало");

            }
        });
    }

    public int generate() {
        Random rd = new Random();
        int rollRezult = rd.nextInt(6) + 1;
        System.out.print(rollRezult);
        return rollRezult;
    }
}

