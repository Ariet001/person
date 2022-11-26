package person;

public class Programmer extends Person {
    public static void programming() {System.out.println("I can create  great thinhs");}

    public void sleep() {System.out.println("I sleep at 23:00 p.m");}

    public void awake() {System.out.println("I wake up at 7:00");}

    public Programmer() {

    }

    public Programmer(String name, String surName, int age) {super(name, surName, age);}

    public String toString() {return "Programmer" + super.toString();}
}








