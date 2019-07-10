package course2.HW.lesson6.server;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {

    public static void main(String[] args) {

        ServerSocket server = null;
        Socket socket = null;
        DataOutputStream out = null;
        DataInputStream in = null;
        final int PORT = 8189;

        try {
            server = new ServerSocket(PORT);
            System.out.println("Сервер запущен");
            socket = server.accept();
            System.out.println("Клиент подключен");
            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
            DataInputStream finalIn = in;

            Thread readUTF = new Thread(() -> {
                try {
                    while (true) {
                        String str = finalIn.readUTF();
                        System.out.println("Client: " + str);

                        if (str.equals(".end")) {
                            System.out.println("Клиент отключен");
                            break;
                        }
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
                    break;
                }
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                socket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
