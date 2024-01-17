
/*
    PROGRAMMING PROBLEM: 

A savings account typically accrues savings using compound interest. If you deposit 
$1,000 with a 10% interest rate per year, then after one year you have a total of 
$1,100. If you leave this money in the account for another year at 10% interest, 
then after two years the total will be $1,210. After three years, you would have 
$1,331, and so on.
Write a program that inputs the amount of money to deposit, an interest rate per 
year, and the number of years the money will accrue compound interest. Write a 
recursive function that calculates the amount of money that will be in the savings 
account using the input information.
To verify your function, the amount should be equal to P(1 + i)n, where P is the 
amount initially saved, i is the interest rate per year, and n is the number of years */

public class QuestionOne{
    public static void main(String[] args) {

        System.out.println(interestCalculator(1000, 0.1, 3));
        
    }

    public static double interestCalculator(double principal, double interest, int year){
        
        if (year == 0){
            return principal;
        }
        else {
            principal += principal * interest;
            return interestCalculator(principal, interest, year - 1);
        }
    }
}