set names gbk; #使用中文必须有这句话
create database haha;
use haha;
create table user
(
	Operator_id int primary key,
	Name Varchar(400) not null,
	Password Varchar(400) not null,
	Status int not null default 0
);
insert into user values
(1,'张三','123',1),
(2,'张四','123',0),
(3,'李四光','123',1),
(4,'李四四','123',0);