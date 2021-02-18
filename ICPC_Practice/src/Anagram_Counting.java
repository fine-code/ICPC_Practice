import java.util.Scanner;
import java.util.ArrayList;

public class Anagram_Counting {

	public static void main(String[] args) {
		//get input
		Scanner in = new Scanner(System.in);
		ArrayList<String> array = new ArrayList<String>();
		//array of words from input
		while (in.hasNextLine()) {
			array.add(in.nextLine());
		}
		
		//ArrayList<String> output = new ArrayList<String>();
		
		//algorithm
		for (int i = 0; i < array.size(); i++) {
			String temp = array.get(i);
			//get word length
			int wordLength = temp.length();
			//array with the letter in the word
			//String[] letters = temp.split(""); 
			
			//go through the word
			for (int j = 0; j < wordLength; j++) {
				char tempLetter = temp.charAt(j);
				int duplicates = 0;
				/*save duplicates letters just for testing*/
				ArrayList<Character> duplicatesArray = new ArrayList<Character>(); 
				//check for doubles
				for (int k = 0; k < temp.length(); k++) {
					if (tempLetter == temp.charAt(k) && j != k) {  //same letter in different position
						duplicates++;
						duplicatesArray.add(tempLetter); /*save for testing*/
					}
				}
				int uniqueLetters = wordLength - duplicates;
				//output
				int numPermutation = uniqueLetters; /*TODO: perform the calculation*/
				System.out.println(numPermutation);
			}
		}
		
	}
}
