package unit02_conditionals.practice;

public class CheckMail {
    private double sizex;
    private double sizey;
    private double sizez;
    private double weight;

    public CheckMail(){
        sizex = 0;
        sizey = 0;
        sizez = 0;
    }

    public CheckMail(double x, double y, double z, double w){
        sizex = x;
        sizey = y;
        sizez = z;
        weight = w;
        if (sizex < sizey){
            double temp = sizex;
            sizex = sizey;
            sizey = temp;
        }
        if (sizex < sizez){
            double temp = sizex;
            sizex = sizez;
            sizez = temp;
        }
    }

    public double size(){
        return sizez * sizey;
    }

    public String isTooBigorHeavy(){
        if (sizez*sizey > 100 && weight > 70){
            return "Package is too large and too heavy";
        }
        else if (sizez*sizey > 100){
            return "Package is too large";
        }
        else if (weight > 70){
            return "Package is too heavy";
        }
        else {
            return "Package is acceptable";
        }
    }
}
