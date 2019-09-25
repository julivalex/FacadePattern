package com.company.subsystem;

public class DvdPlayer {

    public void on() {
        System.out.println("Top-O-Line DvdPlayer on");
    }

    public void play(String movie) {
        System.out.println("Top-O-Line DvdPlayer playing " + movie);
    }

    public void stop() {
        System.out.println("Amplifier is stop");
    }

    public void eject() {
        System.out.println("Amplifier is eject");
    }

    public void off() {
        System.out.println("Amplifier is off");
    }
}
