package com.apartmentlist;

import java.util.ArrayList;
import java.util.List;

/**
 * Main class to run the ShuffleFriday class.
 * 
 * @author Meenal Khandelwal
 */
public class MainClass {
	public static void main(String[] args) {
		ShuffleFriday friday = new ShuffleFriday();
		List<String> people = new ArrayList<>();
		
		for(int i = 0; i < 8; i++) {
			people.add("Sprint" + i);
		}
		
		System.out.println(friday.shufflePeople(people).toString());
	}
}
