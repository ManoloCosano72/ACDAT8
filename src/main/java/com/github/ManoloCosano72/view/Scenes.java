package com.github.ManoloCosano72.view;

public enum Scenes {
    MAIN("view/main.fxml"),
    REGISTRER("view/registrer.fxml"),
    LOGIN("view/login.fxml");
    private final String url;

    Scenes(String url) {
        this.url = url;
    }

    public String getURL() {
        return url;
    }
}
