
package client.ws.rytsa.general;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BEEstado_sistema complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEEstado_sistema">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="IsImputacion" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsEjecucionProcesos" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="IsExportacionContable" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Generacion_Exportacion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="IdUsuarioGeneracion_Exportacion" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Informacion_Asientos" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="IdUsuarioInformacion_Asientos" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Fechaapertura" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Fechacierre" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Fechasistema" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Idusuarioapertura" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Idusuariocierre" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Idusuariosiopel" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Inicio_interface_siopel" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Importacion_precios" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Idusuariovaluacion_mtm" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Valuacion_mtm" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Idusuarioimputacion_cta_cte" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Imputacion_cta_cte" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Ultimo_mensaje_SIOPEL" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Idusuarioimportacion_precios" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="Idusuariobaja" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="IdusuarioejecucionProcesos" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="EjecucionProcesos" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="EstadoActual" use="required" type="{http://tempuri.org/}TipoEstadoActualSistema" />
 *       &lt;attribute name="IsValuacionMTM" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEEstado_sistema", propOrder = {
    "ultimaActualizacion",
    "isImputacion",
    "isEjecucionProcesos",
    "isExportacionContable"
})
public class BEEstadoSistema
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlElement(name = "IsImputacion")
    protected boolean isImputacion;
    @XmlElement(name = "IsEjecucionProcesos")
    protected boolean isEjecucionProcesos;
    @XmlElement(name = "IsExportacionContable")
    protected boolean isExportacionContable;
    @XmlAttribute(name = "Generacion_Exportacion", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar generacionExportacion;
    @XmlAttribute(name = "IdUsuarioGeneracion_Exportacion", required = true)
    protected long idUsuarioGeneracionExportacion;
    @XmlAttribute(name = "Informacion_Asientos", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar informacionAsientos;
    @XmlAttribute(name = "IdUsuarioInformacion_Asientos", required = true)
    protected long idUsuarioInformacionAsientos;
    @XmlAttribute(name = "Fechaapertura", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechaapertura;
    @XmlAttribute(name = "Fechacierre", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechacierre;
    @XmlAttribute(name = "Fechasistema", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar fechasistema;
    @XmlAttribute(name = "Idusuarioapertura", required = true)
    protected long idusuarioapertura;
    @XmlAttribute(name = "Idusuariocierre", required = true)
    protected long idusuariocierre;
    @XmlAttribute(name = "Idusuariosiopel", required = true)
    protected long idusuariosiopel;
    @XmlAttribute(name = "Inicio_interface_siopel", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar inicioInterfaceSiopel;
    @XmlAttribute(name = "Importacion_precios", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar importacionPrecios;
    @XmlAttribute(name = "Idusuariovaluacion_mtm", required = true)
    protected long idusuariovaluacionMtm;
    @XmlAttribute(name = "Valuacion_mtm", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar valuacionMtm;
    @XmlAttribute(name = "Idusuarioimputacion_cta_cte", required = true)
    protected long idusuarioimputacionCtaCte;
    @XmlAttribute(name = "Imputacion_cta_cte", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar imputacionCtaCte;
    @XmlAttribute(name = "Ultimo_mensaje_SIOPEL", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ultimoMensajeSIOPEL;
    @XmlAttribute(name = "Idusuarioimportacion_precios", required = true)
    protected long idusuarioimportacionPrecios;
    @XmlAttribute(name = "Idusuariobaja", required = true)
    protected long idusuariobaja;
    @XmlAttribute(name = "IdusuarioejecucionProcesos", required = true)
    protected long idusuarioejecucionProcesos;
    @XmlAttribute(name = "EjecucionProcesos", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar ejecucionProcesos;
    @XmlAttribute(name = "EstadoActual", required = true)
    protected TipoEstadoActualSistema estadoActual;
    @XmlAttribute(name = "IsValuacionMTM", required = true)
    protected boolean isValuacionMTM;

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
     * Gets the value of the isImputacion property.
     * 
     */
    public boolean isIsImputacion() {
        return isImputacion;
    }

    /**
     * Sets the value of the isImputacion property.
     * 
     */
    public void setIsImputacion(boolean value) {
        this.isImputacion = value;
    }

    /**
     * Gets the value of the isEjecucionProcesos property.
     * 
     */
    public boolean isIsEjecucionProcesos() {
        return isEjecucionProcesos;
    }

    /**
     * Sets the value of the isEjecucionProcesos property.
     * 
     */
    public void setIsEjecucionProcesos(boolean value) {
        this.isEjecucionProcesos = value;
    }

    /**
     * Gets the value of the isExportacionContable property.
     * 
     */
    public boolean isIsExportacionContable() {
        return isExportacionContable;
    }

    /**
     * Sets the value of the isExportacionContable property.
     * 
     */
    public void setIsExportacionContable(boolean value) {
        this.isExportacionContable = value;
    }

    /**
     * Gets the value of the generacionExportacion property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getGeneracionExportacion() {
        return generacionExportacion;
    }

    /**
     * Sets the value of the generacionExportacion property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setGeneracionExportacion(XMLGregorianCalendar value) {
        this.generacionExportacion = value;
    }

    /**
     * Gets the value of the idUsuarioGeneracionExportacion property.
     * 
     */
    public long getIdUsuarioGeneracionExportacion() {
        return idUsuarioGeneracionExportacion;
    }

    /**
     * Sets the value of the idUsuarioGeneracionExportacion property.
     * 
     */
    public void setIdUsuarioGeneracionExportacion(long value) {
        this.idUsuarioGeneracionExportacion = value;
    }

    /**
     * Gets the value of the informacionAsientos property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInformacionAsientos() {
        return informacionAsientos;
    }

    /**
     * Sets the value of the informacionAsientos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInformacionAsientos(XMLGregorianCalendar value) {
        this.informacionAsientos = value;
    }

    /**
     * Gets the value of the idUsuarioInformacionAsientos property.
     * 
     */
    public long getIdUsuarioInformacionAsientos() {
        return idUsuarioInformacionAsientos;
    }

    /**
     * Sets the value of the idUsuarioInformacionAsientos property.
     * 
     */
    public void setIdUsuarioInformacionAsientos(long value) {
        this.idUsuarioInformacionAsientos = value;
    }

    /**
     * Gets the value of the fechaapertura property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechaapertura() {
        return fechaapertura;
    }

    /**
     * Sets the value of the fechaapertura property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechaapertura(XMLGregorianCalendar value) {
        this.fechaapertura = value;
    }

    /**
     * Gets the value of the fechacierre property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechacierre() {
        return fechacierre;
    }

    /**
     * Sets the value of the fechacierre property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechacierre(XMLGregorianCalendar value) {
        this.fechacierre = value;
    }

    /**
     * Gets the value of the fechasistema property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getFechasistema() {
        return fechasistema;
    }

    /**
     * Sets the value of the fechasistema property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setFechasistema(XMLGregorianCalendar value) {
        this.fechasistema = value;
    }

    /**
     * Gets the value of the idusuarioapertura property.
     * 
     */
    public long getIdusuarioapertura() {
        return idusuarioapertura;
    }

    /**
     * Sets the value of the idusuarioapertura property.
     * 
     */
    public void setIdusuarioapertura(long value) {
        this.idusuarioapertura = value;
    }

    /**
     * Gets the value of the idusuariocierre property.
     * 
     */
    public long getIdusuariocierre() {
        return idusuariocierre;
    }

    /**
     * Sets the value of the idusuariocierre property.
     * 
     */
    public void setIdusuariocierre(long value) {
        this.idusuariocierre = value;
    }

    /**
     * Gets the value of the idusuariosiopel property.
     * 
     */
    public long getIdusuariosiopel() {
        return idusuariosiopel;
    }

    /**
     * Sets the value of the idusuariosiopel property.
     * 
     */
    public void setIdusuariosiopel(long value) {
        this.idusuariosiopel = value;
    }

    /**
     * Gets the value of the inicioInterfaceSiopel property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInicioInterfaceSiopel() {
        return inicioInterfaceSiopel;
    }

    /**
     * Sets the value of the inicioInterfaceSiopel property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInicioInterfaceSiopel(XMLGregorianCalendar value) {
        this.inicioInterfaceSiopel = value;
    }

    /**
     * Gets the value of the importacionPrecios property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImportacionPrecios() {
        return importacionPrecios;
    }

    /**
     * Sets the value of the importacionPrecios property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImportacionPrecios(XMLGregorianCalendar value) {
        this.importacionPrecios = value;
    }

    /**
     * Gets the value of the idusuariovaluacionMtm property.
     * 
     */
    public long getIdusuariovaluacionMtm() {
        return idusuariovaluacionMtm;
    }

    /**
     * Sets the value of the idusuariovaluacionMtm property.
     * 
     */
    public void setIdusuariovaluacionMtm(long value) {
        this.idusuariovaluacionMtm = value;
    }

    /**
     * Gets the value of the valuacionMtm property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getValuacionMtm() {
        return valuacionMtm;
    }

    /**
     * Sets the value of the valuacionMtm property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setValuacionMtm(XMLGregorianCalendar value) {
        this.valuacionMtm = value;
    }

    /**
     * Gets the value of the idusuarioimputacionCtaCte property.
     * 
     */
    public long getIdusuarioimputacionCtaCte() {
        return idusuarioimputacionCtaCte;
    }

    /**
     * Sets the value of the idusuarioimputacionCtaCte property.
     * 
     */
    public void setIdusuarioimputacionCtaCte(long value) {
        this.idusuarioimputacionCtaCte = value;
    }

    /**
     * Gets the value of the imputacionCtaCte property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getImputacionCtaCte() {
        return imputacionCtaCte;
    }

    /**
     * Sets the value of the imputacionCtaCte property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setImputacionCtaCte(XMLGregorianCalendar value) {
        this.imputacionCtaCte = value;
    }

    /**
     * Gets the value of the ultimoMensajeSIOPEL property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getUltimoMensajeSIOPEL() {
        return ultimoMensajeSIOPEL;
    }

    /**
     * Sets the value of the ultimoMensajeSIOPEL property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setUltimoMensajeSIOPEL(XMLGregorianCalendar value) {
        this.ultimoMensajeSIOPEL = value;
    }

    /**
     * Gets the value of the idusuarioimportacionPrecios property.
     * 
     */
    public long getIdusuarioimportacionPrecios() {
        return idusuarioimportacionPrecios;
    }

    /**
     * Sets the value of the idusuarioimportacionPrecios property.
     * 
     */
    public void setIdusuarioimportacionPrecios(long value) {
        this.idusuarioimportacionPrecios = value;
    }

    /**
     * Gets the value of the idusuariobaja property.
     * 
     */
    public long getIdusuariobaja() {
        return idusuariobaja;
    }

    /**
     * Sets the value of the idusuariobaja property.
     * 
     */
    public void setIdusuariobaja(long value) {
        this.idusuariobaja = value;
    }

    /**
     * Gets the value of the idusuarioejecucionProcesos property.
     * 
     */
    public long getIdusuarioejecucionProcesos() {
        return idusuarioejecucionProcesos;
    }

    /**
     * Sets the value of the idusuarioejecucionProcesos property.
     * 
     */
    public void setIdusuarioejecucionProcesos(long value) {
        this.idusuarioejecucionProcesos = value;
    }

    /**
     * Gets the value of the ejecucionProcesos property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEjecucionProcesos() {
        return ejecucionProcesos;
    }

    /**
     * Sets the value of the ejecucionProcesos property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEjecucionProcesos(XMLGregorianCalendar value) {
        this.ejecucionProcesos = value;
    }

    /**
     * Gets the value of the estadoActual property.
     * 
     * @return
     *     possible object is
     *     {@link TipoEstadoActualSistema }
     *     
     */
    public TipoEstadoActualSistema getEstadoActual() {
        return estadoActual;
    }

    /**
     * Sets the value of the estadoActual property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoEstadoActualSistema }
     *     
     */
    public void setEstadoActual(TipoEstadoActualSistema value) {
        this.estadoActual = value;
    }

    /**
     * Gets the value of the isValuacionMTM property.
     * 
     */
    public boolean isIsValuacionMTM() {
        return isValuacionMTM;
    }

    /**
     * Sets the value of the isValuacionMTM property.
     * 
     */
    public void setIsValuacionMTM(boolean value) {
        this.isValuacionMTM = value;
    }

}
