package enums;

import static enums.CapacidadVuelo.limpCargaAtributos;

public enum TipoPelaje {
    CORTO,
    LARGO,
    RIZADO,
    GRUESO,
    LANOSO,
    LISO,
    SIN_PELO;

    public static TipoPelaje cargarPelaje(){
        System.out.print("Tipo de pelaje: ");
        String h = limpCargaAtributos();

        while(!h.equals("CORTO") && !h.equals("LISO") && !h.equals("LANOSO") && !h.equals("RIZADO") && !h.equals("GRUESO") && !h.equals("SIN_PELO") && !h.equals("LARGO")){
            System.out.println("Error: ingresar uno de los valores CORTO, LISO, ALTA, LANOSO, RIZADO, GRUESO, SIN_PELO, LRGO");
            System.out.print("Tipo de pelaje: ");
            h = limpCargaAtributos();
        }
        return TipoPelaje.valueOf(h);
    }
}
