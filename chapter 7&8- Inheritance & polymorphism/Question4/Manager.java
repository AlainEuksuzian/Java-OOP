public class Manager extends Employee {
    
    Manager(){}

    Manager(int id, String name, String dept, double salary, String desig){
        super(id, name, dept, salary, desig);
    }

    /**
     * managers have an extra bonus of 300 (200 + 300)
     * @return salary + total bonuses
     */
    @Override
    public double addBonus() {
        return super.getSalary() + 200 + 300;
    }
}
