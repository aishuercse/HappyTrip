# HappyTrip
Creating this repository for developing learning project. In this repository I try to develop a small project similar to make my trip. Via this project, I try to learn new things via developing real time features. 

# Development phases
Planning below phases for development.

1. Design and develop functionality to search all available flights.
2. User should be able to select any searched flight and can book it online.
3. Develop user maintenance phase. So that user can create account and check its previous and incoming booking. Can save personal and other details for future use.
4. Online web check-in portal. User can do web check-in online by selecting preferred seat and add-on services like meal.
5. Extra functionalities related to flight booking, like cancelling the flight.
6. Additional service of hotel booking via portal.

# Technical stack

* Spring
* Hibernate
* Rest
* MySQL


# Development phase-1: search available flights

This is the first phase of development of this project. In this page, exposing very simple functionality of searching flight. Below are important points regarding this phase development.

* User need not to login to the portal but can continue as guest user.
* Search page, where user can enter search criteria for flight.
* Flights will be listed down on search results page based on search criteria. By default search results will be sorted based on price, but user can sort based on other available sort fields also.
* Available flights will be retrieved from various airlines via rest service. As a third party we may not be having latest details of flights.
* User should be able to refine search criteria and see the results.
