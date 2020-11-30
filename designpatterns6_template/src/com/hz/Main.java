package com.hz;

public class Main {

    // READ THE INSTRUCTIONS IN THIS METHOD, PLEASE!!!
    public static void main(String[] args) {

        // Lets print some cards
        Printer printer = new Console();

        // Lets make some cards
        PostCard postCard = new PostCard(printer);
        HighSchoolGraduationCard highSchoolGraduationCard = new HighSchoolGraduationCard(printer);
        ChristmasCard christmasCard = new ChristmasCard(printer);

        postCard.print();
        highSchoolGraduationCard.print();
        christmasCard.print();
    }
}
