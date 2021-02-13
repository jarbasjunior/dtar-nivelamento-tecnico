package enums;

public enum Destinos {
    MATA_DA_CHICA("Mata da Chica"),
    PARIPE("Paripe"),
    SALSA("Salsa"),
    MITUASSU("Mituassú"),
    GURUJI("Gurují"),
    MIAMI("Miami");

    private String cidade;

    Destinos(String cidadeDestino){
        this.cidade = cidadeDestino;
    }

    public String getCidade() {
        return this.cidade;
    }
}
