package com.demo.designpattern.command.after.command.stereo;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.common.vendor.Stereo;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class StereoOffCommand implements Command {
    private final Stereo stereo;

    public void execute() {
        stereo.off();
    }

    public void undo() {
        stereo.on();
    }
}
