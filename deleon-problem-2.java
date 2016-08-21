import java.util.*;

class maclaurin{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
			double a;
			int b=1,c=1;
		System.out.print("Enter value for x: ");
		double x = s.nextDouble();
		System.out.print("Enter value for k: ");
		int k = s.nextInt();
			a=0;
		for(int i=1;i<=k;i++){	
			a=a+(b*(Math.pow(x,c))/c);
			c=c+2;
			b=b*(-1);
		}System.out.println(a);
		 System.out.print("Math.atan("+x+") = "+Math.atan(x));
}
}