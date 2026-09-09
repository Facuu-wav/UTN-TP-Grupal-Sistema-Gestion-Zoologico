package enums;

public enum Hambre {
    BAJA(0),
    MEDIA(1),
    ALTA(2),
    MUY_ALTA(3);

    private final int grado;

    Hambre(int grado) {
        this.grado = grado;
    }

    public int getGrado() {
        return grado;
    }

    /*
    public int masHambre(int num){
            Hambre[] a = Hambre.values();
            this.ordinal() + 1;
        return 1;
    }
     */

    public Hambre masHambre() {
        if (this == MUY_ALTA) {
            return MUY_ALTA;
        }
        return Hambre.values()[this.ordinal() + 1];
    }

    public Hambre menosHambre() {
        if (this == BAJA) {
            return BAJA;
        }
        return Hambre.values()[this.ordinal() - 1];
    }
}