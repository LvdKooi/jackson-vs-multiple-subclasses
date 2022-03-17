create table vehicle (
       id bigint primary key AUTO_INCREMENT,
       vehicle_type varchar(255),
      model varchar(255),
      color varchar(255),
      brand varchar(255),
      condition varchar(255),
      passenger_capacity int
);

create table motorized_vehicle (
 id bigint,
 license_plate varchar(255),
 horse_power int,
   fuel_type varchar(255)
);

create table car (
 id bigint,
   number_of_doors int,
    body_style varchar(255)
);

create table bus (
 id bigint,
    bus_type varchar(255),
    liters_luggage_capacity int
);

create table watercraft (
 id bigint,
    propulsion_type varchar(255),
    watercraft_type varchar(255),
    length_meters int,
    draft_meters int
);




