drop database if exists userDatabase;
create database userDatabase;
use userDatabase;
CREATE TABLE if not exists User(
	email VARCHAR(50) NOT NULL, 
	firstName VARCHAR(10) NOT NULL, 
	lastName VARCHAR(10) NOT NULL, 
	password VARCHAR(20) NOT NULL, 
	PRIMARY KEY (email)
); 
    
insert into User(email, firstName, lastName, password)
values ('susie@gmail.com', 'Susie ', 'Guzman', 'susie1234'),
		('davidSmith@gmail.com', 'David', 'Smith', 'ds1234'),
        ('test', 'avx', 'gas', 't1234'),
		('root', 'default', 'default','pass1234');
select * from User;  