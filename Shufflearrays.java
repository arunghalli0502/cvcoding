package com.cloudvandana;
public class Arrayshuffle2 
{	
	public static void main(String[] args) 
	{
		int a[]= {1,2,3,4,5,6,7};
		int s= 0;						
		int t=3;
		
		int temp=a[s];
		a[s]=a[t];
		a[t]=temp;
		for(int x: a)
		{
			System.out.print(x +" ");
			
		}
		System.out.println("\n");
	}

}
