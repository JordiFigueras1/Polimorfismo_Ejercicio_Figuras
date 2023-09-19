public class Triangulo extends Figura{

    double altura, base;

    public Triangulo (double base, double altura){
        this.base = base;
        this.altura = altura;
    }
    @Override
    public double getArea(){
        return (base * altura)/2;
    }

}
