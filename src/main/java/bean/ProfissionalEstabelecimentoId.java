package bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProfissionalEstabelecimentoId implements Serializable{
	
	private static final long serialVersionUID = -3310824615579366466L;
	
	@Column(name="PROFISSIONAL_ID")
	private Long profissionalId;
	
	@Column(name="ESTABELECIMENTO_ID")
	private Long estabelecimentoId;

	public ProfissionalEstabelecimentoId(){}

	public Long getProfissionalId() {
		return profissionalId;
	}

	public void setProfissionalId(Long profissionalId) {
		this.profissionalId = profissionalId;
	}

	public Long getEstabelecimentoId() {
		return estabelecimentoId;
	}

	public void setEstabelecimentoId(Long estabelecimentoId) {
		this.estabelecimentoId = estabelecimentoId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime
				* result
				+ ((estabelecimentoId == null) ? 0 : estabelecimentoId
						.hashCode());
		result = prime * result
				+ ((profissionalId == null) ? 0 : profissionalId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		ProfissionalEstabelecimentoId other = (ProfissionalEstabelecimentoId) obj;
		if (estabelecimentoId == null) {
			if (other.estabelecimentoId != null)
				return false;
		} else if (!estabelecimentoId.equals(other.estabelecimentoId))
			return false;
		if (profissionalId == null) {
			if (other.profissionalId != null)
				return false;
		} else if (!profissionalId.equals(other.profissionalId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProfissionalEstabelecimentoId [profissionalId="
				+ profissionalId + ", estabelecimentoId=" + estabelecimentoId
				+ "]";
	}

}
