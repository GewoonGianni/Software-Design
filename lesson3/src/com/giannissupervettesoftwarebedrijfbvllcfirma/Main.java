package com.giannissupervettesoftwarebedrijfbvllcfirma;

import com.giannissupervettesoftwarebedrijfbvllcfirma.students.*;

public class Main {

    public static void main(String[] args) {
        Teacher gianni = new Teacher();

        Student kees = new Kees();
        Student marie = new Marie();

        gianni.subscribe(kees);
        gianni.subscribe(marie);

        Student gianniStudent = new Gianni();
        gianni.subscribe(gianniStudent);

        gianni.teach();

        gianni.unsubscribe(gianniStudent);
    }
}
