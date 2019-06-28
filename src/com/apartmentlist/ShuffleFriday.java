package com.apartmentlist;

import java.util.*;

/**
 * Class to shuffle the users into different groups.
 * @author Meenal Khandelwal
 *
 */
public class ShuffleFriday {
	private static final int MINIMUM_NUMBER_OF_PEOPLE = 3;
	
	/**
	 * Method to shuffle people in groups
	 * 
	 * @param List<String> people
	 * @return
	 */
	public List<List<String>> shufflePeople(List<String> people) {
		List<List<String>> results = new ArrayList<>();
		
		if(people == null || people.isEmpty()) {
			return results;
		}
		
		if(people.size() <= 5) {
			results.add(people);
			return results;
		}
		
		List<String> alreadySelected = new ArrayList<>();
		Random random = new Random();
		
		List<String> newGroup = new ArrayList<>();
		while(alreadySelected.size() != people.size()) {
			int i = random.nextInt(people.size());
			
			if(!alreadySelected.contains(people.get(i))) {
				if(newGroup.size() < MINIMUM_NUMBER_OF_PEOPLE || people.size() - alreadySelected.size() < MINIMUM_NUMBER_OF_PEOPLE) {
					newGroup.add(people.get(i));
				} else {
					results.add(newGroup);
					newGroup = new ArrayList<>();
					newGroup.add(people.get(i));
				}
				
				alreadySelected.add(people.get(i));
			}
		}
		
		if(newGroup.size() > 0) {
			results.add(newGroup);
		}
		
		return results;
	}
}

