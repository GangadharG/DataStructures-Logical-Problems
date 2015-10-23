/*A java program to convert 2D array in spiral form*/
/* For Example: 
 * Input - 2 4 6 8
 * 		   5 9 12 16
 * 		   2 11 5 9
 * 		   3 2 1 8
 * 
 * Output - 2 4 6 8 16 9 8 1 2 3 2 5 9 12 5 11
 */
public class TwoDarrayInSpiral {

	public static void main(String[] args){
		int[][] a = {{2, 4, 6, 8}, {5, 9, 12, 16}, {2, 11, 5, 9}, {3, 2, 1, 8}};
		print2DarrayInSpiralOrder(a);
	}
	
	static void print2DarrayInSpiralOrder(int[][] a){
		
		int rows = a.length;
		int cols = a[0].length;
		int t=0, b=rows-1, l=0, r=cols-1;
		int dir =0;
		
		/*
		 * t => top most non traversed index
		 * b => bottom most non traversed index
		 * l => left most non traversed index
		 * r => right most non traversed index
		 */
		
		while(l<=r && t<=b){
			if(dir == 0){
				for(int i=l; i<=r; i++)
					System.out.print(" "+a[t][i]);
				t++;
			}else if(dir == 1){
				for(int i=t; i<=b; i++)
					System.out.print(" "+a[i][r]);
				r--;
			}else if(dir == 2){
				for(int i=r; i>=l; i--)
					System.out.print(" "+a[b][i]);
				b--;
			}else if(dir == 3){
				for(int i=b; i>=t; i--)
					System.out.print(" "+a[i][l]);
				l++;
			}
			dir = (dir+1)%4; // dir is for changing direction
		}
	}
}
