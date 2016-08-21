import java.util.*;
class main{
public static void main(String[]args){
Scanner s = new Scanner(System.in);
String a = "";
for (int x =1;x<10;x++){
a = a + Integer.toString(x);
int b = Integer.parseInt(a) * 8 + x;
System.out.println(a +" = "+ b);}
}
}

