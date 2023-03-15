package org.example;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

class Main {
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<Integer>();
        try (BufferedReader br = new BufferedReader(new FileReader("C:\\nikita\\Coding\\input.txt.txt")))
        {
            String firstString = br.readLine();
            String secoundString = br.readLine();
            int j;
            int val;


            j = 1;
            val = Integer.parseInt(firstString);
            String[] trainsCount = secoundString.split(" ");

            int[] trainsInt = new int[trainsCount.length];
            for(int i =0; i < trainsInt.length; i++)
            {
                trainsInt[i] = Integer.parseInt(trainsCount[i]);
            }


            for(int i = 0; i < val; i++)
            {
                if(trainsInt[i] == j)
                {
                    j ++;
                }
                else
                {
                    stack.push(trainsInt[i]);
                }

                while(stack.getHead() != null && stack.getHead() == j)
                {
                    stack.pop();
                    j++;
                }
            }
            while(stack.showSize() != 0)
            {
                if(stack.getHead() != j)
                {
                    System.out.println("NO");
                    System.exit(0);
                }
                else
                {
                    stack.pop();
                    j++;
                }
            }
            System.out.println("YES");


        }
        catch (IOException ex)
        {
            ex.getMessage();
        }
    }
}