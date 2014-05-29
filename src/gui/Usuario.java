/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author marcio.morando
 */
@Entity
@Table(name = "usuario", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Usuario.findAll", query = "SELECT u FROM Usuario u"),
    @NamedQuery(name = "Usuario.findByUsuario", query = "SELECT u FROM Usuario u WHERE u.usuario = :usuario"),
    @NamedQuery(name = "Usuario.findByNome", query = "SELECT u FROM Usuario u WHERE u.nome = :nome"),
    @NamedQuery(name = "Usuario.findBySenha", query = "SELECT u FROM Usuario u WHERE u.senha = :senha"),
    @NamedQuery(name = "Usuario.findByNomeCompleto", query = "SELECT u FROM Usuario u WHERE u.nomeCompleto = :nomeCompleto"),
    @NamedQuery(name = "Usuario.findByMatricula", query = "SELECT u FROM Usuario u WHERE u.matricula = :matricula"),
    @NamedQuery(name = "Usuario.findByDepartamento", query = "SELECT u FROM Usuario u WHERE u.departamento = :departamento"),
    @NamedQuery(name = "Usuario.findByCargo", query = "SELECT u FROM Usuario u WHERE u.cargo = :cargo"),
    @NamedQuery(name = "Usuario.findByCodRepresentante", query = "SELECT u FROM Usuario u WHERE u.codRepresentante = :codRepresentante"),
    @NamedQuery(name = "Usuario.findByDataUltEntrada", query = "SELECT u FROM Usuario u WHERE u.dataUltEntrada = :dataUltEntrada"),
    @NamedQuery(name = "Usuario.findByDesativado", query = "SELECT u FROM Usuario u WHERE u.desativado = :desativado"),
    @NamedQuery(name = "Usuario.findByCpf", query = "SELECT u FROM Usuario u WHERE u.cpf = :cpf"),
    @NamedQuery(name = "Usuario.findByDataCriacao", query = "SELECT u FROM Usuario u WHERE u.dataCriacao = :dataCriacao")})
public class Usuario implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Usuario")
    private Integer usuario;
    @Basic(optional = false)
    @Column(name = "Nome")
    private String nome;
    @Column(name = "Senha")
    private String senha;
    @Column(name = "NomeCompleto")
    private String nomeCompleto;
    @Column(name = "Matricula")
    private String matricula;
    @Column(name = "Departamento")
    private String departamento;
    @Column(name = "Cargo")
    private String cargo;
    @Column(name = "CodRepresentante")
    private Integer codRepresentante;
    @Column(name = "DataUltEntrada")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataUltEntrada;
    @Column(name = "Desativado")
    private Short desativado;
    @Column(name = "CPF")
    private String cpf;
    @Column(name = "DataCriacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dataCriacao;

    public Usuario() {
    }

    public Usuario(Integer usuario) {
        this.usuario = usuario;
    }

    public Usuario(Integer usuario, String nome) {
        this.usuario = usuario;
        this.nome = nome;
    }

    public Integer getUsuario() {
        return usuario;
    }

    public void setUsuario(Integer usuario) {
        Integer oldUsuario = this.usuario;
        this.usuario = usuario;
        changeSupport.firePropertyChange("usuario", oldUsuario, usuario);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        String oldNome = this.nome;
        this.nome = nome;
        changeSupport.firePropertyChange("nome", oldNome, nome);
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        String oldSenha = this.senha;
        this.senha = senha;
        changeSupport.firePropertyChange("senha", oldSenha, senha);
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        String oldNomeCompleto = this.nomeCompleto;
        this.nomeCompleto = nomeCompleto;
        changeSupport.firePropertyChange("nomeCompleto", oldNomeCompleto, nomeCompleto);
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        String oldMatricula = this.matricula;
        this.matricula = matricula;
        changeSupport.firePropertyChange("matricula", oldMatricula, matricula);
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        String oldDepartamento = this.departamento;
        this.departamento = departamento;
        changeSupport.firePropertyChange("departamento", oldDepartamento, departamento);
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        String oldCargo = this.cargo;
        this.cargo = cargo;
        changeSupport.firePropertyChange("cargo", oldCargo, cargo);
    }

    public Integer getCodRepresentante() {
        return codRepresentante;
    }

    public void setCodRepresentante(Integer codRepresentante) {
        Integer oldCodRepresentante = this.codRepresentante;
        this.codRepresentante = codRepresentante;
        changeSupport.firePropertyChange("codRepresentante", oldCodRepresentante, codRepresentante);
    }

    public Date getDataUltEntrada() {
        return dataUltEntrada;
    }

    public void setDataUltEntrada(Date dataUltEntrada) {
        Date oldDataUltEntrada = this.dataUltEntrada;
        this.dataUltEntrada = dataUltEntrada;
        changeSupport.firePropertyChange("dataUltEntrada", oldDataUltEntrada, dataUltEntrada);
    }

    public Short getDesativado() {
        return desativado;
    }

    public void setDesativado(Short desativado) {
        Short oldDesativado = this.desativado;
        this.desativado = desativado;
        changeSupport.firePropertyChange("desativado", oldDesativado, desativado);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        String oldCpf = this.cpf;
        this.cpf = cpf;
        changeSupport.firePropertyChange("cpf", oldCpf, cpf);
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        Date oldDataCriacao = this.dataCriacao;
        this.dataCriacao = dataCriacao;
        changeSupport.firePropertyChange("dataCriacao", oldDataCriacao, dataCriacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (usuario != null ? usuario.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Usuario)) {
            return false;
        }
        Usuario other = (Usuario) object;
        if ((this.usuario == null && other.usuario != null) || (this.usuario != null && !this.usuario.equals(other.usuario))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Usuario[ usuario=" + usuario + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
