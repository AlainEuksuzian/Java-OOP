package chapterFourClassesMethods.Question7;


public class Pizza {

    private String size;
    private int cheeseToppings;
    private int pepperoniToppings;
    private int hamTopping;

    Pizza(){}

    Pizza(String size, int cheeseTops, int PeppTops, int hamTopps){

        try {
            setSize(size);
            setCheeseToppings(cheeseTops);
            setPepperoniTopping(PeppTops);
            setHamTopping(hamTopps);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }   
    }

    /**
     * sets parameter to size instance only if correct size input
     * @param sizeInput  for the size of the pizza
     * @throws Exception if parameter is not small, medium or large
     */
    public void setSize(String sizeInput) throws Exception{
        if (sizeInput.equalsIgnoreCase("small") || sizeInput.equalsIgnoreCase("medium") || sizeInput.equalsIgnoreCase("large")){
            this.size = sizeInput;
        }
        else {
           throw new Exception("size can either be small, medium or large");
        }
    }

    /**
     * sets parameter to cheeseInput instance if >= 0
     * @param cheeseInput
     * @throws Exception for negative int input
     */
    public void setCheeseToppings(int cheeseInput) throws Exception{
        if (cheeseInput < 0){
            throw new Exception("cheese topping cannot be negative");
        }
        else {
            this.cheeseToppings = cheeseInput;
        }
    }

    /**
     * sets parameter to pepperoniInput instance if >= 0
     * @param pepperoniInput
     * @throws Exception for negative int input
     */
    public void setPepperoniTopping(int pepperoniInput) throws Exception{
        if (pepperoniInput < 0){
            throw new Exception("pepperoni topping cannot be negative");
        }
        else {
            this.pepperoniToppings = pepperoniInput;
        }
    }

    /**
     * sets parameter to hamInput instance if >= 0
     * @param pepperoniInput
     * @throws Exception for negative int input
     */
    public void setHamTopping(int hamInput) throws Exception{

        if (hamInput < 0){
            throw new Exception("ham topping cannot be negative");
        }
        else {
            this.hamTopping = hamInput;
        }
    }

    /**
     * @return size instance varialbe for an order object
     */
    public String getPizzaSize(){
        return this.size;
    }

    /**
     * @return the number of cheesetoppings an order has
     */
    public int getCheeseTopping(){
        return this.cheeseToppings;
    }

    /**
     * @return the number of Pepperoni toppings an order has 
     */
    public int getPepperoniTopping(){
        return this.pepperoniToppings;
    }

    /**
     * @return the number of ham toppings an order has
     */
    public int getHamToppings(){
        return this.hamTopping;
    }


    /**
    * calculates the final price of an order (2$ per topping) + fixed cost depending on pizza size
    * @return finalCost of an order of pizza
    */
    public double calculateCost(){

        double finalCost = 0;

        // 2$ per topping added, plus a fixed cost (10$,12$,14$) depending on the size of pizza
        if (this.size.equals("small")){
            finalCost = 10 + (2 * getCheeseTopping()) + (2 * getPepperoniTopping()) + (2 * getHamToppings());
        }
        else if (this.size.equals("medium")){
            finalCost = 12 + (2 * getCheeseTopping()) + (2 * getPepperoniTopping()) + (2 * getHamToppings());
        }
        else if (this.size.equals("large")){
            finalCost = 14 + (2 * getCheeseTopping()) + (2 * getPepperoniTopping()) + (2 * getHamToppings());
        }
        return finalCost;
    }


    public String getDescription(){
        return "the size of the pizza is: " + getPizzaSize() + "\nthe number of cheese toppings is: " + getCheeseTopping() + "\nthe number of pepperoni topping is: " + getPepperoniTopping()
                + "\nthe number of ham topping is: " + getHamToppings() + "\nthe final order price is: " + calculateCost() + "$";
    }
    
}
