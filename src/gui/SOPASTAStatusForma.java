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
@Table(name = "SOPASTA_StatusForma", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "SOPASTAStatusForma.findAll", query = "SELECT s FROM SOPASTAStatusForma s"),
    @NamedQuery(name = "SOPASTAStatusForma.findById", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.id = :id"),
    @NamedQuery(name = "SOPASTAStatusForma.findByTipoMaterial", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.tipoMaterial = :tipoMaterial"),
    @NamedQuery(name = "SOPASTAStatusForma.findByForma", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.forma = :forma"),
    @NamedQuery(name = "SOPASTAStatusForma.findByStatus", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.status = :status"),
    @NamedQuery(name = "SOPASTAStatusForma.findByDataAlteracao", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.dataAlteracao = :dataAlteracao"),
    @NamedQuery(name = "SOPASTAStatusForma.findByHoraAlteracao", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.horaAlteracao = :horaAlteracao"),
    @NamedQuery(name = "SOPASTAStatusForma.findByObsAlteracao", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.obsAlteracao = :obsAlteracao"),
    @NamedQuery(name = "SOPASTAStatusForma.findByObsRetorno", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.obsRetorno = :obsRetorno"),
    @NamedQuery(name = "SOPASTAStatusForma.findByHost", query = "SELECT s FROM SOPASTAStatusForma s WHERE s.host = :host")})
public class SOPASTAStatusForma implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Id")
    private Integer id;
    @Column(name = "TipoMaterial")
    private String tipoMaterial;
    @Column(name = "Forma")
    private String forma;
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

    public SOPASTAStatusForma() {
    }

    public SOPASTAStatusForma(Integer id) {
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

    public String getForma() {
        return forma;
    }

    public void setForma(String forma) {
        String oldForma = this.forma;
        this.forma = forma;
        changeSupport.firePropertyChange("forma", oldForma, forma);
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
        if (!(object instanceof SOPASTAStatusForma)) {
            return false;
        }
        SOPASTAStatusForma other = (SOPASTAStatusForma) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.SOPASTAStatusForma[ id=" + id + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
