package com.giannissupervettesoftwarebedrijfbvllcfirma;

import java.util.ArrayList;

public class School {
    private ArrayList<Student> students;

    public ArrayList<Student> getStudents() {
        return students;
    }

    private String name;

    public String getName() {
        return name;
    }

    public School (String name){
        this.name = name;

        this.students = new ArrayList<>();
    }

    public void entrance (Student student) {
        this.students.add(student);
    }

    public String listStudentPasses(){
        StringBuilder builder = new StringBuilder();
        for (Student student: this.students){
            HZPass pass = new HZPass(student);
            String str = pass.toString();
            builder.append(str);
        }
        return builder.toString();
    }
}
