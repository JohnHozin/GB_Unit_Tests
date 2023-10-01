package hw2;

import lesson2.hw2.Car;
import lesson2.hw2.Motorcycle;
import lesson2.hw2.Vehicle;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

public class VehicleTest {
    @Test
    public void testCarInstanceofVehicle() {
        Car car = new Car("Ford", "Mustang", 2023);
        assertThat(car).isInstanceOf(Vehicle.class);
    }

    @Test
    public void testCarCreateWithFourWheels() {
        Car car = new Car("Ford", "Mustang", 2023);
        assertThat(car.getNumWheels()).isEqualTo(4);
    }

    @Test
    public void testMotorcycleCreateWithTwoWheels() {
        Motorcycle motorcycle = new Motorcycle("Yamaha","RT-06", 2022);
        assertThat(motorcycle.getNumWheels()).isEqualTo(2);
    }

    @Test
    public void testCarDriveSpeed() {
        Car car = new Car("Ford", "Mustang", 2023);
        car.testDrive();
        assertThat(car.getSpeed()).isEqualTo(60);
    }

    @Test
    public void testMotorcycleDriveSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha","RT-06", 2022);
        motorcycle.testDrive();
        assertThat(motorcycle.getSpeed()).isEqualTo(75);
    }

    @Test
    public void testCarParkingSpeed() {
        Car car = new Car("Ford", "Mustang", 2023);
        car.testDrive();
        car.park();
        assertThat(car.getSpeed()).isEqualTo(0);
    }

    @Test
    public void testMotorcycleParkingSpeed() {
        Motorcycle motorcycle = new Motorcycle("Yamaha","RT-06", 2022);
        motorcycle.testDrive();
        motorcycle.park();
        assertThat(motorcycle.getSpeed()).isEqualTo(0);
    }
}
