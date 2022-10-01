//HERENCIA

public class App {
    public static void main(String[] args) throws Exception {
        Cliente cliente = new Cliente();
        cliente.edad = 23;
        cliente.nombre = "Pedro Morales";
        cliente.telefono = 28837263;
        cliente.credito = 30000;

        System.out.println("El señor " + cliente.nombre + " tiene una edad de " + cliente.edad
                + " y tiene un límite de crédidto de " + cliente.credito + "€ llamar al " + cliente.telefono
                + " para eplicarle las condiciones.");
        Trabajador trabajador = new Trabajador();
        trabajador.edad = 42;
        trabajador.nombre = "Jose Vazquez";
        trabajador.telefono = 32324423;
        trabajador.salario = 40000;
        System.out.println("Al Trabajador " + trabajador.nombre + " con " + trabajador.edad
                + " años de edad hay que subirle el salario porque desde hace 2 años mantiene el salario de "
                + trabajador.salario
                + "€, llamarle al " + trabajador.telefono
                + " para eplicarle la buena noticia.");
    }
}

class Persona {
    int edad;
    String nombre;
    int telefono;
}

class Cliente extends Persona {
    int credito;
}

class Trabajador extends Persona {
    int salario;
}
