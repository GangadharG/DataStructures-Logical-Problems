// A Java program which prints Pyramid structure
//			*
//		       ***
//		      *****
public class PyramidStructure {

	public static void main(String args[]){
		
		System.out.println("The 4 level pyramid structure ");
		int n=4;	// n tells the level of the the Pyramid's structure
		int columns = n*2-1;
		int rows = n;
		// looping through rows
		int i= rows-1;
		while(i<rows && i>=0){
			//looping through columns
			int j=0;
			while(j< columns){
				
				if((j>=i) && (i+j)<columns){
					System.out.print("*");	// Printing * at required places
				}
				else{
					System.out.print(" ");	// Printing space at unrequired places
				}
				j++;
			}
			System.out.println("");			// Moving to next line once row completes
			i--;
		}
	}
}
