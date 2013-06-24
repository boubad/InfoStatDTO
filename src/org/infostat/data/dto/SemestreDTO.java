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
@XmlRootElement(name = "semestre")
public class SemestreDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer id;
    private Integer version;
    private Integer anneeid;
    private String sigle;
    private String status;
    private String description;
    private DateDTO startdate;
    private DateDTO enddate;

    public SemestreDTO() {
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
    public Integer getAnneeid() {
        return anneeid;
    }

    public void setAnneeid(Integer anneeid) {
        this.anneeid = anneeid;
    }

    public String getSigle() {
        return sigle;
    }

    public void setSigle(String sigle) {
        this.sigle = sigle;
    }

    @XmlAttribute
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public DateDTO getStartdate() {
        return startdate;
    }

    public void setStartdate(DateDTO startdate) {
        this.startdate = startdate;
    }

    public DateDTO getEnddate() {
        return enddate;
    }

    public void setEnddate(DateDTO enddate) {
        this.enddate = enddate;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.id);
        hash = 59 * hash + Objects.hashCode(this.anneeid);
        hash = 59 * hash + Objects.hashCode(this.sigle);
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
        final SemestreDTO other = (SemestreDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.anneeid, other.anneeid)) {
            return false;
        }
        if (!Objects.equals(this.sigle, other.sigle)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.sigle;
    }
}
