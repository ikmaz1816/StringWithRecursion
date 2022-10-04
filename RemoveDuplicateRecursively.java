package stringrecursion;

import java.util.Scanner;

public class RemoveDuplicateRecursively {
	public static String remove(String s,String p,int index,int length)
	{
		if(index==length)
		{
			return p+s.charAt(0);
		}
		if(s.charAt(0)==s.charAt(1))
		{
			return remove(s.substring(1),p,index+1,length);
		}
		return remove(s.substring(1),p+s.charAt(0),index+1,length);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		System.out.println(remove(s,"",0,s.length()-1));
		sc.close();
	}

}
