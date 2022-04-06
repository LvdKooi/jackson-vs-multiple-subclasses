When running locally, API-documentation is available at: http://localhost:8080/swagger-ui/index.html

Example requests:

* Posting a car:


    POST "http://localhost:8080/vehicles"

    {
    "brand": "Volkswagen",
    "model": "Golf",
    "licensePlate": "07-88-SX",
    "numberOfDoors": 4,
    "bodyStyle": "HATCHBACK",
    "vehicleType": "CAR"
    }


* Posting a watercraft:


    POST "http://localhost:8080/vehicles"
    
    {
    "brand": "Yamaha",
    "model": "Dingy",
    "vehicleType": "WATERCRAFT",
    "watercraftType": "SPEED_BOAT",
    "propulsionType": "INBOARD_MOTOR"
    }