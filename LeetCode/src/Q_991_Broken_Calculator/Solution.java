package Q_991_Broken_Calculator;

/*
On a broken calculator that has a number showing on its display, we can perform two operations:

Double: Multiply the number on the display by 2, or;
Decrement: Subtract 1 from the number on the display.
Initially, the calculator is displaying the number X.

Return the minimum number of operations needed to display the number Y.
 * */

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int X = 3;
//		int Y = 10;
		
		int X = 5;
		int Y = 8;
		
		
		int ans = brokenCalc(X, Y);
		System.out.println(ans);

	}

	public static int brokenCalc(int X, int Y) {
		if(Y <= X ) {
			return X-Y;
		}else{

			if(Y%2==1) {
				return 1+ brokenCalc(X, Y+1);
			}
			return 1+ brokenCalc(X, Y/2);

		}
	}

}
