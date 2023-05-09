package chapterFourClassesMethods.Question3;

public class WordCount {

    private int counter;
    private String sentence;

    WordCount(){}

    WordCount(String sentence){
        if (sentence.isEmpty()){
            System.exit(0);
        }
        setSentence(sentence);
    }

    /**
     * sets parameter equal to instance variable sentence
     * @param = sentence input
     */
    public void setSentence(String sentenceInput){
        this.sentence = sentenceInput;
    }

    /**
     * @return = String for instance variable sentence
     */
    public String getSentence(){
        return this.sentence;
    }

    /**
     * sets counter instsance to 0
     */
    public void resetCounter(){
        this.counter = 0;
    }

    /**
     * increases counter by 1
     */
    public void increaseCounter(){
        this.counter++;
    }

    /**
     * decreases counter by 1
     */
    public void decreaseCounter(){
        this.counter--;
    }

    /**
     * @return = counter instance variable of type int
     */

    public int getCounter(){
        return this.counter;
    }
    

    /**
     * calculates the number of words in a sentence ignoring words that start with letter 'a'
     * @param  String input for the sentence the user needs counting.
     * @return integer value for number of words counted
     */
    public int wordCounter(String inputSentence){

        this.counter = 1; // start counter at 1 for first word in sentence 

        if (inputSentence.charAt(0) == 'a' || inputSentence.charAt(0) == 'A'){
            decreaseCounter();
        }

        // use of space as seperator for word counter
        for (int i = 0; i < inputSentence.length(); i++){
            char letters = inputSentence.charAt(i);
            if (letters == ' '){
                increaseCounter();

                if (inputSentence.charAt(i + 1) == 'a' || inputSentence.charAt(i + 1) == 'A' ){
                    decreaseCounter();
                }
            }
        }

        if (this.counter < 0){
            resetCounter();
        }

        return this.counter;
    }
    
}
