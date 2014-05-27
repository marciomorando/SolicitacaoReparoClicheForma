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
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
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
@Table(name = "filaConv", catalog = "TrimboxTeste", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "FilaConv.findAll", query = "SELECT f FROM FilaConv f"),
    @NamedQuery(name = "FilaConv.findByMaquina", query = "SELECT f FROM FilaConv f WHERE f.filaConvPK.maquina = :maquina"),
    @NamedQuery(name = "FilaConv.findByOrdem", query = "SELECT f FROM FilaConv f WHERE f.filaConvPK.ordem = :ordem"),
    @NamedQuery(name = "FilaConv.findByOp", query = "SELECT f FROM FilaConv f WHERE f.op = :op"),
    @NamedQuery(name = "FilaConv.findByPassagem", query = "SELECT f FROM FilaConv f WHERE f.passagem = :passagem"),
    @NamedQuery(name = "FilaConv.findByArranjoRoteiro", query = "SELECT f FROM FilaConv f WHERE f.arranjoRoteiro = :arranjoRoteiro"),
    @NamedQuery(name = "FilaConv.findByQuantidadeProgramada", query = "SELECT f FROM FilaConv f WHERE f.quantidadeProgramada = :quantidadeProgramada"),
    @NamedQuery(name = "FilaConv.findByDuracao", query = "SELECT f FROM FilaConv f WHERE f.duracao = :duracao"),
    @NamedQuery(name = "FilaConv.findByInicio", query = "SELECT f FROM FilaConv f WHERE f.inicio = :inicio"),
    @NamedQuery(name = "FilaConv.findByFim", query = "SELECT f FROM FilaConv f WHERE f.fim = :fim"),
    @NamedQuery(name = "FilaConv.findByProxMaquina", query = "SELECT f FROM FilaConv f WHERE f.proxMaquina = :proxMaquina"),
    @NamedQuery(name = "FilaConv.findByPaletizacao", query = "SELECT f FROM FilaConv f WHERE f.paletizacao = :paletizacao"),
    @NamedQuery(name = "FilaConv.findByObs", query = "SELECT f FROM FilaConv f WHERE f.obs = :obs"),
    @NamedQuery(name = "FilaConv.findByObs2", query = "SELECT f FROM FilaConv f WHERE f.obs2 = :obs2"),
    @NamedQuery(name = "FilaConv.findByEmitido", query = "SELECT f FROM FilaConv f WHERE f.emitido = :emitido"),
    @NamedQuery(name = "FilaConv.findByFimJobAntOF", query = "SELECT f FROM FilaConv f WHERE f.fimJobAntOF = :fimJobAntOF"),
    @NamedQuery(name = "FilaConv.findByStatus", query = "SELECT f FROM FilaConv f WHERE f.status = :status"),
    @NamedQuery(name = "FilaConv.findByBoletim", query = "SELECT f FROM FilaConv f WHERE f.boletim = :boletim")})
