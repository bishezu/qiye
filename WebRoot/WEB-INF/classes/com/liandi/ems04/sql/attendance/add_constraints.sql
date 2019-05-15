alter table t_attendance add constraint fk_attendance_sid foreign key(sid) references t_staff(sid);
alter table t_attendance alter column sid int not null;
alter table t_attendance alter column name varchar(32) not null;
alter table t_attendance alter column present_date date not null;