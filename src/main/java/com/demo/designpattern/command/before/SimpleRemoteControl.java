package com.demo.designpattern.command.before;

import com.demo.designpattern.command.common.vendor.Hottub;
import com.demo.designpattern.command.common.vendor.Light;
import com.demo.designpattern.command.common.vendor.Stereo;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class SimpleRemoteControl {

    private Object slot; // hold vendor

    public void buttonWasPressed() {
        /* FIXME:
         *  remove hardcode
         *  decoupling on Remote and Vendor
         */
        if (slot instanceof Light light) {
            light.on();
        } else if (slot instanceof Hottub hottub) {
            hottub.on();
        } else if (slot instanceof Stereo stereo) {
            stereo.on();
            stereo.setCD();
            stereo.setVolume(11);
        }
    }

}
