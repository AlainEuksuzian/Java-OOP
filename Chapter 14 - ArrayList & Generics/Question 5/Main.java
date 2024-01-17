
public class Main{
    public static void main(String[] args) {
        System.out.println(hasValue("hello"));
    }

    public static int hasValue(String input){
        int val = 0;

        for (int i = 0; i < input.length(); i++){
            val += input.charAt(i);
        }
        val %= 10;  
        return val;  //size of array
    }

    public static int hasValue2(String input){
        int val = 0;

        for (int i = 0; i < input.length(); i++){
            val += 31 * val * input.charAt(i);
        }
        val %= 10;  
        return val;  //size of array
    }

}