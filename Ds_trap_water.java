import java.util.*;
import java.lang.*;
import java.io.*;

class Ds_trap_water {
	public static void main (String[] args) {
		//code
		Scanner scan =new Scanner(System.in);
		int t,n;
		BufferedReader br =null;
		try
		{
		br=new BufferedReader(new InputStreamReader(System.in));
		t=Integer.parseInt(br.readLine());
		while(t-->0)
		{
		    
		    n=Integer.parseInt(br.readLine());
		    String line=br.readLine();
		    String str[]=line.trim().split(" ");
		    int a[]=new int[n];
		    for(int i=0;i<n;i++)
		       a[i]=Integer.parseInt(str[i]);
		  
		   int trapwater=0,leftmax=a[0],rightmax=rmax(2,a);
		   for(int i=1;i<n-1;i++)
		   {   
		       
		       if(a[i]<leftmax && a[i]<rightmax)
		         trapwater+=min(leftmax-a[i],rightmax-a[i]);
		        
		       if(a[i]>leftmax)
		         leftmax=a[i];
		       if(rightmax==a[i])
		         rightmax=rmax(i+1,a);
		  
		   }
		   System.out.println(trapwater);
		}
		}
		catch(Exception e)
		{
		    e.printStackTrace();
		}
	}
	static int min(int a,int b)
	{
	    if(a<b)
	     return a;
	    else
	     return b;
	}
	static int rmax(int n,int a[])
	{
	    int rmax=0;
	    for(int i=n;i<a.length;i++)
	      if(a[i]>rmax)
	         rmax=a[i];
	    return rmax;
	}
}
