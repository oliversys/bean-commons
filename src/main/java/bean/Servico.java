package bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="SERVICOS")
public class Servico implements IBabetteUnhasEntity{

	private static final long serialVersionUID = 2953820420650238150L;

	@Id	
	@Column(name="SERVICO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="DURACAO_MEDIA_EM_MINUTOS")
	private Byte duracaoMediaEmMinutos;
		
	public Servico() {
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Byte getDuracaoMediaEmMinutos() {
		return duracaoMediaEmMinutos;
	}

	public void setDuracaoMediaEmMinutos(Byte duracaoMediaEmMinutos) {
		this.duracaoMediaEmMinutos = duracaoMediaEmMinutos;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", nome=" + nome
				+ ", duracaoMediaEmMinutos=" + duracaoMediaEmMinutos
				+ "]";
	}

}
