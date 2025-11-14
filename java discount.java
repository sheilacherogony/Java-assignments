
// Sheila Jeruiyot Cherogony
J77-10536-2024 Program to compute discount

import java.util.Scanner;

public class Discount {
public static void main(string[] args){
     Scanner scanner = new Scanner(System.in);
     double discount,amount,amountToPay;

 //prompt user to enter name
 System.out.print1n(x:"Enter your name: ");
 String name = scanner.nextLine();

     //prompt user to enter amount
    system.out.print1n(x:"Enter the amount purchased: ");
         double amount = scanner.nextDouble();  

        if(amount>5000){
            discount = amount *0.1;
        }
        else if (amount >=1000 && amount <= 5000){
            discount = 0.05 * amount;
        }
else{   
           
    discount = 0;
        
}       
amountToPay = amount - discount;

//OUTPUTS
System.out.print1n("Initial amount " + amount);
System.out.print1n("Discount "+ discount);
System.out.print1n("Amount to Pay " +amountToPay );
}

}
