import java.util.Arrays;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class GestorFiguras {

    static void Sort(Figura[] f){
        Arrays.sort(f);
    }
    static double suma(Figura[] f){
        double res = 0;
        for (int i = 0; i < f.length; i++){
            res += f[i].getArea();
        }
        return res;
    }

    static void printarVector(Figura[] f){

        for (int i = 0; i < f.length; i++){
            String vectorF = "El area del ";
            vectorF += f[i].getClass().getSimpleName() + " tiene un valor de: " + f[i].getArea();
            printaConsola(vectorF);
        }
    }

    static void printaConsola(String vectorPrintable){
        System.out.println (vectorPrintable);
    }


    public static void main(String[] args) {
        Figura[] v = new Figura[4];

        v[0] = new Rectangulo(5,3);
        v[1] = new Circulo(6);
        v[2] = new Cuadrado(5, 5);
        v[3] = new Triangulo(12, 15);

        double res = suma(v);

        System.out.println("suma: "+res);

        printarVector(v);

        Sort(v);

        printarVector(v);
    }
}