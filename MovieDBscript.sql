
drop table Showing;
drop table Movie;
drop table Theater;
drop table CreditCard;


create table Theater(
	name varchar(50),
	location varchar(25),
	address varchar(50),
	zipcode int,
	primary key (name)
);

create table Movie(
	title varchar(25),
	description varchar(100),
	rating varchar(10),
	length varchar(25),
	primary key (title)
); 

create table Showing(
        id int,
	name varchar(50),
	title varchar(25),
	listtimes varchar(100),
        primary key (id)
);

create table CreditCard(
	number varchar(16),
	securitycode varchar(3),
	expdate varchar(5),
	primary key (number)
);

insert into Theater(name, location, address, zipcode)
	values('Cinemark Central Plano', 'West Park Village', '1818 Coit Rd, Plano, TX', 75075);
insert into Theater(name, location, address, zipcode)
	values('K9 Cinemas', 'Pitman Corners', '1301 Custer Rd Suite #810, Plano, TX', 75075);
insert into Theater(name, location, address, zipcode)
	values('Cinemark West Plano and XD','Windhaven', '3800 Dallas Pkwy, Plano, TX',75093);
insert into Theater(name, location, address, zipcode)
	values('Studio Movie Grill','Berkeley Square', '4721 W Park Blvd, Plano, TX',75093);
insert into Theater(name, location, address, zipcode)
	values('Cinemark Vista Ridge Mall and XD','Music City Mall', '2401 S Stemmons Fwy #4, Lewisville, TX',75067);
insert into Theater(name, location, address, zipcode)
	values('Cinemark Movies 8', 'Vista Ridge', '420 Oakbend Dr, Lewisville, TX',75067);
insert into Theater(name, location, address, zipcode)
	values('AMC NorthPark 15', 'NorthPark Center', '8687 N Central Expy #3000, Dallas, TX', 75225);
insert into Theater(name, location, address, zipcode)
	values('Texas Theatre', 'Oak Cliff', '231 W Jefferson Blvd, Dallas, TX', 75208);
insert into Theater(name, location, address, zipcode)
	values('LOOK Cinemas', 'Prestonwood','5409 Belt Line Rd, Dallas, TX', 75254);
insert into Theater(name, location, address, zipcode)
	values('Village On The Parkway 9', 'Village on the Parkway', '5100 Belt Line Rd Suite 220, Dallas, TX', 75254);


insert into Movie(title, description, rating, length)
	values('Back to the Future 1', 'Marty McFly goes back in time to prevent a time paradox that destroys the universe', 'PG', '1h 56m');
insert into Movie(title, description, rating, length)
	values('Indiana Jones 1','Indiana is sent to find the Ark of the Covenant before the Nazis obtain its power', 'PG', '1h 56m');
insert into Movie(title, description, rating, length)
	values('Star Wars VII','Rey travels across the Star Wars universe in search of Luke Skywalker', 'PG-13', '2h 15m');
insert into Movie(title, description, rating, length)
	values('Star Wars IX','Rey and the Resistance must defeat Palpatine and save the Galaxy', 'PG-13', '2h 22m');
insert into Movie(title, description, rating, length)
	values('Deadpool','Deadpool must kill a lot of people and save the world', 'R', '1h 49m');
insert into Movie(title, description, rating, length)
	values('Ghost Busters','The Ghost Busters save the world', 'PG-13', '2h 14m');
insert into Movie(title, description, rating, length)
	values('Spider-Man 2','Spider-Man saves New York from Doctor Octopus', 'PG-13', '2h 15m');
insert into Movie(title, description, rating, length)
	values('The Avengers','Hulk, Ironman, Iron Man, and Captain America join forces to save New York from Loki', 'PG-13', '2h 24m');
insert into Movie(title, description, rating, length)
	values('Captain America','Captain America becomes a super soldier to defeat the Nazis', 'PG-13', '2h 4m');
insert into Movie(title, description, rating, length)
	values('Braveheart','Mel Gibson must save the world', 'R', '3h 2m');
insert into Movie(title, description, rating, length)
	values('The Dark Knight', 'Batman takes on the Joker in Gotham City', 'PG-13', '2h 32m');
insert into Movie(title, description, rating, length)
	values('Batman Begins','Batman saves Gotham City from complete destruction', 'PG-13', '2h 20m');
