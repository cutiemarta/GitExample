package com.company;

//import java.util.Objects;

public class Person
{
    private String name;
    private String surname;
    private int age;
    private Gender gender;

    @Override
    public boolean equals(Object o) { //w javie wszystko obiektem
        Person otherPerson = (Person)o;
        return this.age == otherPerson.age && this.name.equals(otherPerson.name)
                && this.surname.equals(otherPerson.surname) && this.gender == otherPerson.gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }

    Person(String name, String surname, int age, Gender gender) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public void showInfo() {
        System.out.println("Imie i nazwisko: " + name + " " +surname + ", wiek: " + age + ", plec: " + gender);
    }
}
