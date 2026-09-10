package enums;

public enum CapacidadVuelo {
    OPTIMO,
    DEFECTUOSO,
    NO_VUELA;

    /*
    public static CapacidadVuelo cargarCapacidadDeVuelo() {
        System.out.print("Capacidad de vuelo: ");
        String h = limpCargaAtributos();

        while (!h.equals("BAJA") && !h.equals("MEDIA") && !h.equals("ALTA") && !h.equals("MUY_ALTA")) {
            System.out.println("Error: ingresar uno de los valores BAJA, MEDIA, ALTA, MUY_ALTA");
            System.out.print("Hambre: ");
            h = limpCargaAtributos();
        }
        return CapacidadVuelo.valueOf(h);
    }
    */
}
