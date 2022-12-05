import java.util.*;
import java.io.*;

class BinSearch{
	//int[] t;
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
	
	public void bubbleSort(int[] A, int[] t) {  
        int n = A.length;  
        int temp = 0;  
        int tempt = 0;
         for(int i=0; i < n; i++){  
                 for(int j=1; j < (n-i); j++){  
                          if(A[j-1] > A[j]){  
                                 //swap elements  
                                 temp = A[j-1];  
                                 A[j-1] = A[j];  
                                 A[j] = temp;
                                 tempt = t[j-1];
                                 t[j-1] = t[j];
                                 t[j] = tempt;
                                 
                                   
                         }  
                          
                 }  
         }
         System.out.println("the array after sorting");
         for(int i = 0; i<n; i++){
         	System.out.print(A[i]);
         	if(i!= (A.length -1))
				System.out.print(", ");
         } 
          	System.out.println("");
  
    }  
    
 /*   public int linearSearch(int[] arr , int key){
    	int n = arr.length;
    	for(int i = 0; i < n; i++){
    	System.out.println("pos:" + i);
    		if(arr[i] == key){
    			System.out.println("pos:" + i + "key = " + key);
    			return i;
    		}
    		
    	}
    	return -1;
    }*/
	
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of the array");
		int n = sc.nextInt();
		int[] A = new int[n];
		
		
		int[] t = new int[n];
		for(int i = 0; i<n;i++){
			System.out.println("enter element at" + i + ":");
			A[i] = sc.nextInt();
			t[i] = i;
		}
		System.out.println("inputted list:");
		for(int i = 0; i<n ;i++){
			System.out.print(A[i]);
			if(i!= (n-1))
				System.out.print(", ");
		}
		System.out.println("");
		//int arr[] = new int[n];
		//arr= A;
		
		BinSearch obj = new BinSearch();
		
		System.out.println("Enter the element to be searched");
		int key = sc.nextInt();
		obj.bubbleSort(A,t);
		/*for(int i = 0;i<A.length;i++){
			System.out.println(A[i]);
		}*/
		int result = obj.BinarySearch(A,0,n-1,key);
		if(result == -1)
			System.out.println("element not found");
		else{
			int r = t[result];
			System.out.println("element found at position: " + r +" in the original list");
			}
		}
	}
		
