/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infostat.data.dto;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boubad
 */
@XmlRootElement(name = "etudiant-events")
public class EtudiantEventsList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation = "maintains";
    private EtudiantEventDTO[] events;

    public EtudiantEventsList() {
    }

    public EtudiantEventsList(EtudiantEventDTO[] oList) {
        this.events = oList;
    }

    public EtudiantEventDTO[] getEvents() {
        return events;
    }

    public void setEvents(EtudiantEventDTO[] events) {
        this.events = events;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
