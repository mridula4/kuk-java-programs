import java.util.Scanner;


public class Problem3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int l=sc.nextInt();
		int r=sc.nextInt();
		int k=sc.nextInt();
		int count=0;
		if(l<=r){
		while(l<=r){  //if 1st number - l is less than the 2nd number- r
			if(l%k==0){
				++count;
			}
			l++;
		}
		}
		else{
		while(l>=r){ //if 1st number - l is greater than the 2nd number- r
			if(l%k==0){
				++count;
			}
			l--;
		}
		}
		System.out.println(count);
	}

}
