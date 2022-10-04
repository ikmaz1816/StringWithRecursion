package stringrecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class IterativeSubset {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int[] arr=new int[n];
		for(int i=0;i<n;i++)
		{
			arr[i]=sc.nextInt();
		}
		ArrayList<ArrayList<Integer>> outer=new ArrayList<>();
		outer.add(new ArrayList<>());

		for(int num:arr)
		{
			int size=outer.size();
			for(int i=0;i<size;i++)
			{
				ArrayList<Integer> inner =new ArrayList<>(outer.get(i));
				inner.add(num);
				outer.add(inner);
				
			}
		}
		System.out.println(outer);
		sc.close();
	}

}
