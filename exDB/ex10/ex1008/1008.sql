SHOW DATABASES;
USE nation;
SHOW TABLES;

CREATE DATABASE if not EXISTS crm;

DROP DATABASE if EXISTS crm;
CREATE DATABASE crm;
SHOW DATABASES;

SHOW CREATE DATABASE crm;

SHOW CHARACTER SET;

ALTER DATABASE crm
CHARACTER SET = 'latin1'
COLLATE = 'latin1_swedish_ci';

SHOW CREATE DATABASE crm;

DROP DATABASE crm;

SHOW DATABASES;

CREATE DATABASE testdb;

SHOW DATABASES;

SHOW DATABASES
LIKE 'nation';

SHOW DATABASES
LIKE '%schema';

show databases 
where `database` not in 
('information_schema',
'mysql',
'performance_schema');

create table projects(
    project_id int auto_increment,
    project_name varchar(255) not null,
    begin_date date,
    end_date date,
    cost decimal(15,2) not null,
    created_at timestamp default current_timestamp,
    primary key(project_id)
);

create table milestones(
    milestone_id int auto_increment,
    project_id int,
    milestone varchar(255) not null,
    start_date date not null,
    end_date date not null,
    completed bool default false,
    primary key(milestone_id, project_id),
    foreign key(project_id)
        references projects(project_id)
);

create table customers(
    id int auto_increment,
    name varchar(255) not null,
    created_at timestamp default current_timestamp,
    is_active bool not null default false,
    primary key(id)
);

alter table customers
add email varchar(255) not NULL;

alter table customers
add phone varchar(15),
add address varchar(255);

describe customers;

alter table customers 
modify phone varchar(20) not NULL;

describe customers;

alter table customers 
modify email varchar(255),
modify address varchar(255) after NAME;

describe customers;

alter table customers
change column address office_address varchar(255) not NULL;

describe customers;

alter table customers
drop column office_address;

alter table customers 
rename to clients; 

DESCRIBE clients;

create table cities(
    id int primary key,
    city_name varchar(100) not null,
    area decimal(15,2)
);

DESCRIBE cities;

DROP TABLE cities;

create table mountains(
    id int primary key,
    mountain_name varchar(100) not null,
    height decimal(15,2)
);

create table oceans(
    id int primary key,
    ocean_name varchar(100) not null,
    square decimal(15,2)
);

DESCRIBE mountains;

DESCRIBE oceans;

DROP TABLE mountains, oceans;

select 
    name, 
    area
from 
    countries
order by NAME;

select 
    name, 
    area
from 
    countries
order by 
    name desc;
    
select 
    name, 
    region_id
from 
    countries
order by 
    region_id, 
    name;
    
select 
    name, 
    national_day
from 
    countries
order by 
    national_day;

select 
    name, 
    national_day
from 
    countries
order by 
    national_day desc;
    
SELECT 
    name, 
    area, 
    region_id
FROM 
    countries
WHERE 
    region_id = 2
order BY
    NAME;

SELECT 
    name, 
    area
FROM 
    countries
WHERE 
    AREA > 2000000
order BY 
    AREA;
    
select 
    name, 
    area, 
    region_id
from 
    countries
where 
    region_id = 2 and 
    area > 2000000
order by 
    name;
    
select 
    name, 
    area, 
    region_id
from 
    countries
where 
    region_id = 2 or 
    area > 2000000
order by 
    name;
    
select 
    name, 
    area
from 
    countries
where 
    area between 1001449 
        and 1566500
order by 
    area;
    
    
select 
    year
from 
    country_stats
order by 
    year;
    
select 
    distinct year 
from 
    country_stats
order by   
    year desc;
    
select 
    distinct national_day
from 
    countries;