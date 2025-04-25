package com.git.project;
public class CaesarCipher {
    public static void main(String[] args) {
        String input = "HELLZ";
        int key = 3; // Shift value (key)
        
        // Encrypt the input string using the Caesar Cipher
        String encrypted = caesarCipherEncrypt(input, key);
        System.out.println("Encrypted Message: " + encrypted); // KHOOR
    }

    // Method to encrypt the input string using Caesar Cipher
    public static String caesarCipherEncrypt(String input, int key) {
        StringBuilder result = new StringBuilder();
        
        for(int i =0;i<=input.length()-1;i++) {
        	char ch = input.charAt(i);
        	if(Character.isUpperCase(ch)) {
        		char shifted = (char) ((ch+key - 'A')%26 + 'A');
        		result.append(shifted);
        	}else {
        		char shifted = (char) ((ch+key - 'a')%26 + 'a');
        		result.append(shifted);
        	}
        }
        
        
        return result.toString(); // Return the encrypted result
    }
}
