package org.howard.edu.lsp.midterm.question2;

public class SecurityOps {
    /**
     * Encrypts the given text by writing all even-indexed characters followed by odd-indexed characters,
     * ignoring punctuation and whitespace.
     *
     * @param text the text to encrypt
     * @return the encrypted string
     */
    public static String encrypt(String text) {
        // Remove all characters except letters and digits
        String cleanText = text.replaceAll("[^a-zA-Z0-9]", "");

        // Variables to store even-indexed and odd-indexed characters
        StringBuilder evenChars = new StringBuilder();
        StringBuilder oddChars = new StringBuilder();

        // Iterate through each character in the clean text
        for (int i = 0; i < cleanText.length(); i++) {
            char ch = cleanText.charAt(i);
            // Append even-indexed characters to evenChars
            if (i % 2 == 0) {
                evenChars.append(ch);
            } else {
                // Append odd-indexed characters to oddChars
                oddChars.append(ch);
            }
        }

        // Combine evenChars and oddChars to form the final encrypted string
        return evenChars.toString() + oddChars.toString();
    }
}
