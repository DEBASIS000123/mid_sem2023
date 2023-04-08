import java.util.Scanner;
public class a_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number :");
		int n=sc.nextInt();
		int newno=0;
		int c=0;
		while(n!=0) {
			int r=n%10;
			if(r!=0) {
				newno+=(int)(r*Math.pow(10, c));
				c++;
			}
			n=n/10;
		}
		System.out.println("After removing all zeros the new number is :"+newno);
	}

}
