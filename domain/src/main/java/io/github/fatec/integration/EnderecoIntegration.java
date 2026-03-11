package io.github.fatec.integration;

import io.github.fatec.entity.Endereco;

public interface EnderecoIntegration {
    Endereco buscaCep(String cep);
}
