package stringrecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationArrayList {

	public static void permutations(String s,String p,ArrayList<String> arr)
	{
		if(s.isEmpty())
		{
			arr.add(p);
			return;
		}
		for(int i=0;i<=p.length();i++)
		{
			String first=p.substring(0,i);
			String second=p.substring(i);
			permutations(s.substring(1),first+s.charAt(0)+second,arr);
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String> arr=new ArrayList<>();
		permutations(s,"",arr);
		System.out.println(arr);
		sc.close();

	}

}
