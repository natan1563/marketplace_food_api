package br.api.MarketplaceFood.httpClient;

import br.api.MarketplaceFood.dto.ViaCepResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Optional;

@FeignClient(name = "viaCepClient", url = "https://viacep.com.br/ws")
public interface ViaCepClient {
    @GetMapping("/{cep}/json/")
    Optional<ViaCepResponse> getAddressByCep(@PathVariable String cep);
}
