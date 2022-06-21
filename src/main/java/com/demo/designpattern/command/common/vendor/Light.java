package com.demo.designpattern.command.common.vendor;


import com.demo.designpattern.command.after.command.Command;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

/**
 * This is a relative simple object to understand how undo() {@link Command#undo()} works.
 */
@Getter
@RequiredArgsConstructor
public class Light {

    private final String location;
    private int level;

    public void on() {
        level = 100;
        System.out.println("Light is on");
    }

    public void off() {
        level = 0;
        System.out.println("Light is off");
    }

    public void dim(int level) {
        this.level = level;
        if (level == 0) {
            off();
        } else {
            System.out.println("Light is dimmed to " + level + "%");
        }
    }

    public int getLevel() {
        return level;
    }
}
