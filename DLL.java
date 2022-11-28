import java.util.*;
import java.io.*;

public class DLL{

class Node{

public int data;
public Node next;
public Node prev; //next and prev are of type Node and they are a reference to a node.

public Node(int data){
//constructor of class Node

	this.data = data;
	 //this refers to  the data in the node class and the parameter data is the data were sending to be in a node.
	 
	}//closing constructor
	
}//closing class Node

Node head, tail = null;

public void addNodeE(int data){
	
	Node nodeobj = new Node(data); //creating the node 
	
	if(head == null){
		head = tail = nodeobj;
		head.next = null;
		tail.next = null;
		}
	else{
		tail.next = nodeobj;
		nodeobj.prev = tail;
		tail = nodeobj;
		tail.next = null;
		}
		
	}

public void addNodeF(int data){
	
	Node nodeobj = new Node(data); //creating the node 
	
	if(head == null){
		head = tail = nodeobj;
		head.next = null;
		tail.next = null;
		}
	else{
		head.prev = nodeobj;
		nodeobj.next = head;
		head = nodeobj;
		head.prev = null;
		}
		
	}

public void addNodeM(int data, int pos, int where){
	
	int index;
	int w = where;
	
	Node nodeobj = new Node(data); //creating the node 
	
	if(head == null){
		head = tail = nodeobj;
		head.next = null;
		tail.next = null;
		}
	else{
		Node current = head;
		index = pos;
		 for(int i = 1; i < pos; i++){  
                current = current.next;  
            }  
       	if(w == 1){
       		//BEFORE
       		current.prev.next = nodeobj;
       		nodeobj.prev = current.prev;
       		current.prev = nodeobj;
       		nodeobj.next = current;
       		
       		
       	}
       	else if(w == 2){
       	// after
       	
       		current.next.prev = nodeobj;
       		nodeobj.prev = current;
       		nodeobj.next = current.next;
       		current.next = nodeobj;
       		
       	}
       	else if(current == head){
		   	head.prev = nodeobj;
			nodeobj.next = head;
			head = nodeobj;
			head.prev = null;
       		
       	}
       	else
       		System.out.println("error while inserting");
        
        
		}
		
	}
	
	


public void deleteNode(int index){ 
		Node curr = head;
		int p = index;
		if(p == 1){
			 head = head.next; 
			 head.prev = null;
			 }
		else{ 
				for(int i = 1; i <p; i++){
				
		  			// System.out.println("hi4");
                		curr = curr.next;
                		}
                		
                		
								if(curr == null) {
									System.out.println("index out of bounds");
						 
								}
								
								else{
								
									if(head == null) {  
										System.out.println("the list is empty");
						   				 return;  
					   					 }  
					   					 
					   					 
					   				 else {  
						   				 Node current = head;  
				  								
										  //int pos = index;  
				  					
										for(int j = 1; j < p; j++){
												// System.out.println("data : " + current.data);
							   				 current = current.next;
							   				 
							   				 
							   				 
						  				  }  
				  
						  				  if(current == head) {  
							 				   head = current.next;
							 				   head.prev = null;  
							 				  // System.out.println("hi3");
						   						 }  
							 				else if(current == tail) {  
						   				     tail = tail.prev;  
						   				     tail.next = null;
						   				   //  System.out.println("hi2");
						  						  }  
						   				 	else {  
						   				 		//System.out.println("hi1");
							  				  current.prev.next = current.next;  
							   				 current.next.prev = current.prev;  
						   							 }  
											 current = null;  
										 }  
                }
                }
            }		
		
	

public void delete(int ele){
	if(head == null) {  
			System.out.println("the list is empty");
            return;  
        }  
        else {  
            Node current = head;  
            while(current.data!= ele){
            	current = current.next;
            }
            
            if(current.data == ele){
            
            	if(current == head) {  
                head = current.next; 
                
                }
                else if(current == tail) {  
                tail = tail.prev;  
            	}  
            	else{
            	current.prev.next = current.next;  
                current.next.prev = current.prev;  
                }
            }
            else{
            	System.out.println("the element you are trying to delete does not exist, please try again.");
            }
            current = null;  
            System.out.println("element deleted..");
}
}


public void print(){
Node current = head;
if(head == null){
	System.out.println("the list is empty");
}
else{
	while(current != null)
		{
			System.out.print(current.data + "->");
			current = current.next;
			}
		}
System.out.println("");
	}

public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		DLL obj = new DLL();
		int choice,c ,d;
		System.out.println("\n 1.ADDatEND \n 2.ADDatFRONT \n 3.ADDAnyWhere \n 4.DELETEatINDEX \n 5.DISPLAY \n 6.DELETEanELEMENT \n 7.EXIT");
		do{
			System.out.println("Enter the choice: ");
			choice = sc.nextInt();
				switch(choice){
					case 1: 
					{
						System.out.println("enter the number");
						int num = sc.nextInt();
						obj.addNodeE(num);
						break;
					}
					
					case 2: 
					{
						System.out.println("enter the number");
						int num = sc.nextInt();
						obj.addNodeF(num);
						break;
					}
					
					case 3: 
					{
						System.out.println("enter the number");
						int num = sc.nextInt();
					
						System.out.println("enter index at which you want to insert");
						d = sc.nextInt();
						
						do{
						System.out.println("1.enter before\n2.enter after");
						
						c = sc.nextInt();
						}while(c!=1 && c!=2);
						
						obj.addNodeM(num, d, c);
						break;
					}
					
					
					case 4:
					{
						System.out.println("Enter the index at which you want to delete:");
						int num = sc.nextInt();
						obj.deleteNode(num);
						break;
					}
					case 5:
					{
						obj.print();
						break;
					}
					case 6:
					{
						System.out.println("Enter the element you want to delete:");
						int num = sc.nextInt();
						obj.delete(num);
						break;
					}
					case 7:
					{
						System.out.println("Exiting...");
						break;
					}
					default:
					{
						System.out.println("please enter a valid choice");
					}
					
				}
			
			}while(choice!=7);
		
		}
	}
	


	
