public class ServiceStation {
    public void check(Car car) {
        if (car != null) {
            internalCheck(car);
            car.checkEngine();
        }

    }

    public void check(Truck truck) {
        if (truck != null) {
            internalCheck(truck);

            truck.checkEngine();
            truck.checkTrailer();

        }
    }


    public void check(Bicycle bicycle) {
        if (bicycle != null) {
            internalCheck(bicycle);

        }

    }

    private void internalCheck(Vehicle vehicle) {
        System.out.println("Обслуживаем " + vehicle.getModelName());
        for (int i = 0; i < vehicle.getWheelsCount(); i++) {
            vehicle.updateTyre();

        }


    }
}