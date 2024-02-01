package br.com.bs.dao;

import java.util.List;

import br.com.bs.domain.Cliente;

public interface IclienteDAO {
	
	public Integer cadastrarCliente(Cliente cliente) throws Exception;

	public Cliente consultarCliente(String codigo) throws Exception;

	public Integer excluir(Cliente cliente) throws Exception;
	
	public Integer atualizarCliente(Cliente cliente) throws Exception;
	
	public List <Cliente> buscarTodos() throws Exception;
	
	
	

}
