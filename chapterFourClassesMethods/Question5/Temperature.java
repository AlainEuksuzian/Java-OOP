package chapterFourClassesMethods.Question5;

public class Temperature {
    
    private double temperature;
    private char tempScale;

    Temperature(double temp){
        this.temperature = temp;
    }

    Temperature(char scale){
        this.tempScale = scale;
    }

    Temperature(){}

    Temperature(double temp, char scale){
        this.temperature = temp;
        this.tempScale = scale;
    }

 
    /**
     * calculates temperature to celcius
     * @return temp celcius
     */

    public double getCelsius()
    {
        // DegreesC = 5(degreesF - 32)/9
        if (tempScale == 'C')
            return temperature;

        return 5 * (temperature - 32) / 9;
    }


    /**
     * calculates temperature to Farenheit
     * @return temp farenheit
     */

    public double getFahrenheit()
    {
        // DegreesF = (9(degreesC)/5) + 32;
        if (tempScale == 'F')
            return temperature;

        return (9*(temperature)/5) + 32;
    }


    /**
     * sets parameter to temperature instance
     * @param tempInput
     */

    public void setTempValue(double tempInput){
        this.temperature = tempInput;
    }


    /**
     * sets scale Input to tempScale instane variable only if input == c/C or f/F
     * @param input
     */

    public void setTempScale(char scaleInput){

        if (scaleInput == 'c' || scaleInput == 'C' || scaleInput == 'F' || scaleInput == 'f'){
            this.tempScale = scaleInput;
        }
        else {
            System.out.println("temp scale can either be C for celcius or F for farenheit");
        }
    }


    /**
     * sets parameter tempInput and valueInput to both instance variables only if condition (correct unit of measurement) is met
     * @param tempInput
     * @param valueInput
     */

    public void setFullTemp(double tempInput, char valueInput){

        if (valueInput != 'c' || valueInput != 'C' || valueInput != 'F' || valueInput != 'f'){
            System.out.println("unit of measurement can either be C/c for celcius or f/F for farenheit");
            System.exit(0);
        }
        this.temperature = tempInput;
        this.tempScale = valueInput;
    }


    /**
     * checks if 2 object temp are equal
     * @param Object type obj
     * @return boolean if two object temp are the same
     */

    @Override
    public boolean equals(Object obj) {
        Temperature objConvert;
        if (obj instanceof Temperature){
            objConvert = (Temperature) obj;
            return Math.abs(getCelsius()  - (objConvert.getCelsius())) < 0.00001;
        }
        return false;
    }


    /**
     * checks if one temp object is less than another object temp
     * @param obj
     * @return boolean 
     */

    public boolean lessThan(Temperature obj){
        return this.getCelsius() < obj.getCelsius();
    }



    /**
     * checks if one temp object is greater than another object temp
     * @param obj
     * @return boolean 
     */
    public boolean greaterThan(Temperature obj){
        return this.getCelsius() > obj.getCelsius();
    }



    /**
     * toString method to allow objects being printed directly
     * @return returns temp and scale 
     */
    @Override
    public String toString() {
        return this.temperature + " " + this.tempScale;
    }

    
}
