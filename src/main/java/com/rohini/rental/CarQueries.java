package com.rohini.rental;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

// This class is having the methods to filter the data based on the questions that is asked .
public class CarQueries extends JsonParser {

	// Declare a list of Car objects.
	public final List<Car> carList;
	
	// initialized the JsonParser object.
	JsonParser jsonParser = new JsonParser();

	public CarQueries() throws IOException {
		// initialized the final carList Object by using the parser which is taking a json file as parameter.
		carList = jsonParser.car_JSON_Array_To_Java_Object_Array("car2.json");
	}

	// This method will return a list of all Tesla cars which is having blue color.
	public List<Car> getAllBlueTesla() throws IOException {

		// Created a list of car for Tesla 
		List<Car> blueTesla_Cars = new ArrayList<Car>();

		// Iterating through the final object carList, to finding all the tesla car 
		for (Car car : carList) {
			if (car == null) {
				continue;
			}

			// Checking the make of the car in current object of carList as Tesla.
			if (car.getMake().equalsIgnoreCase("Tesla")) {
				// Checking the color of the car in current object of carList as blue.
				if (car.getMetaData().getColor().equalsIgnoreCase("Blue")) {
					System.out.println("Yes, >>>> Blue Tesla Found >>>> " + car);
					
					// If current car object matches the above conditions
					// Then, adding the current car object to the list of tesla cars object. 
					blueTesla_Cars.add(car);
				} else {
					System.out.println(">>>> Blue >>>> Tesla >>>> NOT Found >>>> ");
				}
			} else {
				System.out.println(">>>> Tesla >>>> NOT Found >>>> ");
			}
		}
		
		// returning the list of tesla car.
		return blueTesla_Cars;
	}

	public Car lowestPerdayRental_Cost_ByPrice() throws IOException {

		Car lowest_price_Obj = null;

		float lowest_perday_cost = 0;

		for (Car car : carList) {
			if (car == null) {
				continue;
			}

			float current_car_rentalPrice = car.getPerDayRent().getPrice();
			
			if (current_car_rentalPrice > lowest_perday_cost) {
				lowest_perday_cost = current_car_rentalPrice;
				lowest_price_Obj = car;
			} else {
				System.out.println(" Current Car >>>> is Not >>>> having lowest price >>>> ");
			}
		}
		return lowest_price_Obj;
	}

	public Car lowestPerdayRental_Cost_ByPrice_AfterDiscount() throws IOException {

		Car lowest_price_Obj = null;

		float lowest_perday_cost_after_discount = 0;

		for (Car car : carList) {
			if (car == null) {
				continue;
			}

			float cost_after_discount = car.getPerDayRent().getPrice()
					- car.getPerDayRent().getDiscount();
			if (cost_after_discount > lowest_perday_cost_after_discount) {
				lowest_perday_cost_after_discount = cost_after_discount;
				lowest_price_Obj = car;
			} else {
				System.out.println(" Current Car >>>> is not having lowest price after discount >>>> ");
			}
		}
		return lowest_price_Obj;
	}

	public Car highestRevenueGeneratingCar() throws IOException {

		Car highest_revenue_car = null;
		
		float highest_revenue = 0;
		
		System.out.println("highest_revenue value >>>> " + highest_revenue);
		
		for (Car car : carList) {
			if (car == null) {
				continue;
			}
			
			float current_car_revenue = car.getMetrics().getYoyMaintenanceCost() + car.getMetrics().getDepreciation();
			
			System.out.println("Current Car revenue value >>>> " + current_car_revenue);
			
			if (current_car_revenue > highest_revenue) {
				highest_revenue = current_car_revenue;
				highest_revenue_car = car;
			} else {
				System.out.println(" Current Car >>>> is not >>>> highest_revenue_car >>>> ");
			}
		}
		return highest_revenue_car;
	}
}
