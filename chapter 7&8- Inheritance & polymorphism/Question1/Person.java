

public class Person {
    
    private String firstName;
    private String lastName;

    Person(){}

    Person(String first, String last){

        try {
            setFirstName(first);
            setLastName(last);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    public void setFirstName(String fnameInput) throws Exception{
        if (fnameInput.isEmpty()){
            throw new Exception("a first name input is required");
        }
        else {
            this.firstName = fnameInput;
        }
    }

    public void setLastName(String lnameInput) throws Exception {
        if (lnameInput.isEmpty()){
            throw new Exception("last name cannot be empty");
        }
        else {
            this.lastName = lnameInput;
        }
    }

    public String getFirstName(){
        return this.firstName;
    }

    public String getLastName(){
        return this.lastName;
    }

    @Override
    public String toString() {
        return "first name is: " + getFirstName() +"\nlast name is: " + getLastName();
    }


}
