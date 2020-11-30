package com.giannissupervettesoftwarebedrijfbvllcfirma;

import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.BaseNumber;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.One;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Two;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Three;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Four;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Five;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Six;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Seven;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Eight;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Nine;
import com.giannissupervettesoftwarebedrijfbvllcfirma.clockitems.numbers.Zero;

public class Time {

    public Time () {

    }

    public int getHours() {
        return java.time.LocalTime.now().getHour();
    }

    public int getMinutes() {
        if (java.time.LocalTime.now().getMinute() < 10) {
            return Integer.parseInt(String.format("%02d", java.time.LocalTime.now().getMinute()));
        } else {
            return java.time.LocalTime.now().getMinute();
        }


    }

    public BaseNumber getNumberOne() {
        String whyIsMyCodeSoBad = Integer.toString(getHours());
        return charToString(Integer.parseInt(String.valueOf(whyIsMyCodeSoBad.charAt(0))));
    }

    public BaseNumber getNumberTwo() {
        String whyIsMyCodeSoBad = Integer.toString(getHours());
        return charToString(Integer.parseInt(String.valueOf(whyIsMyCodeSoBad.charAt(1))));
    }

    public BaseNumber getNumberThree() {
        String whyIsMyCodeSoBad = Integer.toString(getMinutes());
        return charToString(Integer.parseInt(String.valueOf(whyIsMyCodeSoBad.charAt(0))));
    }

    public BaseNumber getNumberFour() {
        String whyIsMyCodeSoBad = Integer.toString(getMinutes());
        return charToString(Integer.parseInt(String.valueOf(whyIsMyCodeSoBad.charAt(1))));
    }

    public BaseNumber charToString(int fuckThisIsAwful) {
        if (fuckThisIsAwful == 1) {
            return new One();
        } else if (fuckThisIsAwful == 2) {
            return new Two();
        } else if (fuckThisIsAwful == 3) {
            return new Three();
        } else if (fuckThisIsAwful == 4) {
            return new Four();
        } else if (fuckThisIsAwful == 5) {
            return new Five();
        } else if (fuckThisIsAwful == 6) {
            return new Six();
        } else if (fuckThisIsAwful == 7) {
            return new Seven();
        } else if (fuckThisIsAwful == 8) {
            return new Eight();
        } else if (fuckThisIsAwful == 9) {
            return new Nine();
        } else {
            return new Zero();
        }
    }
}
