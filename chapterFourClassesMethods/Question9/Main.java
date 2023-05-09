package chapterFourClassesMethods.Question9;

public class Main {

    public static void main(String[] args) {
        
        Money accountOne = new Money(50, 30);
        Money accountTwo = new Money(50, 20);

        Money accountThree = Money.add(accountOne, accountTwo);

        System.out.println(accountOne.add(accountTwo)); //works
        System.out.println(accountThree); //works, prints toString 
    }
    
}
