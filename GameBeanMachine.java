import java.util.*;
public class GameBeanMachine{
	public static void main(String[] args){
		
	// Showing BEAN MACHINE
		
	String c =" .";
	int j=0;
	System.out.println("The BEAN MACHINE looks like: \n\n");
	System.out.print("       | |      \n");
	System.out.print("       | |      \n");
	int count1=5;
	for(int o=1;o<=6;o++)
	{
		for(int sp=count1;sp>=0;sp--)
			System.out.print(" ");
	
		count1--;
		System.out.print("/");	
		for(j=1;j<=o;j++)
			System.out.printf("%-2s",c);
			
		System.out.print(" \\");
		System.out.println();
	}
		
	System.out.print(" ");
	while(j>=0)
	{
		System.out.print("| ");
		j--;
	}
				
	
	Scanner in = new Scanner(System.in);
	int i=0,count=0;
	System.out.println("\n\nEnter the number of slots: ");
	int n = in.nextInt();

	System.out.println("Enter the no.of balls: ");
	int b = in.nextInt();
	
	System.out.println("The Symbol R is for RIGHT and L is for LEFT");
	int slots[] = new int[n];
	String name[] = new String[b];
	String path[] = new String[b];
	int flag=0;
	for(i=0;i<n;i++)
	{
		slots[i]=0;		
	}
	for(i=0;i<b;i++)
	{
		name[i]="";
		path[i]="";
	}

		
	for(i=0;i<b;i++)
	{
		flag=0;
		for(j=0;j<n;j++)
		{
			int Random = (int)(Math.random()*2);
			if(Random == 0)
			{
				name[i] += "L";
				path[i] += "/";
			}
			else if(Random == 1)
			{
				name[i] += "R";
				path[i] += "\\";
				flag++;
			}
		}			
		slots[flag-1]++;		
	}
		
	for(i=0;i<b;i++)
		System.out.println("The possible paths are "+name[i]);
	System.out.println();
	int k;
	for(k=0,j=b;k<b;k++,j--)
	{
		for(i=0;i<n;i++)
		{
			if(slots[i]==j)
			{
				System.out.print(" O :");
				slots[i]--;
			}
			else
				System.out.print("   :");	
		}
		System.out.println("\t\t");	
	}
	System.out.println();
	for(i=1;i<=n;i++)
		System.out.printf(" %-3s",i);
		
	System.out.println("\n\n");		
	}
}

