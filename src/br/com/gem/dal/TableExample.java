/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.gem.dal;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author 212815039
 */
public class TableExample {

    public static void main(String[] args) {
        // Use the event dispatch thread for Swing components
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new TableExample().BuildGUI();
            }
        });
    }

    private JTable tabela;

    public void BuildGUI() {
        JFrame f = new JFrame();
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setTitle("Creating a Table Example");
        f.setSize(700, 860);
        f.setLocationRelativeTo(null);

        Object[][] data = {{1, 1, 1}, {2, 2, 2}, {3, 3, 3}, {4, 4, 4}};
        String[] columnNames = {"Column 1", "Column 2", "Column 3"};
        DefaultTableModel defTableModel = new DefaultTableModel(data, columnNames);
        tabela = new JTable(defTableModel);

        JScrollPane sp = new JScrollPane(tabela);
        sp.setBounds(10, 11, 684, 190);

        Object[] newData = {1, 2, 3, 4};
        defTableModel.addColumn("Column 4", newData);

        Object[] newRowData = {5, 5, 5, 5};
        defTableModel.addRow(newRowData);

        Object[] insertRowData = {2.5, 2.5, 2.5, 2.5};
        defTableModel.insertRow(2, insertRowData);

        defTableModel.setValueAt(8888, 3, 2);
        f.getContentPane().setLayout(null);
        f.getContentPane().add(sp);

        JButton btnNewButton  = new JButton("BOTAO PARA CAPTURAR DADOS DA TABELA");
        btnNewButton .addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent arg0) {
                int[] linhasselecionadas = tabela.getSelectedRows();
                for (int i = 0; i < linhasselecionadas.length; i++) {
                    System.out.println(linhasselecionadas[i]);
                    Object teste
                            = tabela.getValueAt(linhasselecionadas[i], 1);
                    System.out.println("Valor capturado:" + teste);
                }
            }
        });
        btnNewButton .setBounds(10, 239, 89, 23);
        f.getContentPane().add(btnNewButton );
        f.setVisible(true);
    }
}
