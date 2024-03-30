package com.demo.designpattern.visitor.before.model;

import lombok.Data;

/**
 * @see Bank
 */
@Data
public abstract class Client {
    private final String name;
    private final String address;
    private final String number;

    // TODO: add sendEmail() function for sending different type of email to different type of clients
    public abstract void sendEmail();

}
