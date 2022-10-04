package stringrecursion;

import java.util.Scanner;

public class ReplaceCharacter {
	public static String remove(String s,char a,char b,String p)
	{
		if(s.isEmpty())
			return p;
		if(s.charAt(0)==a)
			return remove(s.substring(1),a,b,p+b);
		return remove(s.substring(1),a,b,p+s.charAt(0));
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		char a=sc.next().charAt(0);
		char b=sc.next().charAt(0);
		System.out.println(remove(s,a,b,""));
		sc.close();
	}

}
