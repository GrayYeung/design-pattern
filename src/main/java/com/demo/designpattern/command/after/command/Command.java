package com.demo.designpattern.command.after.command;

/**
 * The <strong>Command Pattern</strong> encapsulates a request as an object, <br>
 * thereby letting you parameterize other objects with different requests, queue, log requests, and support undoable operation.
 */
public interface Command {

    void execute();

    /**
     * Use to undo the prev action.
     * So will need to store a prev action or an array of prev actions.
     */
    void undo();

}
