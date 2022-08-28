/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.pojo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "earnings_gr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "EarningsGr.findAll", query = "SELECT e FROM EarningsGr e"),
    @NamedQuery(name = "EarningsGr.findById", query = "SELECT e FROM EarningsGr e WHERE e.id = :id"),
    @NamedQuery(name = "EarningsGr.findByStandbyState", query = "SELECT e FROM EarningsGr e WHERE e.standbyState = :standbyState")})
public class EarningsGr implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "standby_state")
    private short standbyState;
    @JoinColumn(name = "id_ear", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Earnings idEar;
    @JoinColumn(name = "id_gr", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Group idGr;

    public EarningsGr() {
    }

    public EarningsGr(Integer id) {
        this.id = id;
    }

    public EarningsGr(Integer id, short standbyState) {
        this.id = id;
        this.standbyState = standbyState;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public short getStandbyState() {
        return standbyState;
    }

    public void setStandbyState(short standbyState) {
        this.standbyState = standbyState;
    }

    public Earnings getIdEar() {
        return idEar;
    }

    public void setIdEar(Earnings idEar) {
        this.idEar = idEar;
    }

    public Group getIdGr() {
        return idGr;
    }

    public void setIdGr(Group idGr) {
        this.idGr = idGr;
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
        if (!(object instanceof EarningsGr)) {
            return false;
        }
        EarningsGr other = (EarningsGr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.pojo.EarningsGr[ id=" + id + " ]";
    }
    
}
