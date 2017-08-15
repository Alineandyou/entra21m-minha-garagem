/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import java.sql.Date;
import model.Carro;
import org.junit.Assert;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import org.junit.Test;

/**
 *
 * @author Alunos
 */
public class CarroDAOJUnitTest {

    @Test
    public void inserir() {

        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 2014));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setCor("VERMELHO");
        gol.setDescricao("SDASDASDASD SDASDASDSDSAD SDADASDSAD");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(1851f);
        gol.setTipoPneu((short) 17);
        gol.setRenavam(1844);

        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        assertEquals(codigo, 1);

        gol.setId(codigo);

        Carro carroBuscado = dao.buscarPorld(codigo);
        validarIgualdadeCarro(gol, carroBuscado);

    }

    @Test
    public void Excluir() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 2014));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setCor("VERMELHO");
        gol.setDescricao("SDASDASDASD SDASDASDSDSAD SDADASDSAD");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(1851f);
        gol.setTipoPneu((short) 17);
        gol.setRenavam(1844);
        CarroDAO dao = new CarroDAO();
        dao.truncate();
        int codigo = dao.inserir(gol);
        dao.excluir(codigo);

        Carro carroBuscado = dao.buscarPorld(codigo);
        assertNull(carroBuscado);
    }

    @Test
    public void Alterar() {
        Carro gol = new Carro();
        gol.setDataCompra(new Date(2017, 8, 2014));
        gol.setAnoFabricacao((short) 2017);
        gol.setAnoLancamento((short) 2017);
        gol.setChassi("5151874");
        gol.setCor("VERMELHO");
        gol.setDescricao("SDASDASDASD SDASDASDSDSAD SDADASDSAD");
        gol.setEstaFuncional(false);
        gol.setFabricante("VW");
        gol.setNome("Gol");
        gol.setPlaca("FLA-2017");
        gol.setPotencia(100f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 4);
        gol.setQuilometragem(1851f);
        gol.setTipoPneu((short) 17);
        gol.setRenavam(1844);
        CarroDAO dao = new CarroDAO();
        dao.truncate();

        int codigo = dao.inserir(gol);
        gol.setId(codigo);

        gol.setDataCompra(new Date(2017, 8, 2014));
        gol.setAnoFabricacao((short) 2015);
        gol.setAnoLancamento((short) 2018);
        gol.setChassi("5151874");
        gol.setCor("ROSA");
        gol.setDescricao("YTYUTYU SUTYU UTYUTYU");
        gol.setEstaFuncional(false);
        gol.setFabricante("ford");
        gol.setNome("Fusion");
        gol.setPlaca("BNP-2017");
        gol.setPotencia(200f);
        gol.setPermitidaCirculacao(true);
        gol.setQuantidadeBatidas((byte) 0);
        gol.setQuantidadePortas((byte) 14);
        gol.setQuilometragem(1569f);
        gol.setTipoPneu((short) 20);
        gol.setRenavam(1554);
        dao.alterar(gol);

        Carro carroModificado = dao.buscarPorld(gol.getId());
        validarIgualdadeCarro(gol, carroModificado);

    }

    public void validarIgualdadeCarro(Carro carro, Carro outroCarro) {
        assertEquals(carro.getId(), outroCarro.getId());
        assertEquals(carro.getAnoFabricacao(), outroCarro.getAnoFabricacao());
        assertEquals(carro.getAnoLancamento(), outroCarro.getAnoLancamento());
        assertEquals(carro.getChassi(), outroCarro.getChassi());
        assertEquals(carro.getCor(), outroCarro.getCor());
        assertEquals(carro.getDataCompra(), outroCarro.getDataCompra());
        assertEquals(carro.getDescricao(), outroCarro.getDescricao());
        assertEquals(carro.getQuantidadeBatidas(), outroCarro.getQuantidadeBatidas());
        assertEquals(carro.getQuantidadePortas(), outroCarro.getQuantidadePortas());
        assertEquals(carro.getPlaca(), outroCarro.getPlaca());
        assertEquals(carro.getQuilometragem(), outroCarro.getQuilometragem(), 0);
        assertEquals(carro.getTipoPneu(), outroCarro.getTipoPneu());
        assertEquals(carro.getRenavam(), outroCarro.getRenavam());
        assertEquals(carro.getNome(), outroCarro.getNome());
        assertEquals(carro.getPotencia(), outroCarro.getPotencia(), 0);
        assertEquals(carro.getFabricante(), outroCarro.getFabricante());
        assertEquals(carro.isEstaFuncional(), outroCarro.isEstaFuncional());
        assertEquals(carro.isPermitidaCirculacao(), outroCarro.isPermitidaCirculacao());

    }

}
