/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.viviatt2;

import javax.swing.JOptionPane;

/**
 *
 * @author Vitoria Moreira
 */
public class Viviatt2 {

    public static void main(String[] args) {
        
        int quant;
        String a;
        
        String x = JOptionPane.showInputDialog("Informe a quantidade de telefones a serem cadastrados.");
        
        quant = Integer.parseInt(x);
        
        while (quant <= 0) {
            x = JOptionPane.showInputDialog("ERRO!!\nINFORME UM NUMERO VÀLIDO");
            quant = Integer.parseInt(x);
        }
        
        String nome[] = new String[quant];
        String telefone[] = new String[quant];
        
        for (int i = 0; i < quant; i++) {
            nome[i] = JOptionPane.showInputDialog("Informe o nome da " + (i + 1) + "° pessoa :");
            telefone[i] = JOptionPane.showInputDialog("Informe o telefone da " + (i + 1) + "° pessoa :\n         com o modelo abaixo\n            (xx) xxxxx-xxxx");
        }
        
        JOptionPane.showMessageDialog(null, "cadastramento feito com sucesso!" );
        a = JOptionPane.showInputDialog("insira o nome da pessoa cadastrada que procura: ");
        
        int dj;
        
        for (dj = 0; dj < quant; dj++) {
            if (a.equals(nome[dj])) {
                JOptionPane.showMessageDialog(null, "        encontrado com sucesso!!\nNome: " + nome[dj] + "\nTelefone: " + telefone[dj]);
                break;
            }
        }
        if (dj == quant) {
            JOptionPane.showMessageDialog(null, "Nome inexistente no banco de dados.");
        }
    }
}        
