package com.giannissupervettesoftwarebedrijfbvllcfirma;

public class Main {

    public static void main(String[] args) {
        Console.print("Hello, welcome to this script");

        // make new student
        Student student1 = new Student ("Gianni Meesters", 18,80860, "Anything that let's us make stuff");

        // make second student
        Student student2 = new Student ("Tim Kardol", 19, 10000, "Zeelandbrug");

        School hz = new School("HZ");

        hz.entrance(student1);
        hz.entrance(student2);

        Console.print(hz.listStudentPasses());

        FacebookPage facebookPage = new FacebookPage(student1);

        facebookPage.printFacebookPage();
    }
}
