/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.minutesconversion;
import java.util.Scanner;

public class MinutesConversion {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double minutes;
        double hours;
        double days;
        
        System.out.println("Enter the minutes");
        minutes = sc.nextInt();
        
        hours = minutes / 60;
        days = hours / 24;
        
        System.out.println("The numbers of hours is : "+hours);
          System.out.println("The numbers of days is : "+days);
        

    }
}
