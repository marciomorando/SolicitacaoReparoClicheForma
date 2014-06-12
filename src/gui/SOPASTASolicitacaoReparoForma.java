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
@Entity
@Table(name = "SOPASTA_SolicitacaoReparoForma", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findAll", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findById", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.id = :id"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByForma", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.forma = :forma"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByMaquina", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.maquina = :maquina"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByOp", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.op = :op"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByDataEntregaPedido", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.dataEntregaPedido = :dataEntregaPedido"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByDataRetornoCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.dataRetornoCliche = :dataRetornoCliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByHoraRetornoCliche", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.horaRetornoCliche = :horaRetornoCliche"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByCausa", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.causa = :causa"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByObservacao", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.observacao = :observacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByStatus", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.status = :status"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByHostMicro", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.hostMicro = :hostMicro"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByIpMicro", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.ipMicro = :ipMicro"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByDataCriacao", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.dataCriacao = :dataCriacao"),
    @NamedQuery(name = "SOPASTASolicitacaoReparoForma.findByHoraCriacao", query = "SELECT s FROM SOPASTASolicitacaoReparoForma s WHERE s.horaCriacao = :horaCriacao")})
public class SOPASTASolicitacaoReparoForma implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "Forma")
    private String forma;
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

    public SOPASTASolicitacaoReparoForma() {
    }

    public SOPASTASolicitacaoReparoForma(Integer id) {
        this.id = id;
    }

    public SOPASTASolicitacaoReparoForma(Integer id, String maquina, String causa, String observacao) {
        this.id = id;
        this.maquina = maquina;
        this.causa = causa;
        this.observacao = observacao;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        String oldForma = this.forma;
        this.forma = forma;
        changeSupport.firePropertyChange("forma", oldForma, forma);
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
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof SOPASTASolicitacaoReparoForma)) {
            return false;
        }
        SOPASTASolicitacaoReparoForma other = (SOPASTASolicitacaoReparoForma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.SOPASTASolicitacaoReparoForma[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
