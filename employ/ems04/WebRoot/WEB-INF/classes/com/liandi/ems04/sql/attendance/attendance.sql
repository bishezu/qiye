drop table if exists t_attendance; 

create table t_attendance(
attendance_id int primary key auto_increment,
sid int,
name varchar(32),
present_date date,
check_in  time,
check_out time,
arrive_late boolean,
leave_early boolean,
half_absenteeism boolean,
absenteeism boolean
)ENGINE=INNODB,CHARSET=UTF8;

 
