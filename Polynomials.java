import java.util.*;
import java.io.*;

class Polynomials{
	static float a1,b1,a2,b2,sum;
	
	float read_num(){
		Scanner sc = new Scanner(System.in);
		//System.out.println("Enter the Coefficient of x:");
		float n = sc.nextFloat();
		return n;
		}
	
	float add_num(float x, float y){
			sum = x + y;
			return sum;
		}
	
	public static void main(String args[]){
	
		System.out.println("hi");
		
		Polynomials obj = new Polynomials();
		
		System.out.println("enter the first polynomials coefficient of x:");
		a1 = obj.read_num();
		System.out.println("enter the first polynomials constant value:");
		b1 = obj.read_num();
		
		System.out.println("the first polynomial is:");
		System.out.println(a1 + "x +" + b1);
		
		System.out.println("enter the second polynomials coefficient of x:");
		a2 = obj.read_num();
		System.out.println("enter the second polynomials constant value:");
		b2 = obj.read_num();
		
		System.out.println("the second polynomial is:");
		System.out.println(a2 + "x +" + b2);
		
		
		System.out.println("Sum of polynomials is: ");
		float n1 = obj.add_num(a1,a2);
		float n2 = obj.add_num(b1,b2);
		System.out.println(n1 + "x +" + n2);
	}
}
		
		
		
		
