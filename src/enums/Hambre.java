package enums;

public enum Hambre {
    BAJA(0),
    MEDIA(1),
    ALTA(2),
    MUYALTA(3);
    private final int Grado;

    Hambre(int grado) {
        this.Grado = grado;
    }

    public int getGrado() {
        return Grado;
    }

    public int masHambre(int num){
            Hambre[] a = Hambre.values();
            this.ordinal() + 1;
        return 1;
    }

    public int menosHambre(){
        return 1;
    }
}
