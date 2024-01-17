
public class Card {
    private String suit;
    private String name;

    public static  final String[] suitTypes = {"clubs", "diamond", "heart", "spades"};
    public  static final String[] nameType = {"ace", "king", "queen", "jack", "1","2","3","4","5","6","7","8","9","10"};

    Card(){}

    Card(String suit, String name){
        this.suit = suit;
        this.name = name;
    }


    public void setSuit(String suitInput){
        for (int i = 0; i < suitTypes.length; i++){
            if (suitTypes[i].equalsIgnoreCase(suitInput)){
                this.suit = suitInput;
                return;
            }
        }
        System.out.println("the input is invalid");
    }

    public void setName(String nameInput){
        try{
            int val = Integer.parseInt(nameInput);
            if (val > 0 && val <= 10){
                this.name = nameInput;
                return;
            }
        }
        catch (Exception e){
            for (int i = 0; i < nameType.length; i++){
                if (nameType[i].equalsIgnoreCase(nameInput)){
                    this.name = nameInput;
                    return;
                }
                System.out.println("invalid entry");
            }
        }
    }
    
    public String getSuit(){
        return this.suit;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public boolean equals(Object obj) {
        Card object;
        if (obj instanceof Card){
            object = (Card) obj;
            return this.getName().equalsIgnoreCase(object.getName()) && this.getSuit().equalsIgnoreCase(object.getSuit());
        }
        return false;
    }

    @Override
    public String toString() {
        return "the suit is: " + getSuit() + " the name is: " + getName();
    }
}
