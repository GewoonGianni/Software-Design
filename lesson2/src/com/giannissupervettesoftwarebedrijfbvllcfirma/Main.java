package com.giannissupervettesoftwarebedrijfbvllcfirma;

public class Main {

    public static void main(String[] args) {
        Clock clock = new Clock();
// this shit does not work and should not be looked at please do not use this monstrosity
        try {
            while (true) {
                clock.drawClock();
                Thread.sleep(600);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
