package beans;

import java.util.ArrayList;
import java.util.List;

import entities.Categoria;
import entities.Cliente;

public class ClienteBean {

	private List<Cliente> clientes = new ArrayList<Cliente>();
	private Cliente cliente = new Cliente();
	private int id_cliente;
	private static int contador = 0;

	private Cliente clienteBuscado = new Cliente();

	private String updateNome;

	private String updateIdade;
	private String updateRua;
	private String updateBairro;
	private String updateCidade;
	private String updateNumeroCasa;

	public List<Cliente> getClientes() {
		return clientes;
	}

	public void setClientes(List<Cliente> clientes) {
		this.clientes = clientes;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public static int getContador() {
		return contador;
	}

	public static void setContador(int contador) {
		ClienteBean.contador = contador;
	}

	public Cliente getClienteBuscado() {
		return clienteBuscado;
	}

	public void setClienteBuscado(Cliente clienteBuscado) {
		this.clienteBuscado = clienteBuscado;
	}

	public String getUpdateNome() {
		return updateNome;
	}

	public void setUpdateNome(String updateNome) {
		this.updateNome = updateNome;
	}

	public String getUpdateIdade() {
		return updateIdade;
	}

	public void setUpdateIdade(String updateIdade) {
		this.updateIdade = updateIdade;
	}

	public String getUpdateRua() {
		return updateRua;
	}

	public void setUpdateRua(String updateRua) {
		this.updateRua = updateRua;
	}

	public String getUpdateBairro() {
		return updateBairro;
	}

	public void setUpdateBairro(String updateBairro) {
		this.updateBairro = updateBairro;
	}

	public String getUpdateCidade() {
		return updateCidade;
	}

	public void setUpdateCidade(String updateCidade) {
		this.updateCidade = updateCidade;
	}

	public String getUpdateNumeroCasa() {
		return updateNumeroCasa;
	}

	public void setUpdateNumeroCasa(String updateNumeroCasa) {
		this.updateNumeroCasa = updateNumeroCasa;
	}

	private void adicionarCliente() {
		cliente.setId_cliente(contador++);
		clientes.add(cliente);
		cliente = new Cliente();
	}

	private void buscarCliente() {
		Cliente cliente = new Cliente();
		for (Cliente cli : clientes) {
			if (getId_cliente() == cli.getId_cliente())
				;
			cliente = cli;
			setClienteBuscado(cliente);
		}
	}

	public void removerCategoria() {
		clientes.remove(getClienteBuscado());
		clienteBuscado = new Cliente();
	}
}
