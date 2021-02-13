package dto;

import app.utils.ArquivosUtils;
import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import java.util.List;

public class ViagemInternacional extends Viagem implements CalculadoraDePrevisao {

    private String passaporte;

    public ViagemInternacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getPassaporte(){
        return this.passaporte;
    }

    public void setPassaporte(String passaporte) {
        this.passaporte = passaporte;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedades("viagem.internacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagem internacionais não podem ter mais de " + limiteDeAcompanhantes + " acompanhante");
        }
    }

    public int calcularPrevisaoDeDiasPraRetorno() {
        if (this.getDestino().equals(Destinos.MIAMI)) {
            return 1;
        }
        return 0;
    }
}
