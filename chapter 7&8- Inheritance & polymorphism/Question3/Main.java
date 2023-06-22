

public class Main {

    /*
            PROGRAMMING PROBLEM:

     * Create a class called Vehicle that has the manufacturer’s name (type String), 
        number of cylinders in the engine (type int), and owner (type Person given 
        next). Then, create a class called Truck that is derived from Vehicle and has the 
        following additional properties: the load capacity in tons (type double since it may 
        contain a fractional part) and towing capacity in pounds (type int). Be sure your 
        class has a reasonable complement of constructors, accessor and mutator methods, 
        and suitably defined equals and toString methods. Write a program to test all 
        your methods
     */
    public static void main(String[] args) {

        Vehicule vehiculeOne = new Vehicule("honda", 6, new Person("alain"));
        Truck truckOne = new Truck("toyota", 12, new Person("alain"), 1000, 500);

        System.out.println(vehiculeOne.getOwner().equals(truckOne.getOwner())); // works: prints true
        System.out.println(vehiculeOne.equals(truckOne)); //works, prints false


    }
}
