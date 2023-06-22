
public class Vehicule {
    private String manufacturer;
    private int cylinders;
    private Person owner;

    Vehicule(){} // empty constructor

    /**
     * sets parameters to instances & catches error from setCylinder() method
     * @param manufacturer
     * @param cylinder
     * @param owner
     */
    Vehicule(String manufacturer, int cylinder, Person owner){
        this.manufacturer = manufacturer;

       try {
        setCylinder(cylinder);
       }
       catch (Exception e){
        System.out.println(e.getMessage());
       }

        this.owner = owner;
    }


    /**
     * sets parameter to manufacturer instance
     * @param manufacturerInput
     */
    public void setManufacturer(String manufacturerInput){
        this.manufacturer = manufacturerInput;
    }

    /**
     * @return manufacturer 
     */
    public String getManufacturer(){
        return this.manufacturer;
    }

    /**
     * 
     * @param cylinderInput
     * @throws Exception thrown if cylinder odd number and over 12 (assums cylinders are 2-6-8-10-12 cylinders *i dont understand cars* )
     */
    public void setCylinder(int cylinderInput) throws Exception{
        
        if (cylinderInput % 2 == 1 || cylinderInput > 12  || cylinderInput == 0){
            throw new Exception("cylinder cannot exceed 12 and can only be multiples of 2 and over 0");
        }
        else {
            this.cylinders = cylinderInput;
        }
    }

    /**
     * @return cylinder instance
     */
    public int getCylinder(){
        return this.cylinders;
    }

    /**
     * sets parameter to owner instance
     * @param nameInput of type Person
     */
    public void setOwner(Person nameInput){
        this.owner = nameInput;
    }

    /**
     * @return owner instance
     */
    public Person getOwner(){
        return this.owner;
    }

    /**
     *prints all instances as a String output
     */
    @Override
    public String toString() {
        return "the car manufacturer is: " + getManufacturer() + "\nthe number of cylinder is:" +
                getCylinder() + "\nthe owners name is: " + getOwner();
    }


    /**
     * compares if 2 objects are the same
     * @param Object
     * @return boolean (true if all instances of object1 are equal to object2)
     */
    @Override
    public boolean equals(Object obj) {
        Vehicule object;

        if (obj instanceof Person){
            object = (Vehicule) obj;
            return (this.owner.equals(object.owner) && this.manufacturer.equals(object.manufacturer)
             && this.cylinders == object.cylinders);
        }
        return false;
    }
}
