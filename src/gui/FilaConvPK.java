/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gui;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author marcio.morando
 */
@Embeddable
public class FilaConvPK implements Serializable {
    @Basic(optional = false)
    @Column(name = "Maquina")
    private String maquina;
    @Basic(optional = false)
    @Column(name = "Ordem")
    private int ordem;

    public FilaConvPK() {
    }

    public FilaConvPK(String maquina, int ordem) {
        this.maquina = maquina;
        this.ordem = ordem;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        this.maquina = maquina;
    }

    public int getOrdem() {
        return ordem;
    }

    public void setOrdem(int ordem) {
        this.ordem = ordem;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maquina != null ? maquina.hashCode() : 0);
        hash += (int) ordem;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof FilaConvPK)) {
            return false;
        }
        FilaConvPK other = (FilaConvPK) object;
        if ((this.maquina == null && other.maquina != null) || (this.maquina != null && !this.maquina.equals(other.maquina))) {
            return false;
        }
        if (this.ordem != other.ordem) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.FilaConvPK[ maquina=" + maquina + ", ordem=" + ordem + " ]";
    }
    
}
