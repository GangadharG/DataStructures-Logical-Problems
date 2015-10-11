/*
 	Imagine you have a special keyboard with the following keys: 
	Key 1:  Prints 'A' on screen
	Key 2: (Ctrl-A): Select screen
	Key 3: (Ctrl-C): Copy selection to buffer
	Key 4: (Ctrl-V): Print buffer on screen appending it
                 	after what has already been printed. 

	If you can only press the keyboard for N times (with the above four
	keys), write a program to produce maximum numbers of A's. That is to
	say, the input parameter is N (No. of keys that you can press), the 
	output is M (No. of As that you can produce).
*/
// Recursive Solution:
public class CopyPaste {

	public static void main(String[] args){
		
		int n= 20;	// find no. of A's if 20 keys are pressed
		int maxNoOfAs = findMaxAs(n);
		System.out.println("The Maximum of no of A's for "+n+" are "+maxNoOfAs);
	}
	
	static int findMaxAs(int n){
		
		if(n<=6) return n; // base condition
		int multiplier = 2, present_max=0, final_max=0;
		for(int i=n-3; i>=0; i--){
			present_max = multiplier*findMaxAs(i);
			if(present_max > final_max)
				final_max = present_max;
			multiplier++;
		}
		return final_max;
	}
}
