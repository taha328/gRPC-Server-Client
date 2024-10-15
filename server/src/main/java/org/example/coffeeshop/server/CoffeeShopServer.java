package org.example.coffeeshop.server;

import io.grpc.Server;
import io.grpc.ServerBuilder;
import org.example.coffeeshop.service.CoffeeShopServiceImpl;

import java.io.IOException;

public class CoffeeShopServer {
    public static void main(String[] args) throws IOException, InterruptedException {
        Server server = ServerBuilder.forPort(50051)
                .addService(new CoffeeShopServiceImpl())
                .build();

        System.out.println("Server started...");
        server.start();
        server.awaitTermination();
    }
}
