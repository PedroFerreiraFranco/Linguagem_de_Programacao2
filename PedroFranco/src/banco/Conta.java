/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author 17352499636
 */
public class Conta {
    String cliente;//atributos ou variaveis de instacia
    double saldo;//atributos ou variaveis de instacia
    double limite;//atributos ou variaveis de instacia
    
    public void deposita(double saldo){
    this.saldo = this.saldo+saldo;
    }
}
