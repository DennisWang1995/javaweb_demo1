set names gbk; #ʹ�����ı�������仰
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
(1,'����','123',1),
(2,'����','123',0),
(3,'���Ĺ�','123',1),
(4,'������','123',0);