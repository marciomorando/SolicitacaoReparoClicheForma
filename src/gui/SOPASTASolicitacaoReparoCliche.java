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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
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
/*@Entity
@Table(name = "SOPASTA_SolicitacaoReparoCliche", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findAll", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s"),
   
 
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.cliche = :cliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByMaquina", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.maquina = :maquina"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByOp", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.op = :op"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByDataEntregaPedido", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.dataEntregaPedido = :dataEntregaPedido"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByDataRetornoCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.dataRetornoCliche = :dataRetornoCliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByHoraRetornoCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.horaRetornoCliche = :horaRetornoCliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByCausa", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.causa = :causa"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByObservacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.observacao = :observacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByStatus", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.status = :status"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByHostMicro", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.hostMicro = :hostMicro"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByIpMicro", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.ipMicro = :ipMicro"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByDataCriacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByHoraCriacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.horaCriacao = :horaCriacao")})
public class SOPASTASolicitacaoReparoCliche implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
   
    @Column(name = "Cliche")
    private String cliche;
    @Basic(optional = false)
    @Column(name = "Maquina")
    private String maquina;
    @Column(name = "OP")
    private String op;
    @Column(name = "DataEntregaPedido")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaPedido;
    @Column(name = "DataRetornoCliche")
    @Temporal(TemporalType.DATE)
    private Date dataRetornoCliche;
    @Column(name = "HoraRetornoCliche")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaRetornoCliche;
    @Basic(optional = false)
    @Column(name = "Causa")
    private String causa;
    @Basic(optional = false)
    @Column(name = "Observacao")
    private String observacao;
    @Column(name = "Status")
    private String status;
    @Column(name = "HostMicro")
    private String hostMicro;
    @Column(name = "IpMicro")
    private String ipMicro;
    @Column(name = "DataCriacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Column(name = "HoraCriacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCriacao;

    public SOPASTASolicitacaoReparoCliche() {
    }

   

    public SOPASTASolicitacaoReparoCliche(Integer solicitacao, String maquina, String causa, String observacao) {
        
        this.maquina = maquina;
        this.causa = causa;
        this.observacao = observacao;
    }

  
    

    public String getCliche() {
        return cliche;
    }

    public void setCliche(String cliche) {
        String oldCliche = this.cliche;
        this.cliche = cliche;
        changeSupport.firePropertyChange("cliche", oldCliche, cliche);
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        String oldMaquina = this.maquina;
        this.maquina = maquina;
        changeSupport.firePropertyChange("maquina", oldMaquina, maquina);
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        String oldOp = this.op;
        this.op = op;
        changeSupport.firePropertyChange("op", oldOp, op);
    }

    public Date getDataEntregaPedido() {
        return dataEntregaPedido;
    }

    public void setDataEntregaPedido(Date dataEntregaPedido) {
        Date oldDataEntregaPedido = this.dataEntregaPedido;
        this.dataEntregaPedido = dataEntregaPedido;
        changeSupport.firePropertyChange("dataEntregaPedido", oldDataEntregaPedido, dataEntregaPedido);
    }

    public Date getDataRetornoCliche() {
        return dataRetornoCliche;
    }

    public void setDataRetornoCliche(Date dataRetornoCliche) {
        Date oldDataRetornoCliche = this.dataRetornoCliche;
        this.dataRetornoCliche = dataRetornoCliche;
        changeSupport.firePropertyChange("dataRetornoCliche", oldDataRetornoCliche, dataRetornoCliche);
    }

    public Date getHoraRetornoCliche() {
        return horaRetornoCliche;
    }

    public void setHoraRetornoCliche(Date horaRetornoCliche) {
        Date oldHoraRetornoCliche = this.horaRetornoCliche;
        this.horaRetornoCliche = horaRetornoCliche;
        changeSupport.firePropertyChange("horaRetornoCliche", oldHoraRetornoCliche, horaRetornoCliche);
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        String oldCausa = this.causa;
        this.causa = causa;
        changeSupport.firePropertyChange("causa", oldCausa, causa);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getHostMicro() {
        return hostMicro;
    }

    public void setHostMicro(String hostMicro) {
        String oldHostMicro = this.hostMicro;
        this.hostMicro = hostMicro;
        changeSupport.firePropertyChange("hostMicro", oldHostMicro, hostMicro);
    }

    public String getIpMicro() {
        return ipMicro;
    }

    public void setIpMicro(String ipMicro) {
        String oldIpMicro = this.ipMicro;
        this.ipMicro = ipMicro;
        changeSupport.firePropertyChange("ipMicro", oldIpMicro, ipMicro);
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        Date oldDataCriacao = this.dataCriacao;
        this.dataCriacao = dataCriacao;
        changeSupport.firePropertyChange("dataCriacao", oldDataCriacao, dataCriacao);
    }

    public Date getHoraCriacao() {
        return horaCriacao;
    }

    public void setHoraCriacao(Date horaCriacao) {
        Date oldHoraCriacao = this.horaCriacao;
        this.horaCriacao = horaCriacao;
        changeSupport.firePropertyChange("horaCriacao", oldHoraCriacao, horaCriacao);
    }

   


  

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}*/


