import java.util.Scanner;
/**
This program will perform encryption on a message and outputs the scrambled message.
@author Jackie Omekara.
*/

public class EncryptCode{
	public static void main(String[] args){
	
	Scanner scan = new Scanner(System.in);
	
	while(scan.hasNext()){
	int rows_num = scan.nextInt();	//number of rows for the 2D array.
	if (rows_num==0){
		break;
	}
	scan.nextLine();
	String msg = scan.nextLine(); //message to be encrypted.
	
	String msglower = msg.toLowerCase();
	String newstring ="";
	for(int i=0;i<msglower.length();i++){
		if (Character.isLetter(msglower.charAt(i))){
			newstring +=msglower.charAt(i);
		}
	}
	
	int col_num = (int) Math.ceil(newstring.length()/(double)rows_num);
	int rand_num = (rows_num * col_num) % newstring.length(); //number of extra random letters to fit in array.
	
	
	for(int j = 0;j<rand_num;j++){
		int charVal = (int) (Math.random() *26 +97);
		char randLetter = (char) charVal; //random letter to be generated.
		newstring+=randLetter;
	}
	
	
	char [][] encryptArray = new char [rows_num][col_num];
	int n =0;
	for(int col=col_num-1;col>=0;col--){
		if(col%2 ==1){
			for(int row=rows_num-1;row>=0;row--){
				encryptArray[row][col] = newstring.charAt(n);
				n++;
			}
		}
		else{
			for(int row=0;row<rows_num;row++){
				encryptArray[row][col] = newstring.charAt(n);
				n++;
			}
		}
	}
	
	
	String encryptString = "";
	for(int row =rows_num-1;row>=0;row--){
		for(int col=0;col<=col_num-1;col++){
			encryptString+= Character.toString(encryptArray[row][col]);
		}
		
	}
	System.out.println(encryptString); 
	
	
	
	}
	
	}
}
