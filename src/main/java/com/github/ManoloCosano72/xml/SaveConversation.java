package com.github.ManoloCosano72.xml;

import com.github.ManoloCosano72.model.entity.Message;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.stream.Collectors;

public class SaveConversation {
    public void saveConversation (List<Message> messages,String user1, String user2 ,String fileName) {
        List<Message> filteredMessages = messages.stream()
                .filter(message -> (message.getSender().equals(user1) && message.getRecipient().equals(user2)) ||
                        (message.getSender().equals(user2) && message.getRecipient().equals(user1)))
                .collect(Collectors.toList());
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(fileName))) {
            for (Message message : messages) {
                bw.write(message.toCSV());
                bw.newLine();
            }
            System.out.println("El registro se ha guardado correctamente ");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
