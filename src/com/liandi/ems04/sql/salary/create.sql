create table t_salary(
salary_id  int primary key auto_increment,
sid int,
salarylevel int,
present_date  date,
absence_days double,
absence_fine double,
attend_awards double,
salary_gross double,
insurnce double,
salary_tax double,
salary_final double,
salary_status boolean
)ENGINE=INNODB,CHARSET=utf8;


create table t_salarylevel(
salarylevel_id  int primary key auto_increment,
salarylevel int,
salary_base double
)ENGINE=INNODB,CHARSET=utf8;