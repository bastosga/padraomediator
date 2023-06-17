import org.example. *;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
class AtendimentoTeste {
    @Test
    void simularAtendimentoUTI() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao HUV!\n"+
                        "Seu atestado de internação na UTI foi emitido.\n" +
                        ">>Relatório Triagem: Paciente chegou com ferimento a bala na perna",
                atendimento.atendimentoUTI("Relatório Triagem: Paciente chegou com ferimento a bala na perna"));
    }
    @Test
    void simularAtendimentoExames() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao HUV!\n"+
                        "Seu atestado de realização de exames foi emitido.\n" +
                        ">>Relatório Triagem: Paciente precisa realizar exame de sangue.",
                atendimento.atendimentoExames("Relatório Triagem: Paciente precisa realizar exame de sangue."));
    }
    @Test
    void simularAtendimentoConsulta() {
        Atendimento atendimento = new Atendimento();
        assertEquals("Bem vindo ao HUV!\n"+
                        "Seu atestado de Consulta de Rotina foi emitido.\n" +
                        ">>Relatório Triagem: Paciente com hiperglicemia.",
                atendimento.atendimentoConsulta("Relatório Triagem: Paciente com hiperglicemia."));
    }
}