package InterfacesYClasesAbstractas;

import Enums.ConstantesVehiculo;

public interface Vehiculo {
    public void manejar();
    public void moverse();
    public void setTipoVolante(Enum constantesVehiculo);
    public Enum getTipoVolante();
}
