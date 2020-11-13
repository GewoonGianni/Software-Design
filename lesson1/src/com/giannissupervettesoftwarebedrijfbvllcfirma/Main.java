package com.giannissupervettesoftwarebedrijfbvllcfirma;

public class Main {

    public static void main(String[] args) {
        Console.print("Hello, welcome to this script");

        // make new student
        Student student1 = new Student ("Gianni Meesters", 18,80860, "Any subject about writing messed up code");

        // make second student
        Student student2 = new Student ("Tim Kardol", 20, 10000, "Zeelandbrug");

        School hz = new School("HZ");

        hz.entrance(student1);
        hz.entrance(student2);

        Console.print(hz.listStudentPasses());

        Facebook facebook = new Facebook();

        FacebookPage facebookPage = new FacebookPage(student1, facebook);
        FacebookPage facebookPage2 = new FacebookPage(student2, facebook);

        facebook.listPages();
    }
}
