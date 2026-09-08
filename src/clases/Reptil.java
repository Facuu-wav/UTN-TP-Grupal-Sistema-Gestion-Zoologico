package clases;

public class Reptil {
    private boolean esVenenoso;
    private boolean tienePatas;

    public Reptil(boolean esVenenoso, boolean tienePatas) {
        this.esVenenoso = esVenenoso;
        this.tienePatas = tienePatas;
    }

    public boolean isEsVenenoso() {
        return esVenenoso;
    }

    public void setEsVenenoso(boolean esVenenoso) {
        this.esVenenoso = esVenenoso;
    }

    public boolean isTienePatas() {
        return tienePatas;
    }

    public void setTienePatas(boolean tienePatas) {
        this.tienePatas = tienePatas;
    }
}
