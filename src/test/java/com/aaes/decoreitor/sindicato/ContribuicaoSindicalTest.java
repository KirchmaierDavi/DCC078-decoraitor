package com.aaes.decoreitor.sindicato;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;

class ContribuicaoSindicalTest {

    @Test
    void deveCalcularContribuicaoBasicaDoAssociado() {
        ContribuicaoSindical associado = new AssociadoSindical("Ana", 50.00);

        assertEquals("Associado sindical: Ana", associado.getDescricao());
        assertEquals(50.00, associado.getValorMensal());
    }

    @Test
    void deveAdicionarPlanoDeSaudeAoAssociado() {
        ContribuicaoSindical associado = new PlanoSaudeDecorator(
                new AssociadoSindical("Bruno", 50.00));

        assertTrue(associado.getDescricao().contains("plano de saúde"));
        assertEquals(130.00, associado.getValorMensal());
    }

    @Test
    void deveComporMultiplosBeneficios() {
        ContribuicaoSindical associado = new AssociadoSindical("Carla", 50.00);
        associado = new PlanoSaudeDecorator(associado);
        associado = new AssistenciaJuridicaDecorator(associado);
        associado = new SeguroVidaDecorator(associado);

        assertEquals(
                "Associado sindical: Carla + plano de saúde + assistência jurídica + seguro de vida",
                associado.getDescricao());
        assertEquals(170.00, associado.getValorMensal());
    }

    @Test
    void deveRejeitarAssociadoSemNome() {
        assertThrows(IllegalArgumentException.class,
                () -> new AssociadoSindical(" ", 50.00));
    }

    @Test
    void deveRejeitarContribuicaoNegativa() {
        assertThrows(IllegalArgumentException.class,
                () -> new AssociadoSindical("Daniel", -1.00));
    }
}
