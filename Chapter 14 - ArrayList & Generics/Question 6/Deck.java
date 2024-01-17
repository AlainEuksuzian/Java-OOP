import java.util.ArrayList;
import java.util.Random;


public class Deck {
    private ArrayList<Card> cardsList = new ArrayList<>(52);
    private Random myrand = new Random();
 
        
        Deck(){
           for (int i = 0; i < 52; i++){
            int randOne = myrand.nextInt(Card.suitTypes.length - 1);
            int randTwo = myrand.nextInt(Card.nameType.length-1);
            Card obj = new Card(Card.suitTypes[randOne], Card.nameType[randTwo]);
            cardsList.add(obj);
           }
        }


        public  void displayItems(){
            int size = 0;
            for (Card e: cardsList){
                System.out.println(e);
                size++;
            }
        }

        public void shuffleCard(){
            for (int i = 0 ; i < cardsList.size(); i++){
                int randVal = myrand.nextInt(cardsList.size()- i) + i;
                Card temp = cardsList.get(i);
                cardsList.set(i, cardsList.get(randVal));
                cardsList.set(randVal, temp);
            }
        }

        public void addCard(String suit, String name ){
            for (int i = 0; i < Card.nameType.length; i++ ){
                if (Card.nameType[i].equalsIgnoreCase(name) && Card.suitTypes[i].equalsIgnoreCase(suit)){
                    Card toAdd = new Card(suit, name);
                    cardsList.add(toAdd);
                }
            }
        }

        public void removeCard(){
            cardsList.remove(0);
        }

        public void sortByName(){
           for (int i = 0; i < cardsList.size(); i++){
            for (int j = i + 1 ; j < cardsList.size(); j++){
                if (cardsList.get(i).getName().compareTo(cardsList.get(j).getName()) > 0){
                    Card temp = cardsList.get(j);
                    cardsList.set(j, cardsList.get(i));
                    cardsList.set(i, temp);
                }
            }
           }
        }

    }

