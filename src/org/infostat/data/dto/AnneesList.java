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
@XmlRootElement(name = "annees")
public class AnneesList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private AnneeDTO[] annees;

    public AnneesList() {
    }

    public AnneesList(AnneeDTO[] annees) {
        this.annees = annees;
    }

    public AnneesList(String operation, AnneeDTO[] annees) {
        this.operation = operation;
        this.annees = annees;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public AnneeDTO[] getAnnees() {
        return annees;
    }

    public void setAnnees(AnneeDTO[] annees) {
        this.annees = annees;
    }
}
