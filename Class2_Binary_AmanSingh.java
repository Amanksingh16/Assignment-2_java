package class2;

public class Class2_Binary_AmanSingh {

	public static void main(String[] args) {
		int num=1101;
	int Decimal=0,r,p=0;
	while(num>0)
	{
		r=num%10;
		Decimal+=r*Math.pow(2,p);
		num=num/10;
		p++;
	}
	System.out.println("The Decimal of this number "+Decimal);
	}

}
