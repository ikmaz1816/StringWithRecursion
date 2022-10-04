package stringrecursion;

import java.util.ArrayList;
import java.util.Scanner;

public class IterativeSubsetWithDuplicate {

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
		int start=0,end=0;
		for(int i=0;i<arr.length;i++)
		{
			start=0;
			int size=outer.size();
			if(i>0 && arr[i]==arr[i-1])
				start=end+1;
			end=outer.size()-1;
			for(int j=start;j<size;j++)
			{
				ArrayList<Integer> inner =new ArrayList<>(outer.get(j));
				inner.add(arr[i]);
				outer.add(inner);
				
			}
		}
		System.out.println(outer);
		sc.close();
	}

}
