import java.util.*;
import java.io.*;

class BinSearch{
	int mid;
	int BinarySearch(int [] arr ,int first, int last , int key){
	
			if(last>=first){
				mid = first + (last-first)/2;
			
			if(arr[mid] == key)
				return mid;
			else if(arr[mid]>key)
				return BinarySearch(arr, first, mid-1,key);
			else
				return BinarySearch(arr, mid+1, last,key);
				}
			return -1;			
	}
	
	public void bubbleSort(int[] A) {  
        int n = A.length;  
        int temp = 0;  
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(A[j-1] > A[j]){  
                                 //swap elements  
                                 temp = A[j-1];  
                                 A[j-1] = A[j];  
                                 A[j] = temp;  
                         }  
                          
                 }  
         }
         System.out.println("the array after sorting");
         for(int i = 0; i<n; i++){
         	System.out.print(A[i]+ ",");
         } 
          	System.out.println("");
  
    }  
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] A = new int[n];
		for(int i = 0; i<n;i++){
			System.out.println("enter element at" + i + ":");
			A[i] = sc.nextInt();
		}
		
		BinSearch obj = new BinSearch();
		
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		obj.bubbleSort(A);
		int result = obj.BinarySearch(A,0,n-1,key);
		if(result == -1)
			System.out.println("element not found");
		else
			System.out.println("element found at position: " + (result+1));
		}
	}
		
		
			
			
				//System.out.println("Key Found at position" + (mid));
