package enums;

public enum Higiene {
    LIMPIO,
    SUCIO;

    /*
    public static Higiene cargarHigiene(){

        System.out.print("Higiene: ");
        String h = limpCargaAtributos();
        while(!h.equals("LIMPIO") && !h.equals("SUCIO")){
            System.out.println("Error: ingresar uno de los valores LIMPIO, SUCIO");
            System.out.print("Higiene: ");
            h = limpCargaAtributos();
        }
        return Higiene.valueOf(h);
    }
     */
}
