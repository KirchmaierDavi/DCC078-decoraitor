package com.aaes.decoreitor.sindicato;

public class PlanoSaudeDecorator extends BeneficioSindicalDecorator {

    private static final double VALOR = 80.00;

    public PlanoSaudeDecorator(ContribuicaoSindical associado) {
        super(associado);
    }

    @Override
    public String getDescricao() {
        return super.getDescricao() + " + plano de saúde";
    }

    @Override
    public double getValorMensal() {
        return super.getValorMensal() + VALOR;
    }
}
