package dkim.project05;

import java.util.Scanner;

public class Caesar {

  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter text");
    String plaintext = sc.nextLine();
    
    System.out.println("Enter key");
    int key = sc.nextInt();
    key = key % 26;
    
    String ciphertext = "";

    for(int i = 0; i <plaintext.length(); i++){
    	
    	char ch = plaintext.charAt(i);
    	int asciiMyChar = (int) ch; 

         if (Character.isUpperCase(ch)) {
           asciiMyChar -= 65;
           asciiMyChar = (asciiMyChar + key) % 26;
           asciiMyChar += 65;
           ch = (char) (asciiMyChar);
         }

         else if (Character.isLowerCase(ch)) {
           asciiMyChar -= 97;
           asciiMyChar = (asciiMyChar + key) % 26;
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


