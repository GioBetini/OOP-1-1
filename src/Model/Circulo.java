package Model;
public class Circulo {
    public double raio;

public Circulo (double r){
    raio = r;
}

public double getPerimetro (double raio){
    double perim = 2*Math.PI*raio;
    return perim;
}

public double getArea (double raio){
    double area = Math.PI*(Math.pow(raio, 2));
    return area;
}

}
