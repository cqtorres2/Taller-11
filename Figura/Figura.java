public abstract class Figura {
    public abstract String CalcularArea();

    public String MostrarArea() {
        System.out.println("Area de la figura");
        return MostrarArea();
    };
}

class circulo extends Figura {
    @Override
    public String CalcularArea() {
        System.out.println("Es el area de una esfera");
        return CalcularArea();
    }
}

class rectangulo extends Figura {
    @Override
    public String CalcularArea() {
        System.out.println("El rectangulo tiene un area compuesta de 4 lados y 4 puntas");
        return CalcularArea();
    }

    @Override
    public String toString() {
        return CalcularArea();
    }
}