insert into Movie(title, description, rating, length)
	values('The Karate Kid','A young boy learns many lessons from a karate master', 'PG', '2h 7m');
insert into Movie(title, description, rating, length)
	values('Spider-Man','Peter Parker saves New York from the Green Goblin', 'PG-13', '2h 1m');
insert into Movie(title, description, rating, length)
	values('Spider-Man 3','Peter Parker saves New York from Venom and Sandman', 'PG-13', '2h 36m');

insert into Showing(id, name, title, listtimes)
        values(1, 'Cinemark Central Plano','Back to the Future 1','12:30pm!3:00pm!6:00pm');
insert into Showing(id, name, title, listtimes)
        values(2, 'Cinemark Central Plano','Indiana Jones 1','1:30pm!4:00pm!7:00pm');
insert into Showing(id, name, title, listtimes)
        values(3, 'Cinemark Central Plano','Star Wars VII','2:30pm!5:00pm!8:00pm');
insert into Showing(id, name, title, listtimes)
        values(4, 'Cinemark Central Plano','Star Wars IX','3:30pm!6:00pm!9:00pm');
insert into Showing(id, name, title, listtimes)
	values(5, 'Cinemark Central Plano','Batman Begins','4:00pm!6:00pm!9:00pm');

insert into Showing(id, name, title, listtimes)
        values(6, 'K9 Cinemas','Indiana Jones 1','11:00am!1:00pm!4:00pm');
insert into Showing(id, name, title, listtimes)
        values(7, 'K9 Cinemas','Star Wars VII','12:00pm!2:00pm!5:00pm');
insert into Showing(id, name, title, listtimes)
        values(8, 'K9 Cinemas','Star Wars IX','1:00pm!3:00pm!6:00pm');
insert into Showing(id, name, title, listtimes)
        values(9, 'K9 Cinemas','Deadpool','2:00pm!4:00pm!7:00pm');
insert into Showing(id, name, title, listtimes)
        values(10, 'K9 Cinemas','The Dark Knight','4:00pm!6:00pm!10:00pm');

insert into Showing(id, name, title, listtimes)
        values(11, 'Cinemark West Plano and XD','Star Wars VII','9:00am!4:00pm!7:00pm');
insert into Showing(id, name, title, listtimes)
        values(12, 'Cinemark West Plano and XD','Star Wars IX','10:00am!5:00pm!8:00pm');
insert into Showing(id, name, title, listtimes)
        values(13, 'Cinemark West Plano and XD','Deadpool','11:00am!6:00pm!9:00pm');
