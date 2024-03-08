package pracs1;

import java.util.*;
public class Bisect1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		
		System.out.println("enter degree: ");
		int d=in.nextInt();
		int arr[]=new int[d+1];
//		int ans=0;
//		int dd=d;
		for(int i=0; i<=d; i++) {
			System.out.println("enter the coefficient at place "+i);
			arr[i]=in.nextInt();
		}
//		System.out.println("enter val: ");
//		int v=in.nextInt();
//		for(int i=0; i<=d; i++) {
//			ans+=arr[i]*Math.pow(v, dd);
//			dd--;
//		}
		double x1=0;
		double x2=1;
		double x3=x2-x1;
		double xx=0;
		while(Math.abs(x3)>=0.005) {
				
				xx=(x2+x1)/2;
				double ans=0;
				double dd=d;
				for(int i=0; i<=d; i++) {
					ans+=arr[i]*Math.pow(xx, dd);
					dd--;
				}
				
				
				if(ans<0)
					x2=xx;
				else
					x1=xx;
				
				System.out.println("x1: "+x1);
				System.out.println("x2: "+x2);
				System.out.println("xx: "+xx);
				System.out.println("ans: "+ans);
				System.out.println();
				x3=x2-x1;
			

	}
		System.out.println(xx);
		
	}

}