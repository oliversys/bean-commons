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
	@Column(name="USUARIO_ID")
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
		
	@Embedded
	private Endereco endereco;
	
	@Column(name = "NOME")
	private String nomeUsuario;
	
	@Column(name = "URL_FOTO")
	private String urlFoto;
	
	@Column(name = "DATA_NASCIMENTO")
	private String dataNascimento;
	         
	@Column(name = "EMAIL")
    private String email;
   
	@Column(name = "SEXO")
    private Character sexo;
    
	@Column(name = "FACEBOOK_ID")
    private String facebookId;
	
	public Usuario(){}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Character getSexo() {
		return sexo;
	}

	public void setSexo(Character sexo) {
		this.sexo = sexo;
	}

	public String getFacebookId() {
		return facebookId;
	}

	public void setFacebookId(String facebookId) {
		this.facebookId = facebookId;
	}

	public void setId(Long id) {
		this.id = id;
	}

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
				+ ", nomeUsuario=" + nomeUsuario + ", urlFoto=" + urlFoto
				+ ", dataNascimento=" + dataNascimento + ", email=" + email 
				+ ", sexo=" + sexo + ", facebookId="
				+ facebookId + "]";
	}

}
