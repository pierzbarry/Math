package com.company;

import java.util.Scanner;

public class Main{

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your exam score:" );
        int grade = scan.nextInt();

        // An if statement with only one line of code to run
        // does not require braces
        if (grade < 60)
            System.out.println("ur going to hell lol. Also your grade is F");
        else if (grade < 70)
            System.out.println("wow ur awful. Your grade is D.");
        else if (grade <  74)
            System.out.println("my lord try harder you're a disappointment, you get a C-");
        else if (grade < 77)
            System.out.println("lol okay.. C");
        else if (grade < 80)
            System.out.println("pathetic, C+");
        else if (grade < 84)
            System.out.println("barely managed to get a B-");
        else if (grade < 87)
            System.out.println("dude...lol ok, your grade is B");
        else if (grade < 90)
            System.out.println("well you tried but you're barely average, B+");
        else if (grade < 94)
            System.out.println("You got an A-...which is fine I guess but honestly you should be disappointed with yourself");
        else if (grade < 97)
            System.out.println("Your grade is A! Congrats! Dont let this make you forget no one likes you");
        else if (grade < 100)
            System.out.println("Great you got an A+, who cares? You're gonna burn out in life soon anyways so enjoy it while it lasts");
        else {
            // since the else has multiple lines of code to run
            // we use  braces {} to wrap them in a code block
            System.out.println("invalid exam score you dumb bitch");
            System.out.println("lol you tried");
        }
    }
}

