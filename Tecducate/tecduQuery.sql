drop database if exists webDB;
create database webDB;
use webDB;
CREATE TABLE if not exists User(
	email VARCHAR(50) NOT NULL default 'email', 
	firstName VARCHAR(20) NOT NULL default '', 
	lastName VARCHAR(20) NOT NULL default '', 
	password VARCHAR(20) NOT NULL default '1234', 
    phoneNumber varchar(20) Default NULL,
    prefLesson int not null default 0,
    profLVL int not null default 1,
	userID INT(10) NOT NULL auto_increment,
	PRIMARY KEY (userID)
); 
alter table user auto_increment = 500;
    
insert into User(email, firstName, lastName, password, profLVL, prefLesson, phoneNumber)
values ('susie@gmail.com', 'Susie ', 'Guzman', 'susie1234', 1, 101, '313-000-0000'),
		('test', 'test', 'test', 't1234', 2, 100, '346-784-0223'),
		('Donald@gmail.com', 'default', 'default','pass1234', 3, 102, '901-354-6577');

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
        (102, 1, "What does account management mean?"),
		(102, 2, "What is a solid account management practice?"),
        (102, 3, "Which option follows appropriate account management?"),
        (101, 1, "What is a email?"),
		(101, 2, "What is a good way to identify a phishing email?"),
        (101, 3, "Which option is the phishing email?");
SET FOREIGN_KEY_CHECKS=1;



