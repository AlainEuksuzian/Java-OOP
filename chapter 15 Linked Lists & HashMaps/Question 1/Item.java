public class Item{
    private String name;
    private int age;

    Item(String name, int age){
        this.name = name;
        this.age = age;
    }

    Item(){}
    /**
     * sets parameter to name instance
     * @param inName
     */
    public void setName(String inName){
        this.name = inName;
    }

    /**
     * @return name instance
     */
    public String getName(){
        return this.name;
    }

        /**
     * sets parameter to age instance
     * @param inName
     */
    public void setAge(int inAge){
        this.age = inAge;
    }

    /**
     * @return age instance
     */
    public int getAge(){
        return this.age;
    }

    /**
     * late binding for the tostring method to output a sentence with instances
     */
    @Override
    public String toString() {
        return "the name is: " + getName() + " the age is: " + getAge();
    }

    /**
     * compares if 2 objects have the same values *to be used in conjunction with the linkedList equals object*
     */
    @Override
    public boolean equals(Object obj) {
        Item object = (Item) obj;

        if (obj instanceof Item){
            return this.getName().equalsIgnoreCase(object.getName()) && this.getAge() == object.getAge();
        }
        return false;  
    }
}