Example requests:

* Posting a car:


    POST "http://localhost:8080/vehicle"

    {
    "brand": "Volkswagen",
    "color": "Yellow",
    "condition": "Great",
    "model": "Golf",
    "licensePlate": "07-88-SX",
    "numberOfDoors": 4,
    "bodyStyle": "HATCHBACK",
    "vehicleType": "CAR"
    }


* Posting a watercraft:


    POST "http://localhost:8080/vehicle"
    
    {
    "brand": "Yamaha",
    "color": "Grey",
    "condition": "Great",
    "model": "Dingy",
    "vehicleType": "WATERCRAFT",
    "watercraftType": "SPEED_BOAT",
    "propulsionType": "INBOARD_MOTOR"
    }