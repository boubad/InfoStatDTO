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
@XmlRootElement(name = "etudiant-event")
public class EtudiantEventDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer version;
    private String genre;
    private Float note;
    private String observations;
    private Integer groupeventid;
    private Integer etudiantid;

    //
    public EtudiantEventDTO() {
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

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public Float getNote() {
        return note;
    }

    public void setNote(Float note) {
        this.note = note;
    }

    public String getObservations() {
        return observations;
    }

    public void setObservations(String observations) {
        this.observations = observations;
    }

    @XmlAttribute
    public Integer getGroupeventid() {
        return groupeventid;
    }

    public void setGroupeventid(Integer groupeventid) {
        this.groupeventid = groupeventid;
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
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.groupeventid);
        hash = 83 * hash + Objects.hashCode(this.etudiantid);
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
        final EtudiantEventDTO other = (EtudiantEventDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.groupeventid, other.groupeventid)) {
            return false;
        }
        if (!Objects.equals(this.etudiantid, other.etudiantid)) {
            return false;
        }
        return true;
    }
}
