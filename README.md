# CarRental
Convert JSON schema to Java Object

The below represents the JSON schema for a car rental company. 

Below is the schema definition
  "Car" : {
     "make": <String>
	  "model": <String>
     "vin": <String>
     "metadata" : {
         "Color" : <String>
         "Notes" : <String>
         }
     "perdayrent" : {
        "Price" : <Float>
         "Discount" : <Float>
         }
     "metrics" : {
         "yoymaintenancecost" : <Float>
         "depreciation": <Float>
         "rentalcount" : {
             "lastweek" : <Int>
             "yeartodate" : <Int>
             }
         }
    }
    
   We have a list of cars in a json format file.
    
    An example of the response is:
     "Car" : {
     		"make": "Audi",
	  	"model": "A7",
     		"vin": "09AGHY64352JITEG98K",
     		"metadata" : 	{
         				"Color" : "Black",
         				"Notes" : "Scratches on the front side of the car",
         			},
     		"perdayrent" : 	{
        				"Price" : 140,
         				"Discount" : 15,
         			},
     		"metrics" : 	{
         				"yoymaintenancecost" : 2190.76,
         				"depreciation": 2256.43,
         				"rentalcount" : {
             							"lastweek" : 4
             							"yeartodate" : 221
             						},
         			},
    }

Created a maven project to parse the json file and performed following filters:

 1: Print all the blue Teslas received in the web service response. Also print the notes
 2: Return all cars which have the lowest per day rental cost for both cases:
    				a. Price only
    				b. Price after discounts
 3: Find the highest revenue generating car. year over year maintenance cost + depreciation is the total expense per car for the full year for the rental car company.
    			
