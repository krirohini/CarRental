package com.rohini.rental;

import java.io.FileReader;
import java.io.IOException;
import java.sql.Wrapper;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;

// This class is use to parse the json file.
public class JsonParser {
	
	// This function will read the given json file and will return a list of car objects
	public List<Car> car_JSON_Array_To_Java_Object_Array(String fileName) throws IOException {

		// Using the Gson parsor; Its dependecy is added in pom.xml file in this project.
		Gson gson = new Gson();
		List<Car> car;
		Type listType = new TypeToken<List<Car>>() { }.getType();
		car = gson.fromJson(new FileReader(fileName), listType);

		System.out.println(car);
		return car;
	}

}
