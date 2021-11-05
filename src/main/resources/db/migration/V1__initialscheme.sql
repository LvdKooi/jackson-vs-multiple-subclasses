create table car (
   number_of_doors int,
    body_type varchar(255)
);

create table motor_cycle (
    number_of_wheels int,
    helmet_required bit
);

create table motorized_vehicle (
 license_plate varchar(255),
 horse_power varchar(255),
   fuel_type varchar(255)
);

create table vehicle (
       id int primary key AUTO_INCREMENT,
      model varchar(255),
      title varchar(255),
      color varchar(255),
      brand varchar(255),
      condition varchar(255),
);


