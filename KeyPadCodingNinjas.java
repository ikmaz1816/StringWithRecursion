package stringrecursion;

import java.util.Scanner;

public class KeyPadCodingNinjas {
	public static String get(int n)
	{
		switch(n)
		{
		case 2:
			return "abc";
		case 3:
			return "def";
		case 4:
			return "ghi";
		case 5:
			return "jkl";
		case 6:
			return "mno";
		case 7:
			return "pqrs";
		case 8:
			return "tuv";
		case 9:
			return "wxyz";
		default:
			return "";
		}
	}
	public static void print(String s,String p)
	{
		if(s.isEmpty())
		{
			System.out.println(p);
			return;
		}
		int digit=s.charAt(0)-'0';
		String s1=get(digit);
		for(int i=0;i<s1.length();i++)
		{
			print(s.substring(1),p+s1.charAt(i));
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		print(s,"");
		sc.close();

	}

}
