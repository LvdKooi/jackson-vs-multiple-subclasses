create table vehicle (
       id bigint primary key AUTO_INCREMENT,
      model varchar(255),
      title varchar(255),
      color varchar(255),
      brand varchar(255),
      condition varchar(255)
);

create table motorized_vehicle (
 id bigint,
 license_plate varchar(255),
 horse_power bigint,
   fuel_type varchar(255)
);

create table car (
 id bigint,
   number_of_doors int,
    body_type varchar(255)
);

create table motor_cycle (
 id bigint,
    number_of_wheels int,
    helmet_required bit
);






