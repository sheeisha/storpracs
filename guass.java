package pracs1;
import java.util.*;
public class guass {
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       System.out.println("enter number of variables: ");
       int n=in.nextInt();
       int[][] arr=new int[n][n+1];
       int rows=n, cols=n+1;
       for(int i=0;i<rows;i++) {
    	   for(int j=0; j<cols; j++) {
    		   System.out.println("enter coefficients with constant: ");
    		   arr[i][j]=in.nextInt();
    	   }
       }
       for(int i=0;i<rows;i++) {
    	   for(int j=i+1;j<rows;j++) {
    		   double ratio=arr[j][i]/arr[i][i];
    	   
	    	   for(int k=0;k<cols;k++) {
	    		   arr[j][k]-=ratio*arr[i][k];
	    	   }
    	   }
       }
       double[] sol=new double[n];
       for (int i = n - 1; i >= 0; i--) {
           double sum = 0.0;
           for (int j = i + 1; j < n; j++) {
               sum += arr[i][j] * sol[j];
           }
           sol[i] = (arr[i][n] - sum) / arr[i][i];
       }
       for(int i=0;i<n;i++)
    	   System.out.println(sol[i]);
    }
}

