drop database if exists testdb;
create database testdb;
use testdb;
Create TABLE if not exists User(
  clientID int, 
  phoneNumber varchar(13), 
  email varchar(50), 
  creditCard int, 
  firstName varchar(20), 
  lastName varchar(20),
  password varchar(20),
  PRIMARY KEY (email)
);

SET FOREIGN_KEY_CHECKS = 0;
Create TABLE if not exists Bill(
  billID int, 
  clientNote varchar(30), 
  SmithNote varchar(30),
  quoteID int,
  PRIMARY KEY (billID),
  Foreign key (quoteID) references Quote(quoteID)
);
SET FOREIGN_KEY_CHECKS = 1;

SET FOREIGN_KEY_CHECKS = 0;
Create TABLE if not exists Quote(
  quoteID int, 
  clientNote varchar(30), 
  smithNote varchar(30), 
  times time, 
  price int,
  requestID int,
  PRIMARY KEY (QuoteID),
  Foreign key (requestID) references Request(requestID)
);
SET FOREIGN_KEY_CHECKS = 1;

Create TABLE if not exists Request(
  requestID int,
  clientNote varchar(30),  
  smithNote varchar(30), 
  treeCount int,
  PRIMARY KEY (requestID)
);

Create TABLE if not exists Tree(
  treeID int, 
  requestID int,
  distance double (12,2), 
  width double (12,2),
  height double (12,2), 
  address varchar(30), 
  image1 varchar(30), 
  image2 varchar(30), 
  image3 varchar(30),
  PRIMARY KEY (treeID),
  FOREIGN KEY (requestID) REFERENCES Request(requestID)
);

INSERT INTO User (clientID, phoneNumber, Email, creditCard, firstName, lastName, password)
VALUES 
(001, 1234567890, "johnsmith@gmail.com", 11111111, "John", "Smith", "1234"),
(002, 4353536377, "joerey@gmail.com", 22222222, "Joe", "Rey", "1234"),
(003, 6456478874, "jameswhite@gmail.com", 33333333, "James", "White" , "1234"),
(004, 1124435677, "aaronrodgers@gmail.com", 44444444, "Aaron", "Rodgers" , "1234"),
(005, 9898654463, "johndoe@gmail.com", 55555555, "John", "Doe" , "1234"),
(006, 8478976444, "barbakew@gmail.com", 66666666, "Barb", "Akew" , "1234"),
(007, 4645735282, "oliveyew@gmail.com", 77777777, "Olive", "Yew" , "1234"),
(008, 0902848747, "noahlyles@gmail.com", 88888888, "Noah", "Lyles" , "1234"),
(009, 1235134356, "victorabu@gmail.com", 99999999, "Victor", "Abu", "1234"),
(010, 6546534262, "Lukmanace@gmail.com", 00000000, "Lukman", "Ace", "1234"),
(011, 23452342342, 'davidSmith@gmail.com', 2142552, 'David', 'Smith', 'ds1234'),
(012, 7777888899, 'root', 00000000, 'default', 'default','pass1234');

SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO Bill(billID, clientNote, SmithNote, quoteID)
VALUES 
(0001, "Sold!", "", 2),
(0002, "Sold!", "", 4),
(0003, "Sold!", "",3),
(0004, "Sold!", "",4),
(0005, "Sold!", "",1),
(0006, "Sold!", "",2),
(0007, "Sold!", "",5),
(0008, "Sold!", "",6),
(0009, "Sold!", "",6),
(0010, "Sold!", "",1);
SET FOREIGN_KEY_CHECKS = 1;

SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO Quote(quoteID, clientNote , smithNote, times, price, requestID)
VALUES 
(00001, "Sold!", "", "1:00:00", 4500, 1),
(00002, "Sold!", "", "2:00:00", 5500, 2),
(00003, "Sold!", "", "3:00:00", 6500, 3),
(00004, "Sold!", "", "4:00:00", 7500, 4),
(00005, "Sold!", "", "5:00:00", 8500, 5),
(00006, "Sold!", "", "6:00:00", 9500, 6),
(00007, "Sold!", "", "7:00:00", 10500, 7),
(00008, "Sold!", "", "8:00:00", 11500, 8),
(00009, "Sold!", "", "9:00:00", 12500, 9),
(00010, "Sold!", "", "10:00:00", 13500, 10);
SET FOREIGN_KEY_CHECKS = 1;

INSERT INTO Request(requestID, clientNote, smithNote, treeCount)
VALUES 
(1,"Sold!", "",  4500),
(2, "Sold!", "", 5500),
(3, "Sold!", "", 6500),
(4, "Sold!", "", 7500),
(5, "Sold!", "", 8500),
(6, "Sold!", "", 9500),
(7, "Sold!", "", 10500),
(8, "Sold!", "", 11500),
(9, "Sold!", "", 12500),
(10, "Sold!", "", 13500);

SET FOREIGN_KEY_CHECKS = 0;
INSERT INTO Tree(treeID, distance, width, height, address, image1, image2, image3, requestID)
VALUES 
(111, 5, 123, 123, 'Detroit', 'a', 'b', 'c',1),
(222, 10, 232, 123, 'Detroit', 'a', 'd', 'e',1),
(333, 15, 121, 123, 'Detroit', 'h', 'g', 'f',1),
(444, 20, 180, 123, 'Detroit', 'i', 'j', 'k',2),
(555, 25, 280, 123, 'Detroit', 'n', 'm', 'l',4),
(666, 30, 321, 123, 'Detroit', 'o', 'p', 'q',6),
(777, 35, 213, 123, 'Detroit', 't', 's', 'r',3),
(888, 40, 91, 123, 'Detroit', 'u', 'b', 't',3),
(999, 45, 145, 123, 'Detroit', 'v','"y', 's',3),
(000, 50, 156, 123, 'Detroit', 'w','x', 'z',3);
SET FOREIGN_KEY_CHECKS = 1;


select * from User;
select * from Bill;
select * from Request;
select * from Quote;
select * from Tree;

