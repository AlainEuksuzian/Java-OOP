public class City implements Comparable<City> {

    private String cityName;
    private double temperature;

    City(){}

    City(String name, double temp){
        this.cityName = name;
        this.temperature = temp;
    }

    /**
     * sets cityName instance to parameter
     * @param nameInput
     */
    public void setCityName(String nameInput){
        this.cityName = nameInput;
    }

    /**
     * 
     * @return cityName instance
     */
    public String getCity(){
        return this.cityName;
    }

    /**
     * sets temperature instance to parameter
     * @param tempInput
     */
    public void setTemperature(double tempInput){
        this.temperature = tempInput;
    }

    /**
     * 
     * @return temperature instace
     */
    public double getTemperature(){
       return this.temperature;
    }

    /**
     * overrides compareTo method from interface to compare 2 object temperatures
     * returns int
     */
    @Override
    public int compareTo(City obj) {
       return Double.compare(getTemperature(), obj.getTemperature());
    }

    /**
     * prints tostring of city name and its temperature
     */
    @Override
    public String toString() {
        return "the temperature in: " + getCity() + " is: " + getTemperature();
    }
    
}
