package guvi;

import java.util.Arrays;
import java.util.Scanner;

public class LeastNumberAfterDeleting{

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter a number");
		int number=scanner.nextInt();
		System.out.println("enter the number of elements to be deleted");
		int k=scanner.nextInt();
		String str=Integer.toString(number);
		int[] indarr=new int[str.length()];
		int i=0;
		while(number!=0)
		{
			indarr[i]=number%10;
			i++;
			number=number/10;
		}
		Arrays.sort(indarr);
		 String string="";
		 int index=0;
		 int l=indarr.length-1;
		 int n=indarr.length-k;
		 for(int j=l-k;j>=0;j--){
			 if(index<n){
			string+=Integer.toString(indarr[index]); 
			index++;
			 }
		 }
		System.out.println(string);
		scanner.close();
	}

}
