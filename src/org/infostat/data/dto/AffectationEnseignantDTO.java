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
public class AffectationEnseignantDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer version;
    private Integer semestreid;
    private Integer enseignantid;
    private Integer matiereid;
    private Integer groupeid;

    public AffectationEnseignantDTO() {
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
    public Integer getEnseignantid() {
        return enseignantid;
    }

    public void setEnseignantid(Integer enseignantid) {
        this.enseignantid = enseignantid;
    }

    @XmlAttribute
    public Integer getMatiereid() {
        return matiereid;
    }

    public void setMatiereid(Integer matiereid) {
        this.matiereid = matiereid;
    }

    @XmlAttribute
    public Integer getGroupeid() {
        return groupeid;
    }

    public void setGroupeid(Integer groupeid) {
        this.groupeid = groupeid;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.semestreid);
        hash = 79 * hash + Objects.hashCode(this.enseignantid);
        hash = 79 * hash + Objects.hashCode(this.matiereid);
        hash = 79 * hash + Objects.hashCode(this.groupeid);
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
        final AffectationEnseignantDTO other = (AffectationEnseignantDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.semestreid, other.semestreid)) {
            return false;
        }
        if (!Objects.equals(this.enseignantid, other.enseignantid)) {
            return false;
        }
        if (!Objects.equals(this.matiereid, other.matiereid)) {
            return false;
        }
        if (!Objects.equals(this.groupeid, other.groupeid)) {
            return false;
        }
        return true;
    }
}
