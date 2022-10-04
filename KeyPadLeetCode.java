package stringrecursion;

import java.util.Scanner;

public class KeyPadLeetCode {
	public static void print(String s,String p)
	{
		if(s.isEmpty())
		{
			System.out.println(p);
			return;
		}
		int digit=s.charAt(0)-'0';
		for(int i=(digit-1)*3;i<digit*3;i++)
		{
			char a=(char)('a'+i);
			print(s.substring(1),p+a);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print(s,"");
		sc.close();
	}

}
