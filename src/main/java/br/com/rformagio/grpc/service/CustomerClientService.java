package br.com.rformagio.grpc.service;

import br.com.rformagio.grpc.server.grpcserver.*;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import org.springframework.stereotype.Service;

@Service
public class CustomerClientService {
    public String registerCustomer(Customer customer) {
        ManagedChannel channel = ManagedChannelBuilder.forAddress("localhost", 9090)
                .usePlaintext()
                .build();
        CustomerServiceGrpc.CustomerServiceBlockingStub stub = CustomerServiceGrpc.newBlockingStub(channel);
        CustomerResponse customerResponse = stub.registerCustomer(CustomerRequest.newBuilder()
                .setCustomer(customer)
                .build());
        channel.shutdown();
        return customerResponse.getMessage();
    }
}
