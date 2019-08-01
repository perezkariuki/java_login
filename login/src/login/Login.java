/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package login;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class Login {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Would you like to login like Doctor or Patient");
        System.out.println("\t1.Docter\n\t2.Patient");
        System.out.println("Enter your choice");
        int choice=input.nextInt();
        if(choice==1){
        System.out.println("The Docters platform");
        System.out.println("Enter user name");
        String name =input.next();
        System.out.println("Enter password");
        String password=input.next();
        if((name.equals("perez"))&&(password.equals("man"))){
        System.out.println("Successfully loged in");
        }else{
        System.out.println("Wrong Details");
        }
        }
        else if(choice==2){
        System.out.println("Patient platform");
        System.out.println("Enter user name");
        String name =input.next();
        System.out.println("Enter password");
        String password=input.next();
        if((name.equals("oness"))&&(password.equals("man1"))){
            System.out.println("Successfully loged in");
        }else{
        System.out.println("Wrong Details");
        }
        }
        // TODO code application logic here
    }
    
}
