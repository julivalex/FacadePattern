package com.company;

import com.company.subsystem.*;

public class HomeTheaterTestDrive {

    public static void main(String[] args) {

        Amplifier amplifier = new Amplifier();
        DvdPlayer dvdPlayer = new DvdPlayer();
        Projector projector = new Projector();
        TheaterLights lights = new TheaterLights();
        Screen screen = new Screen();
        PopcornPopper popper = new PopcornPopper();

        HomeThreadFacade threadFacade = new HomeThreadFacade(
                amplifier,
                dvdPlayer,
                projector,
                lights,
                screen,
                popper);
        threadFacade.watchMovie("Raiders of the Lost Ark");
        threadFacade.endMovie();
    }
}
