/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gem.dal;

import java.sql.*; //conector java
import javax.swing.JOptionPane;

/**
 *
 * @author 212815039
 */
public class ModuloConexao {

    //metodo responsavel por estabelecer a conexao com o banco
    public static Connection conector() { //connection é um conjunto de funcionalidade que vem do pacote sql importado acima. E conector é o nome do meu método.
        java.sql.Connection conexao = null; //usando novamente o pacote sql e o framework connection eu crio minha variavel conector.
        // a linha abaixo "chama" o driver
        String driver = "com.mysql.jdbc.Driver";
        // armazenando informações referente ao banco
        String url = "jdbc:mysql://localhost:3306/gem"; //sempre sera esse caminho -SE AMANHA EU QUISER COLOCAR UM SERVIDOR DEDICADO EU ALTERO O NUMERO DO IP ONDE ESTA O LOCALHOST
        String user = "root";
        String password = "";
        // Estabelecendo a conexao com o banco
        try {
            Class.forName(driver); //classe do pacote sql
            conexao = DriverManager.getConnection(url, user, password); //essa é a sintaxe para voce ligar seu banco de dados ao java(camimho, usuario, senha).
            return conexao; //return foi necessario pq o método public static necessita de retorno
        } catch (Exception e) {
            // a linha abaixo serve de apoio para esclarecer o erro
            System.out.println("e");
            return null;
        }
    }
}
