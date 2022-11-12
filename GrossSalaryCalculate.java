// Assume a suitable value for Ramesh basic salary .His dearness allowance is 40% of his basic salary , and house rent allownace is 20% of basic salary . Write a java program to calculate his gross salary.
import java.util.Scanner;
public class GrossSalaryCalculate
{
 public static void main(String[] args) {
    RameshSalary();
 }
 public static void RameshSalary()
 {
    Scanner scanner=new Scanner(System.in);
    System.out.println();
    System.out.println("================================================");
    System.out.println("\nTHIS IS GROSS SALARY CALCULATION OF RAMESH \n");
    System.out.println("================================================");
    double basic_salary;
    double dearness_allownace;
    double house_rent_allownace;
    double gross_salary;
    byte value;
    do
    {
    System.out.println("ENTER BASIC SALARY (/-) :");
    basic_salary=scanner.nextDouble();
    dearness_allownace=(40*basic_salary)/100;
    house_rent_allownace=(basic_salary*20)/100;
    gross_salary=dearness_allownace+house_rent_allownace+basic_salary;
    System.out.println("IF BASIC SALARY WILL BE "+basic_salary+"/- \nTHEN ---------");
    System.out.println("RAMESH'S DEARNESS ALLOWNACE : "+dearness_allownace+"/- \n");
    System.out.println("RAMESH'S HOUSE RENT ALLOWNACE :"+house_rent_allownace+"/- \n");
    System.out.println("RAMESH'S GROSS SALARY :"+gross_salary+"/- \n");
    System.out.println("======================================\n");
     System.out.println("DO YOU WANT TO CONTINUE THIS IS PROGRAM THEN PRESS 1 ELSE 0 .");
     value=scanner.nextByte();
    }while(value == 1);
    System.out.println("PROGRAM IS END !!!\nTHANKS !!!");

 }
}