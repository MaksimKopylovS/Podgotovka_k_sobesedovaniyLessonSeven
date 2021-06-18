create table student
(
  id        bigserial primary key,
  name      varchar(255),
  age       int
);

insert into student (name, age)
values ( 'Student1', 1 ),
       ( 'Student2', 2 ),
       ( 'Student3', 3 ),
       ( 'Student4', 4 ),
       ( 'Student5', 5 ),
       ( 'Student6', 6 );
