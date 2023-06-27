import java.util.Scanner;

public class Factors {

	public static void main(String[] args) {
		
				
		int n,factors =0;
		 System.out.println("enter number");
		 Scanner obj=new Scanner(System.in);
		 n=obj.nextInt();
		 System.out.println("the factors of given number is");
		 for(int i=1;i<=n;i++) {
			
			 if(n%i==0)
		{
				  factors++;	 
     System.out.println(":"+i);
   
	}
	}System.out.println("the number  of factors is "+factors);
		 }}

		


	


