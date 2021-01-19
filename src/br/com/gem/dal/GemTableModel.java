/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gem.dal;


import java.util.ArrayList;
import java.util.List;
import javax.swing.table.AbstractTableModel;


/**
 *
 * @author 212815039
 */
public class GemTableModel extends AbstractTableModel{
    
    private List<TabelaGem> dados = new  ArrayList<>(); //Criamos uma lista, os DADOS representam nossa tabela
    private String[] colunas = {"lista", "dat", "pep", "listec", "item", "material", "txtbre", "qtde", "um", "rncrm", "necob", "natnf", "natnf", "local", "projet"}; //Criamos a coluna e seus respectivos nomes

    @Override
    public String getColumnName(int column) { //método utilizado para chamar o nome das colunas(porque anteriormente carregou tudo como A,B,C,D
        return colunas[column];   
    }
    
    
    @Override
    public int getRowCount() { //Aqui fica as linhas, e as linhas estão dentro dos DADOS que criamos.
        return dados.size(); //significa tamanho
    }

    @Override
    public int getColumnCount() { //código onde retornamos as colunas e seu comprimento
        return colunas.length;
    }

    @Override
    public Object getValueAt(int linha, int coluna) {
        
        switch(coluna){
            case 0:
                return dados.get(linha).getLista();
            case 1:
                return dados.get(linha).getData();
            case 2:
                return dados.get(linha).getPep();
            case 3:
                return dados.get(linha).getListec();
            case 4:
                return dados.get(linha).getItem();
            case 5:
                return dados.get(linha).getMaterial();
            case 6:
                return dados.get(linha).getTxtbre();
            case 7:
                return dados.get(linha).getQtde();
            case 8:
                return dados.get(linha).getUm();
            case 9:
                return dados.get(linha).getRncrm();
            case 10:
                return dados.get(linha).getNecob();
            case 11:
                return dados.get(linha).getNatnf();
            case 12:
                return dados.get(linha).getLocal();
            case 13:
                return dados.get(linha).getPepaux();
            case 14:
                return dados.get(linha).getProjeto();          
        }
        return null;
    }

    public void AddRow(TabelaGem g){ //colocando nossa tblgem dentro do método adicionar linha
        this.dados.add(g);//chamando no método this 
        this.fireTableDataChanged();
        
    }       
}
