package stringrecursion;

import java.util.Scanner;

public class PrintSubset {
	public static void subsequence(String s,String p)
	{
		if(s.isEmpty())
		{
			System.out.println(p);
			return;
		}
		subsequence(s.substring(1),p+s.charAt(0));
		subsequence(s.substring(1),p);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		subsequence(s,"");
		sc.close();
	}

}
