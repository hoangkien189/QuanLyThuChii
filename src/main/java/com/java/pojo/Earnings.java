/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.java.pojo;

import java.io.Serializable;
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
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Admin
 */
@Entity
@Table(name = "earnings")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Earnings.findAll", query = "SELECT e FROM Earnings e"),
    @NamedQuery(name = "Earnings.findById", query = "SELECT e FROM Earnings e WHERE e.id = :id"),
    @NamedQuery(name = "Earnings.findByCurrency", query = "SELECT e FROM Earnings e WHERE e.currency = :currency"),
    @NamedQuery(name = "Earnings.findByDetails", query = "SELECT e FROM Earnings e WHERE e.details = :details"),
    @NamedQuery(name = "Earnings.findByTime", query = "SELECT e FROM Earnings e WHERE e.time = :time")})
public class Earnings implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Column(name = "currency")
    private long currency;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 200)
    @Column(name = "details")
    private String details;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "time")
    private String time;
    @JoinColumn(name = "id_user", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private User idUser;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEar")
    private Set<EarningsGr> earningsGrSet;

    public Earnings() {
    }

    public Earnings(Integer id) {
        this.id = id;
    }

    public Earnings(Integer id, long currency, String details, String time) {
        this.id = id;
        this.currency = currency;
        this.details = details;
        this.time = time;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public User getIdUser() {
        return idUser;
    }

    public void setIdUser(User idUser) {
        this.idUser = idUser;
    }

    @XmlTransient
    public Set<EarningsGr> getEarningsGrSet() {
        return earningsGrSet;
    }

    public void setEarningsGrSet(Set<EarningsGr> earningsGrSet) {
        this.earningsGrSet = earningsGrSet;
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
        if (!(object instanceof Earnings)) {
            return false;
        }
        Earnings other = (Earnings) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.pojo.Earnings[ id=" + id + " ]";
    }
    
}
