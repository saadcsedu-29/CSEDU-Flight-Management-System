create database airlinemanagementsystem;

use airlinemanagementsystem;

create table login(username varchar(20), password varchar (20));


insert into login values("SaadBinAshad", "32_29");
insert into login values("AbdullahSakafy", "34_29");
insert into login values("AhnafKhan", "38_29");
insert into login values("MahmudulHasanArafat", "60_29");

select * from login;

create table passenger (name varchar(20), nationality varchar(20),phone varchar(15),address varchar(50), id varchar(20), gender varchar(20));

select * from passenger;

create table flight(f_code varchar(20), f_name varchar(20), source varchar(40), destination varchar(40));

describe flight;

insert into flight values("5001","CSEDU-5221","Dhaka","Sydney");
insert into flight values("5002","CSEDU-5124","Dhaka","New York");
insert into flight values("5003","CSEDU-5113","Dhaka","Toronto");
insert into flight values("5004","CSEDU-5231","Dhaka","London");
insert into flight values("5005","CSEDU-5214","Dhaka","Melbourne");

select * from flight;

create table reservation (PNR varchar(15), TIC varchar(20), id varchar(20), name varchar(20), nationality varchar(30), flightname varchar(15), flightcode varchar(20), src varchar(30), des varchar(30), ddate varchar(30));

select * from reservation;

create table cancel(pnr varchar(20), name varchar(40), cancelno varchar(20), fcode varchar(20), ddate varchar(30));

select * from cancel;
