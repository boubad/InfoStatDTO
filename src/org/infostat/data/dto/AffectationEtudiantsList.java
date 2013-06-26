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
@XmlRootElement(name = "affetuds")
public class AffectationEtudiantsList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private AffectationEtudiantDTO[] affectations;

    public AffectationEtudiantsList() {
    }

    public AffectationEtudiantsList(AffectationEtudiantDTO[] affectations) {
        this.affectations = affectations;
    }

    public AffectationEtudiantsList(String operation, AffectationEtudiantDTO[] affectations) {
        this.operation = operation;
        this.affectations = affectations;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public AffectationEtudiantDTO[] getAffectations() {
        return affectations;
    }

    public void setAffectations(AffectationEtudiantDTO[] affectations) {
        this.affectations = affectations;
    }
}
