package duplicate.characters.string;

import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacters {
	
	
	public static void printDuplicateCharacters(String source) {
		char[] characters = source.toCharArray();
		
		Map<Character, Integer> charMap = new HashMap<Character, Integer>();
		
		//START OF Constructing of character and number
		for (Character c : characters) {
			if (charMap.containsKey(c)) {
				charMap.put(c, charMap.get(c)+1);
			} else  {
				charMap.put(c, 1);
			}
		}
		//END 
		
		System.out.println("List of duplicate characters in String: " + source);
		for (Map.Entry<Character, Integer> entry : charMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.println("Character:" +entry.getKey() +"  "+ "Number of Times=" +entry.getValue());
            }
			}
		}
	
	
	/**
	 * Test method. 
	 * @param args
	 */
	public static void main(String[] args) {
		printDuplicateCharacters("SaradinduSamal");
	}
				
	}

