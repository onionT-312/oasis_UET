public class Car extends Vehicle {
    private int numberOfDoors;

    /**
     * Car construction.
     *
     * @param brand              vehicle brand
     * @param model              vehicle model
     * @param registrationNumber vehicle registrationNumber
     * @param owner              vehicle owner
     * @param numberOfDoors      numberOfDoors
     */
    public Car(String brand, String model, String registrationNumber,
               Person owner, int numberOfDoors) {
        super(brand, model, registrationNumber, owner);
        this.numberOfDoors = numberOfDoors;
    }

    /**
     * getInfo.
     *
     * @return info
     */
    @Override
    public String getInfo() {
        String car = "Car:\n\tBrand: " + brand + "\n\tModel: " + model
                + "\n\tRegistration Number: " + registrationNumber
                + "\n\tNumber of Doors: " + numberOfDoors + "\n\tBelongs to "
                + owner.getName() + " - " + owner.getAddress() + "\n";
        return car;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }
}