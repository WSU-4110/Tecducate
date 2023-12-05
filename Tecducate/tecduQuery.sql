drop database if exists webDB;
create database webDB;
use webDB;
CREATE TABLE if not exists User(
	email VARCHAR(50) NOT NULL default 'email', 
	firstName VARCHAR(20) NOT NULL default '', 
	lastName VARCHAR(20) NOT NULL default '', 
	password VARCHAR(20) NOT NULL default '1234', 
<<<<<<< HEAD
    phoneNumber varchar(20) default NULL,
=======
    phoneNumber varchar(20) Default NULL,
>>>>>>> branch 'Develop' of https://github.com/WSU-4110/Tecducate
    prefLesson int not null default 0,
    profLVL int not null default 1,
	userID INT(10) NOT NULL auto_increment,
	PRIMARY KEY (userID)
); 
alter table user auto_increment = 500;
    
insert into User(email, firstName, lastName, password, profLVL, prefLesson)
<<<<<<< HEAD

values ('susie@gmail.com', 'Susie ', 'Guzman', 'susie1234', 1, 100),
		('test', 'test', 'test', 't1234', 2, 101),
=======
values ('susie@gmail.com', 'Susie ', 'Guzman', 'susie1234', 1, 101),
		('test', 'test', 'test', 't1234', 2, 100),
>>>>>>> branch 'Develop' of https://github.com/WSU-4110/Tecducate
		('Donald@gmail.com', 'default', 'default','pass1234', 3, 102);
select * from User;

insert into User(email, profLVL, prefLesson)
values ('Billy@gmail.com', 2, 100),
		('Jonah@gmail.com', 2, 101),
		('Mary@gmail.com', 3, 102),
        ('Paul@gmail.com', 1, 100),
		('Robert@gmail.com', 1, 101),
		('Cassandra@gmail.com', 3, 102);



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

insert into Quiz(lessonID, LVL, question)
values (100, 1, "What is phishing?"),
		(100, 2, "What Should you do to avoid phishing scams?"),
        (100, 3, "Which option is a phishing scam?"),
        (101, 1, "What does account management mean?"),
		(101, 2, "What is a solid account management practice?"),
        (101, 3, "Which option follows appropriate account management?"),
        (102, 1, "What is a virus?"),
		(102, 2, "What is a good way to identify a virus?"),
        (102, 3, "Which option is the virus?");
SET FOREIGN_KEY_CHECKS=1;



create table if not exists Lesson(
    lessonID int not null auto_increment,
    title varchar (100) not null default 'No Info Yet',
    description varchar (1000) not null default 'No Sample Yet',
    topic1 varchar (1000) not null default 'No Info Yet',
    topic2 varchar (1000) not null default 'No Info Yet',
    topic3 varchar (1000) not null default 'No Info Yet',
    detail1 varchar (1000) not null default 'No Info Yet',
    detail2 varchar (1000) not null default 'No Info Yet',
    detail3 varchar (1000) not null default 'No Info Yet',
    detail4 varchar (1000) not null default 'No Info Yet',
    detail5 varchar (1000) not null default 'No Info Yet',
    detail6 varchar (1000) not null default 'No Info Yet',
    detail7 varchar (1000) not null default 'No Info Yet',
    detail8 varchar (1000) not null default 'No Info Yet',
    detail9 varchar (1000) not null default 'No Info Yet',
    primary key(lessonID)
);
alter table lesson auto_increment = 100;

insert into Lesson(title, description, topic1, topic2, topic3, detail1, detail2, detail3, detail4, detail5, detail6, detail7, detail8, detail9)
values ('Phishing Emails', 'The fake invoice scam, Email account upgrade scam, Google Docs scam, PayPal Scam', "Section 1", "Section 2", "Section 3", 
	"Check the Sender: Always check the sender's email address. Legitimate companies will use email addresses that match their official domains. If it looks suspicious or unfamiliar, be cautious.",
    "Look for Mistakes: Always check the sender's email address. Legitimate companies will use email addresses that match their official domains. If it looks suspicious or unfamiliar, be cautious.",
    "Beware of Urgency: Phishing emails often create a sense of urgency, making you feel like you need to act quickly. Take a breath and think before clicking or providing any information.",
    "Use Strong Passwords: Create strong, unique passwords for your online accounts. This makes it harder for attackers to access your personal information.",
    "Update Security Software: Keep your computer's antivirus and anti-malware software up to date. These tools help protect you from various online threats.",
    "Verify Requests: If you receive an unexpected request for personal or financial information, verify it independently. Call the company using a known phone number, not the one provided in the email.",
    "Use Strong Passwords: Create strong, unique passwords for your online accounts. This makes it harder for attackers to access your personal information.",
    "Update Security Software: Keep your computer's antivirus and anti-malware software up to date. These tools help protect you from various online threats.",
    "Verify Requests: If you receive an unexpected request for personal or financial information, verify it independently. Call the company using a known phone number, not the one provided in the email."),
('Account Management', 'Use long password combinations, Combine numbers, lowercase, and uppercase letters', default, default, default, default, default, default, default, default, default, default, default, default),
 ('Virus Detection', 'Loremim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.', default, default, default, default, default, default, default, default, default, default, default, default);

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


SELECT * FROM Quiz WHERE lessonID = 100 and LVL = 2; 

select * from User;  
select * from Quiz;
select * from Result;
select * from Lesson;
