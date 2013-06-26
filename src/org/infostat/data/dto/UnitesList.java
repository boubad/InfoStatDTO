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
@XmlRootElement(name = "unites")
public class UnitesList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private UniteDTO[] unites;

    public UnitesList() {
    }

    public UnitesList(UniteDTO[] unites) {
        this.unites = unites;
    }

    public UnitesList(String operation, UniteDTO[] unites) {
        this.operation = operation;
        this.unites = unites;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public UniteDTO[] getUnites() {
        return unites;
    }

    public void setUnites(UniteDTO[] unites) {
        this.unites = unites;
    }
}
