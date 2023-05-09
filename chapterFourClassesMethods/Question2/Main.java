package chapterFourClassesMethods.Question2;


/*
 * 
/*
 * PROGRAMMING PROBLEM: 
 * 
 *Define a class called Vehicle that will be used to check the amount of fuel left in a 
vehicle after traveling a certain distance. The class should have the instance variable 
tankSize to store the initial size of the tank and efficiency to store initial efficiency 
of the vehicle. Set to zero the variable fuelInTank that is used to store the initial 
amount of fuel in a tank. Include a mutator method that returns iniTankSize, 
initEfficiency and fuelInTank. Include an accessor method addPetrol that 
calculates how much fuel can be filled depending on the fuel existing in the tank 
and the tank’s capacity. Also, include a method driveTo that returns what distance 
can be traveled with the available fuel and provided efficiency. Use your class with 
a test program. You should decide which variables should be public, if any. Also, 
define if any other method(s) are needed.
 */

public class Main {
    public static void main(String[] args) {

        Vehicule carOne = new Vehicule(100, 4, 20);

        System.out.println(carOne.addPetrol()); // works (100-20)
        System.out.println(carOne.driveTo());   // works: tanksize/efficiency
    }
}
