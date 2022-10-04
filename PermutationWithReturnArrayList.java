package stringrecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PermutationWithReturnArrayList {

	public static ArrayList<String> permutations(String s,String p)
	{
		if(s.isEmpty())
		{
			ArrayList<String> arr=new ArrayList<String>();
			arr.add(p);
			return arr;
		}
		ArrayList<String> arr=new ArrayList<String>();
		for(int i=0;i<=p.length();i++)
		{
			String first=p.substring(0,i);
			String second=p.substring(i);
			arr.addAll(permutations(s.substring(1),first+s.charAt(0)+second));
		}
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String> arr=permutations(s,"");
		System.out.println(arr);
		sc.close();

	}


}
