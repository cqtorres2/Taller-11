package Empleado;

public abstract class Empleado {
    public abstract String CalcularSalario();
    public String MostrarDetalles(){
        System.out.println(" Los detalles del empleado son: Julian, 23 años, salario 500$");
       return MostrarDetalles(); 
    };
}

class Gerente extends Empleado {
    @Override
    public String CalcularSalario() {
        System.out.println("El salario es bueno");
        return CalcularSalario();
    }
}

class Vendedor extends Empleado {
    @Override
    public String CalcularSalario() {
        System.out.println("El salario es malo");
        return CalcularSalario();
    }   
    @Override
    public String toString() {
        return CalcularSalario();
    }
}
