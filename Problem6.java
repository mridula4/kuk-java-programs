import java.util.Scanner;


public class Problem6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int positionOfFriendHouse=sc.nextInt();
		int steps=positionOfFriendHouse/5;
		if(positionOfFriendHouse%5!=0){
			steps+=1;
		}
		System.out.println("Output :\n"+steps);
	}

}
