package class2;

public class Class2_Reverse_AmanSingh {

	public static void main(String[] args)
	{
		int r,reverse=0;
		int n=1737;
		while(n!=0)
		{
			r=n%10;
			reverse=reverse*10;
			reverse=reverse+r;
			n=n/10;
		}
		System.out.println("The reverse of the number is "+reverse );
	}

}
