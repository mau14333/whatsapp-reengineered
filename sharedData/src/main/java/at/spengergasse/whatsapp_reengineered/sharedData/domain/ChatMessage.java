package at.spengergasse.whatsapp_reengineered.sharedData.domain;

import lombok.Getter;
import lombok.Setter;

/**
 * Created by Michi on 10.03.2015.
 */
public class ChatMessage {

    @Getter
    @Setter
    private String text;

    public ChatMessage(String text) {
        this.text = text;
    }
}
