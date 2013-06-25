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
@XmlRootElement(name = "groupe-event")
public class GroupeEventDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer version;
    private Integer affectationenseignantid;
    private String genre;
    private DateDTO date = new DateDTO();
    private String nom;
    private DateDTO starttime = new DateDTO();
    private DateDTO endtime = new DateDTO();
    private Float coefficient = new Float(1.0f);
    private String status;
    private String description;
    private String location;
    private boolean createnotes = false;
    //
    public GroupeEventDTO() {
    }

    @XmlAttribute
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    @XmlAttribute
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    @XmlAttribute
    public boolean isCreatenotes() {
        return createnotes;
    }

    public void setCreatenotes(boolean createnotes) {
        this.createnotes = createnotes;
    }

    @XmlAttribute
    public Integer getVersion() {
        return version;
    }

    public void setVersion(Integer version) {
        this.version = version;
    }

    @XmlAttribute
    public Integer getAffectationenseignantid() {
        return affectationenseignantid;
    }

    public void setAffectationenseignantid(Integer affectationenseignantid) {
        this.affectationenseignantid = affectationenseignantid;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public DateDTO getDate() {
        return date;
    }

    public void setDate(DateDTO date) {
        this.date = date;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public DateDTO getStarttime() {
        return starttime;
    }

    public void setStarttime(DateDTO starttime) {
        this.starttime = starttime;
    }

    public DateDTO getEndtime() {
        return endtime;
    }

    public void setEndtime(DateDTO endtime) {
        this.endtime = endtime;
    }

    public Float getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(Float coefficient) {
        this.coefficient = coefficient;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 71 * hash + Objects.hashCode(this.id);
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
        final GroupeEventDTO other = (GroupeEventDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.nom;
    }
}
