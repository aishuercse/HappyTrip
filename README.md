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

# Development phase-2: book a flight

In this phase user should be able to book the flight. User can select any flight from searched results and make a booking without going to actual airline site. Important points regarding this phase are listed below.

* User can continue booking as guest user and can book flight without login.
* Since login functionality is not maintained so user will be asked to enter personal details like- name, email, mobile number etc. User personal details should be validated.
* Flight booking with airline will be made via Rest call.
* Payment section should be mocked. Since it is testing project so user can't develop actual payment functionality. User will be redirected to payment screen and will be asked to enter payment details. Post that payment logic will be mocked. But still entered payment details will be validated.

### Challenges:

* Suppose user searched the flights and post that took some time to make decision of booking. Meanwhile flight price got changed, since flights' prices keep changing. So before accepting payment, need to reconfirm final price.
* Suppose there is only 2,3 seats available on a flight and user took some time to make decision. Meanwhile all seats got booked, so better to check available seat before making payment. Kindly note that here we are only checking number of available seats and not the preferred seat.
