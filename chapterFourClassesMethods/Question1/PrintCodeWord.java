package chapterFourClassesMethods.Question1;


public class PrintCodeWord {

    private char letter;
    private int number;

    PrintCodeWord(){}

    PrintCodeWord(char letter, int number){
        setLetter(letter);
        setNumber(number);
    }

    /*
     * Parameter: user input of type char
     * sets instance variable letter to parameter
     */
    public void setLetter(char letter){
        this.letter = letter;
    }

    public int getLetter(){
        return this.letter;
    }

     /*
     * Parameter: user input of type number
     * sets instance variable number to parameter
     */
    public void setNumber(int number){
        this.number = number;
    }

    public int getNumber(){
        return this.number;
    }

    // sets char instance variable to 'a'
    public char resetLetter(){
        return this.letter = 'a';
    }

    // sets int instance variable to 0
    public int resetNumber(){
        return this.number = 0;
    }

    /**
     * @param : none
     * body: loops 26 times and prints character and letter
     * condition: if character reaches 'z' -> it is reset to 'a' on next iteration
     * condition2: if int reaches 9 -> it is reset to 0 at next interation
     */

    public void printCodedWords(){

        for (int i = 0; i < 26; i++){

            if (this.letter > 'z' ){
                resetLetter();
            }
            if (this.number > 9 ){
                resetNumber();
            }
            System.out.println(this.letter + "" + this.number);
            this.letter++;
            this.number++;
        }
    }
    
}


