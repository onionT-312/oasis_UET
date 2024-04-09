public class MotorBike extends Vehicle {
    private boolean hasSidecar;

    /**
     * MotorBike construction.
     *
     * @param brand              vehicle brand
     * @param model              vehicle model
     * @param registrationNumber vehicle registrationNumber
     * @param owner              vehicle owner
     * @param hasSideCar         hasSidecar
     */
    public MotorBike(String brand, String model, String registrationNumber,
                     Person owner, boolean hasSideCar) {
        super(brand, model, registrationNumber, owner);
        this.hasSidecar = hasSideCar;
    }

    /**
     * getInfo.
     *
     * @return info
     */
    @Override
    public String getInfo() {
        String motorbike = "Motor Bike:\n\tBrand: " + brand + "\n\tModel: "
                + model + "\n\tRegistration Number: " + registrationNumber
                + "\n\tHas Side Car: " + hasSidecar + "\n\tBelongs to "
                + owner.getName() + " - " + owner.getAddress() + "\n";
        return motorbike;
    }


    public boolean isHasSidecar() {
        return hasSidecar;
    }

    public void setHasSidecar(boolean hasSidecar) {
        this.hasSidecar = hasSidecar;
    }
}
