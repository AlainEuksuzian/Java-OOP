
/*Create a class named Employee that can be used to calculate the salaries of different 
employees. The Employee class should keep a track of the employee ID, name, department, salary, and designation with appropriate accessor and mutator methods.  */

public class Employee {
    
    private int employeeId;
    private String name;
    private String department;
    private double salary;
    private String designation;

    Employee(){}

    Employee(int id, String name, String dept, double salary, String desig){
        this.employeeId = id;
        
        try {
            setName(name);
            setDepartment(dept);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
        this.salary = salary;
        this.designation = desig;
    }

    /**
     * sets instance employee Id to parameter
     * @param idInput
     */
    public void setEmployeeId(int idInput){
        this.employeeId = idInput;
    }

    /**
     * @return employeeId instance
     */
    public int getId(){
        return this.employeeId;
    }

    /**
     * takes parameter "firstname lastname" and assigns it to instance variable name if correct format
     * @param nameInput
     * @throws Exception if firstname or lastname is 1 letter or less
     */
    public void setName(String nameInput) throws Exception{

        int index = nameInput.indexOf(" "); // index of seperator between firstName and LastName

        // if incorrect format entered *no space bar between fname and lname*
        if (index == -1){
            throw new Exception("enter your first name and last name seperated by a space bar");
        }

        // calculate length of first name and last name
        int firstNameLength = nameInput.substring(0, index).length();
        int lastNameLength = nameInput.substring(index + 1, nameInput.length()).length();

        if (firstNameLength <= 1 || lastNameLength <= 1){
            throw new Exception("first and last name must be over 1 letter");
        }
        else {
            this.name = nameInput;
        }

    }

    /**
     * @return name instance variable
     */
    public String getName(){
        return this.name;
    }

    /**
     * sets department instance to parameter
     * @param deptInput
     * @throws Exception if department not part of 4 business units
     */
    public void setDepartment(String deptInput) throws Exception{

        if (deptInput.equalsIgnoreCase("sales") || deptInput.equalsIgnoreCase("supply chain") || deptInput.equalsIgnoreCase("accounting") || deptInput.equalsIgnoreCase("engineering")){
            this.department = deptInput;
        }
        else {
            throw new Exception("department can only be: sales, supply chain, accounting, engineering");
        }
    }

    /**
     * @return department instance
     */
    public String getDepartment(){
        return this.department;
    }

    /**
     * sets salary instance to parameter
     * @param salaryInput
     */
    public void setSalary(double salaryInput){
        this.salary = salaryInput;
    }

    public double getSalary(){
        return this.salary;
    }

    public void setDesignation(String desigInput){
        this.department = desigInput;
    }

    public String getDesignation(){
        return this.designation;
    }


    @Override
    public boolean equals(Object obj) {

        Employee object;
        
        if (obj instanceof Employee){
            object = (Employee) obj;
            return (this.designation.equalsIgnoreCase(object.designation));
        }
        return false;
    }

    public double addBonus(){
        return this.salary + 200;
    }
}
