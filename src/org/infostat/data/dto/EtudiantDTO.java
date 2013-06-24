/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infostat.data.dto;

import java.util.Objects;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boubad
 */
@XmlRootElement(name = "etudiant")
public class EtudiantDTO {

    private Integer id;
    private Integer version;
    private String username;
    private String firstname;
    private String lastname;
    private String seriebac;
    private String optionbac;
    private String mentionbac;
    private String etudessuperieures;
    private String redoublant;
    private String ville;
    private String lycee;
    private String status;
    private String description;
    private byte[] photodata;

    //
    public EtudiantDTO() {
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

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getSeriebac() {
        return seriebac;
    }

    public void setSeriebac(String seriebac) {
        this.seriebac = seriebac;
    }

    public String getOptionbac() {
        return optionbac;
    }

    public void setOptionbac(String optionbac) {
        this.optionbac = optionbac;
    }

    public String getMentionbac() {
        return mentionbac;
    }

    public void setMentionbac(String mentionbac) {
        this.mentionbac = mentionbac;
    }

    public String getEtudessuperieures() {
        return etudessuperieures;
    }

    public void setEtudessuperieures(String etudessuperieures) {
        this.etudessuperieures = etudessuperieures;
    }

    public String getRedoublant() {
        return redoublant;
    }

    public void setRedoublant(String redoublant) {
        this.redoublant = redoublant;
    }

    public String getVille() {
        return ville;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public String getLycee() {
        return lycee;
    }

    public void setLycee(String lycee) {
        this.lycee = lycee;
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

    public byte[] getPhotodata() {
        return photodata;
    }

    public void setPhotodata(byte[] photodata) {
        this.photodata = photodata;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 37 * hash + Objects.hashCode(this.id);
        hash = 37 * hash + Objects.hashCode(this.username);
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
        final EtudiantDTO other = (EtudiantDTO) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.username, other.username)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return this.lastname + " " + this.firstname;
    }
}
