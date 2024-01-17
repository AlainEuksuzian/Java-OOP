

/*  PROGRAMMING PROBLEM: 
 The Sieve of Erastothenes is an ancient algorithm that generates prime numbers. 
Consider the list of numbers from 2 to 10 as follows:
 2 3 4 5 6 7 8 9 10
 The algorithm starts with the first prime number in the list, which is 2, and then 
iterates through the remainder of the list, removing any number that is a multiple 
of 2 (in this case, 4, 6, 8, and 10), leaving
 2 3 5 7 9
 We then repeat the process with the second prime number in the list, which is 3, 
and then iterate through the remainder of the list, removing any number that is a 
multiple of 3 (in this case 9), leaving
 2 3 5 7
 We then repeat starting with each successive prime number, but no elements are 
removed because there are no multiples of 5 or 7 (a more efficient implementation 
of the algorithm would stop without examining 5 or 7). The numbers that remain 
in the list are all prime numbers.
 Implement this algorithm using an ArrayList of integers that is initialized to the 
values from 2 to 100. Your program can iterate numerically through the ArrayList
from index 0 to index size()-1 to get the current prime number, but should use 
an Iterator to scan through the remainder of the list to eliminate the multiples. 
You can use the listIterator method to retrieve the iterator starting at a specified 
index into the ArrayList. Output all remaining prime numbers to the console. */

import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    private static ArrayList<Integer> myNumbers = new ArrayList<>(10);
    public static void main(String[] args) {
        
        for (int add = 2; add <=100; add++){
            myNumbers.add(add);
        }

        for (int i = 0; i < myNumbers.size(); i++){
            int prime = myNumbers.get(i);
            Iterator<Integer> counter = myNumbers.iterator();
            while(counter.hasNext()){
                int number = counter.next();
                if (prime != number && number % prime == 0){
                    counter.remove();
                }
            }
        }

        for (Integer e: myNumbers){
            System.out.println(e);
        }
    }
}