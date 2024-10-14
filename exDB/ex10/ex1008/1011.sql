SELECT country_id FROM countries
WHERE AREA > 5000000;

SELECT NAME, AREA FROM countries
WHERE country_id IN (12,15,31,38,42,182,224)
ORDER BY AREA, NAME;

SELECT NAME, AREA FROM countries
WHERE country_id IN (
	SELECT country_id FROM countries
	WHERE AREA >5000000
	)
ORDER BY AREA, NAME;

SELECT MAX(AREA) FROM countries;

SELECT * FROM countries
WHERE AREA = (
	SELECT MAX(AREA)
	FROM countries
);

SELECT AVG(population), AVG(gdp)
FROM country_stats
WHERE YEAR=2018;

SELECT NAME FROM country_stats
INNER JOIN countries USING (country_id)
WHERE YEAR =2018 AND
	(population,gdp) > (
		SELECT AVG(population), AVG(gdp)
		FROM country_stats
		WHERE YEAR =2018)
ORDER BY NAME;

SELECT AVG(region_area)
FROM (
	SELECT SUM(AREA) region_area
	FROM countries
	GROUP BY region_id
)t;

SELECT vip_id id, NAME,'vip' AS TYPE
FROM vips
UNION
SELECT guest_id, NAME, 'guest' FROM guests;

SELECT NAME FROM guests
UNION
SELECT NAME FROM vips
ORDER BY NAME;

SELECT NAME FROM guests
UNION DISTINCT
SELECT NAME FROM vips
ORDER BY NAME;

SELECT NAME FROM guests
UNION ALL
SELECT NAME FROM vips
ORDER BY NAME;

create table contacts(
    id int auto_increment,
    first_name varchar(50) not null,
    last_name varchar(50) not null,
    full_name varchar(101) 
        as (concat(first_name, ' ', last_name)) virtual,
    phone varchar(100),
    contact_group varchar(50) default 'General',
    primary key(id)
);

insert into contacts(first_name, last_name, phone)
values('John','Doe','(408)-934-2443');

select * from contacts;

insert into contacts(first_name, last_name, phone, contact_group)
values('Jane','Doe','(408)-456-8934','Leads');

select last_insert_id();

select * from contacts;

insert into contacts
set first_name = 'Jonathan',
    last_name = 'Van';	
    
select * from contacts;

insert into contacts(first_name, last_name, phone, contact_group)
values
    ('James','Smith','(408)-232-2352','Customers'),
    ('Michael','Smith','(408)-232-6343','Customers'),
    ('Maria','Garcia','(408)-232-3434','Customers');

insert into contacts(first_name, last_name, phone, contact_group)
values
    ('James','Johnson','(408)-232-4523','Customers'),
    ('Mary','Rodriguez','(408)-232-4532','Customers');
    
select * from contacts;

update contacts
set last_name = 'Smith'
where id = 1;

select * from contacts
where id = 1;

update 
    contacts
set 
    phone = replace(phone,'(408)','(510)')
where 
    contact_group = 'Customers';
    
select * from contacts
where contact_group = 'Customers';

delete from contacts
where id = 1;

select * from contacts
where id = 1;

delete from contacts
where last_name = 'Smith';

select * from contacts
where last_name = 'Smith';

DROP TABLE contacts;

create table if not exists products(
    product_code varchar(18) primary key,
    product_name varchar(50) not null
);

insert into products(product_code, product_name)
values('xg-2019','xgadget of 2019');

show indexes from products;

create table categories(
    category_id int auto_increment,
    name varchar(50) not null,
    primary key(category_id)
);

insert into 
    categories(name)
values
    ('Gadgets'),
    ('Accessories');
    
select * from categories;

create table product_categories(
   product_code varchar(18),
   category_id int,
   primary key(product_code,category_id)
);

create table gadget_types(
    type_id int auto_increment,
    name varchar(100) not null,
    primary key(type_id)
);

insert into gadget_types(name)
values
    ('Entertainment'),
    ('Computing'),
    ('Communication'),
    ('Lifestyle'),
    ('Cameras');
    
create table gadgets(
    gadget_id int auto_increment,
    gadget_name varchar(100) not null,
    type_id int,
    primary key(gadget_id),
    constraint fk_type
    foreign key(type_id) 
        references gadget_types(type_id)
);

insert into 
    gadgets(gadget_name,type_id)
values
    ('Amazon Kindle',1),
    ('Apple iPod',1),
    ('Audio Highway Listen Up',1),
    ('Apple iPad',2),
    ('MicroSD',2),
    ('Apple iPhone',3),
    ('BlackBerry 6210',3),
    ('Pager',3),
    ('Air Taser Model 34000',4),
    ('Credit Card',4),
    ('Zippo',4),
    ('Casio G-Shock DW-5000C',4),
    ('Nikon F',5),
    ('Canon EOS 5D Mark II',5);



delete from gadget_types 
where type_id = 1;

alter table gadgets
drop constraint fk_type;

alter table gadgets 
add constraint fk_type 
foreign key(type_id) 
    references gadget_types(type_id)
    on delete set null
    on update set null;
    
delete from gadget_types 
where type_id = 1;

SELECT * FROM gadgets;

update gadget_types
set type_id = 20
where type_id = 2;

SELECT * FROM gadgets;

delete from gadgets
where type_id is NULL;

alter table gadgets
drop constraint fk_type;

alter table gadgets 
add constraint fk_type 
foreign key(type_id) 
    references gadget_types(type_id)
    on delete cascade
    on update cascade;

delete from gadget_types
where type_id = 3;

select * from gadgets;

update gadget_types
set type_id = 40
where type_id = 4;

select * from gadgets;
