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
@Table(name = "SOPASTA_StatusCliche", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "SOPASTAStatusCliche.findAll", query = "SELECT s FROM SOPASTAStatusCliche s"),
    @NamedQuery(name = "SOPASTAStatusCliche.findById", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.id = :id"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByTipoMaterial", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.tipoMaterial = :tipoMaterial"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByCliche", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.cliche = :cliche"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByStatus", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.status = :status"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByDataAlteracao", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.dataAlteracao = :dataAlteracao"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByHoraAlteracao", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.horaAlteracao = :horaAlteracao"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByObsAlteracao", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.obsAlteracao = :obsAlteracao"),
     @NamedQuery(name = "SOPASTAStatusCliche.findByObsRetorno", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.obsRetorno = :obsRetorno"),
    @NamedQuery(name = "SOPASTAStatusCliche.findByHost", query = "SELECT s FROM SOPASTAStatusCliche s WHERE s.host = :host")})
public class SOPASTAStatusCliche implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "TipoMaterial")
    private String tipoMaterial;
    @Column(name = "Cliche")
    private String cliche;
    @Column(name = "Status")
    private Character status;
    @Column(name = "DataAlteracao")
    @Temporal(TemporalType.DATE)
    private Date dataAlteracao;
    @Column(name = "HoraAlteracao")
    @Temporal(TemporalType.TIMESTAMP)
    private Date horaAlteracao;
    @Column(name = "ObsAlteracao")
    private String obsAlteracao;
    @Column(name = "ObsRetorno")
    private String obsRetorno;
    @Column(name = "Host")
    private String host;

    public SOPASTAStatusCliche() {
    }

    public SOPASTAStatusCliche(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        Integer oldId = this.id;
        this.id = id;
        changeSupport.firePropertyChange("id", oldId, id);
    }

    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setTipoMaterial(String tipoMaterial) {
        String oldTipoMaterial = this.tipoMaterial;
        this.tipoMaterial = tipoMaterial;
        changeSupport.firePropertyChange("tipoMaterial", oldTipoMaterial, tipoMaterial);
    }

    public String getCliche() {
        return cliche;
    }

    public void setCliche(String cliche) {
        String oldCliche = this.cliche;
        this.cliche = cliche;
        changeSupport.firePropertyChange("cliche", oldCliche, cliche);
    }

    public Character getStatus() {
        return status;
    }

    public void setStatus(Character status) {
        Character oldStatus = this.status;
        this.status = status;
        changeSupport.firePropertyChange("status", oldStatus, status);
    }

    public Date getDataAlteracao() {
        return dataAlteracao;
    }

    public void setDataAlteracao(Date dataAlteracao) {
        Date oldDataAlteracao = this.dataAlteracao;
        this.dataAlteracao = dataAlteracao;
        changeSupport.firePropertyChange("dataAlteracao", oldDataAlteracao, dataAlteracao);
    }

    public Date getHoraAlteracao() {
        return horaAlteracao;
    }

    public void setHoraAlteracao(Date horaAlteracao) {
        Date oldHoraAlteracao = this.horaAlteracao;
        this.horaAlteracao = horaAlteracao;
        changeSupport.firePropertyChange("horaAlteracao", oldHoraAlteracao, horaAlteracao);
    }

    public String getObsAlteracao() {
        return obsAlteracao;
    }

    public void setObsAlteracao(String obsAlteracao) {
        String oldObsAlteracao = this.obsAlteracao;
        this.obsAlteracao = obsAlteracao;
        changeSupport.firePropertyChange("obsAlteracao", oldObsAlteracao, obsAlteracao);
    }
    
    
     public String getObsRetorno() {
        return obsRetorno;
    }

    public void setObsRetorno(String obsRetorno) {
        String oldObsRetorno = this.obsRetorno;
        this.obsRetorno = obsRetorno;
        changeSupport.firePropertyChange("obsRetorno", oldObsRetorno, obsRetorno);
    }
    
    
    
    
    
    
    
    

    public String getHost() {
        
        return host;
    }

    public void setHost(String host) {
        String oldHost = this.host;
        this.host = host;
        changeSupport.firePropertyChange("host", oldHost, host);
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
        if (!(object instanceof SOPASTAStatusCliche)) {
            return false;
        }
        SOPASTAStatusCliche other = (SOPASTAStatusCliche) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.SOPASTAStatusCliche[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
