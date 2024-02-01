package br.com.bs.teste;
import br.com.bs.dao.ClienteDao;
import br.com.bs.dao.IclienteDAO;
import br.com.bs.dao.IprodutoDAO;
import br.com.bs.dao.ProdutoDao;
import br.com.bs.domain.Cliente;
import br.com.bs.domain.Produto;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ClienteTeste {
	
	IclienteDAO clienteDao;
	IprodutoDAO proDao;
	public ClienteTeste() {
		clienteDao = new ClienteDao();
		proDao = new ProdutoDao();
		
	}

	
	@Test
	public void cadastrarTeste() throws Exception {
		
		Cliente cliente = new Cliente();
		cliente.setCodigo("26");
		cliente.setNome("Joana");
		
		Integer qtd = clienteDao.cadastrarCliente(cliente); 
		assertTrue(qtd == 1);
		assertNotNull(qtd);
		
		Cliente clienteConsultar = clienteDao.consultarCliente(cliente.getCodigo());
		assertNotNull(clienteConsultar);
		assertEquals(cliente.getCodigo(),clienteConsultar.getCodigo());
		assertEquals(cliente.getNome(),clienteConsultar.getNome());
		assertNotNull(clienteConsultar.getId());
		
		Integer qtdDel = clienteDao.excluir(cliente);
		assertNotNull(qtdDel);
		
		Cliente clienteAtualizado = new Cliente();
		clienteAtualizado.setCodigo("20");
		clienteAtualizado.setNome("Tarcisio Meira");
		
		Integer qtAtualizar = clienteDao.atualizarCliente(clienteAtualizado);
		
		assertNotNull(qtAtualizar);
		
		List<Cliente> clienteVazioLista = clienteDao.buscarTodos();
		assertNotNull(clienteVazioLista);
		clienteVazioLista.forEach(System.out::println);
			
	}
	
	@Test
	public void produtoTeste() throws Exception {
		
 		Produto prod = new Produto();
 		prod.setCodigo("28");
 		prod.setNome("Mamão");
 		Integer qtd1 = proDao.cadastrarProduto(prod);
 		assertTrue(qtd1 == 1);
 		
 		Produto produtoConsu = proDao.consultarProduto(prod.getCodigo());
 		assertNotNull(produtoConsu);
 		assertEquals(prod.getCodigo(),produtoConsu.getCodigo());
 		assertEquals(prod.getNome(),produtoConsu.getNome());
 		assertNotNull(produtoConsu.getId());
		
 		Integer qtdDele = proDao.excluirProduto(prod); 
 		assertNotNull(qtdDele);
		
 		Produto prodAtualizao = new Produto();
 		prodAtualizao.setCodigo("25");
 		prodAtualizao.setNome("Batata");
 		Integer qAtualizarprod = proDao.atualizarProduto(prodAtualizao);
 		assertNotNull(qAtualizarprod);
		
		List<Produto> produtoVazioLista = proDao.buscarTodosProdutos();
		assertNotNull(produtoVazioLista);
		produtoVazioLista.forEach(System.out::println);
	}
}
