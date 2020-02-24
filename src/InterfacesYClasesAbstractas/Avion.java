package InterfacesYClasesAbstractas;

import Enums.ConstantesVehiculo;

public class Avion extends AccionesVehiculo implements Vehiculo {

    Enum constantesVehiculo;

    @Override
    public void manejar() {
        System.out.println("Manejo con una palanca multidireccional");
    }

    @Override
    public void moverse() {
        System.out.println("Vuelo");
    }

    @Override
    public void setTipoVolante(Enum constantesVehiculo) {
        this.constantesVehiculo = constantesVehiculo;
    }

    @Override
    public Enum getTipoVolante() {
        return constantesVehiculo;
    }

    @Override
    public void formaDeMovimiento() {
        System.out.println("Me muevo por medio de turbinas");
    }


}
