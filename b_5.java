import java.util.Scanner;
public class b_5 {
	public static boolean isprime(int n) {
		int c=0;
		for(int i=2;i<=n/2;i++) {
			if(n%i==0)
				c++;
		}
		if(c==0)
			return true;
		else 
			return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number :");
		int n=sc.nextInt();
		for(int i=1;i<n/2;i++) {
			if(isprime(i) && isprime(n-i))
				System.out.println(n+" can be written as :"+i+"+"+(n-i));
		}
	}

}
