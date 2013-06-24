/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infostat.data.dto;

import java.io.Serializable;
import java.util.Objects;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boubad
 */
@XmlRootElement(name = "affectation-enseignant")
public class AffectationEtudiantDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer version;
    private Integer semestreid;
    private Integer groupeid;
    private Integer etudiantid;

    //
    public AffectationEtudiantDTO() {
    }

    @XmlAttribute
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlAttribute
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @XmlAttribute
    public Integer getSemestreid() {
        return semestreid;
    }

    public void setSemestreid(Integer semestreid) {
        this.semestreid = semestreid;
    }

    @XmlAttribute
    public Integer getGroupeid() {
        return groupeid;
    }

    public void setGroupeid(Integer groupeid) {
        this.groupeid = groupeid;
    }

    @XmlAttribute
    public Integer getEtudiantid() {
        return etudiantid;
    }

    public void setEtudiantid(Integer etudiantid) {
        this.etudiantid = etudiantid;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 89 * hash + Objects.hashCode(this.semestreid);
        hash = 89 * hash + Objects.hashCode(this.groupeid);
        hash = 89 * hash + Objects.hashCode(this.etudiantid);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final AffectationEtudiantDTO other = (AffectationEtudiantDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.semestreid, other.semestreid)) {
            return false;
        }
        if (!Objects.equals(this.groupeid, other.groupeid)) {
            return false;
        }
        if (!Objects.equals(this.etudiantid, other.etudiantid)) {
            return false;
        }
        return true;
    }
}
