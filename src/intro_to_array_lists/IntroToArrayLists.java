package intro_to_array_lists;

import java.util.ArrayList;

public class IntroToArrayLists {
	public static void main(String[] args) {
		//1. Create an array list of Strings
		//   Don't forget to import the ArrayList class
		
		ArrayList<String> array= new ArrayList<String>();
		
		//2. Add five Strings to your list
		array.add("s");
		array.add("t");
		array.add("ve");
		array.add("u");
		array.add("s");
				
		
		//3. Print all the Strings using a standard for-loop
		for(int i=0; i<array.size();i++) {
			//System.out.println(array[i]);
		}
	
		
		//4. Print all the Strings using a for-each loop
		
		//5. Print only the even numbered elements in the list.
		for(int i=0; i<array.size(); i++) {
			if((i+1)%2==0) {
			//	System.out.println(array[i]);
			}
		}
		for(int i=array.size(); i>0; i--) {
			System.out.println(array.get(i-1));
		}
		
		//6. Print all the Strings in reverse order.
		
		//7. Print only the Strings that have the letter 'e' in them.
		for(int i=0; i<array.size(); i++) {
			if(array.get(i).contains("e")) {
					System.out.println(array.get(i));
				
			}
		}
	}
}
