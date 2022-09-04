package com.teg.designpatterns.singleton;

public class Connection {
    private static Connection connection = new Connection();
    private static int count = 0;

    private Connection() {
        System.out.println("Connection created...");
    }

    public static Connection connect() {
        if(connection == null) {
            synchronized (Connection.class) {
                if(connection == null) {
                    connection = new Connection();
                }
            }
        }
        count++;
        System.out.println(count);
        return connection;
    }
}
