package bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Embeddable;

@Embeddable
public class ProfissionalServicoId implements Serializable{
	
	private static final long serialVersionUID = -3310824615579366466L;
	
	@Column(name="SERVICO_ID")
	private Long servicoId;
	
	@Column(name="PROFISSIONAL_ID")
	private Long profissionalId;

	public ProfissionalServicoId(){}

	public Long getServicoId() {
		return servicoId;
	}

	public void setServicoId(Long servicoId) {
		this.servicoId = servicoId;
	}

	public Long getProfissionalId() {
		return profissionalId;
	}

	public void setProfissionalId(Long profissionalId) {
		this.profissionalId = profissionalId;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result
				+ ((profissionalId == null) ? 0 : profissionalId.hashCode());
		result = prime * result
				+ ((servicoId == null) ? 0 : servicoId.hashCode());
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
		ProfissionalServicoId other = (ProfissionalServicoId) obj;
		if (profissionalId == null) {
			if (other.profissionalId != null)
				return false;
		} else if (!profissionalId.equals(other.profissionalId))
			return false;
		if (servicoId == null) {
			if (other.servicoId != null)
				return false;
		} else if (!servicoId.equals(other.servicoId))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ProfissionalServicoId [servicoId=" + servicoId
				+ ", profissionalId=" + profissionalId + "]";
	}
}
