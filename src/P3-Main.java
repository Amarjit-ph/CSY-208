/*
   PRACTICAL NO.3
   Create an application to calculate interest for FD’s , RD’s based on certain conditions using inheritance.
   
*/

import java.util.Scanner; 
abstract class Account 
{ 
 double intrestRate; 
 double amount; 
 abstract double calculateInterest(); 
} 
class FDAccount extends Account 
{ 
 double calculateInterest() 
 { 
  double interestRate = 0 ; 
  double amount; 
  int noofdays ; 
  int age;   
  Scanner ob  =new Scanner(System.in); 
  System.out.println("Enter ammount = "); 
  amount = ob.nextInt(); 
  System.out.println("Enter number of days  = "); 
  noofdays = ob.nextInt();  
  if(amount< 10000000) 
  { 
   System.out.println("Enter age of Customer = "); 
   age = ob.nextInt();  
   if(age>= 60) 
   { 
    if((noofdays>= 7) && (noofdays<=14)) 
    { 
     double r = ((5.0)/100); 
     System.out.println(r); 
     interestRate = amount * r;   
    } 
    if((noofdays>= 15) && (noofdays<=29)) 
{ 
     double r= ((5.25)/100); 
     System.out.println(r); 
     interestRate = amount * r;  
    } 
    if((noofdays>= 30) && (noofdays<=45)) 
    { 
     double r= ((6.0)/100); 
     System.out.println(r); 
     interestRate = amount * r;  
    } 
    if((noofdays> 45) && (noofdays<=60)) 
    { 
     double r= ((7.5)/100); 
     System.out.println(r); 
     interestRate = amount * r;   
    } 
    if((noofdays>= 61) && (noofdays<=184)) 
    { 
     double r= ((8.0)/100); 
     System.out.println(r); 
     interestRate = amount * r;  
    } 
    if((noofdays>= 185) && (noofdays<=365)) 
    { 
     double r= ((8.50)/100); 
     System.out.println(r); 
     interestRate = amount * r;   
    } 
   } 
   else 
    if(age< 60)  
    { 
     if((noofdays>= 7) && (noofdays<=14)) 
     { 
      double r= ((4.5)/100); 
      System.out.println(r); 
      interestRate = amount * r;  
     } 
     if((noofdays>= 15) && (noofdays<=29)) 
     { 
      double r= ((4.75)/100); 
      System.out.println(r); 
      interestRate = amount * r; 
} 
     if((noofdays>= 30) && (noofdays<=45)) 
     { 
      double r= ((5.50)/100); 
      System.out.println(r); 
      interestRate = amount * r;   
     } 
      
     if((noofdays> 45) && (noofdays<=60)) 
     { 
      double r= ((7.0)/100); 
      System.out.println(r); 
      interestRate = amount * r;  
     } 
     if((noofdays>= 61) && (noofdays<=184)) 
     { 
      double r= ((7.5)/100); 
      System.out.println(r); 
      interestRate = amount * r;   
     } 
      
     if((noofdays>= 185) && (noofdays<=365)) 
     { 
      double r= ((8.0)/100); 
      System.out.println(r); 
      interestRate = amount * r;  
     } 
    } 
  } 
  else 
   if(amount>=10000000) 
   { 
    if((noofdays>= 7) && (noofdays<=14)) 
    { 
     double r= ((6.50)/100); 
     System.out.println(r); 
     interestRate = amount * r;  
    } 
    if((noofdays>= 15) && (noofdays<=29)) 
    { 
     double r= ((6.75)/100); 
     System.out.println(r); 
     interestRate = amount * r;   
    } 
    if((noofdays>= 30) && (noofdays<=45)) 
{ 
     double r= ((6.75)/100); 
     System.out.println(r); 
     interestRate = amount * r;   
    } 
    if((noofdays> 45) && (noofdays<=60)) 
    { 
     double r= ((8.0)/100); 
     System.out.println(r); 
     interestRate = amount * r;   
    } 
    if((noofdays>= 61) && (noofdays<=184)) 
    { 
     double r= ((8.50)/100); 
     System.out.println(r); 
     interestRate = amount * r;     
    } 
    if((noofdays>= 185) && (noofdays<=365)) 
    { 
     double r= ((10.0)/100); 
     System.out.println(r); 
     interestRate = amount * r;  
    } 
   } 
  ob.close(); 
  return interestRate; 
 } 
} 
class RDAccount extends Account 
{ 
 double interestRate, interest= 0.0; 
 double amount; 
 int noOfMonths,age; 
 double monthlyAmount;  
 double calculateInterest() 
 { 
  Scanner ob = new Scanner(System.in); 
  System.out.println("Enter per month Ammount = "); 
  monthlyAmount = ob.nextDouble();  
  System.out.println("Enter no of Months = "); 
  noOfMonths = ob.nextInt(); 
System.out.println("Enter the age of customer = "); 
  age = ob.nextInt(); 
  amount=(monthlyAmount*noOfMonths); 
  if(age>=60) 
  { 
  if(noOfMonths>=6 &&noOfMonths<9) 
  { 
   interestRate = 8.00; 
  } 
  if(noOfMonths>=9 &&noOfMonths<12) 
  { 
   interestRate = 8.25; 
  } 
  if(noOfMonths>=12 &&noOfMonths<15) 
  { 
   interestRate = 8.50; 
  } 
  if(noOfMonths>=15 &&noOfMonths<18) 
  { 
   interestRate = 8.75; 
  } 
  if(noOfMonths>=18 &&noOfMonths<21) 
  { 
   interestRate = 9.00; 
  } 
  if(noOfMonths>=21) 
  { 
   interestRate = 9.25; 
  } 
   
  } 
  else 
   if(age<60)   
   { 
    if(noOfMonths>=6 &&noOfMonths<9) 
    { 
     interestRate = 7.50; 
    }  
    if(noOfMonths>=9 &&noOfMonths<12) 
    { 
     interestRate = 7.75; 
} 
    if(noOfMonths>=12 &&noOfMonths<15) 
    { 
     interestRate = 8.00; 
    }  
    if(noOfMonths>=15 &&noOfMonths<18) 
    { 
     interestRate = 8.25; 
    } 
    if(noOfMonths>=18 &&noOfMonths<21) 
    { 
     interestRate = 8.50; 
    } 
    if(noOfMonths>=21) 
    { 
     interestRate = 8.75; 
    } 
   } 
  ob.close(); 
  interest = (interestRate/100)*amount; 
  return interest; 
 } 
} 
class SBAccount extends Account 
{ 
 double interestRate=0.000; 
 double interest; 
 double amount; 
 int type;  
 Scanner ob = new Scanner(System.in); 
 double calculateInterest() 
 { 
  System.out.println("Enter Amount = "); 
  amount = ob.nextInt(); 
  System.out.println("Press 1 for Normal Account \nPress 2 for NRI :: "); 
  type = ob.nextInt(); 
  if(type == 1) 
   { 
   interestRate = 0.04; 
   } 
  else 
   if(type == 2) 
{ 
    interestRate = 0.06; 
    } 
  interest = interestRate*amount; 
  ob.close(); 
 return interest;  
 } 
} 
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		  String name; 
		  int choice; 
		  Scanner o = new Scanner(System.in); 
		  System.out.print("\n17BCS2198"); 
		  System.out.print("\nAMARJIT PHEIROIJAM\n"); 
		  System.out.print("\nEnter Customer name :"); 
		  name = o.next(); 
		  System.out.print(" Select the following options: \n1. Interest Calculator -- SB\n2. Interest Calculator -- FD\n3. Interest Calculator -- RD\n4. Exit\nWhat is your Choice "+name+" : "); 
		  choice  =o.nextInt(); 
		  switch(choice) 
		  { 
		  case 1 : SBAccount ob1 = new SBAccount(); 
		    System.out.println(" Interest amount you will get = "+ob1.calculateInterest()); 
		    break; 
		  case 2 : FDAccount ob2 = new FDAccount(); 
		  System.out.println(" Interest amount you will get = "+ob2.calculateInterest()); 
		  break; 
		  case 3 : RDAccount ob = new RDAccount(); 
		    System.out.println(" Interest amount you will get = "+ob.calculateInterest()); 
		  break; 
		  case 4 : break; 
		  } 
		  o.close(); 

	}

}

