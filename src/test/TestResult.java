package test;

import java.util.Scanner;
import domain.Exercise;

public class TestResult {
    public static void main(String[] args){
        System.out.println("Enter the string: ");
        
        Scanner scanner = new Scanner(System.in);
        String inputString = scanner.nextLine();
       
        System.out.println("Encrypted string:");
        String encriptedString = Cipher(inputString);
        
        System.out.println("Decrypted string:");
        Cipher(encriptedString);
    }
}
