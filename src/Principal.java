
import dao.CarroDAO;
import database.Utilitarios;
import java.awt.EventQueue;
import java.sql.Date;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Carro;
import view.JFrameInicial;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alunos
 */
public class Principal {

    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                JFrameInicial inicial = new JFrameInicial();

            }
        });

        // CarroDAO dao = new CarroDAO();
        /*     Carro peugeot308 = new Carro();
         peugeot308.setNome("308");
         peugeot308.setFabricante("Peugeot");
         peugeot308.setCor("Rose");
         peugeot308.setAnoFabricacao((short)2013);
         peugeot308.setAnoLancamento((short)2014);
         peugeot308.setEstaFuncional(true);
         peugeot308.setPermitidaCirculacao(true);
         peugeot308.setQuantidadeBatidas((byte)13);
         peugeot308.setEstaFuncional(true);
         peugeot308.setPlaca("");
         peugeot308.setPotencia(146);
         peugeot308.setDataCompra(new Date(2013,8,24));
         peugeot308.setTipoPneu((short)17);
         peugeot308.setChassi("1581-1484-4545-1548-1484");
         peugeot308.setDescricao("Muito louco");
         int codigoInserir = dao.inserir(peugeot308);
         if(codigoInserir != Utilitarios.NAO_FOI_POSSIVEL_INSERIR){
         peugeot308.setId(codigoInserir);
         }else{
         JOptionPane.showMessageDialog(null,"Não foi possivel inserir");
       
         }
         peugeot308.setNome("Gol");
         peugeot308.setFabricante("VW");
         int codigoAlterar = dao.alterar(peugeot308);
         if(codigoAlterar== peugeot308.getId()){
         JOptionPane.showMessageDialog(null,"Alterado ");
         }else{
         JOptionPane.showMessageDialog(null, "Ops! Deu ruim");
            
            
         }*/
//        for (int i = 1; i < 20; i++) {
//            dao.excluir(i);
//        }
//        ArrayList<Carro> carros = dao.retornarListagem();
//        for (Carro carro : carros) {
//            System.out.println(carro.getId() + "-" + carro.getNome());
//        }
    }
}
