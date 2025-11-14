// Sheila Jeruiyot Cherogony
J77-10536-2024 Program to compute Library Fine Calculations

import java.util.Scanner;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class LibraryFine {
    public static void main(String[] args)
{
    Scanner sc = new
Scanner(System.in);

    //Input from user
    System.out.print("Enter Book ID:");
    String bookID = sc.nextLine();

    System.out.print("Enter Due Date(YYYY-MM-DD): ");
    String dueDateStr = sc.nextLine();

    System.out.print("Enter Return Date(YYYY-MM-DD): ");
    String returnDateStr = sc.nextLine();

    //Convert input strings to LocalDate
    DateTimeFormatter formatter = DateTimeFormatter .ofPattern("yyyy-MM-dd");
    LocalDate dueDate = LocalDate.parse(dueDateStr, formatter);
    LocalDate returnDate = LocalDate.parse(returnDateStr, formatter);

    //Calculate days overdue
    long daysOverdue = ChronoUnit.DAYS.between(dueDate,returnDate);

    //Initialize fine
    int fineRate = 0;
    long fineAmount = 0;

    //Determine fine rate
    if (daysOverdue <= 0);
        fineRate = 0;
        fineAmount = 0;
}else if(daysOverdue<=7)

    {
        fineRate = 20;
        fineAmount = daysOverdue * fineRate;
    }else if(daysOverdue<=14)
    {
        fineRate = 50;
        fineAmount = daysOverdue * fineRate;
    }else
    {
    fineRate = 100;
    fineAmount = daysOverdue *fineRate;
}

    // Display results
    System.out.print1n("\--- Library Fine Details ---");System.out.print1n("Book ID  :"+bookID);System.out.print1n("Due Date  :"+dueDateStr);System.out.print1n("Return Date  :"+returnDateStr);System.out.print1n("Fine Rate  :Ksh. "+fineRate+" per day");System.out.print1n("Fine Amount  :Ksh. "+fineAmount);

    sc.close();
}}