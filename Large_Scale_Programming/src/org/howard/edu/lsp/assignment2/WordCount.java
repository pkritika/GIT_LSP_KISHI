package org.howard.edu.lsp.assignment2;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
//import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.net.URL;



public class WordCount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		String fileName = "/Users/kritika/Downloads/words.txt";   

		URL url = WordCount.class.getResource("words.txt");
        String filePath = url.getPath();
		try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
//            Map<String, Integer> valueMap = new HashMap<>();
              Map<String, Integer> WordCountHelper = new LinkedHashMap<>(); // Creating a new linked hash map to store the key and value that is word and its count.
              // We are using Linked Hash Map because we need to print the word and count in specific order and Hash map does not guaranteed to be in any specific order
           
            while ((line = br.readLine()) != null) { // while it does not reach the end of the sentence
//            	System.out.println(line);
            	String[] words = line.toLowerCase().split("\\s+"); // to convert all the words in lower case so that there design and Design can be considered same and 
            	// later splitting string into an array of words
            	
            	

                for (String word : words) {
                	if (word.contains("'")){
                		String[] ContractionWords = word.split("'");
                		for (String contraction : ContractionWords) {
                			if (!contraction.matches("\\d+") && contraction.length() > 3) {
                				if(WordCountHelper.containsKey(word)){
                					WordCountHelper.put(contraction, WordCountHelper.get(contraction)+1);
                					
                				}else {
                					WordCountHelper.put(word, 1);
                				}
                			}
                		}
                		
                		
                		
                	}	
              
                	else if(!word.matches("\\d+") && word.length() > 3) {  //check if the string word does not match the regular expression \\d+, 
                		//which means it's checking if the string is not composed entirely of digits.
                    if (WordCountHelper.containsKey(word)) { // checking if the Hash Map has the key already, if the key exist increase its value by 1
                        WordCountHelper.put(word, WordCountHelper.get(word) + 1);
                    } else { //if the  key does not exist put its value 1
                        WordCountHelper.put(word, 1);
                    }
                    
                    }
                }
                
            }
            for (String key : WordCountHelper.keySet()) {  //returning a Set view of the keys contained in the map using .keyset
                int value = WordCountHelper.get(key);
                System.out.println(key + " " + value);
            }

        } catch (IOException e) {
            // Handle exceptions such as file not found or unable to read
            e.printStackTrace();
        }
		
		
		
	
	}
}

 