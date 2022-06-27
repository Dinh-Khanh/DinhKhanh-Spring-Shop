create DATABASE khanhshop;
create table  role(
	id bigint not null primary key auto_increment,
    name varchar(255) not null,
    code varchar(255) not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);
create table  user(
	id bigint not null primary key auto_increment,
    username varchar(255) not null,
    password varchar(255) not null,
    fullname varchar(255) null,
    status int not null,
    roleid bigint not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);
alter table user add constraint fk_user_role foreign key (roleid) references role(id);
create table product(
	id bigint not null primary key auto_increment,
    name varchar(255) not null,
	description varchar(255) not null,
	price varchar(255) not null,
    categoryid bigint not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);
create table category(
	id bigint not null primary key auto_increment,
    name varchar(255) not null,
	code varchar(255) not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);
alter table product add constraint fk_product_category foreign key (categoryid) references category(id);
create table comment(
	id bigint not null primary key auto_increment,
    content text null,
	userid bigint not null,
    productid bigint not null,
    createddate timestamp null,
    modifieddate timestamp null,
    createdby varchar(255) null,
    modifiedby varchar(255) null
);
alter table comment add constraint fk_comment_user foreign key (userid) references user(id);
alter table comment add constraint fk_comment_product foreign key (productid) references product(id);