package com.demo.designpattern.facade.after;

import com.demo.designpattern.facade.subsystem.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {
        // note that the subsystem is still directly accessible
        Amplifier amp = new Amplifier("Amplifier");
        StreamingPlayer player = new StreamingPlayer("Streaming Player", amp);
        Projector projector = new Projector("Projector", player);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        // now only have to deal with 1 object with much simple interface
        HomeTheaterFacade homeTheater = new HomeTheaterFacade(amp, player, projector, screen, lights, popper);

        String movie = "Raiders of the Lost Ark";
        homeTheater.watchMovie(movie);
        homeTheater.endMovie();
    }

}
