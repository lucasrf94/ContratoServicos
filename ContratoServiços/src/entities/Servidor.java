package entities;

public class Servidor {
	private String nome_servidor;
	private int idade_servidor;
	private String telefone_servidor;
	private String curriculum_servidor;
	private String email_servidor;
	private String rua_servidor;
	private String bairro_servidor;
	private int numCasa_servidor;
	private String cidade_servidor;
	private String estado_servidor;
	private ServiçoPrest servicoPrest;
	private int id_servidor;
	private int custo_minimo;
	private String foto_servico;
	
	
	public Servidor() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getNome_servidor() {
		return nome_servidor;
	}
	public void setNome_servidor(String nome_servidor) {
		this.nome_servidor = nome_servidor;
	}
	public int getIdade_servidor() {
		return idade_servidor;
	}
	public void setIdade_servidor(int idade_servidor) {
		this.idade_servidor = idade_servidor;
	}
	public String getTelefone_servidor() {
		return telefone_servidor;
	}
	public void setTelefone_servidor(String telefone_servidor) {
		this.telefone_servidor = telefone_servidor;
	}
	public String getCurriculum_servidor() {
		return curriculum_servidor;
	}
	public void setCurriculum_servidor(String curriculum_servidor) {
		this.curriculum_servidor = curriculum_servidor;
	}
	public String getEmail_servidor() {
		return email_servidor;
	}
	public void setEmail_servidor(String email_servidor) {
		this.email_servidor = email_servidor;
	}
	public String getRua_servidor() {
		return rua_servidor;
	}
	public void setRua_servidor(String rua_servidor) {
		this.rua_servidor = rua_servidor;
	}
	public String getBairro_servidor() {
		return bairro_servidor;
	}
	public void setBairro_servidor(String bairro_servidor) {
		this.bairro_servidor = bairro_servidor;
	}
	public int getNumCasa_servidor() {
		return numCasa_servidor;
	}
	public void setNumCasa_servidor(int numCasa_servidor) {
		this.numCasa_servidor = numCasa_servidor;
	}
	public String getCidade_servidor() {
		return cidade_servidor;
	}
	public void setCidade_servidor(String cidade_servidor) {
		this.cidade_servidor = cidade_servidor;
	}
	public String getEstado_servidor() {
		return estado_servidor;
	}
	public void setEstado_servidor(String estado_servidor) {
		this.estado_servidor = estado_servidor;
	}
	public ServiçoPrest getServicoPrest() {
		return servicoPrest;
	}
	public void setServicoPrest(ServiçoPrest servicoPrest) {
		this.servicoPrest = servicoPrest;
	}
	public int getId_servidor() {
		return id_servidor;
	}
	public void setId_servidor(int id_servidor) {
		this.id_servidor = id_servidor;
	}
	public int getCusto_minimo() {
		return custo_minimo;
	}
	public void setCusto_minimo(int custo_minimo) {
		this.custo_minimo = custo_minimo;
	}
	public String getFoto_servico() {
		return foto_servico;
	}
	public void setFoto_servico(String foto_servico) {
		this.foto_servico = foto_servico;
	}
}
