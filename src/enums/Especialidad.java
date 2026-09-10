package enums;
import static enums.CapacidadVuelo.limpCargaAtributos;

public enum Especialidad {
    MAMIFEROS, // especilaista en mamiferos
    REPTILES, // especialista en reptiles
    AVES; // especialista en aves

    public static Hambre cargarEspecialidad(){
        System.out.print("Hambre: ");
        String h = limpCargaAtributos();

        while(!h.equals("BAJA") && !h.equals("MEDIA") && !h.equals("ALTA") && !h.equals("MUY_ALTA")){
            System.out.println("Error: ingresar uno de los valores BAJA, MEDIA, ALTA, MUY_ALTA");
            System.out.print("Hambre: ");
            h = limpCargaAtributos();
        }
        return Hambre.valueOf(h);
    }
}
