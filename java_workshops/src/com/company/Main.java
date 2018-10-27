package com.company;
//@Data_costam zeby wygenerowalo wszystko

public class Main {

    public static void main(String[] args)
    {
	// write your code here
        Dog reksio = new Dog("Reksio");
        reksio.setNumberOfLegs(3);
        reksio.bark();
        Dog.sayHi();

        Person p1 = new Person("Jan", "Kowalski", 30, Gender.MALE);
        Person p2 = new Person("Jan", "Kowalski", 30, Gender.MALE);
        System.out.println(p1.toString());
        p1.showInfo();

        Dices dices = new Dices(5);
        int[] results = dices.throwDices();
        for (int i = 0; i < results.length; ++i)
        {
            System.out.println(results[i]);
        }
        System.out.println(dices.throwDices2());

        String a = new String("Java");
        String b = new String("Java");
        String c = "Java";
        String d = "Java";

        System.out.println(a==b);
        System.out.println(d==c);

        if (p1.equals(p2) == true)
            System.out.println("p1 == p2");
    }
}
//obiekty porownywane po hashcodzie


//git init clone add commit push pull status long merge checkout(-b) stash