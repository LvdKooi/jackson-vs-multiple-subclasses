# jackson-vs-multiple-subclasses

A simple demo application that shows the power of Polymorphic endpoints with Jackson and how Hibernate is able to persist subtypes.

Example request:

    POST "http://localhost:8080/vehicle"

    {
    "brand": "Volkswagen",
    "color": "Yellow",
    "condition": "Great",
    "model": "Golf",
    "licensePlate": "07-88-SX",
    "numberOfDoors": 4,
    "bodyType": "hatchback",
    "vehicleType": "CAR"
    }
