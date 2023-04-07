import java.util.Scanner;
public class b_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your monthly bill :");
		int a=sc.nextInt();
		double amount=0;
		if(a<=50)
			amount=(a*3);
		else if(a>50 && a<=200)
			amount=(50*3)+((a-50)*4.80);
		else if(a>200 && a<=400)
			amount=(50*3)+(150*4.80)+((a-200)*5.80);
		else if(a>400)
			amount=(50*3)+(150*4.80)+(200*5.80)+((a-400)*6.20);
		System.out.println("Do you want to pay it online (y/n) :");
		char ch=sc.next().charAt(0);
		if(ch=='y'|| ch=='Y') {
			double dis=(amount*0.03);
			System.out.println("Your total amount is :"+(amount-dis));
			System.out.println("Discount :"+dis);
		}
		else if(ch=='n'|| ch=='N') {
			System.out.println("your total amount is "+amount);
		}
		else 
			System.out.println("Invalid option ");
		
	}

}
