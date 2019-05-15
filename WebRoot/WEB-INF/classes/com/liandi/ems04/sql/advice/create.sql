create table t_advice(
advice_id int primary key auto_increment,
advice_title varchar(32),
staff_id int references t_staff(staff_id),
advice_content longtext,
advice_time datetime,
reply_content longtext,
admin_id int references t_admin(admin_id),
reply_time datetime
)ENGINE=INNODB,CHARSET=utf8;