public class FilaConv implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected FilaConvPK filaConvPK;
    @Column(name = "OP")
    private String op;
    @Column(name = "Passagem")
    private Integer passagem;
    @Column(name = "ArranjoRoteiro")
    private Integer arranjoRoteiro;
    @Basic(optional = false)
    @Column(name = "QuantidadeProgramada")
    private int quantidadeProgramada;
    @Column(name = "Duracao")
    private Integer duracao;
    @Column(name = "Inicio")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicio;
    @Column(name = "Fim")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fim;
    @Column(name = "ProxMaquina")
    private String proxMaquina;
    @Column(name = "Paletizacao")
    private String paletizacao;
    @Column(name = "Obs")
    private String obs;
    @Column(name = "Obs2")
    private String obs2;
    @Column(name = "Emitido")
    private Short emitido;
    @Column(name = "FimJobAntOF")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fimJobAntOF;
    @Basic(optional = false)
    @Column(name = "Status")
    private int status;
    @Column(name = "Boletim")
    private String boletim;

    public FilaConv() {
    }

    public FilaConv(FilaConvPK filaConvPK) {
        this.filaConvPK = filaConvPK;
    }

    public FilaConv(FilaConvPK filaConvPK, int quantidadeProgramada, int status) {
        this.filaConvPK = filaConvPK;
        this.quantidadeProgramada = quantidadeProgramada;
        this.status = status;
    }

    public FilaConv(String maquina, int ordem) {
        this.filaConvPK = new FilaConvPK(maquina, ordem);
    }

    public FilaConvPK getFilaConvPK() {
        return filaConvPK;
    }

    public void setFilaConvPK(FilaConvPK filaConvPK) {
        this.filaConvPK = filaConvPK;
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        String oldOp = this.op;
        this.op = op;
        changeSupport.firePropertyChange("op", oldOp, op);
    }

    public Integer getPassagem() {
        return passagem;
    }

    public void setPassagem(Integer passagem) {
        Integer oldPassagem = this.passagem;
        this.passagem = passagem;
        changeSupport.firePropertyChange("passagem", oldPassagem, passagem);
    }

    public Integer getArranjoRoteiro() {
        return arranjoRoteiro;
    }

    public void setArranjoRoteiro(Integer arranjoRoteiro) {
        Integer oldArranjoRoteiro = this.arranjoRoteiro;
        this.arranjoRoteiro = arranjoRoteiro;
        changeSupport.firePropertyChange("arranjoRoteiro", oldArranjoRoteiro, arranjoRoteiro);
    }

    public int getQuantidadeProgramada() {
        return quantidadeProgramada;
    }

    public void setQuantidadeProgramada(int quantidadeProgramada) {
        int oldQuantidadeProgramada = this.quantidadeProgramada;
        this.quantidadeProgramada = quantidadeProgramada;
        changeSupport.firePropertyChange("quantidadeProgramada", oldQuantidadeProgramada, quantidadeProgramada);
    }

    public Integer getDuracao() {
        return duracao;
    }

    public void setDuracao(Integer duracao) {
        Integer oldDuracao = this.duracao;
        this.duracao = duracao;
        changeSupport.firePropertyChange("duracao", oldDuracao, duracao);
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        Date oldInicio = this.inicio;
        this.inicio = inicio;
        changeSupport.firePropertyChange("inicio", oldInicio, inicio);
    }

    public Date getFim() {
        return fim;
    }

    public void setFim(Date fim) {
        Date oldFim = this.fim;
        this.fim = fim;
        changeSupport.firePropertyChange("fim", oldFim, fim);
    }

    public String getProxMaquina() {
        return proxMaquina;
    }

    public void setProxMaquina(String proxMaquina) {
        String oldProxMaquina = this.proxMaquina;
        this.proxMaquina = proxMaquina;
        changeSupport.firePropertyChange("proxMaquina", oldProxMaquina, proxMaquina);
    }

    public String getPaletizacao() {
        return paletizacao;
    }

    public void setPaletizacao(String paletizacao) {
        String oldPaletizacao = this.paletizacao;
        this.paletizacao = paletizacao;
        changeSupport.firePropertyChange("paletizacao", oldPaletizacao, paletizacao);
    }

    public String getObs() {
        return obs;
    }

    public void setObs(String obs) {
        String oldObs = this.obs;
        this.obs = obs;
        changeSupport.firePropertyChange("obs", oldObs, obs);
    }

    public String getObs2() {
        return obs2;
    }

    public void setObs2(String obs2) {
        String oldObs2 = this.obs2;
        this.obs2 = obs2;
        changeSupport.firePropertyChange("obs2", oldObs2, obs2);
    }

    public Short getEmitido() {
        return emitido;
    }

    public void setEmitido(Short emitido) {
        Short oldEmitido = this.emitido;
        this.emitido = emitido;
        changeSupport.firePropertyChange("emitido", oldEmitido, emitido);
    }

    public Date getFimJobAntOF() {
        return fimJobAntOF;
    }

    public void setFimJobAntOF(Date fimJobAntOF) {
        Date oldFimJobAntOF = this.fimJobAntOF;
        this.fimJobAntOF = fimJobAntOF;
        changeSupport.firePropertyChange("fimJobAntOF", oldFimJobAntOF, fimJobAntOF);
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        int oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getBoletim() {
        return boletim;
    }

    public void setBoletim(String boletim) {
        String oldBoletim = this.boletim;
        this.boletim = boletim;
        changeSupport.firePropertyChange("boletim", oldBoletim, boletim);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (filaConvPK != null ? filaConvPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilaConv)) {
            return false;
        }
        FilaConv other = (FilaConv) object;
        if ((this.filaConvPK == null && other.filaConvPK != null) || (this.filaConvPK != null && !this.filaConvPK.equals(other.filaConvPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.FilaConv[ filaConvPK=" + filaConvPK + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
