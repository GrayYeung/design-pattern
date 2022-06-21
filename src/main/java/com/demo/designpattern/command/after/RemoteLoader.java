package com.demo.designpattern.command.after;

import com.demo.designpattern.command.after.command.Command;
import com.demo.designpattern.command.after.command.MacroCommand;
import com.demo.designpattern.command.after.command.hottub.HottubOffCommand;
import com.demo.designpattern.command.after.command.hottub.HottubOnCommand;
import com.demo.designpattern.command.after.command.light.LightOffCommand;
import com.demo.designpattern.command.after.command.light.LightOnCommand;
import com.demo.designpattern.command.after.command.stereo.StereoOffCommand;
import com.demo.designpattern.command.after.command.stereo.StereoOnCommand;
import com.demo.designpattern.command.after.command.tv.TVOffCommand;
import com.demo.designpattern.command.after.command.tv.TVOnCommand;
import com.demo.designpattern.command.common.vendor.Hottub;
import com.demo.designpattern.command.common.vendor.Light;
import com.demo.designpattern.command.common.vendor.Stereo;
import com.demo.designpattern.command.common.vendor.TV;

public class RemoteLoader {

    public static void main(String[] args) {

        RemoteControl remoteControl = new RemoteControl();

        // vendor
        Light light = new Light("Living Room");
        TV tv = new TV("Living Room");
        Stereo stereo = new Stereo("Living Room");
        Hottub hottub = new Hottub();

        // command
        LightOnCommand lightOn = new LightOnCommand(light);
        StereoOnCommand stereoOn = new StereoOnCommand(stereo);
        TVOnCommand tvOn = new TVOnCommand(tv);
        HottubOnCommand hottubOn = new HottubOnCommand(hottub);
        LightOffCommand lightOff = new LightOffCommand(light);
        StereoOffCommand stereoOff = new StereoOffCommand(stereo);
        TVOffCommand tvOff = new TVOffCommand(tv);
        HottubOffCommand hottubOff = new HottubOffCommand(hottub);

        // marco command
        Command[] partyOn = {lightOn, stereoOn, tvOn, hottubOn};
        Command[] partyOff = {lightOff, stereoOff, tvOff, hottubOff};
        MacroCommand partyOnMacro = new MacroCommand(partyOn);
        MacroCommand partyOffMacro = new MacroCommand(partyOff);

        remoteControl.setCommand(0, partyOnMacro, partyOffMacro);

        System.out.println(remoteControl);
        System.out.println("--- Pushing Macro On---");
        remoteControl.onButtonWasPushed(0);
        System.out.println("--- Pushing Macro Off---");
        remoteControl.offButtonWasPushed(0);
    }
}
