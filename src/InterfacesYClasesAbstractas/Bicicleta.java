package InterfacesYClasesAbstractas;

public class Bicicleta extends AccionesVehiculo implements Vehiculo {

    Enum constantesVehiculo;
    @Override
    public void manejar() {
        System.out.println("Con un manubrio");
    }

    @Override
    public void moverse() {
        System.out.println("Terrestre dos ruedas mecanicas");
    }

    @Override
    public void setTipoVolante(Enum constantesVehiculo) {
        this.constantesVehiculo = constantesVehiculo;
    }

    @Override
    public Enum getTipoVolante() {
        return this.constantesVehiculo;
    }

    @Override
    public void formaDeMovimiento() {
        System.out.println("Mediante la fuerza de pedaleo");
    }
}