create table if not exists Lesson(
    lessonID int not null auto_increment,
    title varchar (100) not null default 'No Info Yet',
    description varchar (2000) not null default 'No Sample Yet',
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
values ('Phishing Emails',
	"Welcome to our guide on understanding and safeguarding against a common online threat - Phishing Emails. In today's interconnected world, it's crucial to recognize and protect ourselves from deceptive practices that could compromise our sensitive information. Let's explore what phishing emails are and equip ourselves with the knowledge to identify and avoid falling victim to these cyber traps. At its core, a phishing email is a deceptive attempt by cybercriminals to trick individuals into divulging personal and confidential information. These emails often masquerade as legitimate communications from trusted sources, such as banks, government agencies, or reputable companies. The ultimate goal is to lure recipients into clicking on malicious links, downloading harmful attachments, or providing sensitive data like usernames and passwords. Phishing emails exploit social engineering techniques, playing on our trust and emotions to create a sense of urgency or importance. Understanding the characteristics of these deceptive messages is the first line of defense against potential threats.", 
	"How Do You Identify a Phishing Email?", 
    "How to Protect Yourself from a Phishing Attempt?", 
    "What to Do if You Suspect a Phishing Attempt?", 
	"Check the Sender: Always check the sender's email address. Legitimate companies will use email addresses that match their official domains. If it looks suspicious or unfamiliar, be cautious.",
    "Look for Mistakes: Always check the sender's email address. Legitimate companies will use email addresses that match their official domains. If it looks suspicious or unfamiliar, be cautious.",
    "Beware of Urgency: Phishing emails often create a sense of urgency, making you feel like you need to act quickly. Take a breath and think before clicking or providing any information.",
    "Use Strong Passwords: Create strong, unique passwords for your online accounts. This makes it harder for attackers to access your personal information.",
    "Update Security Software: Keep your computer's antivirus and anti-malware software up to date. These tools help protect you from various online threats.",
    "Verify Requests: If you receive an unexpected request for personal or financial information, verify it independently. Call the company using a known phone number, not the one provided in the email.",
    "Do not click on any links or download attachments.",
    "Contact the company or person directly using a phone number you know is real, not the one provided in the email.",
    "Report the phishing attempt to your email provider."),
('Phishing Links',
	"Welcome on a journey to fortify your online defenses against a prevalent cyber threat - Phishing Links. In the vast landscape of the internet, understanding the intricacies of web addresses is crucial to discern genuine links from deceptive ones. Join us as we demystify the world of phishing links, empowering you to navigate the digital realm with confidence and caution. Phishing links are cunningly crafted web addresses designed to deceive individuals into visiting fraudulent websites. These deceptive links often mimic legitimate URLs to create a false sense of trust. Once clicked, they lead unsuspecting users to malicious sites aiming to harvest sensitive information, such as login credentials, financial details, or personal data. Unraveling the anatomy of a link is key to deciphering potential threats. From the protocol and domain name to subdomains, paths, and parameters, each component plays a role in determining the legitimacy of a link. By gaining insights into these elements, you'll be better equipped to discern authentic URLs from their deceitful counterparts. Welcome on this journey with us to explore the nuances of phishing links, understand the telltale signs of deception, and adopt practical strategies to shield yourself from falling victim to these digital traps. Let's delve into the details and fortify your defenses against phishing links in the ever-evolving digital landscape. Let's begin!",
	"How to Recognize Phishing Links?",
    "How to Protect Yourself from a Phishing Email?",
	"What to Do If You Encounter a Phishing Link?", 
    "Protocol (HTTP/HTTPS): The protocol is the 'http://' or 'https://' at the beginning of a link. 'https://' is secure, while 'http://' is less secure. Look for 'https' when dealing with sensitive information.",
    "Domain Name: The domain name is the website's address. For example, in 'www.example.com,' 'example.com' is the domain. Check for familiar and correctly spelled domain names.",
    "Subdomains: Subdomains are additional parts before the main domain, like 'blog.example.com.' Ensure subdomains make sense and are related to the main domain.",
    "Use Security Software: Having updated antivirus and anti-malware software adds an extra layer of protection, helping to block access to phishing websites.",
    "Verify Links Independently: If you receive a link unexpectedly, verify it independently. Visit the website directly by typing the official address into your browser or using a trusted search engine.",
    "Add spam filters to your email: This will insure that suspected emails will go directly to your spam folder decreasing the risk of the user getting scammed.",
    "Do not click on the link.",
    "Report the phishing attempt to your email provider.",
    "Inform the legitimate company if the link claims to be from them"),
 ('Account Management',
	"Greetings! Today, we're embarking on a digital adventure centered around 'Account Management'– a key aspect of ensuring your online experiences is secure and stress-free. Just like organizing your real-world belongings, managing your digital keys (usernames and passwords) is vital. Join us as we delve into the essentials of account management and discover the importance of creating strong passwords for a secure online journey.  Account management is like being the guardian of your digital keys – your usernames and passwords. These keys unlock the doors to your online world, allowing you access to various services like email, banking, or social media. The goal is to keep these keys secure, ensuring that only you hold the power to open these digital doors. Now, let's introduce another essential aspect: 'Strong Passwords.' Think of strong passwords as fortified locks that add an extra layer of security to your digital keys. Creating robust passwords is a crucial part of effective account management, and we'll guide you through the process. Join us on this journey to understand the essentials of account management, learn the art of crafting strong passwords, and ensure your online experience is not only protected but also enjoyable. Ready to dive into the world of account management and strong passwords? Let's keep going!",
	"How to Manage Your Account?",
    "Why is Account Management Important?",
	"What Will Happen If We Don't Manage Our Account Properly?", 
    "Create Strong Passwords: Aim for a combination of uppercase and lowercase letters, numbers, and special characters. Avoid easily guessable information, such as names, birthdays, or common words. Use a passphrase or a combination of unrelated words for added security.",
    "Use Different Passwords: Each online account should have a unique password. If one account is compromised, having distinct passwords prevents unauthorized access to your other accounts.",
    "Enable Two-Factor Authentication (2FA): Activate 2FA wherever available. This adds an extra layer of security by requiring a code sent to your phone or another device for account access.",
    "Security: Protects your accounts from unauthorized access and potential hacking attempts. Reduces the risk of falling victim to phishing scams or fraudulent activities.",
    "Privacy: Maintains the confidentiality of your personal communications and sensitive information. Safeguards your online presence from unwanted intrusion. ",
    "Preventing Unauthorized Access: Establishes barriers against hackers and unauthorized individuals. Ensures that only you, with the proper credentials, can access and control your accounts.",
    "Security Breaches: Without strong passwords and regular updates, accounts become vulnerable to hacking. Personal information, including emails and contacts, may be exposed.",
    "Identity Theft: Lack of proper account management increases the risk of identity theft. Impersonation can lead to unauthorized access to sensitive personal information.",
    "Financial Loss: Unauthorized access to financial accounts can result in fraudulent transactions and financial loss. Hackers may exploit vulnerabilities to gain control of your financial assets."); 

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
