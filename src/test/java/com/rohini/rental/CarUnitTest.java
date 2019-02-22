package com.rohini.rental;

import java.io.IOException;
import java.util.Iterator;
import java.util.List;

import org.testng.annotations.Test;

// This the the unit test for Car
public class CarUnitTest extends CarQueries {
	
	public CarUnitTest() throws IOException {
		super();
	}

	CarQueries queries = new CarQueries();
	
	// Question 1: Print all the blue Teslas received in the web service response.
	@Test
	public void all_Blue_Teslas() throws IOException {
		System.out.println("\n\n >>>> " + new Throwable().getStackTrace()[0].getMethodName());
		List<Car> blueTesla = queries.getAllBlueTesla();
		System.out.println("All Blue Tesla Cars .... \n" + blueTesla );
	}
	
	// Question 2 A: Return all cars which have the lowest per day rental cost for Price only
	@Test
	public void lowest_Perday_Rental_Cost_ByPrice() throws IOException {
		System.out.println("\n\n >>>> " + new Throwable().getStackTrace()[0].getMethodName() );
		Car lowestPriceRental = queries.lowestPerdayRental_Cost_ByPrice();
		System.out.println("lowestPriceRental Car  is .... \n" + lowestPriceRental );
	}
	
	// Question 2 B: Return all cars which have the lowest per day rental cost for Price after discounts
	@Test
	public void lowest_Perday_Rental_Cost_ByPrice_AfterDiscount() throws IOException {
		System.out.println("\n\n >>>> " + new Throwable().getStackTrace()[0].getMethodName() );
		Car lowestPriceRental = queries.lowestPerdayRental_Cost_ByPrice_AfterDiscount();
		System.out.println("lowest_Perday_Rental_Cost_ByPrice_AfterDiscount car is .... \n" + lowestPriceRental );
	}
	
	// Question 3: Find the highest revenue generating car
	@Test
	public void highestRevenueCar() throws IOException {
		System.out.println("\n\n >>>> " + new Throwable().getStackTrace()[0].getMethodName() );
		Car highestRevenue = queries.highestRevenueGeneratingCar();
		System.out.println("highestRevenueGeneratingCar is .... \n" + highestRevenue );
	}
	
}
