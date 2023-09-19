public class Rectangulo extends Figura{
    double l1, l2;
    public Rectangulo (double altura, double ancho){
        this.l1 = altura;
        this.l2 = ancho;
    }

    @Override
    public double getArea() {
        return l1*l2;
    }
}
