import java.util.Scanner;

public class PrimeNum {

	public static void main(String[] args) {
	int n1,n2;
	Scanner obj=new Scanner(System.in);
	System.out.println("enter numbers ");
n1=obj.nextInt();
	n2=obj.nextInt();int i,j;
	for( i=n1;i<=n2;i++)
	{
		for( j=2;j<=i;j++)
			if(i%j==0) {
				break;
				
			}
		
		if(i==j)
		{
			System.out.println("the prime numbers is"+j);
		}
	}
	}

}
