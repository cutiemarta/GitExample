package com.company;

public class Dog
{
    String name;
    private int numberOfLegs;

    public Dog(String name)
    {
        this();
        this.name = name;
    }

    public Dog()
    {
        this.numberOfLegs = 4;
    }

    public String getName() {
        return name;
    }

    public int getNumberOfLegs() {
        return numberOfLegs;
    }

    public void setName(String name) {
        this.name = name;
    }

    public static void sayHi(){
        System.out.println("Hi");
    }

    public void setNumberOfLegs(int numberOfLegs) {
        this.numberOfLegs = numberOfLegs;
    }

    public void bark()
    {
        System.out.println("Hau hau");
    }
}

//new tworzy obiekt, konstruktor inicjalizuje
//hermetyzacja ukrywanie jak najwiecej od strony programisty