package dkim.project05;

import java.util.Scanner;

public class Vigenere {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	    
	    System.out.println("Enter text: ");
	    String plaintext = sc.nextLine();
	    
	    System.out.println("Enter key: ");
	    String key = sc.nextLine();
	    key = key.toLowerCase();
	    
	    String ciphertext = "";
	    int j = 0;
	    int asciiMyChar2;

	    for(int i = 0; i <plaintext.length(); i++){
	    	
	    	char ch = plaintext.charAt(i);
	    	int asciiMyChar = (int) ch;

	        if (Character.isUpperCase(ch)) {
	        	asciiMyChar2 = (int) key.charAt(j % key.length());
	        	asciiMyChar2 -= 97;
	        	j++;
	        	
	         	asciiMyChar -= 65;
	         	asciiMyChar = (asciiMyChar + asciiMyChar2) % 26;
	         	asciiMyChar += 65;
	         	ch = (char) (asciiMyChar);
	         }

	         else if (Character.isLowerCase(ch)) {
	        	asciiMyChar2 = (int) key.charAt(j % key.length());
		        asciiMyChar2 -= 97;
		        j++; 
	        	 
		        asciiMyChar -= 97;
		        asciiMyChar = (asciiMyChar + asciiMyChar2) % 26;
		        asciiMyChar += 97;
	           	ch = (char) (asciiMyChar);
	         }

	         else {
	           ch = (char) (asciiMyChar);
	         }

	         ciphertext += ch;
	    }
	    System.out.println(ciphertext);

	  }
}




