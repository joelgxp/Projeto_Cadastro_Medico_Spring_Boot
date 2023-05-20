package br.com.jvsmed.api.medico;

import br.com.jvsmed.api.paciente.DadosEndereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(
        @NotNull
        Long id,
        String nome,
        String telefone
       ) {
}
