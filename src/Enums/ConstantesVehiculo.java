package Enums;

public final class ConstantesVehiculo {
    public enum Volantes{
        MANUBRIO("De bicicleta"),
        PALANCA("De Avion"),
        VOLANTE_CIRCULAR("De auto");

        private String tipoVolante;

        Volantes(String tipoVolante){
            this.tipoVolante = tipoVolante;
        }

        public String getTipoVolante(){
            return this.tipoVolante;
        }
    }
}
