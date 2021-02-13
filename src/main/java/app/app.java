package app;

import dto.Acompanhante;
import dto.ViagemInternacional;
import dto.ViagemNacional;
import enums.Destinos;

import java.util.ArrayList;
import java.util.List;

public class app {
    public static void main(String[] args) {
        Acompanhante acompanhante1 = new Acompanhante();
        Acompanhante acompanhante2 = new Acompanhante();
        Acompanhante acompanhante3 = new Acompanhante();
        Acompanhante acompanhante4 = new Acompanhante();
        Acompanhante acompanhante5 = new Acompanhante();
        List<Acompanhante> acompanhantes = new ArrayList<Acompanhante>();

        acompanhante1.setNome("Anjo da Guarda");
        acompanhante1.setConfirmouCadastro(true);
        acompanhante2.setNome("Santo de devoção");
        acompanhante2.setConfirmouCadastro(true);
        acompanhante3.setNome("Anjo da Guarda 2");
        acompanhante3.setConfirmouCadastro(true);
        acompanhante4.setNome("Santo de devoção 2");
        acompanhante4.setConfirmouCadastro(true);
        acompanhante5.setNome("Santo de devoção 3");
        acompanhante5.setConfirmouCadastro(true);

        acompanhantes.add(acompanhante1);
        acompanhantes.add(acompanhante2);
        acompanhantes.add(acompanhante3);
        acompanhantes.add(acompanhante4);
        acompanhantes.add(acompanhante5);

        ViagemNacional viagemNacional = new ViagemNacional(Destinos.SALSA);
        ViagemInternacional viagemInternacional = new ViagemInternacional(Destinos.MIAMI);

        try {
            viagemNacional.setAcompanhantes(acompanhantes);
        } catch (Exception excecao) {
            System.out.println("Ocorreu um erro: ");
            System.out.println(excecao.getMessage());
        }

        System.out.println(viagemNacional.calcularPrevisaoDeDiasPraRetorno());
    }
}
