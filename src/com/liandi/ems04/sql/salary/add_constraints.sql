alter table t_salaryLevel add unique(salarylevel);
alter table t_salary add constraint fk_column_id foreign key(salarylevel) references t_salarylevel (salarylevel);
alter table t_salary add constraint fk_column_id foreign key(present_date) references t_attendance (present_date);
alter table t_salary add constraint fk_column_id foreign key(sid) references t_staff (sid);