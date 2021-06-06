package ex23.base;

/* UCF COP3330 Summer 2021 Assignment 1 Solution
   Copyright 2021 Rachel Schwarz
*/

import java.util.Scanner;

public class ex23 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Is the car silent when you turn the key? ");
        String answer = input.nextLine();
        if(answer.equals("y")) {
            System.out.print("Are the battery terminals corroded? ");
            answer = input.nextLine();
            if(answer.equals("y")) {
                System.out.println("Clean the terminals and try starting again.");
                return;
            }
            else {
                System.out.println("Replace cables and try again.");
                return;
            }
        }
        else {
            System.out.print("Does the car make a slicking noise? ");
            answer = input.nextLine();
            if(answer.equals("y")) {
                System.out.println("Replace the battery.");
                return;
            }
            else {
                System.out.print("Does the car crank up but fail to start? ");
                answer = input.nextLine();
                if(answer.equals("y")) {
                    System.out.println("Check spark plug connection.");
                    return;
                }
                else {
                    System.out.print("Does the engine start and then die? ");
                    answer = input.nextLine();
                    if(answer.equals("y")) {
                        System.out.print("Does your car have fuel injection? ");
                        answer = input.nextLine();
                        if(answer.equals("y")) {
                            System.out.println("Get it in for service.");
                            return;
                        }
                        else {
                            System.out.println("Check t0 make sure the choke is opening and closing.");
                            return;
                        }
                    }
                    else{
                        System.out.println("This should not be possible.");
                        return;
                    }
                }
            }
        }
    }
}
