package chapterFourClassesMethods.Question3;



/*
 * PROGRAMMING PROBLEM:
 * 
 * Define a class called WordCount whose objects count the number of words in a 
sentence. An object of this class maintains a variable count that is a nonnegative 
integer. Include methods to set the counter to 0, to increase the count by 1, and to 
decrease the count by 1 if any word encountered starts with ‘A’ or ‘a’. Be sure that 
no method allows the value of the counter to become negative. Include an accessor 
method that returns the current count value and a method that outputs the count 
to the screen. There should be no input method or other mutator methods. The 
only method that can set the counter is the one that sets it to 0. Write a program 
(or programs) to test all the methods in your class definition.
 */

public class Main {

    public static void main(String[] args) {
        
        WordCount count = new WordCount();

        int sentenceCounter = count.wordCounter("hello how are you");
        int sentenceCounterTwo = count.wordCounter("hello my name is alain what is yours?");
        int allAs = count.wordCounter("alain are alain alain");

        System.out.println(sentenceCounter); // works, outputs 3

        System.out.println(sentenceCounterTwo); // works, outputs 7 

        System.out.println(allAs); // works, outputs 0
    }
    
}
