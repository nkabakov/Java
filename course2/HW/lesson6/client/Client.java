package course2.HW.lesson6.client;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.util.Scanner;

public class Client {

    public static void main(String[] args) {

        Socket socket = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        final String IP_ADRESS = "localhost";
        final int PORT = 8189;

        try {
            socket = new Socket(IP_ADRESS, PORT);
            System.out.println("Подключение к серверу произошло успешно");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            DataInputStream finalIn = in;

            Thread readUTF = new Thread(() -> {
                try {
                    while (true) {
                        String str = finalIn.readUTF();
                        System.out.println("Server: " + str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }
            });

            readUTF.setDaemon(true);
            readUTF.start();

            while (true) {
                Scanner readConsole = new Scanner(System.in);
                String str = readConsole.nextLine();
                out.writeUTF(str);
                if (str.equals(".end")) {
                    out.writeUTF(".end");
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
