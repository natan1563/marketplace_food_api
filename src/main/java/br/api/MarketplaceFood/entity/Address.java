package br.api.MarketplaceFood.entity;

import br.api.MarketplaceFood.dto.ViaCepResponse;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    private String neighborhood;
    private String street;
    private String cep;
    private String locale;
    private String uf;

    public void setDataFromViaCepResponse(ViaCepResponse viaCepResponse) {
        setNeighborhood(viaCepResponse.getBairro());
        setStreet(viaCepResponse.getLogradouro());
        setCep(viaCepResponse.getCep());
        setLocale(viaCepResponse.getLocalidade());
        setUf(viaCepResponse.getUf());
    }
}
