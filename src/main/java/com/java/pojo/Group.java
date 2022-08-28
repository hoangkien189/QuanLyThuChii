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
@Table(name = "group")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Group1.findAll", query = "SELECT g FROM Group1 g"),
    @NamedQuery(name = "Group1.findById", query = "SELECT g FROM Group1 g WHERE g.id = :id"),
    @NamedQuery(name = "Group1.findByName", query = "SELECT g FROM Group1 g WHERE g.name = :name"),
    @NamedQuery(name = "Group1.findByRole", query = "SELECT g FROM Group1 g WHERE g.role = :role")})
public class Group implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 45)
    @Column(name = "name")
    private String name;
    @Size(max = 45)
    @Column(name = "role")
    private String role;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGr")
    private Set<MemberGr> memberGrSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGr")
    private Set<ExpendituresGr> expendituresGrSet;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idGr")
    private Set<EarningsGr> earningsGrSet;

    public Group() {
    }

    public Group(Integer id) {
        this.id = id;
    }

    public Group(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @XmlTransient
    public Set<MemberGr> getMemberGrSet() {
        return memberGrSet;
    }

    public void setMemberGrSet(Set<MemberGr> memberGrSet) {
        this.memberGrSet = memberGrSet;
    }

    @XmlTransient
    public Set<ExpendituresGr> getExpendituresGrSet() {
        return expendituresGrSet;
    }

    public void setExpendituresGrSet(Set<ExpendituresGr> expendituresGrSet) {
        this.expendituresGrSet = expendituresGrSet;
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
        if (!(object instanceof Group)) {
            return false;
        }
        Group other = (Group) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.java.pojo.Group1[ id=" + id + " ]";
    }
    
}
