package stringrecursion;

import java.util.Scanner;

public class SkipAString {
	public static String remove(String s,String p)
	{
		if(s.isEmpty())
			return p;
		if(s.startsWith("Apple"))
		{
				return remove(s.substring(5),p);
		}
		return remove(s.substring(1),p+s.charAt(0));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(remove(s,""));
		sc.close();
	}

}
