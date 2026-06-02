package server;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

import service.CalculadoraImpl;

public class Servidor {

    public static void main(String[] args) {

        try {

            Registry registry = LocateRegistry.createRegistry(1099);

            registry.rebind("Calculadora", new CalculadoraImpl());

            System.out.println("Servidor RMI iniciado na porta 1099");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}