
package client.ws.rytsa.valuaciones;

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
 * <p>Java class for ArrayOfAgendaCuponOperacioneSWAPAValuarData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfAgendaCuponOperacioneSWAPAValuarData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgendaCuponOperacioneSWAPAValuarData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="NumeroOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="IdCupon" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="TipoFlujo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ReceivedOPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FechaInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FechaVencimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FechaIndiceInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FechaIndiceFin" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
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
@XmlType(name = "ArrayOfAgendaCuponOperacioneSWAPAValuarData", propOrder = {
    "agendaCuponOperacioneSWAPAValuarData"
})
public class ArrayOfAgendaCuponOperacioneSWAPAValuarData {

    @XmlElement(name = "AgendaCuponOperacioneSWAPAValuarData", nillable = true)
    protected List<ArrayOfAgendaCuponOperacioneSWAPAValuarData.AgendaCuponOperacioneSWAPAValuarData> agendaCuponOperacioneSWAPAValuarData;

    /**
     * Gets the value of the agendaCuponOperacioneSWAPAValuarData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agendaCuponOperacioneSWAPAValuarData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgendaCuponOperacioneSWAPAValuarData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfAgendaCuponOperacioneSWAPAValuarData.AgendaCuponOperacioneSWAPAValuarData }
     * 
     * 
     */
    public List<ArrayOfAgendaCuponOperacioneSWAPAValuarData.AgendaCuponOperacioneSWAPAValuarData> getAgendaCuponOperacioneSWAPAValuarData() {
        if (agendaCuponOperacioneSWAPAValuarData == null) {
            agendaCuponOperacioneSWAPAValuarData = new ArrayList<ArrayOfAgendaCuponOperacioneSWAPAValuarData.AgendaCuponOperacioneSWAPAValuarData>();
        }
        return this.agendaCuponOperacioneSWAPAValuarData;
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
     *       &lt;attribute name="NumeroOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="IdCupon" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="TipoFlujo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ReceivedOPayment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FechaInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FechaVencimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FechaIndiceInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FechaIndiceFin" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AgendaCuponOperacioneSWAPAValuarData {

        @XmlAttribute(name = "NumeroOperacion", required = true)
        protected int numeroOperacion;
        @XmlAttribute(name = "IdCupon", required = true)
        protected int idCupon;
        @XmlAttribute(name = "TipoFlujo")
        protected String tipoFlujo;
        @XmlAttribute(name = "ReceivedOPayment")
        protected String receivedOPayment;
        @XmlAttribute(name = "FechaInicio", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaInicio;
        @XmlAttribute(name = "FechaVencimiento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaVencimiento;
        @XmlAttribute(name = "FechaIndiceInicio", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaIndiceInicio;
        @XmlAttribute(name = "FechaIndiceFin", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaIndiceFin;

        /**
         * Gets the value of the numeroOperacion property.
         * 
         */
        public int getNumeroOperacion() {
            return numeroOperacion;
        }

        /**
         * Sets the value of the numeroOperacion property.
         * 
         */
        public void setNumeroOperacion(int value) {
            this.numeroOperacion = value;
        }

        /**
         * Gets the value of the idCupon property.
         * 
         */
        public int getIdCupon() {
            return idCupon;
        }

        /**
         * Sets the value of the idCupon property.
         * 
         */
        public void setIdCupon(int value) {
            this.idCupon = value;
        }

        /**
         * Gets the value of the tipoFlujo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoFlujo() {
            return tipoFlujo;
        }

        /**
         * Sets the value of the tipoFlujo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoFlujo(String value) {
            this.tipoFlujo = value;
        }

        /**
         * Gets the value of the receivedOPayment property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReceivedOPayment() {
            return receivedOPayment;
        }

        /**
         * Sets the value of the receivedOPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReceivedOPayment(String value) {
            this.receivedOPayment = value;
        }

        /**
         * Gets the value of the fechaInicio property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaInicio() {
            return fechaInicio;
        }

        /**
         * Sets the value of the fechaInicio property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaInicio(XMLGregorianCalendar value) {
            this.fechaInicio = value;
        }

        /**
         * Gets the value of the fechaVencimiento property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaVencimiento() {
            return fechaVencimiento;
        }

        /**
         * Sets the value of the fechaVencimiento property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaVencimiento(XMLGregorianCalendar value) {
            this.fechaVencimiento = value;
        }

        /**
         * Gets the value of the fechaIndiceInicio property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaIndiceInicio() {
            return fechaIndiceInicio;
        }

        /**
         * Sets the value of the fechaIndiceInicio property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaIndiceInicio(XMLGregorianCalendar value) {
            this.fechaIndiceInicio = value;
        }

        /**
         * Gets the value of the fechaIndiceFin property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaIndiceFin() {
            return fechaIndiceFin;
        }

        /**
         * Sets the value of the fechaIndiceFin property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaIndiceFin(XMLGregorianCalendar value) {
            this.fechaIndiceFin = value;
        }

    }

}
