package stringrecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsetArrayList {

	public static void subsequence(String s,String p,ArrayList<String> arr)
	{
		if(s.isEmpty())
		{
			arr.add(p);
			return;
		}
		subsequence(s.substring(1),p+s.charAt(0),arr);
		subsequence(s.substring(1),p,arr);
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String> arr=new ArrayList<>();
		subsequence(s,"",arr);
		System.out.println(arr);
		sc.close();
	}

}
