/* The process of finding the largest value is used frequently in
 computer applications. For example, a program that determines 
 the winner of a sales contest would input the number of units sold
by each salesperson. The salesperson who sells the most units 
wins the contest. Write a pseudocode program, then a 
Java application that inputs a series of 10 integers and
determines and prints the largest integer. Your program should
use at least the following three variables:

counter: A counter to count to 10 (i.e., to keep track of how
many numbers have been input and to determine when 
all 10 numbers have been processed).

number: The integer most recently input by the user.

largest: The largest number found so far.
*/
import java.util.Scanner;
import java.util.Set;
import java.util.ArrayList;



public class four21 {
    public int empUnits;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO SALES_CONTEST.EXE");
        System.out.println("Enter the number of contestants(10)");
        int emps = sc.nextInt();
        int counter = emps;


        List<four21> empList = new ArrayList<>();

        while (counter > 10) {
            four21 newEmp = new four21();
            System.out.println("enter employee units sold");
            newEmp.empUnits = sc.nextInt();
            empList.add(newEmp);

            counter = counter - 1;

        }
        for (four21 e : empList) {
            // Get student info
            System.out.println("Student number is: "+e.empUnits);
        }
    }
}
