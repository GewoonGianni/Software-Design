package com.giannissupervettesoftwarebedrijfbvllcfirma;

public class HZPass {
    private Student student;

    public Student getStudent() {
        return student;
    }

    public HZPass(Student student){
        this.student = student;
    }

    @Override
    public String toString(){
        String pass = "Naam: " + student.getName() + ", Studentnummer: " + student.getStudentNumber() + ", Leeftijd: " + student.getAge();
        return pass;
    }
}
