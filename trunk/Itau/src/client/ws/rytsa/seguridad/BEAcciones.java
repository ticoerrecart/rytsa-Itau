
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEAcciones complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEAcciones">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="IdAccion_Padre" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Descripcion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="HabilitarPermisos" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TablaOrigen" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DobleControl" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AdministraSistema" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Interna" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="IdAplicacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Tipo_Configuracion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="URLWebForm" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEAcciones", propOrder = {
    "ultimaActualizacion"
})
public class BEAcciones
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "IdAccion_Padre", required = true)
    protected long idAccionPadre;
    @XmlAttribute(name = "Descripcion")
    protected String descripcion;
    @XmlAttribute(name = "HabilitarPermisos", required = true)
    protected int habilitarPermisos;
    @XmlAttribute(name = "TablaOrigen")
    protected String tablaOrigen;
    @XmlAttribute(name = "DobleControl", required = true)
    protected boolean dobleControl;
    @XmlAttribute(name = "AdministraSistema", required = true)
    protected boolean administraSistema;
    @XmlAttribute(name = "Interna", required = true)
    protected boolean interna;
    @XmlAttribute(name = "IdAplicacion", required = true)
    protected int idAplicacion;
    @XmlAttribute(name = "Tipo_Configuracion", required = true)
    protected int tipoConfiguracion;
    @XmlAttribute(name = "URLWebForm")
    protected String urlWebForm;

    /**
     * Gets the value of the ultimaActualizacion property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getUltimaActualizacion() {
        return ultimaActualizacion;
    }

    /**
     * Sets the value of the ultimaActualizacion property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setUltimaActualizacion(byte[] value) {
        this.ultimaActualizacion = ((byte[]) value);
    }

    /**
     * Gets the value of the idAccionPadre property.
     * 
     */
    public long getIdAccionPadre() {
        return idAccionPadre;
    }

    /**
     * Sets the value of the idAccionPadre property.
     * 
     */
    public void setIdAccionPadre(long value) {
        this.idAccionPadre = value;
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

    /**
     * Gets the value of the habilitarPermisos property.
     * 
     */
    public int getHabilitarPermisos() {
        return habilitarPermisos;
    }

    /**
     * Sets the value of the habilitarPermisos property.
     * 
     */
    public void setHabilitarPermisos(int value) {
        this.habilitarPermisos = value;
    }

    /**
     * Gets the value of the tablaOrigen property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTablaOrigen() {
        return tablaOrigen;
    }

    /**
     * Sets the value of the tablaOrigen property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTablaOrigen(String value) {
        this.tablaOrigen = value;
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
     * Gets the value of the interna property.
     * 
     */
    public boolean isInterna() {
        return interna;
    }

    /**
     * Sets the value of the interna property.
     * 
     */
    public void setInterna(boolean value) {
        this.interna = value;
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
     * Gets the value of the tipoConfiguracion property.
     * 
     */
    public int getTipoConfiguracion() {
        return tipoConfiguracion;
    }

    /**
     * Sets the value of the tipoConfiguracion property.
     * 
     */
    public void setTipoConfiguracion(int value) {
        this.tipoConfiguracion = value;
    }

    /**
     * Gets the value of the urlWebForm property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLWebForm() {
        return urlWebForm;
    }

    /**
     * Sets the value of the urlWebForm property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLWebForm(String value) {
        this.urlWebForm = value;
    }

}
