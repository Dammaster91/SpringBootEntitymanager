drop table if exists student CASCADE 
create table student (
       id integer not null,
        name varchar(255),
        roll_number varchar(255),
        university varchar(255),
        primary key (id)
    )