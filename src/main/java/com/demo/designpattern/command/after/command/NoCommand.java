package com.demo.designpattern.command.after.command;

/**
 * This class known as Null Object. <br>
 * Purpose: avoid extract handling on dealing null.
 */
public class NoCommand implements Command {

    public void execute() {
    }

    public void undo() {
    }
}
