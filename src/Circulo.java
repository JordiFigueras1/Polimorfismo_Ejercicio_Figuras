public class Circulo extends Figura{

    double r;

    public Circulo (double r){
        this.r = r;
    }

    @Override
    public double getArea(){
        return r * r * 3.14;

    }
}
