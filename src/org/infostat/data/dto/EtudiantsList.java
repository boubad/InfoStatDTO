/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infostat.data.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boubad
 */
@XmlRootElement(name = "etudiants")
public class EtudiantsList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private EtudiantDTO[] etudiants;

    public EtudiantsList() {
    }

    public EtudiantsList(EtudiantDTO[] etudiants) {
        this.etudiants = etudiants;
    }

    public EtudiantsList(String operation, EtudiantDTO[] etudiants) {
        this.operation = operation;
        this.etudiants = etudiants;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public EtudiantDTO[] getEtudiants() {
        return etudiants;
    }

    public void setEtudiants(EtudiantDTO[] etudiants) {
        this.etudiants = etudiants;
    }
}
