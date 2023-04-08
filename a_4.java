import java.util.Scanner;
public class a_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int sum=0,mul=1;
		for(int i=1;i<=n;i++) {
			if (i%2==0)
				sum+=i;
			else
				mul*=i;
		}
		System.out.println("The sum of all even number between n ="+sum);
		System.out.println("The product of all odd numbers between n ="+mul);
	}

}
