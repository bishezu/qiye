/* t_admintype是管理员类型表*/
create table t_admintype(
admintype_id int primary key auto_increment,
admin_type varchar(16),
create_time date,
add_dept boolean,
findstaff_bydeptid boolean,
deletedept_byid boolean,
modifydept_bystaffid boolean,
add_title boolean,
findstaff_bytitleid boolean,
deletetitle_byid boolean,
modifytitle_bystaffid boolean,
findadvice_byadviceid boolean,
deleteadvice_byid boolean,
modifyreplay_byadviceid boolean,
modifysalary_bysalarylevelid boolean,
add_staff boolean,
modifystaff_bystaffid boolean,
deletestaff_bystaffid boolean,
add_admintype boolean,
modify_admin boolean,
delete_admintype boolean,
modify_admintype boolean
)ENGINE=INNODB,CHARSET=utf8;

/* t_staffadmin是管理员类型表和员工表中间关系表
create table t_staffadmin(
staffadmin_id int primary key auto_increment,
staff_id int constraint fk_staff_id foreign key  reference to t_staff(staff_id),
admintype_id int constraint fk_admintype_id foreign key  reference to t_admintype(t_admintype)
)ENGINE=INNODB,CHARSET=utf8;*/