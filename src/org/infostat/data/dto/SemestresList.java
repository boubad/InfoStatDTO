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
@XmlRootElement(name = "semestres")
public class SemestresList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private SemestreDTO[] semestres;

    public SemestresList() {
    }

    public SemestresList(SemestreDTO[] semestres) {
        this.semestres = semestres;
    }

    public SemestresList(String operation, SemestreDTO[] semestres) {
        this.operation = operation;
        this.semestres = semestres;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public SemestreDTO[] getSemestres() {
        return semestres;
    }

    public void setSemestres(SemestreDTO[] semestres) {
        this.semestres = semestres;
    }
}
