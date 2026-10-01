package com.aaes.decoreitor.sindicato;

public class AssistenciaJuridicaDecorator extends BeneficioSindicalDecorator {

    private static final double VALOR = 25.00;

    public AssistenciaJuridicaDecorator(ContribuicaoSindical associado) {
        super(associado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + assistência jurídica";
    }

    @Override
    public double getValorMensal() {
        return super.getValorMensal() + VALOR;
    }
}
