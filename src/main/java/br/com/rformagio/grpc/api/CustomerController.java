package br.com.rformagio.grpc.api;

import br.com.rformagio.grpc.server.grpcserver.Customer;
import br.com.rformagio.grpc.service.CustomerClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/customer")
public class CustomerController {

    private CustomerClientService customerClientService;

    @Autowired
    public CustomerController(CustomerClientService customerClientService) {
        this.customerClientService = customerClientService;
    }

    @PostMapping(value = "/reg", consumes = MediaType.APPLICATION_JSON_VALUE)
    public String registor(@RequestBody CustomerDTO customerDTO) {
        try {
            Customer cus=Customer.newBuilder()
                    .setCustomerId(customerDTO.getCustomer_id())
                    .setFirstName(customerDTO.getFirst_name())
                    .setLastName(customerDTO.getLast_name())
                    .setEmail(customerDTO.getEmail())
                    .addAllPhoneNumbers(customerDTO.getPhone_numbers())
                    .setAge(customerDTO.getAge())
                    .setBalance(customerDTO.getBalance())
                    .build();
            return customerClientService.registerCustomer(cus);
        } catch (Exception e) {
            System.out.println("##########################################################################");
            System.out.println("ERRO: " + e.getMessage());
        }

        return "ERRO $$$$$$$$$$$$$$$$$$$$$$$$$$$";
    }


}
