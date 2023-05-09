package chapterFourClassesMethods.Question2;


public class Vehicule {
    
    private double tankSize;
    private double efficiency;
    private double fuelInTank = 0;

    Vehicule(){}

    Vehicule(double tankSize, double efficiency, double fuelTank){
        initTankSize(tankSize);
        initEfficiency(efficiency);
        initFuelInTank(fuelTank);
    }

    /*
     * parameter: input to be set as tankSize Instance variable
     * returns: tankSize as the parameter input
     */
    public double initTankSize(double input){
        return this.tankSize = input;
    }

    /*
     * parameter: input to be set as efficiency Instance variable
     * returns: efficiency as the parameter input
     */
    public double initEfficiency(double input){
        return this.efficiency = input;
    }

    /*
     * parameter: input to be set as fuelInTank Instance variable
     * returns: fuelIntank as the parameter input
     */
    public double initFuelInTank(double input){
        return this.fuelInTank = input;
    }

    public double getTankSize(){
        return this.tankSize;
    }
    
    public double getEfficiency(){
        return this.efficiency;
    }

    public double getFuelInTank(){
        return this.fuelInTank;
    }

    /*
     * calculate the difference between tank size and existing fuel
     * returns different of how much fuel can be filled
     */
    public double addPetrol(){
        return (getTankSize() - getFuelInTank());
    }

    /*
     * returns how much the current fuel in car can drive based on efficiency
     */
    public double driveTo(){
        return (this.fuelInTank / this.efficiency);
    }

}

