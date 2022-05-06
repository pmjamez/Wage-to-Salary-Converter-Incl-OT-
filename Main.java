package com.company;

import java.text.NumberFormat;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Double HW, HPW, WPY, SPY;

        while(true) {
            System.out.print("Type '1' to convert Wage to Salary, Type '2' to convert Salary to Wage." + "\n");
            int SoW;
            SoW = scan.nextInt();
            if (SoW == 1) {
                System.out.print("Enter your hourly wage:" + "\n");
                HW = scan.nextDouble();
                System.out.print("How many hours do you work per week? " + "\n");
                HPW = scan.nextDouble();
                System.out.print("How many weeks do you work in a given year?" + "\n");
                WPY = scan.nextDouble();
                if (HPW >= 40) {
                    Double OTP = (HPW - 40) * (HW * 1.5) * WPY;
                    Double RoughSalaryOT = ((HW * 40 * WPY) + OTP);
                    String output = NumberFormat.getCurrencyInstance().format(RoughSalaryOT);
                    System.out.print("Your salary based on the information given is roughly: " + output + " per year.");
                    break;

                } else {
                    Double RoughSalary = HW * HPW * WPY;
                    String output = NumberFormat.getCurrencyInstance().format(RoughSalary);
                    System.out.print("Your salary based on the information given is roughly: " + output + " per year.");
                    break;

                }
            } else if (SoW == 2) {
                System.out.print("Enter your yearly salary:" + "\n");
                SPY = scan.nextDouble();
                System.out.print("How many hours do you work per week?" + "\n");
                HPW = scan.nextDouble();
                System.out.print("How many weeks do you work in a given year?" + "\n");
                WPY = scan.nextDouble();
                Double WFS = SPY / HPW / WPY;
                String output = NumberFormat.getCurrencyInstance().format(WFS);
                System.out.print("Your wage based on the information given is roughly: " + output + " per hour.");
                break;

            } else{
                System.out.print("Not a valid option!" + "\n");
                continue;

            }
        }
    }
}
