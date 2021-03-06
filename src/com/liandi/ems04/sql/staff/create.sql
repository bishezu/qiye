create table t_staff(
id int primary key auto_increment,
sid int unique,
name varchar(32) not null,
gender boolean,
hiredate date,
seniority int,
account varchar(32) unique,
password varchar(32) not null,
dept_id int,
title_id int,
admintype_id int,
nation varchar(32),
birthday date,
phone varchar(16) unique,
email varchar(64) unique,
homeaddress varchar(64) not null,
edubackground varchar(32),
school varchar(32),
profession varchar(16),
salarylevel int,
numbera int,
numberb int,
numberc int
)ENGINE=INNODB,CHARSET=utf8;
