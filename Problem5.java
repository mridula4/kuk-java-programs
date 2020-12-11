import java.util.Scanner;


public class Problem5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of Elements :");
		int size=sc.nextInt();
		System.out.println("Enter "+size+" elemets in the Array");
		int[] num=new int[size];
		for(int i=0;i<num.length;i++){
				num[i]=sc.nextInt();
				if(num[i]>99 || num[i]<-99){
					System.out.println(num[i]+" is an invalid number. Please re-enter a 2 digit number.");
					num[i]=sc.nextInt();
				}
		}
		System.out.println("Output :");
		for(int k=0;k<num.length;k++){
			if(num[k]==42){
				return;
			}
			else{
				System.out.println(num[k]);
			}
		}
	}

}
