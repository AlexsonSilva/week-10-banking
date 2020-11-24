package com.company;

import java.util.Scanner;

public class LoggingIn {

    private static String MENU = "\nPlease select one of the following options:\n" +
            "1: Bank Employee.\n" +
            "2: Customer.\n" +
            "3: Exit program.\n\n" +
            "> ";

    public LoggingIn(){
        Scanner sc = new Scanner(System.in);

        boolean keepRunning = true;
        while (keepRunning){
            System.out.println(MENU);
            String option = sc.nextLine();

            switch (option){
                case "1":
                    break;
                case "2":
                    break;
                case "3":
                    System.out.println("Exiting program");
                    keepRunning = false;
                    break;
                default:
                    System.out.println("Invalid option. Please select one of the following options: \n");
            }
        }

    }
}
