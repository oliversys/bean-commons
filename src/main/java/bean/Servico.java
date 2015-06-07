package bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="SERVICOS")
public class Servico implements IBabetteUnhasEntity{

	private static final long serialVersionUID = 2953820420650238150L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="SERVICO_ID")
	private Long id;
	
	@Column(name="NOME")
	private String nome;
	
	@Column(name="DURACAO_MEDIA_EM_MINUTOS")
	private Byte duracaoMediaEmMinutos;
	
	@Column(name="PRECO")
	private BigDecimal preco;
	
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

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Servico [id=" + id + ", nome=" + nome
				+ ", duracaoMediaEmMinutos=" + duracaoMediaEmMinutos
				+ ", preco=" + preco + "]";
	}

}
