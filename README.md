Application is about get Country name and Weather of the capital using Currency.

It's built on MicroServices architecture 

Containing following services:
1.Eureka Naming Service
2.Cloud Configuration Service
3.Zuul Api-Gateway Service
4.Weather Service
5.Countries Service
6.Search Service

use command prompt/powershell
## Building the project
		
		cd <service-directory>
		
		gradlew build

## Running the application

			java -jar .\build\libs\<Service-Name>-0.0.1-SNAPSHOT.jar

## Note: The following order need to start the services
1.Eureka Name Service
2.Cloud Configuration Service
3.Zuul Api-Gateway service 
other three can start any order

## Search API
Pass the currency as path variable to api
```java
	http://localhost:8765/search-service/v1/by-currency/{currency}
```

Sample Resposnse for currncy:INR
```
[
    {
        "countryName": "Bhutan",
        "capitalName": "Thimphu",
        "weatherInfo": "Weather information of city Thimphu:  71f, 22c"
    },
    {
        "countryName": "Zimbabwe",
        "capitalName": "Harare",
        "weatherInfo": "Weather information of city Harare:  76f, 24c"
    },
    {
        "countryName": "India",
        "capitalName": "New Delhi",
        "weatherInfo": "Weather information of city New Delhi:  75f, 24c"
    }
]
```
