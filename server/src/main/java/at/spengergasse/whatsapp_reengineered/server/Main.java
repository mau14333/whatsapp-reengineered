package at.spengergasse.whatsapp_reengineered.server;

import at.spengergasse.whatsapp_reengineered.sharedData.domain.ChatMessage;

import java.io.IOException;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by Michi on 13.03.2015.
 */
public class Main {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(44440);
            while (true) {
                final Socket clientSocket = serverSocket.accept();
                Thread clientThread = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        try (ObjectInputStream input = new ObjectInputStream(clientSocket.getInputStream())) {
                            ChatMessage message;
                            while ((message = (ChatMessage) input.readObject())!=null){

                            }
                        } catch (IOException e) {

                        } catch (ClassNotFoundException e) {
                        }
                    }
                });
            }
        } catch (IOException e) {

        }
    }
}
