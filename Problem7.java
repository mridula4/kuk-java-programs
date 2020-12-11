import java.util.Scanner;

public class Problem7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Message String :");
		String msg=sc.next();
		System.out.println("Enter the numeric Key :");
		int numKey=sc.nextInt();
		String encryptedMsg=new String();
		for(int i=0;i<msg.length();i++){
			if(Character.isAlphabetic(msg.charAt(i)) || Character.isDigit(msg.charAt(i)))
			{
				encryptedMsg+=""+((char)((int)msg.charAt(i)+numKey));
				if(!Character.isAlphabetic(encryptedMsg.charAt(i)) && !Character.isDigit(encryptedMsg.charAt(i)))
				{
					encryptedMsg=encryptedMsg.replace(encryptedMsg.charAt(i), roundOff(encryptedMsg.charAt(i),msg.charAt(i)));
				}
			}
			else
			{
				encryptedMsg+=""+(msg.charAt(i));
			}
			
		}
		System.out.println("Output :\n"+encryptedMsg);
		sc.close();
	}
	
	static char roundOff(char ch, char Orignal)
	{
		int newAscii=ch;
		int Oldascii=Orignal;
		int[] ranges={(int)'Z',(int)'z',(int)'9'};
		int[] begin={(int)'A',(int)'a',(int)'0'};
		char result=' ';
		for(int i=0;i<ranges.length;i++){
			if(Oldascii>=begin[i] && Oldascii<=ranges[i]){
				int small=newAscii-ranges[i];
				if(small>ranges[i]){
					roundOff((char)newAscii, (char)small);
				}
				result=(char) (begin[i]+small-1);
			}
		}
		return result;
	}

}
