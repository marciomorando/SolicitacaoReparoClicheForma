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
@Table(name = "Maquina", catalog = "Trimbox", schema = "dbo")
@NamedQueries({
    @NamedQuery(name = "Maquina.findAll", query = "SELECT m FROM Maquina m"),
    @NamedQuery(name = "Maquina.findByMaquina", query = "SELECT m FROM Maquina m WHERE m.maquina = :maquina"),
    @NamedQuery(name = "Maquina.findByNomeMaquina", query = "SELECT m FROM Maquina m WHERE m.nomeMaquina = :nomeMaquina"),
    @NamedQuery(name = "Maquina.findByTipo", query = "SELECT m FROM Maquina m WHERE m.tipo = :tipo"),
    @NamedQuery(name = "Maquina.findByFacoes", query = "SELECT m FROM Maquina m WHERE m.facoes = :facoes"),
    @NamedQuery(name = "Maquina.findByLargUtilMax", query = "SELECT m FROM Maquina m WHERE m.largUtilMax = :largUtilMax"),
    @NamedQuery(name = "Maquina.findByLargMinChapa", query = "SELECT m FROM Maquina m WHERE m.largMinChapa = :largMinChapa"),
    @NamedQuery(name = "Maquina.findByLargMaxChapa", query = "SELECT m FROM Maquina m WHERE m.largMaxChapa = :largMaxChapa"),
    @NamedQuery(name = "Maquina.findByCompMinChapa", query = "SELECT m FROM Maquina m WHERE m.compMinChapa = :compMinChapa"),
    @NamedQuery(name = "Maquina.findByCompMaxChapa", query = "SELECT m FROM Maquina m WHERE m.compMaxChapa = :compMaxChapa"),
    @NamedQuery(name = "Maquina.findByRefiloMin", query = "SELECT m FROM Maquina m WHERE m.refiloMin = :refiloMin"),
    @NamedQuery(name = "Maquina.findByRefiloMax", query = "SELECT m FROM Maquina m WHERE m.refiloMax = :refiloMax"),
    @NamedQuery(name = "Maquina.findByFacas", query = "SELECT m FROM Maquina m WHERE m.facas = :facas"),
    @NamedQuery(name = "Maquina.findByVincos", query = "SELECT m FROM Maquina m WHERE m.vincos = :vincos"),
    @NamedQuery(name = "Maquina.findByResinaInterna", query = "SELECT m FROM Maquina m WHERE m.resinaInterna = :resinaInterna"),
    @NamedQuery(name = "Maquina.findByResinaExterna", query = "SELECT m FROM Maquina m WHERE m.resinaExterna = :resinaExterna"),
    @NamedQuery(name = "Maquina.findByEndurecedorMiolo", query = "SELECT m FROM Maquina m WHERE m.endurecedorMiolo = :endurecedorMiolo"),
    @NamedQuery(name = "Maquina.findByRotacaoMaxima", query = "SELECT m FROM Maquina m WHERE m.rotacaoMaxima = :rotacaoMaxima"),
    @NamedQuery(name = "Maquina.findByLargMinFacao", query = "SELECT m FROM Maquina m WHERE m.largMinFacao = :largMinFacao"),
    @NamedQuery(name = "Maquina.findByCustoHora", query = "SELECT m FROM Maquina m WHERE m.custoHora = :custoHora"),
    @NamedQuery(name = "Maquina.findByCustoHoraFixo", query = "SELECT m FROM Maquina m WHERE m.custoHoraFixo = :custoHoraFixo"),
    @NamedQuery(name = "Maquina.findByCustoMetro", query = "SELECT m FROM Maquina m WHERE m.custoMetro = :custoMetro"),
    @NamedQuery(name = "Maquina.findByCustoMetroFixo", query = "SELECT m FROM Maquina m WHERE m.custoMetroFixo = :custoMetroFixo"),
    @NamedQuery(name = "Maquina.findByCustoMetroQuad", query = "SELECT m FROM Maquina m WHERE m.custoMetroQuad = :custoMetroQuad"),
    @NamedQuery(name = "Maquina.findByCustoMetroQuadFixo", query = "SELECT m FROM Maquina m WHERE m.custoMetroQuadFixo = :custoMetroQuadFixo"),
    @NamedQuery(name = "Maquina.findByCustoKg", query = "SELECT m FROM Maquina m WHERE m.custoKg = :custoKg"),
    @NamedQuery(name = "Maquina.findByCustoKgFixo", query = "SELECT m FROM Maquina m WHERE m.custoKgFixo = :custoKgFixo"),
    @NamedQuery(name = "Maquina.findByCustoSetup", query = "SELECT m FROM Maquina m WHERE m.custoSetup = :custoSetup"),
    @NamedQuery(name = "Maquina.findByFormatoPadrao", query = "SELECT m FROM Maquina m WHERE m.formatoPadrao = :formatoPadrao"),
    @NamedQuery(name = "Maquina.findByCompMinimoFormato", query = "SELECT m FROM Maquina m WHERE m.compMinimoFormato = :compMinimoFormato"),
    @NamedQuery(name = "Maquina.findByUnidProdutividade", query = "SELECT m FROM Maquina m WHERE m.unidProdutividade = :unidProdutividade"),
    @NamedQuery(name = "Maquina.findBySetup", query = "SELECT m FROM Maquina m WHERE m.setup = :setup"),
    @NamedQuery(name = "Maquina.findByProdM2", query = "SELECT m FROM Maquina m WHERE m.prodM2 = :prodM2"),
    @NamedQuery(name = "Maquina.findByProdBatidas", query = "SELECT m FROM Maquina m WHERE m.prodBatidas = :prodBatidas"),
    @NamedQuery(name = "Maquina.findByProdKg", query = "SELECT m FROM Maquina m WHERE m.prodKg = :prodKg"),
    @NamedQuery(name = "Maquina.findByProdChapa", query = "SELECT m FROM Maquina m WHERE m.prodChapa = :prodChapa"),
    @NamedQuery(name = "Maquina.findByHomensTurma", query = "SELECT m FROM Maquina m WHERE m.homensTurma = :homensTurma"),
    @NamedQuery(name = "Maquina.findByCargaMaquina", query = "SELECT m FROM Maquina m WHERE m.cargaMaquina = :cargaMaquina"),
    @NamedQuery(name = "Maquina.findByGantt", query = "SELECT m FROM Maquina m WHERE m.gantt = :gantt"),
    @NamedQuery(name = "Maquina.findByHorasDia", query = "SELECT m FROM Maquina m WHERE m.horasDia = :horasDia"),
    @NamedQuery(name = "Maquina.findByHorasSabado", query = "SELECT m FROM Maquina m WHERE m.horasSabado = :horasSabado"),
    @NamedQuery(name = "Maquina.findByHorasDomingo", query = "SELECT m FROM Maquina m WHERE m.horasDomingo = :horasDomingo"),
    @NamedQuery(name = "Maquina.findByNrDeCores", query = "SELECT m FROM Maquina m WHERE m.nrDeCores = :nrDeCores"),
    @NamedQuery(name = "Maquina.findByLogGantt", query = "SELECT m FROM Maquina m WHERE m.logGantt = :logGantt"),
    @NamedQuery(name = "Maquina.findByCompMinConj", query = "SELECT m FROM Maquina m WHERE m.compMinConj = :compMinConj"),
    @NamedQuery(name = "Maquina.findByIDGrupoMaquina", query = "SELECT m FROM Maquina m WHERE m.iDGrupoMaquina = :iDGrupoMaquina"),
    @NamedQuery(name = "Maquina.findByProdutividadePadrao", query = "SELECT m FROM Maquina m WHERE m.produtividadePadrao = :produtividadePadrao"),
    @NamedQuery(name = "Maquina.findByEficienciaPadrao", query = "SELECT m FROM Maquina m WHERE m.eficienciaPadrao = :eficienciaPadrao"),
    @NamedQuery(name = "Maquina.findByLimiteMaxProdutiv", query = "SELECT m FROM Maquina m WHERE m.limiteMaxProdutiv = :limiteMaxProdutiv"),
    @NamedQuery(name = "Maquina.findByLimiteMinProdutiv", query = "SELECT m FROM Maquina m WHERE m.limiteMinProdutiv = :limiteMinProdutiv"),
    @NamedQuery(name = "Maquina.findByTarefaAtual", query = "SELECT m FROM Maquina m WHERE m.tarefaAtual = :tarefaAtual"),
    @NamedQuery(name = "Maquina.findByInicioTarefaAtual", query = "SELECT m FROM Maquina m WHERE m.inicioTarefaAtual = :inicioTarefaAtual"),
    @NamedQuery(name = "Maquina.findByFimPrevTarefaAtual", query = "SELECT m FROM Maquina m WHERE m.fimPrevTarefaAtual = :fimPrevTarefaAtual"),
    @NamedQuery(name = "Maquina.findByParadaAtual", query = "SELECT m FROM Maquina m WHERE m.paradaAtual = :paradaAtual"),
    @NamedQuery(name = "Maquina.findByInicioParadaAtual", query = "SELECT m FROM Maquina m WHERE m.inicioParadaAtual = :inicioParadaAtual"),
    @NamedQuery(name = "Maquina.findByFimPrevParadaAtual", query = "SELECT m FROM Maquina m WHERE m.fimPrevParadaAtual = :fimPrevParadaAtual"),
    @NamedQuery(name = "Maquina.findByCor", query = "SELECT m FROM Maquina m WHERE m.cor = :cor"),
    @NamedQuery(name = "Maquina.findByCoordX", query = "SELECT m FROM Maquina m WHERE m.coordX = :coordX"),
    @NamedQuery(name = "Maquina.findByCoordY", query = "SELECT m FROM Maquina m WHERE m.coordY = :coordY"),
    @NamedQuery(name = "Maquina.findByLargDesenho", query = "SELECT m FROM Maquina m WHERE m.largDesenho = :largDesenho"),
    @NamedQuery(name = "Maquina.findByAlturaDesenho", query = "SELECT m FROM Maquina m WHERE m.alturaDesenho = :alturaDesenho"),
    @NamedQuery(name = "Maquina.findByProgramarProducao", query = "SELECT m FROM Maquina m WHERE m.programarProducao = :programarProducao"),
    @NamedQuery(name = "Maquina.findByDesativada", query = "SELECT m FROM Maquina m WHERE m.desativada = :desativada"),
    @NamedQuery(name = "Maquina.findByCodigoERP", query = "SELECT m FROM Maquina m WHERE m.codigoERP = :codigoERP"),
    @NamedQuery(name = "Maquina.findByInicioDia", query = "SELECT m FROM Maquina m WHERE m.inicioDia = :inicioDia"),
    @NamedQuery(name = "Maquina.findByPerdaLimiteAviso", query = "SELECT m FROM Maquina m WHERE m.perdaLimiteAviso = :perdaLimiteAviso"),
    @NamedQuery(name = "Maquina.findByUnidadeApontConjugacao", query = "SELECT m FROM Maquina m WHERE m.unidadeApontConjugacao = :unidadeApontConjugacao"),
    @NamedQuery(name = "Maquina.findByTestePorBoletim", query = "SELECT m FROM Maquina m WHERE m.testePorBoletim = :testePorBoletim"),
    @NamedQuery(name = "Maquina.findByIdJornada", query = "SELECT m FROM Maquina m WHERE m.idJornada = :idJornada")})
