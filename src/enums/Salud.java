package enums;

import static enums.CapacidadVuelo.limpCargaAtributos;

public enum Salud {
    DESNUTRIDO,
    ENFERMO,
    SALUDABLE,
    LASTIMADO;

    public static Salud cargarSalud(){
        System.out.print("Salud: ");
        String h = limpCargaAtributos();
        while(!h.equals("DESNUTRIDO") && !h.equals("ENFERMO") && !h.equals("LASTIMADO") && !h.equals("SALUDABLE")){
            System.out.println("Error: ingresar uno de los valores DESNUTRIDO, ENFERMO, SALUDABLE, LASTIMADO");
            System.out.print("Salud: ");
            h = limpCargaAtributos();
        }
       return Salud.valueOf(h);
    }
}
