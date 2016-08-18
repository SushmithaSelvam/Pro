package guvipro;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySort {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("enter the number of elements");
		int range=scanner.nextInt();
		int[] array=new int[range];
		int[] count=new int[range];
		System.out.println("enter the elements");
		for(int i=0;i<range;i++){
			array[i]=scanner.nextInt();
			String binary=Integer.toString(array[i],2);
			for(int j=0;j<binary.length();j++){
				if(binary.charAt(j)=='1'){
					count[i]++;
					
				}
			}
		}
		for(int i=0;i<count.length-1;i++){
			for(int j=i+1;j<count.length;j++){
				if(count[i]>count[j]){
					int temp=count[i];
					count[i]=count[j];
					count[j]=temp;
					int dup=array[i];
					array[i]=array[j];
					array[j]=dup;
					
				}
			}
		}
		System.out.println(Arrays.toString(array));
		scanner.close();
	}

}
