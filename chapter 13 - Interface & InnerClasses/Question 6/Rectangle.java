public class Rectangle implements Shape {

    private double height;
    private double width;

    Rectangle(){}

    Rectangle(double height, double width){
        this.height = height;
        this.width = width;
    }

    /**
     * sets height instance to parameter of method
     * @param heightInput
     * @throws Exception if height input is negative
     */
    public void setHeight(double heightInput) throws Exception{
        if (heightInput < 0){
            throw new Exception("heigth cannot be negative");
        }
        else {
            this.height = heightInput;
        }
    }

    /*
     * gets height instance
     */
    public double getHeight(){
        return this.height;
    }

    /**
     * sets height instance to parameter of metho 
     * @param widthInput
     * @throws Exception if height parameter is negative
     */
    public void setWidth(double widthInput) throws Exception{
        if (widthInput < 0){
            throw new Exception("Width cannot be negative");
        }
        else {
            this.width = widthInput;
        }
    }

    public double getWidth(){
        return this.width;
    }

    /**
     * implements area from interface to calculate area of rectangle
     * @return area (l * w)
     */
    @Override
    public double area() {
       return getHeight() * getWidth();
    }
    
}
