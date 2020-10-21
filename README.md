# HappyTrip
Creating this repository for developing learning project. In this repository I try to develop a small project similar to make my trip. Via this project, I try to learn new things via developing real time features. 

## Business functionalities

* Airline service
* Flight booking service

## Technical stack

* Spring
* Hibernate
* Rest
* MySQL

## Airline service

In real time scenario, each airline is an independent service and each airline has its own portal and database. But since it is a learning project so I am not going to create independent service for each  airline. Instead of that I am going to create one web application using one database for all the airlines. Below are few important points regarding airline service. 

* Flight will be uniquely identified using flight number and date of operation. Because same flight usually operate daily.
* User's flight booking info will be identified via PNR number. Booking detail will be having PNR, flight info, customer info, payment details etc.
* For each flight(flight number and date of operations), details like price, available seats etc. would be updated regularly. We can get updated details regularly and post it on portal.
* Each flight will have seats assigned for travel types like- economy class, business class.

## Flight booking service

User should be able to search and book the flight. But since the portal is third party service so flight related information will be fetched from airlines via rest service. Portal will act as landing point for flight booking as it will be having details of multiple flights from multiple airlines. Also flight bookng request will be confirmed by airline service.

## Development phases for flight booking service
Planning below phases for development.

1. Design and develop functionality to search all available flights.
2. User should be able to select any searched flight and can book it online.
3. Develop user maintenance phase. So that user can create account and check its previous and incoming booking. Can save personal and other details for future use.
4. Online web check-in portal. User can do web check-in online by selecting preferred seat and add-on services like meal.
5. Extra functionalities related to flight booking, like cancelling the flight.

### Development phase-1: search available flights

This is the first phase of development of this project. In this page, exposing very simple functionality of searching flight. Below are important points regarding this phase development.

* User need not to login to the portal but can continue as guest user.
* Search page, where user can enter search criteria for flight.
* Flights will be listed down on search results page based on search criteria. By default search results will be sorted based on price, but user can sort based on other available sort fields also.
* Available flights will be retrieved from airline DB via rest service. Since happy trip is third party portal so can't have access to airlines DB.
* User should be able to refine search criteria and see the results.

### Development phase-2: book a flight

In this phase user should be able to book the flight. User can select any flight from searched results and make a booking without going to actual airline site. Important points regarding this phase are listed below.

* User can continue booking as guest user and can book flight without login.
* Since login functionality is not maintained so user will be asked to enter personal details like- name, email, mobile number etc. User personal details should be validated.
* Flight booking with airline will be made via Rest call.
* Payment section should be mocked. Since it is learning project so we can't develop actual payment functionality. User will be redirected to payment screen and will be asked to enter payment details. Post that payment logic will be mocked. But still entered payment details will be validated.
* Airlines need to store details of payment also as well as personal details. Because if user cancel the flights then refund needs to be processed to same payment source.

#### Challenges:

* Suppose user searched the flights and post that took some time to make decision of booking. Meanwhile flight price got changed, since flights' prices keep changing. So before accepting payment, need to reconfirm final price.
* Suppose there is only 2,3 seats available on a flight and user took some time to make decision. Meanwhile all seats got booked, so better to check available seat before making payment. Kindly note that here we are only checking number of available seats and not the preferred seat.

### Development phase-3: user maintenance

Till phase-2 development we were only dealing with guest user. In this phase we will try to implement user maintenance also.

* User should be able to register and login to the portal.
* User can save personal details.
* If user book the flight after login then user's flight details should be shown under upcoming/completed flights section.
* User can save payment details for faster transaction.
* User should be able to save preferred search criteria, so that criteria can be used to pre fill the search criteria and user can then modify it if required.

### Development phase-4: web checkin

In this phase we will try to implement web checkin using our portal. During web checkin user can opt a seat and also opt for additional services like meal. Below are important points regarding this phase.

* During web checkin user will be prompted to read guidelines and instructions and once user accepts conditions then only go to next step of web checkin.
* User can select preferred seat. Already selected seats should be shown in grey. If any seat has price to be paid then show that once user hover over it.
* Available seats and their prices will be fetched from airline via rest service.
* Once seat is selected then in next step user will be asked to choose additional services if interested.
* Additional services and their prices will be fetched from airline via rest service.
* Final step is to finish web checkin after making payment for seat and additional services.
* After web checkin, boarding pass should get generated and user can save or print the boarding pass.

#### Challenges
* Suppose user selected one seat and took some time to finish web checkin. Meanwhile another user booked that seat, so before making final payment it is wise to recheck if selected seat is available and lock that seat then.

### Development-phase 5: additional flight services

* Along with flight booking and web checkin, additional flight related services can also be provided like- cancelling the flight.
* If user cancel the flights then request will be sent to airline via rest service and before submit cancellation charges and eligible refund will be shown. If user confirm then cancel the flight.
* Actual flight cancellation logic will be developed at airline side and portal will send request to airline via rest service.
