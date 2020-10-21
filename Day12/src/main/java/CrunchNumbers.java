public class CrunchNumbers {

    public double base;
    public double height;
    public double area;

    public CrunchNumbers(){

    }

    public CrunchNumbers(double base, double height){
        this.base = base;
        this.height = height;
    }

    public double findArea(double b, double h){
        this.area = b*h*.5;
        return this.area;
    }

}
