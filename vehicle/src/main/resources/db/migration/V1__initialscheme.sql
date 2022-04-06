CREATE TABLE vehicle
  (
     id           BIGINT PRIMARY KEY auto_increment,
     vehicle_type VARCHAR(255) NOT NULL,
     model        VARCHAR(255),
     brand        VARCHAR(255)
  );

CREATE TABLE motorized_vehicle
  (
     id            BIGINT NOT NULL,
     license_plate VARCHAR(255),
     horse_power   INT,
     fuel_type     VARCHAR(255)
  );

CREATE TABLE car
  (
     id              BIGINT NOT NULL,
     number_of_doors INT,
     body_style      VARCHAR(255)
  );

CREATE TABLE bus
  (
     id                      BIGINT NOT NULL,
     bus_type                VARCHAR(255),
     liters_luggage_capacity INT
  );

CREATE TABLE watercraft
  (
     id              BIGINT NOT NULL,
     propulsion_type VARCHAR(255),
     watercraft_type VARCHAR(255),
     length_meters   INT,
     draft_meters    INT
  );

ALTER TABLE motorized_vehicle
  ADD CONSTRAINT motorized_vehicle_vehicle_id_fk FOREIGN KEY (id) REFERENCES
  vehicle(id);

ALTER TABLE car
  ADD CONSTRAINT car_vehicle_id_fk FOREIGN KEY (id) REFERENCES vehicle(id);

ALTER TABLE bus
  ADD CONSTRAINT bus_vehicle_id_fk FOREIGN KEY (id) REFERENCES vehicle(id);

ALTER TABLE watercraft
  ADD CONSTRAINT watercraft_vehicle_id_fk FOREIGN KEY (id) REFERENCES vehicle(id);