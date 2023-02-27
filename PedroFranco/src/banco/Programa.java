/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

import java.util.Scanner;

/**
 *
 * @author tulio
 */
public class Programa {
    public static void main(String[] args) {
        Scanner entradaDeposita = new Scanner(System.in);
        Scanner entradaSaque = new Scanner(System.in);
        Scanner entradaTransfere = new Scanner(System.in);
        
        Conta minhaConta = new Conta();
        Conta segundaConta = new Conta();
        
        System.out.println("Digite um valor para depósito:");
        minhaConta.deposita(entradaDeposita.nextDouble());
       
        System.out.println("Digite um valor para saque:");
        minhaConta.saca(entradaSaque.nextDouble());

        System.out.println("Digite um valor para tansferencia:");
        minhaConta.transfere(segundaConta, entradaTransfere.nextDouble());

        System.out.println("Saldo minha conta:"+minhaConta.saldo);
        System.out.println("Saldo segunda conta:"+segundaConta.saldo);

        
        
        
        
    }
    
}
