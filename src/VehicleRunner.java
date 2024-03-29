public class VehicleRunner {
    public static void main(String[] args) {
        // testing all available methods on a Vehicle object
        Vehicle myVehicle = new Vehicle("Generic Vehicle", 6);
        System.out.println(myVehicle.getName());
        System.out.println(myVehicle.getWheels());
        myVehicle.move(10);
        myVehicle.turn();
        myVehicle.brake();

        // testing all available methods on a Car object
        Car myCar = new Car("Honda Civic", 4, "leather");
        System.out.println(myCar.getName()); // inherited method
        System.out.println(myCar.getWheels()); // inherited method
        System.out.println(myCar.getFabric()); // method ONLY available on Car objects
        myCar.move(30); // inherited method
        myCar.turn(); // inherited method
        myCar.brake(); // inherited method
        myCar.honk(); // method ONLY available on Car objects
        myCar.lockDoors(); // method ONLY available on Car objects

        // ---- WRITE YOUR BICYCLE TEST CODE BELOW ----
        Bicycle myBike = new Bicycle("Jeffry", 2, 15);
        System.out.println(myBike.getName());
        System.out.println(myBike.getWheels());
        System.out.println(myBike.getGearCount());
        myBike.turn();
        myBike.brake();
        myBike.ringBells();

        Boat myBoat = new Boat("Geffry", 0, 35, 15);
        System.out.println(myBoat.getName());
        System.out.println(myBoat.getWheels());
        System.out.println(myBoat.getHullLength());
        System.out.println(myBoat.getPropellerSpeed());
        myBoat.turn();
        myBoat.move(30);
        myBoat.brake();
        myBoat.honkBoatHorn();
    }
}