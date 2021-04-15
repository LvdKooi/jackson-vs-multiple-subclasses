create table spel (
  id int primary key AUTO_INCREMENT,
  startmoment DATETIME not null
);

create table speler (
  id int primary key AUTO_INCREMENT,
  naam varchar(55) not null
);

create table score (
  id int primary key AUTO_INCREMENT,
  score int not null,
  speler_id int,
  ronde_id int
);

create table ronde (
  id int primary key AUTO_INCREMENT,
  rondenummer int,
  spel_id int
);

create table spel_speler (
  spel_id int,
  speler_id int
);
