package org.howard.edu.lsp.midterm.question2;

public class Driver {
    /**
     * Entry point to execute and test the encrypt method.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        // Original text
        String text = "I love CSCI363";
        
        // Encrypt the text using the encrypt method from SecurityOps class
        String encryptedText = SecurityOps.encrypt(text);
        
        // Display the result
        System.out.println("Original Text: " + text);
        System.out.println("Encrypted Text: " + encryptedText);
    }
}
