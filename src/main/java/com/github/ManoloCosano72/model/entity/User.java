package com.github.ManoloCosano72.model.entity;

import java.util.List;
import java.util.Objects;

public class User {
    private String name;
    private String password;
    private String mail;
    private List<Message> messages;

    public User(String name, String password, String mail, String phone, List<Message> messages) {
        this.name = name;
        this.password = password;
        this.mail = mail;
        this.messages = messages;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public List<Message> getMessages() {
        return messages;
    }

    public void setMessages(List<Message> messages) {
        this.messages = messages;
    }

    @Override
    public boolean equals(Object obj) {
        boolean isEquals;
        if (this == obj) {
            isEquals = true;
        } else if (obj == null || getClass() != obj.getClass()) {
            isEquals = false;
        } else {
            User user = (User) obj;
            return Objects.equals(mail, user.mail);
        }
        return isEquals;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, password, mail);
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", mail='" + mail + '\'' +
                '}';
    }
}
