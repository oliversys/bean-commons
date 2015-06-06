package bean;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="PROFISSIONAIS")
public class Profissional implements IBabetteUnhasEntity{

	private static final long serialVersionUID = 2135229495712912773L;

	@Id
	@Column(name="PROFISSIONAL_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name = "NOME")
	private String nome;
	
	@Column(name = "URL_FOTO")
	private String urlFoto;
	
	@Column(name = "CPF")
	private String cpf;
	
	@Column(name = "AVALIACAO")
	private Float avaliacao;
	
	@OneToMany
	private List<Servico> servicos;
	
	public Profissional() {
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getUrlFoto() {
		return urlFoto;
	}

	public void setUrlFoto(String urlFoto) {
		this.urlFoto = urlFoto;
	}

	public Long getId() {
		return id;
	}

	@Override
	public String toString() {
		return "Profissional [id=" + id + ", nome=" + nome + ", urlFoto="
				+ urlFoto + ", cpf=" + cpf + ", avaliacao=" + avaliacao
				+ ", servicos=" + servicos + "]";
	}

}
