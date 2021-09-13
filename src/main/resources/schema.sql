

create table meal (
	id long not null,
	name varchar(255) not null,
	price long not null,
	prep_time integer not null,
	picture varchar(255) not null,
	PRIMARY KEY (id)
);

create table service_provider (
	id long not null,
	name varchar(255) not null, 
	email varchar(255) not null, 
	phone varchar(255) not null, 
	city varchar(100) not null, 
	logo varchar(100) not null,
	primary key (id)
);

create table testimony (
	id long not null,
	name varchar(255) not null, 
	message varchar(555) not null,
	primary key (id)
);

create table sp_meal (
	s_id long not null,
	m_id long not null
);

