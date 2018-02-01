package class2;

public class Class2_Prime_AmanSingh {
	
	public static void main(String[] args)
	{
		int N=131;
		boolean flag=false;
		int i=2;
		while(i<N)
		{
			if(N%i==0)
			{
				flag=true;
				break;
			}
			i++;
		}
			if(!flag)
			{
				System.out.println("The Number is a prime number");		
			}
			else
			{
				System.out.println("The Number is not a prime number");	
			}		
	}

}
