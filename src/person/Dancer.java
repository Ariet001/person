package person;

public class Dancer extends Person {
    private static void dancing (){System.out.println("I can create  great thinhs");
}

    public void sleep() {System.out.println("I sleep at 23:00 p.m");}

    public void awake() {System.out.println("I wake up at 7:00");}

    public Dancer() {

    }

    public Dancer(String name, String surName, int age) {super(name, surName, age);}

    public String toString() {return "Dancer" + super.toString();}
}

