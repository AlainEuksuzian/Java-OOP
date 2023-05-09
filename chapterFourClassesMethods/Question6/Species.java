package chapterFourClassesMethods.Question6;

/*Define a class whose objects are records on animal species. The class should have 
instance variables for the species name, population, and growth rate. The growth 
rate is a percentage that can be positive or negative and can exceed 100%. Include 
a suitable collection of constructors, mutator methods, and accessor methods. 
Include a toString method and an equals method. Include a boolean valued 
method named endangered that returns true when the growth rate is negative 
and returns false otherwise. Write a test program (or programs) that tests each 
method in your class definition. */

public class Species {
    
    private String name;
    private int population;
    private double growthRate;

    Species(){}

    Species(String name, int pop, double growth){
        setName(name);
        setPopulation(pop);
        setGrowthRate(growth);
    }

    /**
     * sets parameter to name instance
     * @param nameInput
     */
    public void setName(String nameInput){
        this.name = nameInput;
    }


    /**
     * set parameter to population instance
     * @param populationInput
     */
    public void setPopulation(int populationInput){
        this.population = populationInput;
    }

    /**
     * sets parameter to growthRate instance
     * @param growthInput
     */
    public void setGrowthRate(double growthInput){
        this.growthRate = growthInput;
    }

    /**
     * returns name (String)
     * @return name
     */
    public String getName(){
        return this.name;
    }

    /**
     * returns population size (int)
     * @return population
     */
    public int getPopulation(){
        return this.population;
    }


    /**
     * returns growthRate instance (double)
     * @return growthRate
     */
    public double getGrowthRate(){
        return this.growthRate;
    }

    /**
     * outputs the entire object as a string
     * @return String of explanation of each instance and its output
     */
    @Override
    public String toString() {
        return "the species name is: " + getName() + "\nthe population size is: " + getPopulation() + "\nthe growth rate is " + getGrowthRate() + " %";
    }

    /**
     * converts parameter from Object to Species and checks if all 3 insatance variables are the same 
     * @param Object obj
     * @return boolean
     */
    @Override
    public boolean equals(Object obj) {
        Species object;

        if (obj instanceof Species){
            object = (Species) obj;
            return (this.getName().equalsIgnoreCase(object.getName()) && (this.getPopulation() == object.getPopulation()) && this.getGrowthRate() == object.getGrowthRate());
        }
        return false;
    }
}
