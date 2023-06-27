import java.util.Scanner;

public class Individuvaldigit{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.println("enter numbers ");
Scanner obj=new Scanner(System.in);
n=obj.nextInt();
while(n>0) {
	int r=n%10;
	System.out.println("the digit "+r);
	n=n%10;
}
	}

}
