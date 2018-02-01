package class2;

public class Class2_Palindrome_AmanSingh {

	public static void main(String[] args) {
		int r,var=0;
        int n=4664; //number to be checked
        int temp=n;
        while(n>0)
        {        	
        	r=n%10;
        	var=(var*10)+r;
        	n=n/10;
        }
        if(temp==var)
        {
           System.out.println("This number is a palindrome ! ");	
        }
        else
        {
        	System.out.println("This number is not a palindrome ! ");
        }
	}

}
