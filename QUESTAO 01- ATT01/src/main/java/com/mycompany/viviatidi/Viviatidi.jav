/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viviatidi;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitoria Moreira
 */
public class Viviatidi {

    public static void main(String[] args) {
        int quantPessoas;
        int numero;
        
        String quant2 = JOptionPane.showInputDialog("Informe a quantidade de pessoas que irão se cadastrar: ");
        
        quantPessoas = Integer.parseInt(quant2);
        
        while (quantPessoas <= 0) {
            quant2 = JOptionPane.showInputDialog("ERRO!!!             INFORME UM NUMERO VÀLIDO!!");
            quantPessoas= Integer.parseInt(quant2);
        }
        
        String vet[] = new String[quantPessoas];
        for (int i = 0; i < quantPessoas; i++) {
            
        vet[i] = JOptionPane.showInputDialog("Informe o nome da "+ (i+1) + "° pessoa :");
        }
        
        JOptionPane.showMessageDialog(null, "Nomes cadastrados com sucesso!");
        
        String selecionar = JOptionPane.showInputDialog("Infome o numero para encontra o nome desejado.");
        
        numero = Integer.parseInt(selecionar);
        
        while(numero <= 0 || numero > quantPessoas){
            selecionar = JOptionPane.showInputDialog("Por favor informe um numero entre 1 e "+ quantPessoas);
            numero = Integer.parseInt(selecionar);       
        }
        
        JOptionPane.showMessageDialog(null, "Nome: " + vet[numero-1]+"\nPosição: " +numero);
    }
}
              

  
