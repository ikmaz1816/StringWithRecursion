package stringrecursion;

import java.util.Scanner;

public class TowerOfHanoi {
	public static void tower(int disk,char source,char auxiliary,char destination)
	{
		if(disk>0)
		{
		tower(disk-1,source,destination,auxiliary);
		System.out.println(source+" "+destination);
		tower(disk-1,auxiliary,source,destination);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int disk=sc.nextInt();
		tower(disk,'a','b','c');
		sc.close();
	}

}
