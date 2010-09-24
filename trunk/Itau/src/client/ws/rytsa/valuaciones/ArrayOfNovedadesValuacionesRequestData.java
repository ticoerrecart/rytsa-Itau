
package client.ws.rytsa.valuaciones;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for ArrayOfNovedadesValuacionesRequestData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfNovedadesValuacionesRequestData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NovedadesValuacionesRequestData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="IdOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="TotalValuado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="FechaUltimaValuacion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="IdUsuarioCargaSE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FechaCargaPrecio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="TipoValuacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MonedaValuacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Precio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TasaUtilizada" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ValoresNominales" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Plazo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ArrayOfNovedadesValuacionesRequestData", propOrder = {
    "novedadesValuacionesRequestData"
})
public class ArrayOfNovedadesValuacionesRequestData {

    @XmlElement(name = "NovedadesValuacionesRequestData", nillable = true)
    protected List<ArrayOfNovedadesValuacionesRequestData.NovedadesValuacionesRequestData> novedadesValuacionesRequestData;

    /**
     * Gets the value of the novedadesValuacionesRequestData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the novedadesValuacionesRequestData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNovedadesValuacionesRequestData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfNovedadesValuacionesRequestData.NovedadesValuacionesRequestData }
     * 
     * 
     */
    public List<ArrayOfNovedadesValuacionesRequestData.NovedadesValuacionesRequestData> getNovedadesValuacionesRequestData() {
        if (novedadesValuacionesRequestData == null) {
            novedadesValuacionesRequestData = new ArrayList<ArrayOfNovedadesValuacionesRequestData.NovedadesValuacionesRequestData>();
        }
        return this.novedadesValuacionesRequestData;
    }


    /**
     * <p>Java class for anonymous complex type.
     * 
     * <p>The following schema fragment specifies the expected content contained within this class.
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="IdOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Fecha" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="TotalValuado" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="FechaUltimaValuacion" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="IdUsuarioCargaSE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FechaCargaPrecio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="TipoValuacion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MonedaValuacion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Precio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TasaUtilizada" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ValoresNominales" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Plazo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NovedadesValuacionesRequestData {

        @XmlAttribute(name = "IdOperacion", required = true)
        protected int idOperacion;
        @XmlAttribute(name = "Fecha", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fecha;
        @XmlAttribute(name = "TotalValuado", required = true)
        protected BigDecimal totalValuado;
        @XmlAttribute(name = "FechaUltimaValuacion", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaUltimaValuacion;
        @XmlAttribute(name = "IdUsuarioCargaSE")
        protected String idUsuarioCargaSE;
        @XmlAttribute(name = "FechaCargaPrecio", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaCargaPrecio;
        @XmlAttribute(name = "TipoValuacion")
        protected String tipoValuacion;
        @XmlAttribute(name = "MonedaValuacion")
        protected String monedaValuacion;
        @XmlAttribute(name = "Precio", required = true)
        protected BigDecimal precio;
        @XmlAttribute(name = "TasaUtilizada", required = true)
        protected BigDecimal tasaUtilizada;
        @XmlAttribute(name = "ValoresNominales", required = true)
        protected BigDecimal valoresNominales;
        @XmlAttribute(name = "Plazo", required = true)
        protected int plazo;

        /**
         * Gets the value of the idOperacion property.
         * 
         */
        public int getIdOperacion() {
            return idOperacion;
        }

        /**
         * Sets the value of the idOperacion property.
         * 
         */
        public void setIdOperacion(int value) {
            this.idOperacion = value;
        }

        /**
         * Gets the value of the fecha property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFecha() {
            return fecha;
        }

        /**
         * Sets the value of the fecha property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFecha(XMLGregorianCalendar value) {
            this.fecha = value;
        }

        /**
         * Gets the value of the totalValuado property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTotalValuado() {
            return totalValuado;
        }

        /**
         * Sets the value of the totalValuado property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTotalValuado(BigDecimal value) {
            this.totalValuado = value;
        }

        /**
         * Gets the value of the fechaUltimaValuacion property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaUltimaValuacion() {
            return fechaUltimaValuacion;
        }

        /**
         * Sets the value of the fechaUltimaValuacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaUltimaValuacion(XMLGregorianCalendar value) {
            this.fechaUltimaValuacion = value;
        }

        /**
         * Gets the value of the idUsuarioCargaSE property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIdUsuarioCargaSE() {
            return idUsuarioCargaSE;
        }

        /**
         * Sets the value of the idUsuarioCargaSE property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIdUsuarioCargaSE(String value) {
            this.idUsuarioCargaSE = value;
        }

        /**
         * Gets the value of the fechaCargaPrecio property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaCargaPrecio() {
            return fechaCargaPrecio;
        }

        /**
         * Sets the value of the fechaCargaPrecio property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaCargaPrecio(XMLGregorianCalendar value) {
            this.fechaCargaPrecio = value;
        }

        /**
         * Gets the value of the tipoValuacion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoValuacion() {
            return tipoValuacion;
        }

        /**
         * Sets the value of the tipoValuacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoValuacion(String value) {
            this.tipoValuacion = value;
        }

        /**
         * Gets the value of the monedaValuacion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonedaValuacion() {
            return monedaValuacion;
        }

        /**
         * Sets the value of the monedaValuacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonedaValuacion(String value) {
            this.monedaValuacion = value;
        }

        /**
         * Gets the value of the precio property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPrecio() {
            return precio;
        }

        /**
         * Sets the value of the precio property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPrecio(BigDecimal value) {
            this.precio = value;
        }

        /**
         * Gets the value of the tasaUtilizada property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasaUtilizada() {
            return tasaUtilizada;
        }

        /**
         * Sets the value of the tasaUtilizada property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTasaUtilizada(BigDecimal value) {
            this.tasaUtilizada = value;
        }

        /**
         * Gets the value of the valoresNominales property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValoresNominales() {
            return valoresNominales;
        }

        /**
         * Sets the value of the valoresNominales property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValoresNominales(BigDecimal value) {
            this.valoresNominales = value;
        }

        /**
         * Gets the value of the plazo property.
         * 
         */
        public int getPlazo() {
            return plazo;
        }

        /**
         * Sets the value of the plazo property.
         * 
         */
        public void setPlazo(int value) {
            this.plazo = value;
        }

    }

}
