/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 *
 * @author Alunos
 */
public class JFrameInicial extends JFrame implements JFrameComportamentosInterface {
    
    private JButton jButtonListaCarros;
    private JButton jButtonCadastroCarro;
    
    public JFrameInicial() {
        criarTela();
        criarComponentes();
        definirLocalizacao();
        adicionarComponentes();
        adcOnclick();
    }

    //definir localizacao
    //adicionar componentes
    //criarcomponentes
    //adc Onclick
    //criartela
    @Override
    public void criarTela() {
        
        setSize(600, 600);
        setLocationRelativeTo(null);
        setLayout(null);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    @Override
    public void criarComponentes() {
        
        jButtonListaCarros = new JButton("Lista de carros");
        jButtonCadastroCarro = new JButton("Cadastro de carros");
    }
    
    @Override
    public void definirLocalizacao() {
        
        jButtonListaCarros.setBounds(10, 10, 200, 35);
        jButtonCadastroCarro.setBounds(10, 50, 200, 35);
        
    }
    
    @Override
    public void adicionarComponentes() {
        
        add(jButtonListaCarros);
        add(jButtonCadastroCarro);
        
    }
    
    @Override
    public void adcOnclick() {
        
        jButtonListaCarros.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                new JFrameListaCarros();
            }
        });
        jButtonCadastroCarro.addActionListener(new ActionListener() {
            
            @Override
            public void actionPerformed(ActionEvent e) {
                new JFrameCadastroCarro().setVisible(true);
            }
        });
        
    }
}
