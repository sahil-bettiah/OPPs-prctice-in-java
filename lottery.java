package com.company;

//Suppose you want to develop a program to play lottery. The program
//        randomly generates a lottery of a two-digit number, prompt the user to
//        enter a two-digit number, and determines whether the user wins the
//        following rules:
//        i. If the user input matches the lottery in exact order, the award is
//        1,00,000/-
//        ii. If the digits of the user input match the digits of lottery, the award
//        is 50,000/-
//        iii. If one digit in the user input matches a digit in the lottery, the
//        award is 20,000/-

import java.util.Random;
import java.util.Scanner;

public class lottery {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        Random rand = new Random();
        int ans = rand.nextInt(90) + 10;
        System.out.println("Enter your number");
        int num = input.nextInt();
        System.out.println(ans);
        if (ans==num)
            System.out.println("You won 1 lakhs");
        else if (ans/10 == num%10 && ans%10 == num/10)
            System.out.println("You won 50 thousand");
        else if (ans/10 == num/10 || ans/10 == num%10 ||ans%10 == num/10 || ans%10 == num%10 )
            System.out.println("You won 20 thousand");
        else
            System.out.println("Better luck next time");

    }
}
