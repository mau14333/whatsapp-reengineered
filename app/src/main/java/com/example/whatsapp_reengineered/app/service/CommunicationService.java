package com.example.whatsapp_reengineered.app.service;

import com.example.whatsapp_reengineered.app.domain.ChatMessage;

import java.util.ArrayList;

/**
 * Created by Michi on 10.03.2015.
 */
public class CommunicationService {

    public ArrayList<ChatMessage> getNewMessages(ArrayList<ChatMessage> currentList){
        ArrayList<ChatMessage> onlineList = new ArrayList<ChatMessage>();
        ArrayList<ChatMessage> newMessages = new ArrayList<ChatMessage>();
        for (ChatMessage cm : onlineList){
            if (!currentList.contains(cm)){
                newMessages.add(cm);
            }
        }
        return newMessages;
    }

    public ArrayList<ChatMessage> getDeletedMessages(ArrayList<ChatMessage> currentList){
        ArrayList<ChatMessage> onlineList = new ArrayList<ChatMessage>();
        ArrayList<ChatMessage> deletedMessages = new ArrayList<ChatMessage>();
        for (ChatMessage cm : currentList){
            if (!onlineList.contains(cm)){
                deletedMessages.add(cm);
            }
        }
        return deletedMessages;
    }

}
