package First.Homework;

import java.util.Scanner;

public class MyFirstJavaHomework {

    public static void main (String[] args) {

        System.out.println("Enter your name:");

        Scanner scanner = new Scanner(System.in);

        String firstName = scanner.next();

        System.out.println("Enter your favourite hobby: ");
        String Hobby = scanner.next();

        System.out.println("Hello " + firstName + " your favourite hobby is: " + Hobby);


    }
    }


