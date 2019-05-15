
import java.util.*;
import java.lang.*;
import java.io.*;

class DS_max_index.java {
	public static void main (String[] args) {
		//code
		Scanner scan =new Scanner(System.in);
		int t,n;
		t=scan.nextInt();
		while(t-->0)
		{
		    n=scan.nextInt();
		    long a[]=new long[n];
		    for(int i=0;i<n;i++)
		       a[i]=scan.nextInt();
		    System.out.println(maxindex(a,n));
		}
	}
	static int maxindex(long a[],int n)
    {
        int j=n-1,i=n,count=0,p=0;
        while(i>0)
        {
            count=p;
            int flag=-1;
            while(count>=0)
            {
                if(a[j]>=a[count])
                {
                  return j-count;
                 // flag=1;
                }
                else
                {
                    j--;
                    count--;
                }
            }
            p++;
            j=n-1;
            i--;
        }
        return -1;
    }
}
