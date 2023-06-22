public class Truck extends Vehicule {

    private double loadCapacity;
    private int towingCapacity;

    Truck(){}  //empty constructor

    /**
     * constructor that sets both local and inherited instances
     * @param manufacturer
     * @param cylinder
     * @param owner
     * @param load
     * @param towing
     */
    Truck(String manufacturer, int cylinder, Person owner, double load, int towing){
        super(manufacturer,cylinder,owner);
        this.loadCapacity = load;
        this.towingCapacity = towing;
    }

    /**
     * sets parameter to loadCapacity instance
     * @param loadInput
     */
    public void setLoadCapacity(double loadInput){
        this.loadCapacity = loadInput;
    }

    /**
     * @return loadCapacity instance
     */
    public double getLoadCapacity(){
        return this.loadCapacity;
    }

    /**
     * sets towingCapacity instance to parameter of method
     * @param towingInput
     */
    public void setTowingCapacity(int towingInput){
        this.towingCapacity = towingInput;
    }

    /**
     * 
     * @return towingCapacity instance
     */
    public int getTowingCapacity(){
        return this.towingCapacity;
    }

    /**
     * prints all instances both local and inherited 
     * @return String text 
     */
    @Override
    public String toString() {
        return "the manufacturer is: " + super.getManufacturer() +
               "\nthe number of cylinder is: " + super.getCylinder() +
                "\nthe owner is: " + getOwner() + "\nthe load Capacity is: " + getLoadCapacity()
                + "\nthe towing capacity is: " + getTowingCapacity();
    }

    /**
     * checks if 2 objects are similar
     * @return boolean (true if same instances)
     */
    @Override
    public boolean equals(Object obj) {
        Truck object;
        if (obj instanceof Truck){
            object = (Truck) obj;
            return (super.getManufacturer().equalsIgnoreCase(object.getManufacturer()) && super.getCylinder() == object.getCylinder() && super.getOwner().equals(object.getOwner())
            && this.loadCapacity == object.loadCapacity && this.towingCapacity == object.towingCapacity);
        }
        else {
            return false;
        }
    }
}
