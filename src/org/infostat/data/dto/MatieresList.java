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
@XmlRootElement(name = "matieres")
public class MatieresList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private MatiereDTO[] matieres;

    public MatieresList() {
    }

    public MatieresList(MatiereDTO[] matieres) {
        this.matieres = matieres;
    }

    public MatieresList(String operation, MatiereDTO[] matieres) {
        this.operation = operation;
        this.matieres = matieres;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public MatiereDTO[] getMatieres() {
        return matieres;
    }

    public void setMatieres(MatiereDTO[] matieres) {
        this.matieres = matieres;
    }
}
