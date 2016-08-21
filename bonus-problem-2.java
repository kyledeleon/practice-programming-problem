import java.util.*;
class wierdnumber{

public static void main(String[]args){
Scanner s = new Scanner(System.in);
	System.out.print("Enter N:");
	int n = s.nextInt();
		if (n%2==0 && n > 1 && n <6 || n >20 )	System.out.print("Not wierd");
		else if (n%2==0 && n > 5 && n < 21 || n%2==1 )	System.out.print("Wierd");
}
}