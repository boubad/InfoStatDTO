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
@XmlRootElement(name = "profs")
public class EnseignantsList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private EnseignantDTO[] enseignants;

    public EnseignantsList() {
    }

    public EnseignantsList(EnseignantDTO[] enseignants) {
        this.enseignants = enseignants;
    }

    public EnseignantsList(String operation, EnseignantDTO[] enseignants) {
        this.operation = operation;
        this.enseignants = enseignants;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public EnseignantDTO[] getEnseignants() {
        return enseignants;
    }

    public void setEnseignants(EnseignantDTO[] enseignants) {
        this.enseignants = enseignants;
    }
}
