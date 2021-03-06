package model.controllers;

import data.tools.DatabaseManager;
import entities.Car;
import entities.User;

import java.util.Objects;

public class CarFrameController {
    private Car car;
    private User user;

    public CarFrameController(Car car, User user) {
        this.car = car;
        this.user = user;
    }

    public Car getCar() {
        return this.car;
    }

    public User getUser() {
        return this.user;
    }

    /**
     * Update the controller car in the database.
     */
    public void updateCar() {
        DatabaseManager.updateCar(this.car);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CarFrameController that = (CarFrameController) o;
        return Objects.equals(car, that.car) &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(car, user);
    }

    @Override
    public String toString() {
        return "CarFrameController{" +
                "car=" + car +
                ", user=" + user +
                '}';
    }
}
