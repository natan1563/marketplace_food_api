package br.api.MarketplaceFood.dto;

import lombok.Data;

@Data
public class ViaCepResponse {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
