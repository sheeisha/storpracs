package pracs1;
import java.util.*;
public class lagranges {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		int n=0;
		System.out.println("enter n");
		n=in.nextInt();
		int[] x=new int[n];
		int[] y=new int[n];
		for(int i=0; i<n; i++) {
			System.out.println("enter x ");
			x[i]=in.nextInt();
			System.out.println("enter y ");
			y[i]=in.nextInt();
		}
		System.out.println("enter xc: ");
		double xc=in.nextDouble();
		double term=0.0,num=0.0,den=0.0;
		for(int i=0;i<n;i++) {
			num=1.0;
			den=1.0;
			for(int j=0;j<n;j++) {
				if(i!=j) {
					num=num*(xc-x[j]);
					den=den*(x[i]-x[j]);
				}
			}
			term=term+(num*y[i]/den);
		}
		System.out.println(term);
		
	}

}
