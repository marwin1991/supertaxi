package com.codecool.supertaxi.SuperTaxi;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Ride {

    private final Driver driver;
    private final Passenger passenger;
    private final PickUpPoint pickUpPoint;
    private final DestinationPoint destinationPoint;

    public static Ride of(Driver driver, Passenger passenger, PickUpPoint pickUpPoint, DestinationPoint destinationPoint){
        if(driver == null){
            throw new IllegalArgumentException("Driver cannot be null");
        }
        if(passenger == null){
            throw new IllegalArgumentException("Passenger cannot be null");
        }
        if(pickUpPoint == null){
            throw new IllegalArgumentException("Pick up point cannot be null");
        }
        if(destinationPoint == null){
            throw new IllegalArgumentException("Destination point cannot be null");
        }
        return new Ride(driver, passenger, pickUpPoint, destinationPoint);
    }

}
