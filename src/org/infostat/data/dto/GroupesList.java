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
@XmlRootElement(name = "groupes")
public class GroupesList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private GroupeDTO[] groupes;

    public GroupesList() {
    }

    public GroupesList(GroupeDTO[] groupes) {
        this.groupes = groupes;
    }

    public GroupesList(String operation, GroupeDTO[] groupes) {
        this.operation = operation;
        this.groupes = groupes;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public GroupeDTO[] getGroupes() {
        return groupes;
    }

    public void setGroupes(GroupeDTO[] groupes) {
        this.groupes = groupes;
    }
}
