package bean;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.Table;

@Entity
@Table(name="PROFISSIONAIS_ESTABELECIMENTOS")
public class ProfissionalEstabelecimento implements IBabetteUnhasEntity {

	private static final long serialVersionUID = -2962664990798017591L;

	@EmbeddedId
	private ProfissionalEstabelecimentoId id;
		
	@ManyToOne
	@JoinColumn(name = "ESTABELECIMENTO_ID", referencedColumnName = "ESTABELECIMENTO_ID")
	@MapsId("ESTABELECIMENTO_ID")
	private Estabelecimento estabelecimento;
	
	@ManyToOne
	@JoinColumn(name = "PROFISSIONAL_ID", referencedColumnName = "PROFISSIONAL_ID")
	@MapsId("PROFISSIONAL_ID")
	private Profissional profissional;
	
	public ProfissionalEstabelecimento() {
	}

	public Estabelecimento getEstabelecimento() {
		return estabelecimento;
	}

	public void setEstabelecimento(Estabelecimento estabelecimento) {
		this.estabelecimento = estabelecimento;
	}

	public Profissional getProfissional() {
		return profissional;
	}

	public void setProfissional(Profissional profissional) {
		this.profissional = profissional;
	}

	public ProfissionalEstabelecimentoId getId() {
		return id;
	}

	public void setId(ProfissionalEstabelecimentoId id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "ProfissionalEstabelecimento [id=" + id + ", estabelecimento="
				+ estabelecimento + ", profissional=" + profissional + "]";
	}

}
