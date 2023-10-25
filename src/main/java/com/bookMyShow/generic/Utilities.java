package com.bookMyShow.generic;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class Utilities {
	static List<String> city = Arrays.asList("Mumbai", "Delhi-NCR", "Bengaluru", "Hyderabad", "Ahmedabad", "Chandigarh",
			"Chennai", "Pune", "Kolkata", "Kochi");
	static List<String> language = Arrays.asList("Hindi", "English", "Tamil", "Marathi", "Telugu", "Malayalam",
			"Multi Language", "Punjabi");

	private Pojo objPojo;
	Random randNum = new Random();

	public Utilities(Pojo pojo) {
		this.objPojo = pojo;
	}

	public String getRandomCity() {

		int max = city.size() - 1;
		int num = randNum.nextInt(max - 0 + 1) + 0;
		return city.get(num);

	}

	public String getRandomLanguage() {
		int max = language.size() - 1;
		int randomNo = randNum.nextInt(max - 0 + 1) + 0;
		return language.get(randomNo);
	}

}
