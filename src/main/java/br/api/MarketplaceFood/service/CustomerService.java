package br.api.MarketplaceFood.service;

import br.api.MarketplaceFood.dto.CustomerDTO;
import br.api.MarketplaceFood.dto.ViaCepResponse;
import br.api.MarketplaceFood.entity.Address;
import br.api.MarketplaceFood.entity.Customer;
import br.api.MarketplaceFood.httpClient.ViaCepClient;
import br.api.MarketplaceFood.repository.CustomerRepository;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class CustomerService {
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private ViaCepClient cepClient;

    public Customer create(CustomerDTO customerDTO) {
        Customer customer = new Customer();
        BeanUtils.copyProperties(customerDTO, customer);

        String cleanedCep = customerDTO.getCep().replaceAll("\\D", "");
        Optional<ViaCepResponse> addressResponse = cepClient.getAddressByCep(cleanedCep);

        if (addressResponse.isPresent()) {
            Address address = new Address();
            address.setDataFromViaCepResponse(addressResponse.get());
            customer.setAddress(address);
        }

        return customerRepository.save(customer);
    }
}
