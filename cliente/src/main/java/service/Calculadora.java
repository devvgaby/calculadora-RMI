package service;

import java.rmi.Remote;
import java.rmi.RemoteException;

import model.Operacao;

public interface Calculadora extends Remote {

    double somar(Operacao operacao) throws RemoteException;

    double subtrair(Operacao operacao) throws RemoteException;

    double multiplicar(Operacao operacao) throws RemoteException;

    double dividir(Operacao operacao) throws RemoteException;
}