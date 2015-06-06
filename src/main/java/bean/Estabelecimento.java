package bean;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="ESTABELECIMENTOS")
public class Estabelecimento implements IPedePizzaEntity,IBabetteUnhasEntity{
	
	private static final long serialVersionUID = 2785986018808117662L;

	@GeneratedValue(strategy=GenerationType.AUTO)
	@Id
	@Column(name="ESTABELECIMENTO_ID",columnDefinition="BIGINT NOT NULL AUTO_INCREMENT")
	protected Long id;

	@Column(name="NOME")
	protected String nome;
	
	@Embedded
	protected Endereco endereco;
	
	@OneToMany(cascade={javax.persistence.CascadeType.ALL}, fetch=FetchType.EAGER)
	@JoinColumn(name="COMENTARIO_ID")
	protected Set<Comentario> comentarios;
	
	@Column(name="AVALIACAO")
	protected Float avaliacao = Float.valueOf(1.0F);

// distanciaEmKM eh calculada em tempo real e nao armazenada	
	
	@Column(name="DIA_HORA_FUNCIONAMENTO")
	protected String diaHoraFuncionamento;
		
	@Column(name="LOGO_URL")
	protected String logoURL;
	
	public Estabelecimento() {}

	public Long getId() {
		return this.id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Set<Comentario> getComentarios() {
		return comentarios;
	}

	public void setComentarios(Set<Comentario> comentarios) {
		this.comentarios = comentarios;
	}

	public Float getAvaliacao() {
		return avaliacao;
	}

	public void setAvaliacao(Float avaliacao) {
		this.avaliacao = avaliacao;
	}

	public String getDiaHoraFuncionamento() {
		return diaHoraFuncionamento;
	}

	public void setDiaHoraFuncionamento(String diaHoraFuncionamento) {
		this.diaHoraFuncionamento = diaHoraFuncionamento;
	}

	public String getLogoURL() {
		return logoURL;
	}

	public void setLogoURL(String logoURL) {
		this.logoURL = logoURL;
	}

	@Override
	public String toString() {
		return "Estabelecimento [id=" + id + ", nome="
				+ nome + ", endereco=" + endereco + ", comentarios="
				+ comentarios + ", avaliacao=" + avaliacao + ", diaHoraFuncionamento="
				+ diaHoraFuncionamento + ", logoURL=" + logoURL + "]";
	}

}
