package com.company;

import com.company.subsystem.*;

class HomeThreadFacade {

    private Amplifier amplifier;
    private DvdPlayer dvdPlayer;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    HomeThreadFacade(Amplifier amplifier,
                     DvdPlayer dvdPlayer,
                     Projector projector,
                     TheaterLights lights,
                     Screen screen,
                     PopcornPopper popper) {
        this.amplifier = amplifier;
        this.dvdPlayer = dvdPlayer;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        popper.on();
        popper.pop();
        lights.dim(10);
        screen.down();
        projector.on();
        projector.wideScreenMode();
        amplifier.on();
        amplifier.setDvd(dvdPlayer);
        amplifier.setSurroundSound();
        amplifier.setVolume(5);
        dvdPlayer.on();
        dvdPlayer.play(movie);
    }

    void endMovie() {
        System.out.println("Shutting movie theater down...");
        popper.off();
        popper.pop();
        lights.on();
        screen.up();
        projector.off();
        amplifier.off();
        dvdPlayer.stop();
        dvdPlayer.eject();
        dvdPlayer.off();
    }
}
