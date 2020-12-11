import java.util.Scanner;


public class Problem2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String inputString=sc.next();
		int countZ=0;
		int countO=0;
		for(int i=0;i<inputString.length();i++){
			if(inputString.charAt(i)=='z'){
				countZ++;
			}
			else if(inputString.charAt(i)=='o'){
				countO++;
			}
			else{
				System.out.println("No");
				return;
			}
			if(i!=0){
			if(inputString.charAt(i-1)=='o' && inputString.charAt(i)=='z'){
				System.out.println("No");
				return;
			}
			}
		}
		if((2*countZ)!=countO){
			System.out.println("No");
		}
		else{
			System.out.println("Yes");
		}
	}

}
