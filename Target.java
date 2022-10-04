package stringrecursion;

import java.util.Scanner;

public class Target {
	public static void print(int target,String s)
	{
		if(target==0)
		{
			System.out.println(s);
			return;
		}
		for(int i=1;i<=6 && i<=target;i++)
		{
			print(target-i,s+i);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		print(n,"");
		sc.close();
	}

}
