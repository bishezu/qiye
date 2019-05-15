alter table t_staff add constraint t_staff_dept_id foreign key(dept_id) references t_dept(id);
alter table t_staff add constraint t_staff_title_id foreign key(title_id) references t_title(id);
alter table t_staff add constraint t_staff_admintype_id foreign key(admintype_id) references t_admintype(admintype_id);
