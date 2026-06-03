package service;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;

import model.Operacao;

public class CalculadoraImpl extends UnicastRemoteObject implements Calculadora { // UnicastRemoteObject é uma classe que facilita a criação de objetos remotos

    public CalculadoraImpl() throws RemoteException {
        super();
    }

    @Override
    public double somar(Operacao operacao) {
        return operacao.getNumero1() + operacao.getNumero2();
    }

    @Override
    public double subtrair(Operacao operacao) {
        return operacao.getNumero1() - operacao.getNumero2();
    }

    @Override
    public double multiplicar(Operacao operacao) {
        return operacao.getNumero1() * operacao.getNumero2();
    }

    @Override
    public double dividir(Operacao operacao) {
        return operacao.getNumero1() / operacao.getNumero2();
    }
}