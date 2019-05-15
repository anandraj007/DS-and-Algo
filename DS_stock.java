import java.util.*;
import java.lang.*;
import java.io.*;

class GFG {
	public static void main (String[] args) {
		//code
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
		   
		   // StringBuffer sb=new StringBuffer();
		   String result="";
		    int i=n-1,flag=0,sell=0;
		    boolean check =false;
		    while(i>=0)
		    {
		       int sellday=a[i];
		       if(i>=1 && a[i-1]< sellday)
		           i--;
		       while(i>=0 && a[i] < sellday)
		       {
		           sellday=a[i];
		           if(check==false)
		           {
		               check=true;
		               sell=i+1;
		               flag=1;
		           }
		           i--;
		       }
		       
		       if(check==true)
		       {
		           result=" "+"("+String.valueOf(i+1)+" "+String.valueOf(sell)+")"+result;
		           check=false;
		       }
		       else
		        i--;
		    }
		    if(flag==0)
		    System.out.println("No Profit");
		    else
		    System.out.println(result.substring(1));
		}
		}
		
		catch(Exception e)
		{
		    e.printStackTrace();
		}
	}
}
