package logical;

import java.util.HashMap;
import java.util.Set;

public class Char_frequency_Hashmap {

	public static void main(String[] args) {
		String s = "madmaaadmcadam";
		// declaring hashmap; key=character,value=integer, key is unique ,value can be
		// duplicate
		HashMap<Character, Integer> mp = new HashMap<Character, Integer>();
		for (int i = 0; i < s.length(); i++) { // iterating string
			char charvalue = s.charAt(i); // store each char from string in variable

			if (mp.containsKey(charvalue)) { // check whether given key already present or not returns true/false
				// if condition true then put method is used to add value in map.
				// map accept value in key value pair so we have to provide key and value
				// here we adding each char from our string in map as key; as key is unique each
				// char will be stored in map for ones
				// if we try to add duplicate key the value associated with key will get updated
				// only
				// here we want to count frequency so if key exist in map and if try to add it
				// again the value should be increased by one else it should set to one
				mp.put(charvalue, mp.get(charvalue) + 1); // get method gives value associated with key as our map is
															// empty it will be null by default
			} else {
				mp.put(charvalue, 1); // if key we want to add is not present then value set to 1
			}

		}
		Set<Character> keys = mp.keySet(); // keySet method returns the set of key value in map as we know key in our
			int max=0;								// map accept character we use set<char>
		for (Character key : keys) {// iterate over key using for each loop
if(mp.get(key)>max) {
	max=mp.get(key);
}
			

		}
		System.out.print(max);
	}

}
