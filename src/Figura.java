public abstract class Figura implements Comparable<Figura>{
    public abstract double getArea();

    @Override
    public int compareTo (Figura f){
        double areaGeneral = this.getArea();
        double otraArea = f.getArea();
        return areaGeneral > otraArea ? 1 : otraArea < areaGeneral ? -1 : 0;
    }

}
