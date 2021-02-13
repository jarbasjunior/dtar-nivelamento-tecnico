package dto;

import app.utils.ArquivosUtils;
import enums.Destinos;
import interfaces.CalculadoraDePrevisao;
import java.util.List;

public class ViagemNacional extends Viagem implements CalculadoraDePrevisao {

    private String cpf;

    public ViagemNacional(Destinos lugarDeDestino) {
        super(lugarDeDestino);
    }

    public String getCpf(){
        return this.cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public void setAcompanhantes(List<Acompanhante> acompanhantes) throws Exception {
        int limiteDeAcompanhantes = Integer.parseInt(ArquivosUtils.getPropriedades("viagem.nacional.acompanhantes.limite"));

        if (acompanhantes.size() <= limiteDeAcompanhantes) {
            super.setAcompanhantes(acompanhantes);
        } else {
            throw new Exception("Viagem nacionais não podem ter mais que " + limiteDeAcompanhantes + " acompanhantes");
        }
    }

    public int calcularPrevisaoDeDiasPraRetorno() {
        int quantidadeDeDias = 0;

        switch (this.getDestino()) {
            case SALSA: quantidadeDeDias = 5; break;
            case MATA_DA_CHICA: quantidadeDeDias = 10; break;
            case MITUASSU: quantidadeDeDias = 15; break;
            case PARIPE: quantidadeDeDias = 30; break;
            case GURUJI: quantidadeDeDias = 3; break;
        }
        return quantidadeDeDias;
    }
}
