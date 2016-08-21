import java.util.*;
class armstrongnumber{
	public static void main(String[]args){
		Scanner s = new Scanner(System.in);
			
			int i = 0,a,temp;
			System.out.print("Enter # of inputs:");
			int n=s.nextInt();
			int[] arms = new int[n+1];
			int k=0;
			while(k<n){	
				System.out.print("Enter digits:");
				arms[k] = s.nextInt();
				k++;}
			for (int ctr=0;ctr<n;ctr++){
                        temp = arms[ctr];
			while (arms[ctr]>0){
				a = arms[ctr]%10;
				arms[ctr]=arms[ctr]/10;
				i=i+(a*a*a);}
                        if (temp==i) System.out.println(temp+" is an armstrong number");
                        else System.out.println(temp+" is not an armstrong number");
                        i=0;
                        }

}
}