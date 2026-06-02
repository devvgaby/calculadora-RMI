package client;

import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

import model.Operacao;

import service.Calculadora;

public class Cliente {

    public static void main(String[] args) {

        try {

            Registry registry =
                    LocateRegistry.getRegistry("servidor", 1099);

            Calculadora calculadora =
                    (Calculadora) registry.lookup("Calculadora");

            Scanner scanner = new Scanner(System.in);

            System.out.print("Digite o primeiro número: ");
            double numero1 = scanner.nextDouble();

            System.out.print("Digite o segundo número: ");
            double numero2 = scanner.nextDouble();

            Operacao operacao = new Operacao(numero1, numero2);

            System.out.println("\nResultados:");

            System.out.println("Soma: "
                    + calculadora.somar(operacao));

            System.out.println("Subtração: "
                    + calculadora.subtrair(operacao));

            System.out.println("Multiplicação: "
                    + calculadora.multiplicar(operacao));

            System.out.println("Divisão: "
                    + calculadora.dividir(operacao));

            scanner.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}