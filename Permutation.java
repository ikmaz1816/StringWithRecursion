package stringrecursion;

import java.util.Scanner;

public class Permutation {
	public static void permutations(String s,String p)
	{
		if(s.isEmpty())
		{
			System.out.println(p);
			return;
		}
		for(int i=0;i<=p.length();i++)
		{
			String first=p.substring(0,i);
			String second=p.substring(i);
			permutations(s.substring(1),first+s.charAt(0)+second);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		permutations(s,"");
		sc.close();

	}

}
