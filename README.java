import java.io.*;
import java.util.*;
class Digits
{
public static void main(String args[])
	{
	Scanner input=new Scanner(System.in);
	int num=input.nextInt();
	int count=0;
	while(num!=0)
	{
		num=num/10;
		count++;
	}
	System.out.println(count);
  }
}
