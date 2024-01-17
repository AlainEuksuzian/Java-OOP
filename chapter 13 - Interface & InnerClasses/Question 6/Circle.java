public class Circle implements Shape{
    private double radius;

    Circle(){}

    Circle(double radius){
        try {
            setRadius(radius);
        }
        catch (Exception e){
            System.out.println(e.getMessage());
        }
    }

    public void setRadius(double radiusInput) throws Exception{
        if (radiusInput < 0){
            throw new Exception("radius cannot be negative");
        }
        else {
            this.radius = radiusInput;
        }
    }

    public double getRadius(){
        return this.radius;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadius(), 2);
    }

}
