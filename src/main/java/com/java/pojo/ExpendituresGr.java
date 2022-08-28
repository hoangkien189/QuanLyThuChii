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
@Table(name = "expenditures_gr")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ExpendituresGr.findAll", query = "SELECT e FROM ExpendituresGr e"),
    @NamedQuery(name = "ExpendituresGr.findById", query = "SELECT e FROM ExpendituresGr e WHERE e.id = :id"),
    @NamedQuery(name = "ExpendituresGr.findByStandbyState", query = "SELECT e FROM ExpendituresGr e WHERE e.standbyState = :standbyState")})
public class ExpendituresGr implements Serializable {

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
    @JoinColumn(name = "id_exp", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Expenditures idExp;
    @JoinColumn(name = "id_gr", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Group idGr;

    public ExpendituresGr() {
    }

    public ExpendituresGr(Integer id) {
        this.id = id;
    }

    public ExpendituresGr(Integer id, short standbyState) {
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

    public Expenditures getIdExp() {
        return idExp;
    }

    public void setIdExp(Expenditures idExp) {
        this.idExp = idExp;
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
        if (!(object instanceof ExpendituresGr)) {
            return false;
        }
        ExpendituresGr other = (ExpendituresGr) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.pojo.ExpendituresGr[ id=" + id + " ]";
    }
    
}
