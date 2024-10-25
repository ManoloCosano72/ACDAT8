package com.github.ManoloCosano72.model.entity;

import java.time.LocalDateTime;
import java.util.Objects;

public class Message {
    private int id;
    private String text;
    private LocalDateTime sendDate;
    private String sender;
    private String recipient;

    public Message(int id, String text, LocalDateTime sendDate, String sender, String recipient) {
        this.id = id;
        this.text = text;
        this.sendDate = sendDate;
        this.sender = sender;
        this.recipient = recipient;
    }

    public Message() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public LocalDateTime getSendDate() {
        return sendDate;
    }

    public void setSendDate(LocalDateTime sendDate) {
        this.sendDate = sendDate;
    }

    public String getSender() {
        return sender;
    }

    public void setSender(String sender) {
        this.sender = sender;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }

    public String toCSV (){
        return id + ", " + text + ", " + sendDate + ", " + sender + ", " + recipient;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals;
        if (this == obj) {
            isEquals = true;
        } else if (obj == null || getClass() != obj.getClass()) {
            isEquals = false;
        } else {
            Message msg = (Message) obj;
            return Objects.equals(id, msg.id);
        }
        return isEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, text, sendDate, sender, recipient);
    }

    @Override
    public String toString() {
        return "Message{" +
                "id=" + id +
                ", text='" + text + '\'' +
                ", sendDate=" + sendDate +
                ", sender='" + sender + '\'' +
                ", recipient='" + recipient + '\'' +
                '}';
    }
}
