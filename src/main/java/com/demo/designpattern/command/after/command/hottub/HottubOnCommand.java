package com.demo.designpattern.command.after.command.hottub;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.common.vendor.Hottub;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class HottubOnCommand implements Command {

    private final Hottub hottub;

    public void execute() {
        hottub.on();
        hottub.setTemperature(104);
        hottub.circulate();
    }

    public void undo() {
        hottub.off();
    }
}
