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
@XmlRootElement(name = "affprofs")
public class AffectationEnseignantsList implements Serializable {
     private static final long serialVersionUID = 1L;
    private String operation;
    private AffectationEnseignantDTO[] affectations;

    public AffectationEnseignantsList() {
    }

    public AffectationEnseignantsList(String operation, AffectationEnseignantDTO[] affectations) {
        this.operation = operation;
        this.affectations = affectations;
    }

    public AffectationEnseignantsList(AffectationEnseignantDTO[] affectations) {
        this.affectations = affectations;
    }
    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public AffectationEnseignantDTO[] getAffectations() {
        return affectations;
    }

    public void setAffectations(AffectationEnseignantDTO[] affectations) {
        this.affectations = affectations;
    }
    
}
