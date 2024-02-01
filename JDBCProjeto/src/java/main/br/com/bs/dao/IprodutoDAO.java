package br.com.bs.dao;

import java.util.List;

import br.com.bs.domain.Cliente;
import br.com.bs.domain.Produto;

public interface IprodutoDAO {
	
	public Integer cadastrarProduto(Produto produto) throws Exception;

	public Produto consultarProduto(String codigo) throws Exception;

	public Integer excluirProduto(Produto produto) throws Exception;
	
	public Integer atualizarProduto(Produto produto) throws Exception;
	
	public List <Produto> buscarTodosProdutos() throws Exception;
	

}
