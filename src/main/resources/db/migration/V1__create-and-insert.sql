
create table IF NOT EXISTS parent
(
    id   bigint primary key auto_increment,
    name varchar(100) not null
);

create table if not exists father
(
    id bigint primary key references parent (id)

);
create table if not exists mother
(
    id bigint primary key references parent (id)

);

create table IF NOT EXISTS child
(
    id        bigint primary key auto_increment,
    name varchar(100) not null,
    mother_id bigint,
    father_id bigint,

    constraint FK_father foreign key (father_id) references father (id),
    constraint FK_mother foreign key (mother_id) references mother (id)

);



insert into parent( name)
values ('John');
insert into parent (name)
values ('Paul');
insert into parent(name)
values ('Mary');
insert into parent(name)
values ('Lucy');
insert into parent (name)
values ('Mark');


insert into father (id)
values (1);
insert into father (id)
values (2);
insert into mother (id)
values (3);
insert into mother (id)
values (4);
insert into father (id)
values (5);


INSERT INTO child (name, mother_id, father_id)
VALUES('John', 3,1 );
INSERT INTO child (name, mother_id, father_id)
values ('Paul', 3, 1);
INSERT INTO child (name, mother_id, father_id)
values ( 'Lucy', 4, 2);
INSERT INTO child (name, mother_id, father_id)
values ('Claire', 4, 1);
INSERT INTO child (name, mother_id)
values ('Simon',4);