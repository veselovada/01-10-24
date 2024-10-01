package org.example;


import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        DbConnectionImpl connection = new DbConnectionImpl();

        connection.insert(new User("user", "1234"));
        connection.insert(new User("user1", "124564"));
        connection.insert(new User("user2", "547457"));
        connection.insert(new User("user3", "5474544"));
        connection.insert(new User("user4", "2323"));



        connection.select();
        System.out.println("Enter password:  ");
        Scanner sc = new Scanner(System.in);


//        EncryptionPass pass = new EncryptionPass();
//        var password = "12345";
//       var encrypt = pass.encrypt("12345");
//
//        System.out.println("Encrypt pass - " + encrypt);
//        System.out.println("Decrypt - "+ pass.decrypt(encrypt));
    }
}