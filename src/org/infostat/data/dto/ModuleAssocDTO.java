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
@XmlRootElement(name = "module-assoc")
public class ModuleAssocDTO implements Serializable {

    private static final long serialVersionUID = 1L;
    private Integer moduleid;
    private Integer matiereid;
    private String operation;

    public ModuleAssocDTO() {
    }

    public ModuleAssocDTO(Integer moduleid, Integer matiereid, String operation) {
        this.moduleid = moduleid;
        this.matiereid = matiereid;
        this.operation = operation;
    }

    @XmlAttribute
    public Integer getModuleid() {
        return moduleid;
    }

    public void setModuleid(Integer moduleid) {
        this.moduleid = moduleid;
    }

    @XmlAttribute
    public Integer getMatiereid() {
        return matiereid;
    }

    public void setMatiereid(Integer matiereid) {
        this.matiereid = matiereid;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }
}
