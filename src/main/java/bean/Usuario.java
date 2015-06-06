package bean;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="USUARIOS")
public class Usuario implements IBabetteUnhasEntity,IPedePizzaEntity{

	private static final long serialVersionUID = -5945305443634905264L;

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USUARIO_ID")
	private Long id;
		
	@Embedded
	private Endereco endereco;
	
	@Column(name = "NOME")
	private String nomeUsuario;
	
	@Column(name = "URL_FOTO")
	private String urlFoto;
	
	public Usuario(){}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public String getNomeUsuario() {
		return nomeUsuario;
	}

	public void setNomeUsuario(String nomeUsuario) {
		this.nomeUsuario = nomeUsuario;
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
		return "Usuario [id=" + id + ", endereco=" + endereco
				+ ", nomeUsuario=" + nomeUsuario + ", urlFoto=" + urlFoto + "]";
	}	
}
