import java.io.*;
import java.util.*;
class large
{
public static void main(String args[])
{
Scanner s=new Scanner(System.in);
System.out.println("enetr numbers:");
int num[]=new int[3];
num[0]=s.nextInt();
num[1]=s.nextInt();
num[2]=s.nextInt();
Arrays.sort(num);
System.out.println("largest is:"+num[2]);
}
}
