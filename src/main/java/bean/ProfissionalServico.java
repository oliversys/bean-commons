package bean;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="PROFISSIONAIS_SERVICOS")
public class ProfissionalServico implements IBabetteUnhasEntity {

	private static final long serialVersionUID = -2962664990798017591L;

	@EmbeddedId
	private ProfissionalServicoId id;
		
	@ManyToOne
	@JoinColumn(name = "SERVICO_ID", referencedColumnName = "SERVICO_ID")
	@MapsId("SERVICO_ID")
	private Servico servico;
	
	@ManyToOne
	@JoinColumn(name = "PROFISSIONAL_ID", referencedColumnName = "PROFISSIONAL_ID")
	@MapsId("PROFISSIONAL_ID")
	private Profissional profissional;
	
	@Column(name="PRECO")
	private BigDecimal preco;
	
	public ProfissionalServico() {
	}

	public Servico getServico() {
		return servico;
	}

	public void setServico(Servico servico) {
		this.servico = servico;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public ProfissionalServicoId getId() {
		return id;
	}

	public void setId(ProfissionalServicoId id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ServicosDosProfissionais [id=" + id + ", servico=" + servico
				+ ", profissional=" + profissional + ", preco=" + preco + "]";
	}
}
