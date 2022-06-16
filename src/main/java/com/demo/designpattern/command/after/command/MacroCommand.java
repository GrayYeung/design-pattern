package com.demo.designpattern.command.after.command;

import lombok.RequiredArgsConstructor;

/**
 * The <Strong>Meta Command Pattern</Strong> allows you to create macros of command so that you can execute multiple commands at once. <br>
 * <p>
 * Instead of execute one by one.<br>
 * Can execute multiple commands at one go.
 */
@RequiredArgsConstructor
public class MacroCommand implements Command {
    private final Command[] commands;

    public void execute() {
        for (int i = 0; i < commands.length; i++) {
            commands[i].execute();
        }
    }

    /**
     * NOTE:  these commands have to be done backwards to ensure
     * proper undo functionality
     */
    public void undo() {
        for (int i = commands.length - 1; i >= 0; i--) {
            commands[i].undo();
        }
    }
}

