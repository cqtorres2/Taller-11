package Empleado;

public abstract class Empleado {
    public abstract void CalcularSalario();

    public void MostrarDetalles() {
        System.out.println(" Los detalles del empleado son: Julian, 23 años, salario 500$");
    };
}

class Gerente extends Empleado {
    @Override
    public void CalcularSalario() {
        System.out.println("El salario es bueno");
    }
}

class Vendedor extends Empleado {
    @Override
    public void CalcularSalario() {
        System.out.println("El salario es malo");
    }
}

class Main {
    public static void main(String[] args) {
        Vendedor vendedor = new Vendedor();
        Gerente gerente = new Gerente();
        vendedor.CalcularSalario();
        gerente.CalcularSalario();
    }

}
