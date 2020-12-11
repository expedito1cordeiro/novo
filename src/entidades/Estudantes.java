package entidades;

public class Estudantes {
	private String nome;
	private String email;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Estudantes(String nome, String email){
		this.nome = nome;
		this.email = email;
		
	}
	//o método to string da classe object
	//é herdado por todas as classes
	//ele pode ser sobreposto
	//foi o que fizemso abaixo
	public String toString(){
		return nome+" , E-mail "+email;
	}
	

}
