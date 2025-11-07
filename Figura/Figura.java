public abstract class Figura {
    public abstract void CalcularArea();
 }

class circulo extends Figura {
    @Override
    public void CalcularArea() {
        System.out.println("Es el area de una esfera");
    }
}

class rectangulo extends Figura {
    @Override
    public void CalcularArea() {
        System.out.println("El rectangulo tiene un area compuesta de 4 lados y 4 puntas");
    }
}

class Main {
    public static void main(String[] args) {
        rectangulo cuadrado = new rectangulo();
        circulo esfera = new circulo();
        cuadrado.CalcularArea();
        esfera.CalcularArea();

    }
}