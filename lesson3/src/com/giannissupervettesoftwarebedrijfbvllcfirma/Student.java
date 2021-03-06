package com.giannissupervettesoftwarebedrijfbvllcfirma;

public abstract class Student implements Observer{
    public String name;

    public Student(String name) {
        this.name = name;
    }

    public void listen (String topic){
        String opinion = String.format(this.getOpinion(), topic);
        String thinkAloud = String.format("[%s] > %s ", this.name, opinion);

        Console.writeLine(thinkAloud);
    }

    public void update(String topic) {
        this.listen(topic);
    }

    public abstract String getOpinion();
}
