package pracs1;
import java.util.*;
public class nwcmm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in=new Scanner(System.in);
		System.out.println("enter supply number: ");
		int s=in.nextInt();
		int[] sup=new int[s];
		System.out.println("enter demand number: ");
		int d=in.nextInt();
		int[] dem=new int[d];
		int[][] cost=new int[s][d];
		int[][] alloc=new int[s][d];
		for(int i=0;i<s;i++) {
			System.out.println("enter supply values: ");
			sup[i]=in.nextInt();
		}
		for(int i=0;i<d;i++) {
			System.out.println("enter demand values: ");
			dem[i]=in.nextInt();
		}
		for(int i=0;i<d;i++) {
			for(int j=0;j<s;j++) {
				System.out.println("enter cost values: ");
				cost[i][j]=in.nextInt();
				alloc[i][j]=0;
			}
		}
		
		for(int i=0;i<s;i++) {
			for(int j=0;j<d;j++) {
				System.out.println("enter cost values: ");
				cost[i][j]=in.nextInt();
				alloc[i][j]=0;
			}
		}
		for(int i=0;i<s;i++) {
			for(int j=0;j<d;j++) {
				if(sup[i]>dem[j]) {
					alloc[i][j]=dem[j];
					sup[i]-=dem[j];
					dem[j]=0;
					continue;
				}
				else {
					alloc[i][j]=sup[i];
					dem[j]-=sup[i];
					sup[i]=0;
					break;
				}
			}
		}
		int tc=0;
		for(int i=0;i<s;i++) {
			for(int j=0;j<d;j++) {
				tc+=alloc[i][j]*cost[i][j];
			}
		}
		
		System.out.println(tc);
	}

}
