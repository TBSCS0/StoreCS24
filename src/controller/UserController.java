package controller;

import model.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;
import java.util.Scanner;

public class UserController {
    private User user;
    private LinkedList<User> users;

    public UserController(){
        users = new LinkedList<>();
    }

    public LinkedList<User> read(){
        try {
            FileReader fileReader = new FileReader("./data/users.csv");
            Scanner scanner = new Scanner(fileReader);
            while(scanner.hasNext()){
                String[] data = scanner.nextLine().split(",");
                user = new User(data[0], Integer.parseInt(data[1]), data[2]);
                users.add(user);
            }
            scanner.close();
            fileReader.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return users;
    }

    public void create(String username, int password, String email){
        try {
            FileWriter fileWriter = new FileWriter("./data/users.csv", true);
            fileWriter.write(username+","+password+","+email);
            fileWriter.write(System.lineSeparator());

            user = new User(username, password, email);
            users.add(user);

            fileWriter.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
