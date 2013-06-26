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
@XmlRootElement(name = "modules")
public class ModulesList implements Serializable {

    private static final long serialVersionUID = 1L;
    private String operation;
    private ModuleDTO[] modules;

    public ModulesList() {
    }

    public ModulesList(ModuleDTO[] modules) {
        this.modules = modules;
    }

    public ModulesList(String operation, ModuleDTO[] modules) {
        this.operation = operation;
        this.modules = modules;
    }

    @XmlAttribute
    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public ModuleDTO[] getModules() {
        return modules;
    }

    public void setModules(ModuleDTO[] modules) {
        this.modules = modules;
    }
}
