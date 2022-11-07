import java.io.*;
import java.util.*;

public abstract class Employee {

    int age,phno,salary;
    String address,name;
    
    public abstract void printSalary();
    
    public static void main(String[] args) {
    
   			Scanner sc = new Scanner(System.in);
			
			Officer off=new Officer();
			
			System.out.println("details of the officer");
			System.out.println("enter name");
			off.name= sc.nextLine();
			
			
			System.out.println("enter specialisation");
			off.specialization= sc.nextLine();
			
			
			System.out.println("enter address");
			off.address= sc.nextLine();
			System.out.println("enter age");
			off.age= sc.nextInt();
			System.out.println("enter phone no");
			off.phno=sc.nextInt();
			System.out.println("enter salary");
			off.salary=sc.nextInt();
			
			
			
			Manager man=new Manager();
			
			System.out.println("details of the manager");
			
			System.out.println("enter name");
			sc.nextLine();
			man.name= sc.nextLine();
			System.out.println("enter department");
			//sc.nextLine();
			man.department= sc.nextLine();
			System.out.println("enter address");
			man.address= sc.nextLine();
			System.out.println("enter age");
			man.age= sc.nextInt();
			System.out.println("enter phone no");
			man.phno=sc.nextInt();
			System.out.println("enter salary");
			man.salary=sc.nextInt();
			
			off.printSalary();
			off.printDetails();
			
			man.printSalary();
			man.printDetails();
			
				}
}
 class Officer extends Employee{
     String specialization,department;
    public void printSalary(){
        System.out.println("Salary of officer is "+salary);
    }
    
    public void printDetails(){
    	System.out.println("Employee Name           :  " + name);
		System.out.println("Employee Age            :  " + age);
		System.out.println("Employee Phone          :  " + phno);
		System.out.println("Employee Address        :  " + address);
		System.out.println("Employee Specialization :  " + specialization);
    }
    
}

class Manager extends Employee{
    String specialization,department;
    public void printSalary(){
        System.out.println("Salary of Manager is "+salary);
    }
    
     public void printDetails(){
    	System.out.println("Employee Name    	:  " + name);
		System.out.println("Employee Age     	:  " + age);
		System.out.println("Employee Phone   	:  " + phno);
		System.out.println("Employee Address 	:  " + address);
		System.out.println("Employee Department :  " + department);
    }
}
