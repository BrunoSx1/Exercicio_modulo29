package br.com.bs.domain;

public class Cliente {
	
	private Long id;
	private String codigo;
	private String nome;
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Cliente() {
		
	}
	@Override
	public String toString() {
		return "Cliente [id=" + id + ", codigo=" + codigo + ", nome=" + nome + "]";
	}
	
	
	public Cliente(Long id, String codigo, String nome) {
		super();
		this.id = id;
		this.codigo = codigo;
		this.nome = nome;
	}
	
	
	
	
	
	
	
	
	

}
