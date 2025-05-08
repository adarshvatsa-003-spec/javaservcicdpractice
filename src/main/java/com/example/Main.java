package com.example;

import java.io.IOException;
import java.net.InetSocketAddress;

import com.sun.net.httpserver.HttpServer;
import com.sun.net.httpserver.HttpHandler;
import com.sun.net.httpserver.HttpExchange;

public class Main {
public static void main(String[] args) throws IOException {
    HttpServer server = HttpServer.create(new InetSocketAddress(8080), 0);
    server.createContext("/", new HelloHandler());
    server.setExecutor(null); // creates a default executor
    server.start();
    System.out.println("Server started at http://localhost:8080/");
}

static class HelloHandler implements HttpHandler {
    public void handle(HttpExchange t) throws IOException {
        String response = "<html><body style='background-color:coral;'>" +
                            "<h1 style='color:white;'>Hello from JAR-based Java App!</h1>" +
                            "</body></html>";
        t.sendResponseHeaders(200, response.length());
        t.getResponseBody().write(response.getBytes());
        t.getResponseBody().close();
    }
}
}
