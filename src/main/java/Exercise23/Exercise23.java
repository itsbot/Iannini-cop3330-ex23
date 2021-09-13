/*
 *  UCF COP3330 Fall 2021 Exercise 23 Solution
 *  Copyright 2021 Patrick Iannini
 */
package Exercise23;
import java.util.Scanner;

public class Exercise23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Is the car silent when you turn the key?");
        if (sc.next().equals("y")) {
            System.out.println("Are the battery terminals corroded?");
            if (sc.next().equals("y")) {
                System.out.println("Clean terminals and try starting again");
                System.exit(1);
            } else {
                System.out.println("Replace cables and try again");
                System.exit(1);
            }
        } else {
            System.out.println("Does the car make a slicking noise?");
            if (sc.next().equals("y")) {
                System.out.println("Replace the battery");
            } else {
                System.out.println("Does the car crank up but fail to start?");
                if (sc.next().equals("y")) {
                    System.out.println("Check the spark plug connections");
                    System.exit(1);
                } else {
                    System.out.println("Does the engine start and then die?");
                    if (sc.next().equals("y")) {
                        System.out.println("Does your car have fuel injection?");
                        if (sc.next().equals("y")) {
                            System.out.println("Get it in for service");
                            System.exit(1);
                        } else {
                            System.out.println("Check to ensure the choke is opening and closing");
                            System.exit(1);
                        }
                    } else {
                        System.out.println("This should not be possible");
                        System.exit(1);
                    }
                }
            }
        }

    }
}
