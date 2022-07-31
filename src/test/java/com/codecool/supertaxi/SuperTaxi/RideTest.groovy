package com.codecool.supertaxi.SuperTaxi

import spock.lang.Specification

class RideTest extends Specification {

    def "ride should have driver, passenger, pickup point and destination point"(){
        given:
        Driver driver = new Driver()
        Passenger passenger = new Passenger()
        PickUpPoint pickUpPoint = new PickUpPoint()
        DestinationPoint destinationPoint = new DestinationPoint()

        when:
        Ride ride = Ride.of(driver, passenger, pickUpPoint, destinationPoint)

        then:
        ride.getDriver() == driver
        ride.getDriver().getClass() == Driver.class

        ride.getPassenger() == passenger
        ride.getPassenger().getClass() == Passenger.class

        ride.getPickUpPoint() == pickUpPoint
        ride.getPickUpPoint().getClass() == PickUpPoint.class

        ride.getDestinationPoint() == destinationPoint
        ride.getDestinationPoint().getClass() == DestinationPoint.class
    }

    def "ride should have throw exception when no driver"(){
        given:
        Driver driver = null
        Passenger passenger = new Passenger()
        PickUpPoint pickUpPoint = new PickUpPoint()
        DestinationPoint destinationPoint = new DestinationPoint()

        when:
        Ride ride = Ride.of(driver, passenger, pickUpPoint, destinationPoint)

        then:
        IllegalArgumentException ex = thrown()
        ex.message == 'Driver cannot be null'
    }

    def "ride should have throw exception when no passenger"(){
        given:
        Driver driver = new Driver()
        Passenger passenger = null
        PickUpPoint pickUpPoint = new PickUpPoint()
        DestinationPoint destinationPoint = new DestinationPoint()

        when:
        Ride ride = Ride.of(driver, passenger, pickUpPoint, destinationPoint)

        then:
        IllegalArgumentException ex = thrown()
        ex.message == 'Passenger cannot be null'
    }

    def "ride should have throw exception when no pick up point"(){
        given:
        Driver driver = new Driver()
        Passenger passenger = new Passenger()
        PickUpPoint pickUpPoint = null
        DestinationPoint destinationPoint = new DestinationPoint()

        when:
        Ride ride = Ride.of(driver, passenger, pickUpPoint, destinationPoint)

        then:
        IllegalArgumentException ex = thrown()
        ex.message == 'Pick up point cannot be null'
    }

    def "ride should have throw exception when no destination point"(){
        given:
        Driver driver = new Driver()
        Passenger passenger = new Passenger()
        PickUpPoint pickUpPoint = new PickUpPoint()
        DestinationPoint destinationPoint = null

        when:
        Ride ride = Ride.of(driver, passenger, pickUpPoint, destinationPoint)

        then:
        IllegalArgumentException ex = thrown()
        ex.message == 'Destination point cannot be null'
    }

    def "ride should have distance grater than minimum value"() {
        given:

        when:

        then:

        expect:
        1 == 0
    }
}
