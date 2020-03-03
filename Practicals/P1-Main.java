import java.util.*;
public class Main{
public static void main(String[] args) {
	
	Scanner s = new Scanner(System.in);
	int eno[]={1001,1002,1003,1004,1005,1006,1007};
	String ename[]={"Ashish","Sushma","Rahul","Chahat","Ranjan","Suman","Tanmay"};
	char dcode[]={'e','c','k','r','m','e','c'};
	String dept[]={"R&D","PM","Acct","Front Desk","Engg","Manufacturing","PM"};
	int basic[]={20000,30000,10000,12000,50000,23000,29000};
	int hra[]={8000,12000,8000,6000,20000,9000,12000};
	int it[]={3000,9000,1000,2000,20000,4400,10000};
	
	String designation = null;
	int dA=0;
	char code = 0;
	
	int salary;
	int index = -1;
	
	System.out.println("enter emp no");
	int e_num=Integer.parseInt(s.next());
	for(int i=0;i<eno.length;i++)
		{
		if(eno[i]==e_num)
		{
	index=i;
	break;
	}}
	
	if(index==-1)
{
	System.out.println("There is no employee...");
}
else
{
	code=dcode[index];
}
if(code=='e') {
    designation="Engineer";
     dA=20000;
}
if(code== 'c') { 
    designation="Consultant";
    dA=32000;
}
if (code=='k') {
    designation="Clerk";
     dA=12000;
}if(code=='r') {
    designation="Receptionist";
   dA=15000;
}
if(code== 'm') { 
    designation="Manager";
    dA=40000; }         
salary=(basic[index]+hra[index]+dA-it[index]);
System.out.printf("%-15s", "Empno");
System.out.printf("%-15s", "Empname");
System.out.printf("%-15s", "Department");
System.out.printf("%-15s", "Designation");
System.out.printf("%-15s", "Salary");
System.out.println();
System.out.printf("%-15s", eno[index]);
System.out.printf("%-15s", ename[index]);
System.out.printf("%-15s", dept[index]);
System.out.printf("%-15s", designation);
System.out.printf("%-15s", salary);
}}
