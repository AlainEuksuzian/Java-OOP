package chapterFourClassesMethods.Question6;

/*
 * PROGRAMMING PROBLEM: 
 * 
 * Define a class whose objects are records on animal species. The class should have 
instance variables for the species name, population, and growth rate. The growth 
rate is a percentage that can be positive or negative and can exceed 100%. Include 
a suitable collection of constructors, mutator methods, and accessor methods. 
Include a toString method and an equals method. Include a boolean valued 
method named endangered that returns true when the growth rate is negative 
and returns false otherwise. Write a test program (or programs) that tests each 
method in your class definition.
 */

public class Main {
    public static void main(String[] args) {

        Species speciesOne = new Species("dog", 500, 120);
        Species speciesTwo = new Species("cat", 200 , 100);
        Species speciesThree = new Species("dog", 500, 120);
        Species speciesFour = new Species("rabbit", 1000, -20);

        // create array of type Species to store all object references
        Species[] allSpecies = {speciesOne, speciesTwo, speciesThree, speciesFour};
        
        //print array to see if toString works well
        for (Species x: allSpecies){
            System.out.println(x);
            System.out.println();
        }
        
        System.out.println(speciesOne.equals(speciesThree)); // works, prints true
        System.out.println(speciesThree.equals(speciesFour)); // works, prints false
    }
}
