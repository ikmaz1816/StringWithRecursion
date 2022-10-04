package stringrecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class PrintSubsetArrayListReturn {


	public static ArrayList<String> subsequence(String s,String p)
	{
		if(s.isEmpty())
		{
			ArrayList<String> arr=new ArrayList<String>();
			arr.add(p);
			return arr;
		}
		ArrayList<String> arr=new ArrayList<String>();
		arr.addAll(subsequence(s.substring(1),p+s.charAt(0)));
		arr.addAll(subsequence(s.substring(1),p));
		return arr;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s=sc.next();
		ArrayList<String> arr=subsequence(s,"");
		System.out.println(arr);
		sc.close();
	}

}
