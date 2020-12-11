import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class mostFrequentNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the size of Array : ");
		int sizeOfArray=sc.nextInt();
		int[] arr=new int[sizeOfArray];
		System.out.println("Enter "+sizeOfArray+" elements in the array : ");
		for(int i=0;i<sizeOfArray;i++){
			arr[i]=sc.nextInt();
		}
		int count=0;
		int max=0;
		int num=0;
		List<Integer> numbers=new ArrayList<Integer>();
		for(int i=0;i<arr.length-1;i++){
			count=0;
			if(i==0){
				count=1;
			}
			for(int j=1;j<arr.length;j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			
			
			if(count==max){
				numbers.add(arr[i]);
			}
			else if(count>max){
				max=count;
				num=arr[i];
				numbers.clear();
			}
		}
		if(numbers.size()>0){
			for(int i=0;i<numbers.size();i++){
				if(numbers.get(i)==num)
				{
					Collections.sort(numbers);
				}
			}
			System.out.println("Number is "+numbers.get(0));
		}
		else{
			System.out.println(num);
		}
		
		sc.close();
	}

}
