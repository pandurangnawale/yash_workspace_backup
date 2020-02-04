create sequence hibernate_sequence start with 1 increment by 1
create table todo (id bigint not null, description varchar(255), is_done boolean not null, target_date varchar(255), username varchar(255), primary key (id))
create sequence hibernate_sequence start with 1 increment by 1
create table todo (id bigint not null, description varchar(255), is_done boolean not null, target_date varchar(255), username varchar(255), primary key (id))
