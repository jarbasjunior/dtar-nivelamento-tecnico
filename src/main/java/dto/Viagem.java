package dto;

import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class Viagem {
    private Destinos destino;
    private List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();

    public Viagem(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public Destinos getDestino() {
        return this.destino;
    }

    public void setDestino(Destinos lugarDeDestino) {
        this.destino = lugarDeDestino;
    }

    public List<Acompanhante> getAcompanhantes() {
        return acompanhantes;
    }

    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        this.acompanhantes = acompanhantes;
    }
}
