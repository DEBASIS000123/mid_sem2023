import java.util.Scanner;
public class c_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter two operands :");
		int a=sc.nextInt();
		int b=sc.nextInt();
		System.out.println("Enter an operator :");
		char ch=sc.next().charAt(0);
		if(ch=='+')
			System.out.println("The addition of "+a+" and "+b+" is :"+(a+b));
		else if(ch=='-')
			System.out.println("The substraction of "+a+" and "+b+" is :"+(b-a));
		else if(ch=='*')
			System.out.println("The multification of "+a+" and "+b+" is :"+(a*b));
		else if(ch=='/')
			System.out.println("The division of "+a+" and "+b+" is :"+(b/a));
	}

}
