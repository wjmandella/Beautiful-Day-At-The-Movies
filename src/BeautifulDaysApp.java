// My solution to the HackerRank.com problem "Beautiful Days At The Movies."
// https://www.hackerrank.com/challenges/beautiful-days-at-the-movies/problem

import java.util.Scanner;

public class BeautifulDaysApp {
    static int beautifulDays(int i, int j, int k) {
        // Complete this function
    	int nbrOfBDays = 0;
    	for(int idx = i; idx <= j; idx++) {
    		String tempNbrStr = Integer.toString(idx);
    		String[] tempNbrArray = tempNbrStr.split("");
    		String tempNbrStr2 = "";
    		for(int idx2 = (tempNbrArray.length -1); idx2 >= 0; idx2--) {
    			tempNbrStr2 += tempNbrArray[idx2];
    		}
    		int tempNbr = Integer.valueOf(tempNbrStr2);
    		if(Math.abs(idx - tempNbr) % k == 0) {
    			nbrOfBDays++;
    		}
    	}
    	  	
    	return nbrOfBDays;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter the lower bound, i (integer 1-2000000): ");
        int i = in.nextInt();
        System.out.print("Enter the upper bound, j (integer 1-2000000): ");
        int j = in.nextInt();
        System.out.print("Enter the divisor, k (integer 1-2000000): ");
        int k = in.nextInt();
        int result = beautifulDays(i, j, k);
        System.out.println(result);
        in.close();
    }
}
