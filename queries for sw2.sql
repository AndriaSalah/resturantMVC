create table person(
	userID int primary key,
	userName varchar(20) not null,
	userPass varchar(12) not null,
	userType varchar(5) default 'user' constraint userType_chk check((userType = 'user')or(userType = 'admin'))
);

create table reservation(
	reservationID int primary key,
	tableNumber int not null,
	reservationDate date,
	userID int
);

create table orders(
	orderID int primary key,
	reservationID int,
	orederTotalPrice int
);

create table products(
	productID int primary key,
	productName varchar(20) not null,
	productPrice int not null,
	productType varchar(20) constraint productType_chk check((productType = 'main')or(productType = 'appetizer')or(productType = 'drinks')or(productType = 'dessert'))
);

create table prodcuts_orders(
	orderID int,
	productID int
);



alter table reservation add constraint user_reservation_fk foreign key (userID) references person(userID)
alter table orders add constraint reservation_orders_fk foreign key (reservationID) references reservation(reservationID)
alter table prodcuts_orders add constraint prodcuts_orders_orders_fk foreign key (orderID) references orders(orderID)
alter table prodcuts_orders add constraint prodcuts_orders_products_fk foreign key (productID) references products(productID)


insert into person values(112,'andria','12as34df','user')

INSERT INTO person (userID, userName,userPass,userType)
VALUES(1, 'hima','123','admin');
INSERT INTO person (userID, userName,userPass,userType)
VALUES(2, 'andar','123','admin');
INSERT INTO person (userID, userName,userPass,userType)
VALUES(3, 'user','123','user');
INSERT INTO person (userID, userName,userPass,userType)
VALUES(4, 'user2','123','user');


select max(userID) from person 