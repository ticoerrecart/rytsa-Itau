
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEPermisos complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEPermisos">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEBase">
 *       &lt;attribute name="IdUsuario" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdAccion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Permiso" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DobleControl" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AdministraSistema" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IdAplicacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEPermisos")
public class BEPermisos
    extends BEBase
{

    @XmlAttribute(name = "IdUsuario", required = true)
    protected long idUsuario;
    @XmlAttribute(name = "IdAccion", required = true)
    protected long idAccion;
    @XmlAttribute(name = "Permiso", required = true)
    protected int permiso;
    @XmlAttribute(name = "DobleControl", required = true)
    protected boolean dobleControl;
    @XmlAttribute(name = "AdministraSistema", required = true)
    protected boolean administraSistema;
    @XmlAttribute(name = "IdAplicacion", required = true)
    protected int idAplicacion;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;

    /**
     * Gets the value of the idUsuario property.
     * 
     */
    public long getIdUsuario() {
        return idUsuario;
    }

    /**
     * Sets the value of the idUsuario property.
     * 
     */
    public void setIdUsuario(long value) {
        this.idUsuario = value;
    }

    /**
     * Gets the value of the idAccion property.
     * 
     */
    public long getIdAccion() {
        return idAccion;
    }

    /**
     * Sets the value of the idAccion property.
     * 
     */
    public void setIdAccion(long value) {
        this.idAccion = value;
    }

    /**
     * Gets the value of the permiso property.
     * 
     */
    public int getPermiso() {
        return permiso;
    }

    /**
     * Sets the value of the permiso property.
     * 
     */
    public void setPermiso(int value) {
        this.permiso = value;
    }

    /**
     * Gets the value of the dobleControl property.
     * 
     */
    public boolean isDobleControl() {
        return dobleControl;
    }

    /**
     * Sets the value of the dobleControl property.
     * 
     */
    public void setDobleControl(boolean value) {
        this.dobleControl = value;
    }

    /**
     * Gets the value of the administraSistema property.
     * 
     */
    public boolean isAdministraSistema() {
        return administraSistema;
    }

    /**
     * Sets the value of the administraSistema property.
     * 
     */
    public void setAdministraSistema(boolean value) {
        this.administraSistema = value;
    }

    /**
     * Gets the value of the idAplicacion property.
     * 
     */
    public int getIdAplicacion() {
        return idAplicacion;
    }

    /**
     * Sets the value of the idAplicacion property.
     * 
     */
    public void setIdAplicacion(int value) {
        this.idAplicacion = value;
    }

    /**
     * Gets the value of the descripcion property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescripcion() {
        return descripcion;
    }

    /**
     * Sets the value of the descripcion property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescripcion(String value) {
        this.descripcion = value;
    }

}
