package com.mamatha.CodingChallenges;

public class ArrayRotation_UsingTempArray {
	
	static void moveArray(int d, int n, int arr[]) {
		
		int[] temp= new int[d];
		
		for(int i=0;i<n;i++) {
			if(i<d) {
				temp[i] = arr[i];
				System.out.println(temp[i]);
			}else {
				arr[i-d] = arr[i];
				System.out.println(arr[i]);
			}
			
			/*if(i+1 == n ) {
				
			}*/
		} 
			for(int j=0;j<d;j++) {
			arr[n-d+j]= temp[j];
		}
		for(int i=0;i<n;i++) {
			System.out.print(arr[i]+",");
		}
	}
	
	
	public static void main(String []args) {
		int d=2, n=7;
		int arr[] = {1,2,3,4,5,6,7};
		moveArray(d,n, arr);
		
	}

}
