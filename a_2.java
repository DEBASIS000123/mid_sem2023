
public class a_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		if(a%b==0) {
			System.out.println(a+" is divisible by "+b+" : true");
		}
		else if(a%b!=0) {
			if(b%a==0)
				System.out.println(b+" is divisible by "+a+" : true");
			else
				System.out.println(a+" is not divisible by "+b+" and "+b+" is not divisible by "+a+" so : false");
		}
	}

}
