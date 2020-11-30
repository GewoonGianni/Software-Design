package com.giannissupervettesoftwarebedrijfbvllcfirma;

import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.BaseNumber;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.Colon;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.Space;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.One;

import java.util.ArrayList;

public class Clock {
    ArrayList<BaseNumber> time;

    Time timeNumber = new Time();

    public Clock() {
        this.time = new ArrayList<>();
    }

    public void drawClock() {
        for (String string: createLines()) {
            System.out.println(string);
        }
    }

    public ArrayList<String> createLines() {
        ArrayList<String> strings = new ArrayList<String>();
        StringBuilder str = new StringBuilder();
        for (BaseNumber time : constructTime()) {
            str.append(time.getFirstLine());
            System.out.println(time.firstLine);
        }
        strings.add(str.toString());
        str = new StringBuilder();
        for (BaseNumber time : constructTime()) {
            str.append(time.getSecondLine());
        }
        strings.add(str.toString());
        str = new StringBuilder();
        for (BaseNumber time : constructTime()) {
            str.append(time.getThirdLine());
        }
        strings.add(str.toString());
        str = new StringBuilder();
        for (BaseNumber time : constructTime()) {
            str.append(time.getFourthLine());
        }
        strings.add(str.toString());
        str = new StringBuilder();
        for (BaseNumber time : constructTime()) {
            str.append(time.getFifthLine());
        }
        strings.add(str.toString());
        str = new StringBuilder();
        for (BaseNumber time : constructTime()) {
            str.append(time.getSixtLine());
        }
        strings.add(str.toString());

        return strings;
    }

    public ArrayList<BaseNumber> constructTime() {
        if (time != null) {
            time.clear();
        }

        time.add(timeNumber.getNumberOne());
        time.add(timeNumber.getNumberTwo());
        time.add(new Space());
        time.add(new Colon());
        time.add(new Space());
        time.add(timeNumber.getNumberThree());
        time.add(timeNumber.getNumberFour());
        return time;
    }
}
