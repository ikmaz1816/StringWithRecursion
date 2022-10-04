package stringrecursion;

import java.util.Scanner;

public class SkipACharacter {
	public static String remove(String s,char c,String p)
	{
		if(s.isEmpty())
		{
			return p;
		}
		if(s.charAt(0)==c)
			return remove(s.substring(1),c,p);
		return remove(s.substring(1),c,p+s.charAt(0));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char c=sc.next().charAt(0);
		System.out.println(remove(s,c,""));
		sc.close();
	}

}
