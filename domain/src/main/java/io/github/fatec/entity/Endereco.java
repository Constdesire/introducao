package io.github.fatec.entity;

public record Endereco(
        String cep,
        String logradouro,
        String complemento,
        String bairro,
        String cidade,
        String uf
) {
}