package com.demo.designpattern.visitor.before;

import com.demo.designpattern.visitor.before.model.*;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Client> clients = List.of(
                new Bank("name1", "address1", "001", 10),
                new Company("name2", "address2", "002", 250),
                new Resident("name3", "address3", "003", "Basic"),
                new Restaurant("name4", "address4", "004", true)
        );

        clients.forEach(Client::sendEmail);
    }

}