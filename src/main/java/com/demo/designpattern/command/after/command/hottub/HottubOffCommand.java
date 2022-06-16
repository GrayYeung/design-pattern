package com.demo.designpattern.command.after.command.hottub;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.common.vendor.Hottub;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HottubOffCommand implements Command {

    private final Hottub hottub;

    public void execute() {
        hottub.setTemperature(98);
        hottub.off();
    }

    public void undo() {
        hottub.on();
    }
}
