package app;

import app.facade.EntertainmentFacade;
import app.items.*;

public class Main {

    public static void main(String[] args) {
        // make all items
        Amplifier amp = new Amplifier("Top-O-Line Amplifier");
        Tuner tuner = new Tuner("Top-O-Line AM/FM Tuner", amp);
        DvdPlayer dvd = new DvdPlayer("Top-O-Line DVD Player", amp);
        CdPlayer cd = new CdPlayer("Top-O-Line CD Player", amp);
        Projector projector = new Projector("Top-O-Line Projector", dvd);
        TheaterLights lights = new TheaterLights("Theater Ceiling Lights");
        Screen screen = new Screen("Theater Screen");
        PopcornPopper popper = new PopcornPopper("Popcorn Popper");

        // Make facade
        EntertainmentFacade entertainmentFacade = new EntertainmentFacade(amp, tuner, dvd, cd, projector, lights, screen, popper);

        // do actions
        entertainmentFacade.watchMovie();
        entertainmentFacade.turnOffMovie();
        entertainmentFacade.listenToMusic();
        entertainmentFacade.stopListeningToMusic();
        entertainmentFacade.listenToRadio();
        entertainmentFacade.stopListeningToRadio();
    }
}
