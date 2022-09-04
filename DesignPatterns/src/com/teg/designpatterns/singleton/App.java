package com.teg.designpatterns.singleton;

public class App {
    public static void main(String[] args) {
        for(int i = 0; i < 5; i++) {
            Connection connection = Connection.connect();
        }
    }
}
