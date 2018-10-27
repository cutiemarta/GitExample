package com.company;

import java.util.Random;

public class Dices {
    private int howManyDices;

    Dices(int howManyDices)
    {
        this.howManyDices = howManyDices;
    }

    public int[] throwDices()
    {
        int[] results = new int[howManyDices];
        for (int i = 0; i < howManyDices; ++i) {
            results[i] = (int)(Math.random() * 6) + 1;
        }
        return results;
    }

    public String throwDices2()
    {
        StringBuilder stringBuilder = new StringBuilder();
        Random random = new Random();
        for (int i = 0; i < howManyDices; ++i)
        {
            stringBuilder.append(random.nextInt(6) + 1).append(", ");
        }
        return stringBuilder.toString().substring(0, stringBuilder.toString().length()-2);
    }
}
//