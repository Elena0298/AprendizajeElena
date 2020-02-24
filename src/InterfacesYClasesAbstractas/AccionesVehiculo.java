package InterfacesYClasesAbstractas;

public abstract class AccionesVehiculo {
    public abstract void formaDeMovimiento();

    public void transportar(Objeto objeto){
        System.out.println("Transporto "+objeto.getNombre());
    }
}
