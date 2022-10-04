package stringrecursion;

import java.util.Scanner;

public class CheckPalindrome {
	public static String rev(String s,String p)
	{
		if(s.isEmpty())
			return p;
		return rev(s.substring(1),s.charAt(0)+p);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		if(rev(s,"").equals(s))
			System.out.println("Palindrome");
		else
			System.out.println("Not Palindrome");
		sc.close();
	}

}
