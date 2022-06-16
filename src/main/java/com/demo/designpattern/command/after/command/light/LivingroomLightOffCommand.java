package com.demo.designpattern.command.after.command.light;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.common.vendor.Light;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LivingroomLightOffCommand implements Command {
    private final Light light;

    public void execute() {
        light.off();
    }

    public void undo() {
        light.on();
    }
}
