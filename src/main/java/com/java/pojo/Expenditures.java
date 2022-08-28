/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.pojo;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "expenditures")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Expenditures.findAll", query = "SELECT e FROM Expenditures e"),
    @NamedQuery(name = "Expenditures.findById", query = "SELECT e FROM Expenditures e WHERE e.id = :id"),
    @NamedQuery(name = "Expenditures.findByTime", query = "SELECT e FROM Expenditures e WHERE e.time = :time"),
    @NamedQuery(name = "Expenditures.findByCurrency", query = "SELECT e FROM Expenditures e WHERE e.currency = :currency"),
    @NamedQuery(name = "Expenditures.findByDetails", query = "SELECT e FROM Expenditures e WHERE e.details = :details")})
public class Expenditures implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "time")
    @Temporal(TemporalType.TIMESTAMP)
    private Date time;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currency")
    private long currency;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "details")
    private String details;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idExp")
    private Set<ExpendituresGr> expendituresGrSet;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User idUser;

    public Expenditures() {
    }

    public Expenditures(Integer id) {
        this.id = id;
    }

    public Expenditures(Integer id, Date time, long currency, String details) {
        this.id = id;
        this.time = time;
        this.currency = currency;
        this.details = details;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public long getCurrency() {
        return currency;
    }

    public void setCurrency(long currency) {
        this.currency = currency;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    @XmlTransient
    public Set<ExpendituresGr> getExpendituresGrSet() {
        return expendituresGrSet;
    }

    public void setExpendituresGrSet(Set<ExpendituresGr> expendituresGrSet) {
        this.expendituresGrSet = expendituresGrSet;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
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
        if (!(object instanceof Expenditures)) {
            return false;
        }
        Expenditures other = (Expenditures) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.pojo.Expenditures[ id=" + id + " ]";
    }
    
}
