/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalib;

import java.util.Scanner;

/**
 *
 * @author jevans
 */
public class JavaLib {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String firstName;
        String age;
        String adjective1;
        String teacher;
        String restaurant;
        String subject;
      
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter your first name" );
        firstName = sc.nextLine();
        
        System.out.println("Great to meet ya, " +firstName +"! I'm Libby, the JavaLib AI! Welcome to the JavaLib! ");
        System.out.println("Please give me your age (Don't be shy, I won't tell anyone how old you are :) ) " );
        age = sc.nextLine();
        
        System.out.println("How lovely! Could you please give me an adjective, " +firstName + "? " );
        adjective1 = sc.nextLine();
        
        System.out.println("Who was your favorite teacher in elementary school?" );
        teacher = sc.nextLine();
        
        System.out.println("What subject/grade did they teach?" );
        subject = sc.nextLine();
        
        System.out.println("What is your favorite restaurant?");
        restaurant = sc.nextLine();
        
        System.out.println("You would never believe what happened to me on my " +age + "th birthday! It was pretty " +adjective1 + "! ");
        System.out.println("I went to eat at " +restaurant + ", and I saw my old " +subject +" teacher, " +teacher +"! ") ;
        System.out.println( teacher + " smiled and waved hi to me. \"Good to see you, " +firstName + "!\" " +teacher + " said. ");
        System.out.println("\"It's been so long! What are you doing here?\" " +teacher + " asked. \" It's my birthday!\" I said with a smile.");
        
    }
    
}
