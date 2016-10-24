import java.util.Scanner; 
 
public class NextDate { 
 
 	public static void main(String arg[]) { 
 	 	int dd, mm, yyyy; 
 	 	System.out.print("enter dd/mm/yyyy values");  	 	Scanner input = new Scanner(System.in); 
 	 	dd = input.nextInt();  	 	mm = input.nextInt(); 
 	 	yyyy = input.nextInt(); 
 
 	 	if (mm > 12 || mm < 1 || dd < 1 || dd > maxVal(mm, yyyy)) { 
 	 	 	System.err.println("invalid date"); 
 	 	} else { 
 
 	 	 	if (dd == maxVal(mm, yyyy) && mm == 12) { 
 	 	 	 	dd = 1;  	 	 	 	mm = 1;  	 	 	 	yyyy++; 
 	 	} else if (dd == maxVal(mm, yyyy)) { 
 	 	dd = 1;  	 	mm++; 
 	} else 
 	 	 	dd++; 
 	 	System.out.println("the next date is: " + dd + "/" + mm + "/" 
 	 	 	 	+ yyyy); 
 	 	} 
 	 	return; 
 	} 
 
 	private static int maxVal(int mm, int yyyy) {  	 	int l = isLeap(yyyy);  	 	int d = 0; 
 
 	 	if (mm == 1 || mm == 3 || mm == 5 || mm == 7 || mm == 8 || mm == 10 
 	 	 	 	|| mm == 12)  	 	 	d = 31;  	 	else {  	 	 	if (mm == 2) 
 	 	 	 	d = 28 + l;  	 	 	else  	 	 	 	d = 30; 
 	 	} 
 
 	 	return d; 
 	} 
 
 	private static int isLeap(int yyyy) { 
 	 	if (yyyy % 4 == 0) 
 	 	 	return 1;  	 	else 
 	 	 	return 0;  	} 
} 

