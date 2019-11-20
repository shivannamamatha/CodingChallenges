package com.mamatha.CodingChallenges;

public class GCD{

	static int gcdm(int a, int b) 
    { 
        if (b == 0) 
            return a; 
        else
            return gcdm(b, a % b); 
    } 
	
    public static void main(String[] args) {
/*
        int num1 = 2, num2 = 10;

        while (num1 != num2) {
        	if(num1 > num2)
                num1 = num1 - num2;
            else
                num2 = num2 - num1;
        }
*/
    	System.out.println(gcdm(2,7));
     //   System.out.printf("GCD of given numbers is: %d", num2);
    }

}