package InterfacesYClasesAbstractas;

import Enums.ConstantesVehiculo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingrese la opción de transporte:");
        System.out.println("1 = Avion y 2 = Bicicleta");

        int opcion1 = Integer.parseInt(entrada.next());


        System.out.println("Ingrese la opción de carga:");
        System.out.println("1 = Huma, 2 = Animal y 3 = Cosa");

        int opcion2 = Integer.parseInt(entrada.next());

        Vehiculo vehiculo = fabricarVehiculo(opcion1);
        vehiculo.moverse();

        Objeto objeto = fabricarObjeto(opcion2);

        if (opcion1 == 1){
            Avion avion = (Avion) vehiculo;
            avion.transportar(objeto);
            avion.formaDeMovimiento();
            avion.setTipoVolante(ConstantesVehiculo.Volantes.PALANCA);
            System.out.println(avion.getTipoVolante());
        }else if (opcion1 == 2){
            Bicicleta bicicleta = (Bicicleta) vehiculo;
            bicicleta.transportar(objeto);
            bicicleta.formaDeMovimiento();
            bicicleta.setTipoVolante(ConstantesVehiculo.Volantes.MANUBRIO);
            System.out.println(bicicleta.getTipoVolante());
        }


    }

    public static Vehiculo fabricarVehiculo(int opcion){
        Vehiculo vehiculo = null;
        if (opcion == 1){
            vehiculo = new Avion();
        }else if (opcion == 2){
            vehiculo = new Bicicleta();
        }
        return vehiculo;
    }

    public static Objeto fabricarObjeto(int opcion){
        Objeto objeto = null;
        if (opcion == 1){
            objeto = new Humano();
        }else if(opcion == 2){
            objeto = new Animal();
        }else if (opcion == 3){
            objeto = new Cosa();
        }
        return objeto;
    }
}
