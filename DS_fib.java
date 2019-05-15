import java.util.*;
import java.lang.*;
import java.io.*;

class DS_fib{
	public static void main (String[] args) {
		//code
		Scanner scan= new Scanner(System.in);
	    int t,a,b,n,m,diviser,dividend,temp;
	    t = scan.nextInt();
	    for(int k=0;k<t;k++){
	        int p=scan.nextInt();
	        System.out.println(fib(p%300));
	    }
	}
	static int fib(int n){
	int r[]=new int[n];
	r[0]=1;
	r[1]=1;
	
	for(int i=2;i<n;i++)
	     r[i]=(r[i-1]+r[i-2])%100;
	return r[n-1];
	}    
}
