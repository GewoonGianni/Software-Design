package com.giannissupervettesoftwarebedrijfbvllcfirma.students;

import com.giannissupervettesoftwarebedrijfbvllcfirma.Student;

public class Gianni extends Student {
    public Gianni() {
        super("Gianni");
    }

    @Override
    public String getOpinion() {
        String msg = "Lekker blijven beunen met %s. Vooral een bak zin meegenomen want ik heb er zin in!";

        return msg;
    }
}
