package com.giannissupervettesoftwarebedrijfbvllcfirma;

public class Student {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private int studentNumber;

    public int getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(int studentNumber) {
        this.studentNumber = studentNumber;
    }

    private String favoriteSubject;

    public String getFavoriteSubject() {
        return favoriteSubject;
    }

    public void setFavoriteSubject(String favoriteSubject) {
        this.favoriteSubject = favoriteSubject;
    }

    public Student (String name, int age, int studentNumber, String favoriteSubject){
        this.name = name;
        this.age = age;
        this.studentNumber = studentNumber;
        this.favoriteSubject = favoriteSubject;
    }

    public static void main(String[] args) {
        System.out.println();
    }
}