public class Maquina implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @Column(name = "Maquina")
    private String maquina;
    @Column(name = "NomeMaquina")
    private String nomeMaquina;
    @Basic(optional = false)
    @Column(name = "Tipo")
    private int tipo;
    @Basic(optional = false)
    @Column(name = "Facoes")
    private int facoes;
    @Column(name = "LargUtilMax")
    private Integer largUtilMax;
    @Column(name = "LargMinChapa")
    private Integer largMinChapa;
    @Column(name = "LargMaxChapa")
    private Integer largMaxChapa;
    @Column(name = "CompMinChapa")
    private Integer compMinChapa;
    @Column(name = "CompMaxChapa")
    private Integer compMaxChapa;
    @Column(name = "RefiloMin")
    private Integer refiloMin;
    @Column(name = "RefiloMax")
    private Integer refiloMax;
    @Column(name = "Facas")
    private Integer facas;
    @Column(name = "Vincos")
    private Integer vincos;
    @Column(name = "ResinaInterna")
    private Short resinaInterna;
    @Column(name = "ResinaExterna")
    private Short resinaExterna;
    @Column(name = "EndurecedorMiolo")
    private Integer endurecedorMiolo;
    // @Max(value=?)  @Min(value=?)//if you know range of your decimal fields consider using these annotations to enforce field validation
    @Column(name = "RotacaoMaxima")
    private Double rotacaoMaxima;
    @Column(name = "LargMinFacao")
    private Integer largMinFacao;
    @Column(name = "CustoHora")
    private Double custoHora;
    @Column(name = "CustoHoraFixo")
    private Double custoHoraFixo;
    @Column(name = "CustoMetro")
    private Double custoMetro;
    @Column(name = "CustoMetroFixo")
    private Double custoMetroFixo;
    @Column(name = "CustoMetroQuad")
    private Double custoMetroQuad;
    @Column(name = "CustoMetroQuadFixo")
    private Double custoMetroQuadFixo;
    @Column(name = "CustoKg")
    private Double custoKg;
    @Column(name = "CustoKgFixo")
    private Double custoKgFixo;
    @Column(name = "CustoSetup")
    private Double custoSetup;
    @Column(name = "FormatoPadrao")
    private Integer formatoPadrao;
    @Column(name = "CompMinimoFormato")
    private Integer compMinimoFormato;
    @Column(name = "UnidProdutividade")
    private Short unidProdutividade;
    @Basic(optional = false)
    @Column(name = "Setup")
    private int setup;
    @Basic(optional = false)
    @Column(name = "ProdM2")
    private int prodM2;
    @Basic(optional = false)
    @Column(name = "ProdBatidas")
    private int prodBatidas;
    @Basic(optional = false)
    @Column(name = "ProdKg")
    private int prodKg;
    @Basic(optional = false)
    @Column(name = "ProdChapa")
    private int prodChapa;
    @Column(name = "HomensTurma")
    private Integer homensTurma;
    @Column(name = "CargaMaquina")
    private Short cargaMaquina;
    @Column(name = "Gantt")
    private Short gantt;
    @Column(name = "HorasDia")
    private Double horasDia;
    @Column(name = "HorasSabado")
    private Double horasSabado;
    @Column(name = "HorasDomingo")
    private Double horasDomingo;
    @Column(name = "NrDeCores")
    private Integer nrDeCores;
    @Column(name = "LogGantt")
    private Short logGantt;
    @Column(name = "CompMinConj")
    private Integer compMinConj;
    @Column(name = "IDGrupoMaquina")
    private Integer iDGrupoMaquina;
    @Column(name = "ProdutividadePadrao")
    private Integer produtividadePadrao;
    @Column(name = "EficienciaPadrao")
    private Integer eficienciaPadrao;
    @Basic(optional = false)
    @Column(name = "LimiteMaxProdutiv")
    private int limiteMaxProdutiv;
    @Basic(optional = false)
    @Column(name = "LimiteMinProdutiv")
    private int limiteMinProdutiv;
    @Column(name = "TarefaAtual")
    private String tarefaAtual;
    @Column(name = "InicioTarefaAtual")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicioTarefaAtual;
    @Column(name = "FimPrevTarefaAtual")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fimPrevTarefaAtual;
    @Column(name = "ParadaAtual")
    private Integer paradaAtual;
    @Column(name = "InicioParadaAtual")
    @Temporal(TemporalType.TIMESTAMP)
    private Date inicioParadaAtual;
    @Column(name = "FimPrevParadaAtual")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fimPrevParadaAtual;
    @Basic(optional = false)
    @Column(name = "Cor")
    private int cor;
    @Basic(optional = false)
    @Column(name = "CoordX")
    private int coordX;
    @Basic(optional = false)
    @Column(name = "CoordY")
    private int coordY;
    @Basic(optional = false)
    @Column(name = "LargDesenho")
    private int largDesenho;
    @Basic(optional = false)
    @Column(name = "AlturaDesenho")
    private int alturaDesenho;
    @Basic(optional = false)
    @Column(name = "ProgramarProducao")
    private boolean programarProducao;
    @Basic(optional = false)
    @Column(name = "Desativada")
    private short desativada;
    @Column(name = "CodigoERP")
    private String codigoERP;
    @Column(name = "InicioDia")
    private Integer inicioDia;
    @Basic(optional = false)
    @Column(name = "PerdaLimiteAviso")
    private int perdaLimiteAviso;
    @Basic(optional = false)
    @Column(name = "UnidadeApontConjugacao")
    private int unidadeApontConjugacao;
    @Basic(optional = false)
    @Column(name = "TestePorBoletim")
    private int testePorBoletim;
    @Column(name = "idJornada")
    private Integer idJornada;

    public Maquina() {
    }

    public Maquina(String maquina) {
        this.maquina = maquina;
    }

    public Maquina(String maquina, int tipo, int facoes, int setup, int prodM2, int prodBatidas, int prodKg, int prodChapa, int limiteMaxProdutiv, int limiteMinProdutiv, int cor, int coordX, int coordY, int largDesenho, int alturaDesenho, boolean programarProducao, short desativada, int perdaLimiteAviso, int unidadeApontConjugacao, int testePorBoletim) {
        this.maquina = maquina;
        this.tipo = tipo;
        this.facoes = facoes;
        this.setup = setup;
        this.prodM2 = prodM2;
        this.prodBatidas = prodBatidas;
        this.prodKg = prodKg;
        this.prodChapa = prodChapa;
        this.limiteMaxProdutiv = limiteMaxProdutiv;
        this.limiteMinProdutiv = limiteMinProdutiv;
        this.cor = cor;
        this.coordX = coordX;
        this.coordY = coordY;
        this.largDesenho = largDesenho;
        this.alturaDesenho = alturaDesenho;
        this.programarProducao = programarProducao;
        this.desativada = desativada;
        this.perdaLimiteAviso = perdaLimiteAviso;
        this.unidadeApontConjugacao = unidadeApontConjugacao;
        this.testePorBoletim = testePorBoletim;
    }

    public String getMaquina() {
        return maquina;
    }

    public void setMaquina(String maquina) {
        String oldMaquina = this.maquina;
        this.maquina = maquina;
        changeSupport.firePropertyChange("maquina", oldMaquina, maquina);
    }

    public String getNomeMaquina() {
        return nomeMaquina;
    }

    public void setNomeMaquina(String nomeMaquina) {
        String oldNomeMaquina = this.nomeMaquina;
        this.nomeMaquina = nomeMaquina;
        changeSupport.firePropertyChange("nomeMaquina", oldNomeMaquina, nomeMaquina);
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        int oldTipo = this.tipo;
        this.tipo = tipo;
        changeSupport.firePropertyChange("tipo", oldTipo, tipo);
    }

    public int getFacoes() {
        return facoes;
    }

    public void setFacoes(int facoes) {
        int oldFacoes = this.facoes;
        this.facoes = facoes;
        changeSupport.firePropertyChange("facoes", oldFacoes, facoes);
    }

    public Integer getLargUtilMax() {
        return largUtilMax;
    }

    public void setLargUtilMax(Integer largUtilMax) {
        Integer oldLargUtilMax = this.largUtilMax;
        this.largUtilMax = largUtilMax;
        changeSupport.firePropertyChange("largUtilMax", oldLargUtilMax, largUtilMax);
    }

    public Integer getLargMinChapa() {
        return largMinChapa;
    }

    public void setLargMinChapa(Integer largMinChapa) {
        Integer oldLargMinChapa = this.largMinChapa;
        this.largMinChapa = largMinChapa;
        changeSupport.firePropertyChange("largMinChapa", oldLargMinChapa, largMinChapa);
    }

    public Integer getLargMaxChapa() {
        return largMaxChapa;
    }

    public void setLargMaxChapa(Integer largMaxChapa) {
        Integer oldLargMaxChapa = this.largMaxChapa;
        this.largMaxChapa = largMaxChapa;
        changeSupport.firePropertyChange("largMaxChapa", oldLargMaxChapa, largMaxChapa);
    }

    public Integer getCompMinChapa() {
        return compMinChapa;
    }

    public void setCompMinChapa(Integer compMinChapa) {
        Integer oldCompMinChapa = this.compMinChapa;
        this.compMinChapa = compMinChapa;
        changeSupport.firePropertyChange("compMinChapa", oldCompMinChapa, compMinChapa);
    }

    public Integer getCompMaxChapa() {
        return compMaxChapa;
    }

    public void setCompMaxChapa(Integer compMaxChapa) {
        Integer oldCompMaxChapa = this.compMaxChapa;
        this.compMaxChapa = compMaxChapa;
        changeSupport.firePropertyChange("compMaxChapa", oldCompMaxChapa, compMaxChapa);
    }

    public Integer getRefiloMin() {
        return refiloMin;
    }

    public void setRefiloMin(Integer refiloMin) {
        Integer oldRefiloMin = this.refiloMin;
        this.refiloMin = refiloMin;
        changeSupport.firePropertyChange("refiloMin", oldRefiloMin, refiloMin);
    }

    public Integer getRefiloMax() {
        return refiloMax;
    }

    public void setRefiloMax(Integer refiloMax) {
        Integer oldRefiloMax = this.refiloMax;
        this.refiloMax = refiloMax;
        changeSupport.firePropertyChange("refiloMax", oldRefiloMax, refiloMax);
    }

    public Integer getFacas() {
        return facas;
    }

    public void setFacas(Integer facas) {
        Integer oldFacas = this.facas;
        this.facas = facas;
        changeSupport.firePropertyChange("facas", oldFacas, facas);
    }

    public Integer getVincos() {
        return vincos;
    }

    public void setVincos(Integer vincos) {
        Integer oldVincos = this.vincos;
        this.vincos = vincos;
        changeSupport.firePropertyChange("vincos", oldVincos, vincos);
    }

    public Short getResinaInterna() {
        return resinaInterna;
    }

    public void setResinaInterna(Short resinaInterna) {
        Short oldResinaInterna = this.resinaInterna;
        this.resinaInterna = resinaInterna;
        changeSupport.firePropertyChange("resinaInterna", oldResinaInterna, resinaInterna);
    }

    public Short getResinaExterna() {
        return resinaExterna;
    }

    public void setResinaExterna(Short resinaExterna) {
        Short oldResinaExterna = this.resinaExterna;
        this.resinaExterna = resinaExterna;
        changeSupport.firePropertyChange("resinaExterna", oldResinaExterna, resinaExterna);
    }

    public Integer getEndurecedorMiolo() {
        return endurecedorMiolo;
    }

    public void setEndurecedorMiolo(Integer endurecedorMiolo) {
        Integer oldEndurecedorMiolo = this.endurecedorMiolo;
        this.endurecedorMiolo = endurecedorMiolo;
        changeSupport.firePropertyChange("endurecedorMiolo", oldEndurecedorMiolo, endurecedorMiolo);
    }

    public Double getRotacaoMaxima() {
        return rotacaoMaxima;
    }

    public void setRotacaoMaxima(Double rotacaoMaxima) {
        Double oldRotacaoMaxima = this.rotacaoMaxima;
        this.rotacaoMaxima = rotacaoMaxima;
        changeSupport.firePropertyChange("rotacaoMaxima", oldRotacaoMaxima, rotacaoMaxima);
    }

    public Integer getLargMinFacao() {
        return largMinFacao;
    }

    public void setLargMinFacao(Integer largMinFacao) {
        Integer oldLargMinFacao = this.largMinFacao;
        this.largMinFacao = largMinFacao;
        changeSupport.firePropertyChange("largMinFacao", oldLargMinFacao, largMinFacao);
    }

    public Double getCustoHora() {
        return custoHora;
    }

    public void setCustoHora(Double custoHora) {
        Double oldCustoHora = this.custoHora;
        this.custoHora = custoHora;
        changeSupport.firePropertyChange("custoHora", oldCustoHora, custoHora);
    }

    public Double getCustoHoraFixo() {
        return custoHoraFixo;
    }

    public void setCustoHoraFixo(Double custoHoraFixo) {
        Double oldCustoHoraFixo = this.custoHoraFixo;
        this.custoHoraFixo = custoHoraFixo;
        changeSupport.firePropertyChange("custoHoraFixo", oldCustoHoraFixo, custoHoraFixo);
    }

    public Double getCustoMetro() {
        return custoMetro;
    }

    public void setCustoMetro(Double custoMetro) {
        Double oldCustoMetro = this.custoMetro;
        this.custoMetro = custoMetro;
        changeSupport.firePropertyChange("custoMetro", oldCustoMetro, custoMetro);
    }

    public Double getCustoMetroFixo() {
        return custoMetroFixo;
    }

    public void setCustoMetroFixo(Double custoMetroFixo) {
        Double oldCustoMetroFixo = this.custoMetroFixo;
        this.custoMetroFixo = custoMetroFixo;
        changeSupport.firePropertyChange("custoMetroFixo", oldCustoMetroFixo, custoMetroFixo);
    }

    public Double getCustoMetroQuad() {
        return custoMetroQuad;
    }

    public void setCustoMetroQuad(Double custoMetroQuad) {
        Double oldCustoMetroQuad = this.custoMetroQuad;
        this.custoMetroQuad = custoMetroQuad;
        changeSupport.firePropertyChange("custoMetroQuad", oldCustoMetroQuad, custoMetroQuad);
    }

    public Double getCustoMetroQuadFixo() {
        return custoMetroQuadFixo;
    }

    public void setCustoMetroQuadFixo(Double custoMetroQuadFixo) {
        Double oldCustoMetroQuadFixo = this.custoMetroQuadFixo;
        this.custoMetroQuadFixo = custoMetroQuadFixo;
        changeSupport.firePropertyChange("custoMetroQuadFixo", oldCustoMetroQuadFixo, custoMetroQuadFixo);
    }

    public Double getCustoKg() {
        return custoKg;
    }

    public void setCustoKg(Double custoKg) {
        Double oldCustoKg = this.custoKg;
        this.custoKg = custoKg;
        changeSupport.firePropertyChange("custoKg", oldCustoKg, custoKg);
    }

    public Double getCustoKgFixo() {
        return custoKgFixo;
    }

    public void setCustoKgFixo(Double custoKgFixo) {
        Double oldCustoKgFixo = this.custoKgFixo;
        this.custoKgFixo = custoKgFixo;
        changeSupport.firePropertyChange("custoKgFixo", oldCustoKgFixo, custoKgFixo);
    }

    public Double getCustoSetup() {
        return custoSetup;
    }

    public void setCustoSetup(Double custoSetup) {
        Double oldCustoSetup = this.custoSetup;
        this.custoSetup = custoSetup;
        changeSupport.firePropertyChange("custoSetup", oldCustoSetup, custoSetup);
    }

    public Integer getFormatoPadrao() {
        return formatoPadrao;
    }

    public void setFormatoPadrao(Integer formatoPadrao) {
        Integer oldFormatoPadrao = this.formatoPadrao;
        this.formatoPadrao = formatoPadrao;
        changeSupport.firePropertyChange("formatoPadrao", oldFormatoPadrao, formatoPadrao);
    }

    public Integer getCompMinimoFormato() {
        return compMinimoFormato;
    }

    public void setCompMinimoFormato(Integer compMinimoFormato) {
        Integer oldCompMinimoFormato = this.compMinimoFormato;
        this.compMinimoFormato = compMinimoFormato;
        changeSupport.firePropertyChange("compMinimoFormato", oldCompMinimoFormato, compMinimoFormato);
    }

    public Short getUnidProdutividade() {
        return unidProdutividade;
    }

    public void setUnidProdutividade(Short unidProdutividade) {
        Short oldUnidProdutividade = this.unidProdutividade;
        this.unidProdutividade = unidProdutividade;
        changeSupport.firePropertyChange("unidProdutividade", oldUnidProdutividade, unidProdutividade);
    }

    public int getSetup() {
        return setup;
    }

    public void setSetup(int setup) {
        int oldSetup = this.setup;
        this.setup = setup;
        changeSupport.firePropertyChange("setup", oldSetup, setup);
    }

    public int getProdM2() {
        return prodM2;
    }

    public void setProdM2(int prodM2) {
        int oldProdM2 = this.prodM2;
        this.prodM2 = prodM2;
        changeSupport.firePropertyChange("prodM2", oldProdM2, prodM2);
    }

    public int getProdBatidas() {
        return prodBatidas;
    }

    public void setProdBatidas(int prodBatidas) {
        int oldProdBatidas = this.prodBatidas;
        this.prodBatidas = prodBatidas;
        changeSupport.firePropertyChange("prodBatidas", oldProdBatidas, prodBatidas);
    }

    public int getProdKg() {
        return prodKg;
    }

    public void setProdKg(int prodKg) {
        int oldProdKg = this.prodKg;
        this.prodKg = prodKg;
        changeSupport.firePropertyChange("prodKg", oldProdKg, prodKg);
    }

    public int getProdChapa() {
        return prodChapa;
    }

    public void setProdChapa(int prodChapa) {
        int oldProdChapa = this.prodChapa;
        this.prodChapa = prodChapa;
        changeSupport.firePropertyChange("prodChapa", oldProdChapa, prodChapa);
    }

    public Integer getHomensTurma() {
        return homensTurma;
    }

    public void setHomensTurma(Integer homensTurma) {
        Integer oldHomensTurma = this.homensTurma;
        this.homensTurma = homensTurma;
        changeSupport.firePropertyChange("homensTurma", oldHomensTurma, homensTurma);
    }

    public Short getCargaMaquina() {
        return cargaMaquina;
    }

    public void setCargaMaquina(Short cargaMaquina) {
        Short oldCargaMaquina = this.cargaMaquina;
        this.cargaMaquina = cargaMaquina;
        changeSupport.firePropertyChange("cargaMaquina", oldCargaMaquina, cargaMaquina);
    }

    public Short getGantt() {
        return gantt;
    }

    public void setGantt(Short gantt) {
        Short oldGantt = this.gantt;
        this.gantt = gantt;
        changeSupport.firePropertyChange("gantt", oldGantt, gantt);
    }

    public Double getHorasDia() {
        return horasDia;
    }

    public void setHorasDia(Double horasDia) {
        Double oldHorasDia = this.horasDia;
        this.horasDia = horasDia;
        changeSupport.firePropertyChange("horasDia", oldHorasDia, horasDia);
    }

    public Double getHorasSabado() {
        return horasSabado;
    }

    public void setHorasSabado(Double horasSabado) {
        Double oldHorasSabado = this.horasSabado;
        this.horasSabado = horasSabado;
        changeSupport.firePropertyChange("horasSabado", oldHorasSabado, horasSabado);
    }

    public Double getHorasDomingo() {
        return horasDomingo;
    }

    public void setHorasDomingo(Double horasDomingo) {
        Double oldHorasDomingo = this.horasDomingo;
        this.horasDomingo = horasDomingo;
        changeSupport.firePropertyChange("horasDomingo", oldHorasDomingo, horasDomingo);
    }

    public Integer getNrDeCores() {
        return nrDeCores;
    }

    public void setNrDeCores(Integer nrDeCores) {
        Integer oldNrDeCores = this.nrDeCores;
        this.nrDeCores = nrDeCores;
        changeSupport.firePropertyChange("nrDeCores", oldNrDeCores, nrDeCores);
    }

    public Short getLogGantt() {
        return logGantt;
    }

    public void setLogGantt(Short logGantt) {
        Short oldLogGantt = this.logGantt;
        this.logGantt = logGantt;
        changeSupport.firePropertyChange("logGantt", oldLogGantt, logGantt);
    }

    public Integer getCompMinConj() {
        return compMinConj;
    }

    public void setCompMinConj(Integer compMinConj) {
        Integer oldCompMinConj = this.compMinConj;
        this.compMinConj = compMinConj;
        changeSupport.firePropertyChange("compMinConj", oldCompMinConj, compMinConj);
    }

    public Integer getIDGrupoMaquina() {
        return iDGrupoMaquina;
    }

    public void setIDGrupoMaquina(Integer iDGrupoMaquina) {
        Integer oldIDGrupoMaquina = this.iDGrupoMaquina;
        this.iDGrupoMaquina = iDGrupoMaquina;
        changeSupport.firePropertyChange("IDGrupoMaquina", oldIDGrupoMaquina, iDGrupoMaquina);
    }

    public Integer getProdutividadePadrao() {
        return produtividadePadrao;
    }

    public void setProdutividadePadrao(Integer produtividadePadrao) {
        Integer oldProdutividadePadrao = this.produtividadePadrao;
        this.produtividadePadrao = produtividadePadrao;
        changeSupport.firePropertyChange("produtividadePadrao", oldProdutividadePadrao, produtividadePadrao);
    }

    public Integer getEficienciaPadrao() {
        return eficienciaPadrao;
    }

    public void setEficienciaPadrao(Integer eficienciaPadrao) {
        Integer oldEficienciaPadrao = this.eficienciaPadrao;
        this.eficienciaPadrao = eficienciaPadrao;
        changeSupport.firePropertyChange("eficienciaPadrao", oldEficienciaPadrao, eficienciaPadrao);
    }

    public int getLimiteMaxProdutiv() {
        return limiteMaxProdutiv;
    }

    public void setLimiteMaxProdutiv(int limiteMaxProdutiv) {
        int oldLimiteMaxProdutiv = this.limiteMaxProdutiv;
        this.limiteMaxProdutiv = limiteMaxProdutiv;
        changeSupport.firePropertyChange("limiteMaxProdutiv", oldLimiteMaxProdutiv, limiteMaxProdutiv);
    }

    public int getLimiteMinProdutiv() {
        return limiteMinProdutiv;
    }

    public void setLimiteMinProdutiv(int limiteMinProdutiv) {
        int oldLimiteMinProdutiv = this.limiteMinProdutiv;
        this.limiteMinProdutiv = limiteMinProdutiv;
        changeSupport.firePropertyChange("limiteMinProdutiv", oldLimiteMinProdutiv, limiteMinProdutiv);
    }

    public String getTarefaAtual() {
        return tarefaAtual;
    }

    public void setTarefaAtual(String tarefaAtual) {
        String oldTarefaAtual = this.tarefaAtual;
        this.tarefaAtual = tarefaAtual;
        changeSupport.firePropertyChange("tarefaAtual", oldTarefaAtual, tarefaAtual);
    }

    public Date getInicioTarefaAtual() {
        return inicioTarefaAtual;
    }

    public void setInicioTarefaAtual(Date inicioTarefaAtual) {
        Date oldInicioTarefaAtual = this.inicioTarefaAtual;
        this.inicioTarefaAtual = inicioTarefaAtual;
        changeSupport.firePropertyChange("inicioTarefaAtual", oldInicioTarefaAtual, inicioTarefaAtual);
    }

    public Date getFimPrevTarefaAtual() {
        return fimPrevTarefaAtual;
    }

    public void setFimPrevTarefaAtual(Date fimPrevTarefaAtual) {
        Date oldFimPrevTarefaAtual = this.fimPrevTarefaAtual;
        this.fimPrevTarefaAtual = fimPrevTarefaAtual;
        changeSupport.firePropertyChange("fimPrevTarefaAtual", oldFimPrevTarefaAtual, fimPrevTarefaAtual);
    }

    public Integer getParadaAtual() {
        return paradaAtual;
    }

    public void setParadaAtual(Integer paradaAtual) {
        Integer oldParadaAtual = this.paradaAtual;
        this.paradaAtual = paradaAtual;
        changeSupport.firePropertyChange("paradaAtual", oldParadaAtual, paradaAtual);
    }

    public Date getInicioParadaAtual() {
        return inicioParadaAtual;
    }

    public void setInicioParadaAtual(Date inicioParadaAtual) {
        Date oldInicioParadaAtual = this.inicioParadaAtual;
        this.inicioParadaAtual = inicioParadaAtual;
        changeSupport.firePropertyChange("inicioParadaAtual", oldInicioParadaAtual, inicioParadaAtual);
    }

    public Date getFimPrevParadaAtual() {
        return fimPrevParadaAtual;
    }

    public void setFimPrevParadaAtual(Date fimPrevParadaAtual) {
        Date oldFimPrevParadaAtual = this.fimPrevParadaAtual;
        this.fimPrevParadaAtual = fimPrevParadaAtual;
        changeSupport.firePropertyChange("fimPrevParadaAtual", oldFimPrevParadaAtual, fimPrevParadaAtual);
    }

    public int getCor() {
        return cor;
    }

    public void setCor(int cor) {
        int oldCor = this.cor;
        this.cor = cor;
        changeSupport.firePropertyChange("cor", oldCor, cor);
    }

    public int getCoordX() {
        return coordX;
    }

    public void setCoordX(int coordX) {
        int oldCoordX = this.coordX;
        this.coordX = coordX;
        changeSupport.firePropertyChange("coordX", oldCoordX, coordX);
    }

    public int getCoordY() {
        return coordY;
    }

    public void setCoordY(int coordY) {
        int oldCoordY = this.coordY;
        this.coordY = coordY;
        changeSupport.firePropertyChange("coordY", oldCoordY, coordY);
    }

    public int getLargDesenho() {
        return largDesenho;
    }

    public void setLargDesenho(int largDesenho) {
        int oldLargDesenho = this.largDesenho;
        this.largDesenho = largDesenho;
        changeSupport.firePropertyChange("largDesenho", oldLargDesenho, largDesenho);
    }

    public int getAlturaDesenho() {
        return alturaDesenho;
    }

    public void setAlturaDesenho(int alturaDesenho) {
        int oldAlturaDesenho = this.alturaDesenho;
        this.alturaDesenho = alturaDesenho;
        changeSupport.firePropertyChange("alturaDesenho", oldAlturaDesenho, alturaDesenho);
    }

    public boolean getProgramarProducao() {
        return programarProducao;
    }

    public void setProgramarProducao(boolean programarProducao) {
        boolean oldProgramarProducao = this.programarProducao;
        this.programarProducao = programarProducao;
        changeSupport.firePropertyChange("programarProducao", oldProgramarProducao, programarProducao);
    }

    public short getDesativada() {
        return desativada;
    }

    public void setDesativada(short desativada) {
        short oldDesativada = this.desativada;
        this.desativada = desativada;
        changeSupport.firePropertyChange("desativada", oldDesativada, desativada);
    }

    public String getCodigoERP() {
        return codigoERP;
    }

    public void setCodigoERP(String codigoERP) {
        String oldCodigoERP = this.codigoERP;
        this.codigoERP = codigoERP;
        changeSupport.firePropertyChange("codigoERP", oldCodigoERP, codigoERP);
    }

    public Integer getInicioDia() {
        return inicioDia;
    }

    public void setInicioDia(Integer inicioDia) {
        Integer oldInicioDia = this.inicioDia;
        this.inicioDia = inicioDia;
        changeSupport.firePropertyChange("inicioDia", oldInicioDia, inicioDia);
    }

    public int getPerdaLimiteAviso() {
        return perdaLimiteAviso;
    }

    public void setPerdaLimiteAviso(int perdaLimiteAviso) {
        int oldPerdaLimiteAviso = this.perdaLimiteAviso;
        this.perdaLimiteAviso = perdaLimiteAviso;
        changeSupport.firePropertyChange("perdaLimiteAviso", oldPerdaLimiteAviso, perdaLimiteAviso);
    }

    public int getUnidadeApontConjugacao() {
        return unidadeApontConjugacao;
    }

    public void setUnidadeApontConjugacao(int unidadeApontConjugacao) {
        int oldUnidadeApontConjugacao = this.unidadeApontConjugacao;
        this.unidadeApontConjugacao = unidadeApontConjugacao;
        changeSupport.firePropertyChange("unidadeApontConjugacao", oldUnidadeApontConjugacao, unidadeApontConjugacao);
    }

    public int getTestePorBoletim() {
        return testePorBoletim;
    }

    public void setTestePorBoletim(int testePorBoletim) {
        int oldTestePorBoletim = this.testePorBoletim;
        this.testePorBoletim = testePorBoletim;
        changeSupport.firePropertyChange("testePorBoletim", oldTestePorBoletim, testePorBoletim);
    }

    public Integer getIdJornada() {
        return idJornada;
    }

    public void setIdJornada(Integer idJornada) {
        Integer oldIdJornada = this.idJornada;
        this.idJornada = idJornada;
        changeSupport.firePropertyChange("idJornada", oldIdJornada, idJornada);
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (maquina != null ? maquina.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Maquina)) {
            return false;
        }
        Maquina other = (Maquina) object;
        if ((this.maquina == null && other.maquina != null) || (this.maquina != null && !this.maquina.equals(other.maquina))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "gui.Maquina[ maquina=" + maquina + " ]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }
    
}