@Entity
@Table(name = "SOPASTA_SolicitacaoReparoCliche", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findAll", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findBySolicitacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.solicitacao = :solicitacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.cliche = :cliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByMaquina", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.maquina = :maquina"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByOp", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.op = :op"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByDataEntregaPedido", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.dataEntregaPedido = :dataEntregaPedido"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByDataRetornoCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.dataRetornoCliche = :dataRetornoCliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByHoraRetornoCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.horaRetornoCliche = :horaRetornoCliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByCausa", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.causa = :causa"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByObservacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.observacao = :observacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByStatus", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.status = :status"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByHostMicro", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.hostMicro = :hostMicro"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByIpMicro", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.ipMicro = :ipMicro"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByDataCriacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoCliche.findByHoraCriacao", query = "SELECT s FROM SOPASTASolicitacaoReparoCliche s WHERE s.horaCriacao = :horaCriacao")})
public class SOPASTASolicitacaoReparoCliche implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Solicitacao")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer solicitacao;
    @Column(name = "Cliche")
    private String cliche;
    @Basic(optional = false)
    @Column(name = "Maquina")
    private String maquina;
    @Column(name = "OP")
    private String op;
    @Column(name = "DataEntregaPedido")
    @Temporal(TemporalType.DATE)
    private Date dataEntregaPedido;
    @Column(name = "DataRetornoCliche")
    @Temporal(TemporalType.DATE)
    private Date dataRetornoCliche;
    @Column(name = "HoraRetornoCliche")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaRetornoCliche;
    @Basic(optional = false)
    @Column(name = "Causa")
    private String causa;
    @Basic(optional = false)
    @Column(name = "Observacao")
    private String observacao;
    @Column(name = "Status")
    private String status;
    @Column(name = "HostMicro")
    private String hostMicro;
    @Column(name = "IpMicro")
    private String ipMicro;
    @Column(name = "DataCriacao")
    @Temporal(TemporalType.DATE)
    private Date dataCriacao;
    @Column(name = "HoraCriacao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaCriacao;

    public SOPASTASolicitacaoReparoCliche() {
    }

    public SOPASTASolicitacaoReparoCliche(Integer solicitacao) {
        this.solicitacao = solicitacao;
    }

    public SOPASTASolicitacaoReparoCliche(Integer solicitacao, String maquina, String causa, String observacao) {
        this.solicitacao = solicitacao;
        this.maquina = maquina;
        this.causa = causa;
        this.observacao = observacao;
    }

    public Integer getSolicitacao() {
        return solicitacao;
    }

    public void setSolicitacao(Integer solicitacao) {
        Integer oldSolicitacao = this.solicitacao;
        this.solicitacao = solicitacao;
        changeSupport.firePropertyChange("solicitacao", oldSolicitacao, solicitacao);
    }

    public String getCliche() {
        return cliche;
    }

    public void setCliche(String cliche) {
        String oldCliche = this.cliche;
        this.cliche = cliche;
        changeSupport.firePropertyChange("cliche", oldCliche, cliche);
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        String oldMaquina = this.maquina;
        this.maquina = maquina;
        changeSupport.firePropertyChange("maquina", oldMaquina, maquina);
    }

    public String getOp() {
        return op;
    }

    public void setOp(String op) {
        String oldOp = this.op;
        this.op = op;
        changeSupport.firePropertyChange("op", oldOp, op);
    }

    public Date getDataEntregaPedido() {
        return dataEntregaPedido;
    }

    public void setDataEntregaPedido(Date dataEntregaPedido) {
        Date oldDataEntregaPedido = this.dataEntregaPedido;
        this.dataEntregaPedido = dataEntregaPedido;
        changeSupport.firePropertyChange("dataEntregaPedido", oldDataEntregaPedido, dataEntregaPedido);
    }

    public Date getDataRetornoCliche() {
        return dataRetornoCliche;
    }

    public void setDataRetornoCliche(Date dataRetornoCliche) {
        Date oldDataRetornoCliche = this.dataRetornoCliche;
        this.dataRetornoCliche = dataRetornoCliche;
        changeSupport.firePropertyChange("dataRetornoCliche", oldDataRetornoCliche, dataRetornoCliche);
    }

    public Date getHoraRetornoCliche() {
        return horaRetornoCliche;
    }

    public void setHoraRetornoCliche(Date horaRetornoCliche) {
        Date oldHoraRetornoCliche = this.horaRetornoCliche;
        this.horaRetornoCliche = horaRetornoCliche;
        changeSupport.firePropertyChange("horaRetornoCliche", oldHoraRetornoCliche, horaRetornoCliche);
    }

    public String getCausa() {
        return causa;
    }

    public void setCausa(String causa) {
        String oldCausa = this.causa;
        this.causa = causa;
        changeSupport.firePropertyChange("causa", oldCausa, causa);
    }

    public String getObservacao() {
        return observacao;
    }

    public void setObservacao(String observacao) {
        String oldObservacao = this.observacao;
        this.observacao = observacao;
        changeSupport.firePropertyChange("observacao", oldObservacao, observacao);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        String oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public String getHostMicro() {
        return hostMicro;
    }

    public void setHostMicro(String hostMicro) {
        String oldHostMicro = this.hostMicro;
        this.hostMicro = hostMicro;
        changeSupport.firePropertyChange("hostMicro", oldHostMicro, hostMicro);
    }

    public String getIpMicro() {
        return ipMicro;
    }

    public void setIpMicro(String ipMicro) {
        String oldIpMicro = this.ipMicro;
        this.ipMicro = ipMicro;
        changeSupport.firePropertyChange("ipMicro", oldIpMicro, ipMicro);
    }

    public Date getDataCriacao() {
        return dataCriacao;
    }

    public void setDataCriacao(Date dataCriacao) {
        Date oldDataCriacao = this.dataCriacao;
        this.dataCriacao = dataCriacao;
        changeSupport.firePropertyChange("dataCriacao", oldDataCriacao, dataCriacao);
    }

    public Date getHoraCriacao() {
        return horaCriacao;
    }

    public void setHoraCriacao(Date horaCriacao) {
        Date oldHoraCriacao = this.horaCriacao;
        this.horaCriacao = horaCriacao;
        changeSupport.firePropertyChange("horaCriacao", oldHoraCriacao, horaCriacao);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (solicitacao != null ? solicitacao.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SOPASTASolicitacaoReparoCliche)) {
            return false;
        }
        SOPASTASolicitacaoReparoCliche other = (SOPASTASolicitacaoReparoCliche) object;
        if ((this.solicitacao == null && other.solicitacao != null) || (this.solicitacao != null && !this.solicitacao.equals(other.solicitacao))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.SOPASTASolicitacaoReparoCliche[ solicitacao=" + solicitacao + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
