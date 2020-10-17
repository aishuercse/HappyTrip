create database airline_service;
<!------------------ Table for user authorization ------------------------->
create table user_role(role_code integer, role_name varchar(25));
insert into user_role values(1, "Admin");
insert into user_role values(2, "Flight manager");

