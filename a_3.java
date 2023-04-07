import java.util.Scanner;
public class a_3 {

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
		System.out.println("your total amount is :"+amount);
	}

}
