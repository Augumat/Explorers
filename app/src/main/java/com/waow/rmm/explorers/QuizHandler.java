package com.waow.rmm.explorers;

import java.util.ArrayList;

public class QuizHandler
{
    private static ArrayList<String> answers;
    public static void add(String toAdd)
    {
        if (answers == null)
        {
            reset();
        }
        answers.add(toAdd);
    }
    public static int tally()
    {
        int[] count = new int[4];
        for (String current: answers)
        {
            count[current.length() - 1]++;
        }
        int largestIndex = 0;
        int largestValue = 0;
        for (int i = 0; i < count.length; i++)
        {
            if (count[i] > largestValue)
            {
                largestValue = count[i];
                largestIndex = i;
            }
        }
        return largestIndex + 1;
    }
    public static void reset()
    {
        answers = new ArrayList<>();
    }
}
