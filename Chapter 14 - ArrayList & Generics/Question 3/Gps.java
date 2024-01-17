
public class Gps {
    private double xWaypoint;
    private double yWaypoint;
    private int timestamp;


    Gps(){}

    Gps(double xInput, double yInput, int tInput){
        this.xWaypoint = xInput;
        this.yWaypoint = yInput;
        this.timestamp = tInput;
    }

    public void setXwaypoint(double xInput){
        this.xWaypoint = xInput;
    }

    public double getXwaypoint(){
        return this.xWaypoint;
    }

    public void setYwaypoint(double yInput){
        this.yWaypoint = yInput;
    }

    public double getYwaypoint(){
        return this.yWaypoint;
    }

    public void setTimestamp(int tInput){
        this.timestamp = tInput;
    }

    public int getTimestamp(){
        return this.timestamp;
    }

    // sqrt x2-x1^2 + y2-y1^2
    public double getDistance(Gps obj){
        double distance = Math.sqrt(Math.pow(this.getXwaypoint() - obj.getXwaypoint(),2) +
         Math.pow(this.getYwaypoint() - obj.getYwaypoint(),2));
        distance /= 10;
        return distance;
    }

    public int computeTime(Gps object){
        return Math.abs(this.getTimestamp() - object.getTimestamp() );
    }

    @Override
    public boolean equals(Object obj) {
        Gps object;
        if (this.getClass() != obj.getClass()){
            return false;
        }
        else {
            object = (Gps) obj;
            return (this.getXwaypoint()==(object.getXwaypoint()) && 
            (this.getYwaypoint() == object.getYwaypoint()) && this.timestamp == object.getTimestamp());
        }
    }

    @Override
    public String toString() {
        return "the x value is: " + getXwaypoint() + " the y value is: " + getYwaypoint() +
         " the timestamp is: " + getTimestamp();
    }
}
