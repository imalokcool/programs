import java.io.*;
import java.util.*;
public class Main
{
	public static void main(String[] args) throws IOException
	{
	    Scanner s = new Scanner(System.in);
	    int[] note = new int[]{2000,500,200,100,50,20,10,5,1};
	    int[] notecount = new int[9];
	    int sum= s.nextInt();
	    for(int i=0;i<9;i++)
	    {
	    	if(sum>note[i])
	    	{
	    		notecount[i] = sum / note[i];
	    		sum = sum - notecount[i]*note[i];
	    	}
	    }
	    for(int i=0;i<9;i++)
	    {
	    	System.out.println(note[i] + "=" + notecount[i]);
	    }
	    
	}
}
