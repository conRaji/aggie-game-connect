import java.util.Scanner;
public class comp_167 {
public static void main (String [] args ) {
	
	Scanner scnr = new Scanner (System.in);
	int sum;
	int curVal;
	sum = 0; 
	//next line is only fro string you put next int to really understand it  get it 
	curVal = scnr.nextInt();
	while (curVal != 0 ) {
		sum = sum + curVal;
		System.out.print(sum );
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// this is an example of a for loop and what it is doing is printing out the number 123
	/* int n = 3;
	//at this point the second condition is saying 1 is less or equal than 3 
	for (int i = 1; i <= n; ++i) {
		int fact = 1;
		fact = fact * i;
		// the "" all it does is add spaces betwwen the numbers printed 
		System.out.print(fact + " 7 ");
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// this for if I ever need to reverse a string or more specifaicay a input the use inputs 
	
	// Still trying to figure out why you would put -1
	//
	/*for (i = str.length() - 1; i >= 0; --i) {
		System.out.print(str.charAt(i));
		
	
	*}*/
}
}
