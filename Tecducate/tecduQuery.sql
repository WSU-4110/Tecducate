drop database if exists webDB;
create database webDB;
use webDB;
CREATE TABLE if not exists User(
	email VARCHAR(50) NOT NULL, 
	firstName VARCHAR(10) NOT NULL, 
	lastName VARCHAR(10) NOT NULL, 
	password VARCHAR(20) NOT NULL, 
    phoneNumber varchar(20) NOT NULL Default '0',
    prefLesson int not null default 0,
    profLVL int not null default 1,
	userID INT(10) NOT NULL auto_increment,
	PRIMARY KEY (userID)
); 
alter table user auto_increment = 500;
    
insert into User(email, firstName, lastName, password, profLVL, prefLesson)
values ('susie@gmail.com', 'Susie ', 'Guzman', 'susie1234', 1, 100),
		('test', 'test', 'test', 't1234', 2, 101),
		('root', 'default', 'default','pass1234', 3, 102);
select * from User;  


SET FOREIGN_KEY_CHECKS=0;
create table if not exists Quiz(
	quizID int not null auto_increment,
    lessonID int not null default 0,
    LVL int not null,
    directions varchar (150) not null default 'Click The Correct Answer',
    question varchar (150) not null default 'Question Not Loaded',
    ansr1 varchar (50) not null default 'A',
    ansr2 varchar (50) not null default 'B',
    ansr3 varchar (50) not null default 'C',
    ansr4 varchar (50) not null default 'D',
    correctAnsr varchar(50) not null default 'A',
    primary key(quizID),
    foreign key(lessonID) references Lesson(lessonID)
);
alter table quiz auto_increment = 10;

insert into Quiz(question, lessonID, LVL)
values ('Beginner Question',100, 1),
		('Advanced Question',100, 2),
        ('Expert Question',100, 3),
        ('Beginner Question',101, 1),
		('Advanced Question',101, 2),
        ('Expert Question',101, 3),
        ('Beginner Question',102, 1),
		('Advanced Question',102, 2),
        ('Expert Question',102, 3);
SET FOREIGN_KEY_CHECKS=1;
select * from Quiz;


create table if not exists Lesson(
    lessonID int not null auto_increment,
    details varchar (150) not null default 'No Info Yet',
    sample varchar (100) not null default 'No Sample Yet',
    primary key(lessonID)
);
alter table lesson auto_increment = 100;

insert into Lesson()
values (),
		(),
        ();
select * from Lesson;


SET FOREIGN_KEY_CHECKS=0;
create table Result(
	resultID int not null auto_increment,
    quizID int not null default 0,
    score int not null default 0,
    primary key(resultID),
    foreign key(quizID) references Quiz(quizID)
);
alter table Result auto_increment = 500;

insert into Result(quizID)
values (10),
		(14),
        (17);
SET FOREIGN_KEY_CHECKS=1;
select * from Result;

SELECT * FROM Quiz WHERE lessonID = 100 and LVL = 2; 