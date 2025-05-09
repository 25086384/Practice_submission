/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject10;

import java.util.Scanner;

public class Insurance {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the current year: ");
        int currentYear = scanner.nextInt();

        System.out.print("Enter your birth year: ");
        int birthYear = scanner.nextInt();

        int premium = calculatePremium(currentYear, birthYear);
        System.out.println("Your insurance premium is: $" + premium);
        
    }

    
    public static int calculatePremium(int currentYear, int birthYear) {
        int age = currentYear - birthYear;
        int ageDecade = age / 10; 
        return (ageDecade + 15) * 20;
    }
}