insert into Showing(id, name, title, listtimes)
        values(14, 'Cinemark West Plano and XD','Ghost Busters','12:00pm!7:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
        values(15, 'Cinemark West Plano and XD','The Karate Kid','2:00pm!5:00pm!11:00pm');

insert into Showing(id, name, title, listtimes)
        values(16, 'Studio Movie Grill','Star Wars IX','8:00am!11:00am!2:00pm');
insert into Showing(id, name, title, listtimes)
        values(17, 'Studio Movie Grill','Deadpool','9:00am!12:00pm!3:00pm');
insert into Showing(id, name, title, listtimes)
        values(18, 'Studio Movie Grill','Ghost Busters','10:00am!1:00pm!4:00pm');
insert into Showing(id, name, title, listtimes)
        values(19, 'Studio Movie Grill','Spider-Man 2','11:00am!2:00pm!5:00pm');
insert into Showing(id, name, title, listtimes)
        values(20, 'Studio Movie Grill','Spider-Man 3','1:00pm!5:00pm!11:00pm');

insert into Showing(id, name, title, listtimes)
        values(21, 'Cinemark Vista Ridge Mall and XD','Deadpool','3:00pm!6:00pm!9:00pm');
insert into Showing(id, name, title, listtimes)
        values(22, 'Cinemark Vista Ridge Mall and XD','Ghost Busters','4:00pm!7:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
        values(23, 'Cinemark Vista Ridge Mall and XD','Spider-Man 2','5:00pm!8:00pm!11:00pm');
insert into Showing(id, name, title, listtimes)
        values(24, 'Cinemark Vista Ridge Mall and XD','The Avengers','6:00pm!9:00pm!12:00am');
insert into Showing(id, name, title, listtimes)
        values(25, 'Cinemark Vista Ridge Mall and XD','Spider-Man','11:00am!1:00pm!12:00am');

insert into Showing(id, name, title, listtimes)
        values(26, 'Cinemark Movies 8','Spider-Man 2','1:00pm!5:00pm!8:00pm');
insert into Showing(id, name, title, listtimes)
        values(27, 'Cinemark Movies 8','The Avengers','2:00pm!6:00pm!9:00pm');
insert into Showing(id, name, title, listtimes)
        values(28, 'Cinemark Movies 8','Captain America','3:00pm!7:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
        values(29, 'Cinemark Movies 8','Braveheart','4:00pm!8:00pm!11:00pm');
insert into Showing(id, name, title, listtimes)
        values(30, 'Cinemark Movies 8','The Dark Knight','5:00pm!8:00pm!11:00pm');

insert into Showing(id, name, title, listtimes)
	values(31,'AMC NorthPark 15','Back to the Future 1','10:00am!1:00pm!4:00pm');
insert into Showing(id, name, title, listtimes)
	values(32,'AMC NorthPark 15','Indiana Jones 1','11:00am!2:00pm!5:00pm');
insert into Showing(id, name, title, listtimes)
	values(33,'AMC NorthPark 15','Star Wars VII','5:00pm!8:00pm!11:00pm');
insert into Showing(id, name, title, listtimes)
	values(34,'AMC NorthPark 15','Star Wars IX','4:00pm!7:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
	values(35,'AMC NorthPark 15','Deadpool','6:00pm!9:00pm!12:00am');

insert into Showing(id, name, title, listtimes)
	values(36,'Texas Theatre','Spider-Man','8:00am!11:00am!2:00pm');
insert into Showing(id, name, title, listtimes)
	values(37,'Texas Theatre','Spider-Man 2','4:00pm!7:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
	values(38,'Texas Theatre','Spider-Man 3','6:00pm!9:00pm!12:00am');
insert into Showing(id, name, title, listtimes)
	values(39,'Texas Theatre','Indiana Jones 1','12:00pm!3:00pm!6:00pm');
insert into Showing(id, name, title, listtimes)
	values(40,'Texas Theatre','Back To The Future 1','1:00pm!4:00pm!7:00pm');

insert into Showing(id, name, title, listtimes)
	values(41,'LOOK Cinemas','Star Wars VII','5:00pm!8:00pm!11:00pm');
insert into Showing(id, name, title, listtimes)
	values(42,'LOOK Cinemas','Star Wars IX','6:00pm!9:00pm!12:00am');
insert into Showing(id, name, title, listtimes)
	values(43,'LOOK Cinemas','Deadpool','4:00pm!7:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
	values(44,'LOOK Cinemas','Braveheart','2:00pm!6:00pm!10:00pm');
insert into Showing(id, name, title, listtimes)
	values(45,'LOOK Cinemas','Ghost Busters','8:00am!1:00pm!5:00pm');

insert into Showing(id, name, title, listtimes)
	values(46,'Village On The Parkway 9','Batman Begins','5:00pm!8:00pm!11:00pm');
insert into Showing(id, name, title, listtimes)
	values(47,'Village On The Parkway 9','The Dark Knight','6:00pm!9:00pm!12:00am');
insert into Showing(id, name, title, listtimes)
	values(48,'Village On The Parkway 9','The Avengers','10:00am!1:00pm!4:00pm');
insert into Showing(id, name, title, listtimes)
	values(49,'Village On The Parkway 9','Captain America','2:00pm!5:00pm!8:00pm');
insert into Showing(id, name, title, listtimes)
	values(50,'Village On The Parkway 9','The Karate Kid','12:00pm!3:00pm!6:00pm');


insert into CreditCard(number, securitycode, expdate)
        values('1111111111111111','111','01/25');
insert into CreditCard(number, securitycode, expdate)
        values('2222222222222222','222','02/25');
insert into CreditCard(number, securitycode, expdate)
        values('3333333333333333','333','03/25');
insert into CreditCard(number, securitycode, expdate)
        values('4444444444444444','444','04/25');
insert into CreditCard(number, securitycode, expdate)
        values('5555555555555555','555','05/25');
insert into CreditCard(number, securitycode, expdate)
        values('6666666666666666','666','06/25');
insert into CreditCard(number, securitycode, expdate)
        values('7777777777777777','777','07/25');
insert into CreditCard(number, securitycode, expdate)
        values('8888888888888888','888','08/25');












