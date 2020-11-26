package app.facade;

import app.items.*;

public class EntertainmentFacade {
    private Amplifier amp;
    private Tuner tuner;
    private DvdPlayer dvd;
    private CdPlayer cd;
    private Projector projector;
    private TheaterLights lights;
    private Screen screen;
    private PopcornPopper popper;

    public EntertainmentFacade(Amplifier amp, Tuner tuner, DvdPlayer dvd, CdPlayer cd, Projector projector, TheaterLights lights, Screen screen, PopcornPopper popper) {
        this.amp = amp;
        this.tuner = tuner;
        this.dvd = dvd;
        this.cd = cd;
        this.projector = projector;
        this.lights = lights;
        this.screen = screen;
        this.popper = popper;
    }

    public void watchMovie() {
        this.popper.on();
        this.popper.pop();
        this.lights.dim(10);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenMode();
        this.amp.on();
        this.amp.setDvd(this.dvd);
        this.amp.setSurroundSound();
        this.amp.setVolume(5);
        this.dvd.on();
        this.dvd.play("Mind Hunter");
    }

    public void turnOffMovie() {
        this.popper.off();
        this.lights.on();
        this.screen.up();
        this.projector.off();
        this.amp.off();
        this.dvd.stop();
        this.dvd.eject();
        this.dvd.off();
    }

    public void listenToMusic() {
        this.lights.on();
        this.amp.on();
        this.amp.setVolume(5);
        this.amp.setCd(this.cd);
        this.amp.setStereoSound();
        this.cd.on();
        this.cd.play("despacito");
    }

    public void stopListeningToMusic() {
        this.amp.off();
        this.amp.setCd(cd);
        this.cd.eject();
        this.cd.off();
    }

    public void listenToRadio() {
        this.tuner.on();
        this.tuner.setFrequency(98);
        this.amp.on();
        this.amp.setVolume(5);
        this.amp.setTuner(tuner);
    }

    public void stopListeningToRadio() {
        this.tuner.off();
        this.amp.off();
    }
}
