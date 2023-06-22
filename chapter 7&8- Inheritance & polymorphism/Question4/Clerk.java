public class Clerk extends Employee{

    Clerk(){}

    Clerk(int id, String name, String dept, double salary, String desig){
        super(id, name, dept, salary, desig);
    }

    /**
     * clerks have a extra bonus of 100$ (200 + 100 = total bonus)
     */
    @Override
    public double addBonus() {
        return super.getSalary() + 200 + 100;
    }
    
}
