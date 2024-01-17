public class Dictionary {
    private String word;
    private String synonym;

    Dictionary(){}

    Dictionary(String word, String syn){
        this.word = word;
        this.synonym =syn;
    }

    public void setWord(String wordInput){
        this.word = wordInput;
    }

    public String getWord(){
        return this.word;
    }

    public void setSynonym(String synInput){
        this.synonym = synInput;
    }

    public String getSynonym(){
        return this.synonym;
    }

    @Override
    public boolean equals(Object obj) {
        Dictionary object;

        if (getClass() != obj.getClass()){
            return false;
        }
        else {
            object = (Dictionary) obj;
            return (this.getWord().equals(object.getWord()) && this.getSynonym().equals(object.getSynonym()));
        }

    }

    @Override
    public String toString() {
        return "the word is: " + getWord() + " the synonym is: " + getSynonym();
    }
}
