import java.util.Scanner; 
 
public class Comission2 
{ 
 	public static void main(String args[]) 
 	{ 
 	 	int lock, stack, barrels, tot;  	 	
 	 	float com = 0; 
 	 	Scanner ip = new Scanner(System.in); 
 
 	 	System.out.println("Please enter the number of locks?"); 
 	 	lock = ip.nextInt();  	 	
 	 	System.out.println("stack?");  	 	
 	 	stack = ip.nextInt();  	 	
 	 	System.out.println("Barrels?"); 
 	 	barrels = ip.nextInt(); 
 
 	 	if ((lock > 70) || (stack > 80) || (barrels > 90) || (lock < 1) 
 	 	 	 	|| (stack < 1) || (barrels < 1)) 
 	 	 	System.out.println("Sales out of bound (invalid!! no commission for salesman......)"); 
 
 	 	else 
 	 	{ 
 	 	 	tot = lock * 45 + stack * 30 + barrels * 25; 
 
 	 	 	if (tot <= 1000) 
 	 	 	 	com = (tot * .10f); 
 	 	 	else if ((tot > 1000) && (tot <= 1800))  	 	 	 	
 	 	 	com = 100 + ((tot-1000) * 0.15f); 
 	 	 	else 
 	 	 	 	com = 220 + ((tot-1800) * 0.2f); 
 
 	 	 	System.out.println("Commission is :" + com); 
 	 	 	} 
 	 	} 
  } 

