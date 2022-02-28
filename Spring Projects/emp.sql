create database springdb;
use springdb;
create table Emp99(id int auto_increment primary key,name char(40),salary int,designation char(40));
insert into Emp99 values(id,'adi',95000,'Assoc Developer');
insert into Emp99 values(id,'abbci',85000,'Assoc Developer');
insert into Emp99 values(id,'mmmi',70000,'Assoc Developer');
select * from Emp99;
