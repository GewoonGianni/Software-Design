package com.giannissupervettesoftwarebedrijfbvllcfirma;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;

public class Console {

    public Console() throws FileNotFoundException {
        System.setOut(new PrintStream(new File("studenten.txt")));
    }

    static void print(String message){
        System.out.println(message);
    }
}
