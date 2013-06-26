/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.infostat.data.dto;

import java.io.Serializable;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author boubad
 */
@XmlRootElement(name = "moduleassocs")
public class ModuleAssocsList implements Serializable {

    private static final long serialVersionUID = 1L;
    private ModuleAssocDTO[] associations;

    public ModuleAssocsList() {
    }

    public ModuleAssocsList(ModuleAssocDTO[] associations) {
        this.associations = associations;
    }

    public ModuleAssocDTO[] getAssociations() {
        return associations;
    }

    public void setAssociations(ModuleAssocDTO[] associations) {
        this.associations = associations;
    }
}
