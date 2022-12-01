package main;

import person.Dancer;
import person.Programmer;
import person.Singer;

public class Main {
    public static void main(String[] args){
        System.out.println(person()+"\n");
        System.out.println(sing()+"\n");
        System.out.println(dancer());
    }

    private static Programmer person() {
        Programmer programmer = new Programmer();
        programmer.setName("Dastan");
        programmer.setSurName("KALMAMATOV");
        programmer.setAge(7);
        programmer.sleep();
        programmer.awake();
        return programmer;
    }

    private static Singer sing() {
        Singer singer = new Singer();
        singer.setName("Kurmanbek");
        singer.setSurName("MASHAPOV");
        singer.setAge(34);
        singer.sleep();
        singer.awake();
        return singer;
    }

    private static Dancer dancer() {
        Dancer dancer = new Dancer();
        dancer.setName("Daniel");
        dancer.setSurName("PAZYLOV");
        dancer.setAge(02);
        dancer.sleep();
        dancer.awake();
        return dancer;
    }

}
