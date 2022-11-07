import java.util.*;
import java.io.*;

abstract class Marks{
	abstract void get_percentage();
	}

class A extends Marks{
		int mark1,mark2,mark3;
	A(int mark1, int mark2, int mark3){
		this.mark1 = mark1;
		this.mark2 = mark2;
		this.mark3 = mark3;
		}
	void get_percentage(){
		System.out.println("MARKS OF STUDENT A :");
		System.out.println("Percentage of first subject: " + mark1 + "%");
		System.out.println("Percentage of second subject: " + mark2 + "%");
		System.out.println("Percentage of third subject: " + mark3 + "%");
		}
	}

class B extends Marks{
		int mark1,mark2,mark3;
	B(int mark1, int mark2, int mark3){
			this.mark1 = mark1;
			this.mark2 = mark2;
			this.mark3 = mark3;
			}
	void get_percentage(){
		System.out.println("MARKS OF STUDENT A :");
		System.out.println("Percentage of first subject: " + mark1 + "%");
		System.out.println("Percentage of second subject: " + mark2 + "%");
		System.out.println("Percentage of third subject: " + mark3 + "%");
		}
	}
	
class Main{
	public static void main(String args[]){
		A obja = new A(95,80,67);
		B objb = new B(83,92,79);
		obja.get_percentage();
		objb.get_percentage();
		}
}

		
		
