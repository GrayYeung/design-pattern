package com.demo.designpattern.command.after.command.cellingfan;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.common.vendor.CeilingFan;
import lombok.RequiredArgsConstructor;
import lombok.Setter;

@RequiredArgsConstructor
@Setter
public class CeilingFanMediumCommand implements Command {

    private final CeilingFan ceilingFan;
    private int prevSpeed;

    public void execute() {
        prevSpeed = ceilingFan.getSpeed();
        ceilingFan.medium();
    }

    public void undo() {
        switch (prevSpeed) {
            case CeilingFan.HIGH -> ceilingFan.high();
            case CeilingFan.MEDIUM -> ceilingFan.medium();
            case CeilingFan.LOW -> ceilingFan.low();
            default -> ceilingFan.off();
        }
    }

}
