/**
 * 
 */
package com.sapient.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @author prasingh40
 *
 */
public class Lambda {
	public static void main(String[] args) {
		List<String> gamesList = new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("Cricket");
		gamesList.add("Counter-Strike");
		gamesList.add("PES");
		gamesList.add("Badminton");
		System.out.println("iterating by passsing lambda exp");
		gamesList.forEach(games->System.out.println(games));

	}

}
