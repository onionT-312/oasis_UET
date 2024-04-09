import java.util.ArrayList;
import java.util.List;

public class Person {
    private String name;
    private String address;
    private List<Vehicle> vehicleList = new ArrayList<Vehicle>();

    /**
     * Person construction.
     *
     * @param name    name
     * @param address address
     */
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    /**
     * add vehicle.
     *
     * @param vehicle vehicle
     */
    public void addVehicle(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    /**
     * remove vehicle.
     *
     * @param registrationNumber registrationNumber
     */
    public void removeVehicle(String registrationNumber) {
        for (Vehicle vehicle : vehicleList) {
            if (vehicle.getRegistrationNumber().equals(registrationNumber)) {
                vehicleList.remove(vehicle);
                break;
            }
        }
    }

    /**
     * getInfo.
     *
     * @return info
     */
    public String getVehiclesInfo() {
        String result = "";

        if (vehicleList.isEmpty()) {
            result = name + " has no vehicle!";
            return result;
        }
        result += name + " has:" + "\n" + "\n";

        for (Vehicle vehicle : vehicleList) {
            result += vehicle.getInfo();
        }
        return result;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
