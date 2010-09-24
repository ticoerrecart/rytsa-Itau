
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
 * <p>Java class for ArrayOfOperacionSWAPAValuarData complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="ArrayOfOperacionSWAPAValuarData">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperacionSWAPAValuarData" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="NumeroOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Producto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Mercado" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Instrumento" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MetodoFixing" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="BIBAPaga" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TasaFija" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="TasaVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MonedaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Frecuencia" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="FechaCarga" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FechaInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="FechaVencimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Banca" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GestorRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Estrategia" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Officer" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CliNum" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Raiz" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Cuit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Contraparte" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="NumeroBoleto" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="CantidadVN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Base1" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Base2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="RendimientoUltimoPeriodo" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RendimientoTotalHastaFechaActual" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="SwapVigentesTasaFija" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="SwapVigentesTasaVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Precio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="StrikeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MTMPayment" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="MTMReceived" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Base" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="RolTotalContable" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RdoMesContab" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RdoDiarioContab" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Vigentes" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Vencidos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="ComprasVigentes" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="VentasVigentes" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="DevTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="DevCob" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="DevPag" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Plazo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Dias" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RdoBBA" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="RdoBBANoDev" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="IdOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="FechaProceso" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="IdOperacionRelacionada" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "ArrayOfOperacionSWAPAValuarData", propOrder = {
    "operacionSWAPAValuarData"
})
public class ArrayOfOperacionSWAPAValuarData {

    @XmlElement(name = "OperacionSWAPAValuarData", nillable = true)
    protected List<ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData> operacionSWAPAValuarData;

    /**
     * Gets the value of the operacionSWAPAValuarData property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operacionSWAPAValuarData property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperacionSWAPAValuarData().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData }
     * 
     * 
     */
    public List<ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData> getOperacionSWAPAValuarData() {
        if (operacionSWAPAValuarData == null) {
            operacionSWAPAValuarData = new ArrayList<ArrayOfOperacionSWAPAValuarData.OperacionSWAPAValuarData>();
        }
        return this.operacionSWAPAValuarData;
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
     *       &lt;attribute name="Producto" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Mercado" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Instrumento" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MetodoFixing" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Moneda" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="BIBAPaga" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TasaFija" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="TasaVariable" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MonedaLiquidacion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TipoOperacion" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Frecuencia" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="FechaCarga" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FechaInicio" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="FechaVencimiento" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Banca" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GestorRiesgo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Estrategia" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Officer" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CliNum" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Raiz" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Cuenta" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Sucursal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Cuit" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Contraparte" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="NumeroBoleto" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="CantidadVN" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Base1" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Base2" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="RendimientoUltimoPeriodo" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RendimientoTotalHastaFechaActual" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="SwapVigentesTasaFija" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="SwapVigentesTasaVariable" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Precio" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="StrikeRef" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MTMPayment" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="MTMReceived" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Base" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="RolTotalContable" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RdoMesContab" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RdoDiarioContab" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Vigentes" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Vencidos" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="ComprasVigentes" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="VentasVigentes" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="DevTotal" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="DevCob" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="DevPag" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Plazo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Dias" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RdoBBA" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="RdoBBANoDev" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="IdOperacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="FechaProceso" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="IdOperacionRelacionada" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OperacionSWAPAValuarData {

        @XmlAttribute(name = "NumeroOperacion", required = true)
        protected int numeroOperacion;
        @XmlAttribute(name = "Producto")
        protected String producto;
        @XmlAttribute(name = "Mercado")
        protected String mercado;
        @XmlAttribute(name = "Instrumento")
        protected String instrumento;
        @XmlAttribute(name = "MetodoFixing")
        protected String metodoFixing;
        @XmlAttribute(name = "Moneda")
        protected String moneda;
        @XmlAttribute(name = "BIBAPaga")
        protected String bibaPaga;
        @XmlAttribute(name = "TasaFija", required = true)
        protected BigDecimal tasaFija;
        @XmlAttribute(name = "TasaVariable")
        protected String tasaVariable;
        @XmlAttribute(name = "MonedaLiquidacion")
        protected String monedaLiquidacion;
        @XmlAttribute(name = "TipoOperacion")
        protected String tipoOperacion;
        @XmlAttribute(name = "Frecuencia", required = true)
        protected int frecuencia;
        @XmlAttribute(name = "FechaCarga", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaCarga;
        @XmlAttribute(name = "FechaInicio", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaInicio;
        @XmlAttribute(name = "FechaVencimiento", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaVencimiento;
        @XmlAttribute(name = "Banca")
        protected String banca;
        @XmlAttribute(name = "GestorRiesgo")
        protected String gestorRiesgo;
        @XmlAttribute(name = "Estrategia")
        protected String estrategia;
        @XmlAttribute(name = "Officer")
        protected String officer;
        @XmlAttribute(name = "CliNum")
        protected String cliNum;
        @XmlAttribute(name = "Raiz")
        protected String raiz;
        @XmlAttribute(name = "Cuenta")
        protected String cuenta;
        @XmlAttribute(name = "Sucursal")
        protected String sucursal;
        @XmlAttribute(name = "Cuit")
        protected String cuit;
        @XmlAttribute(name = "Contraparte")
        protected String contraparte;
        @XmlAttribute(name = "NumeroBoleto", required = true)
        protected int numeroBoleto;
        @XmlAttribute(name = "CantidadVN", required = true)
        protected BigDecimal cantidadVN;
        @XmlAttribute(name = "Base1", required = true)
        protected int base1;
        @XmlAttribute(name = "Base2", required = true)
        protected int base2;
        @XmlAttribute(name = "RendimientoUltimoPeriodo", required = true)
        protected BigDecimal rendimientoUltimoPeriodo;
        @XmlAttribute(name = "RendimientoTotalHastaFechaActual", required = true)
        protected BigDecimal rendimientoTotalHastaFechaActual;
        @XmlAttribute(name = "SwapVigentesTasaFija", required = true)
        protected BigDecimal swapVigentesTasaFija;
        @XmlAttribute(name = "SwapVigentesTasaVariable", required = true)
        protected BigDecimal swapVigentesTasaVariable;
        @XmlAttribute(name = "Precio", required = true)
        protected BigDecimal precio;
        @XmlAttribute(name = "StrikeRef", required = true)
        protected BigDecimal strikeRef;
        @XmlAttribute(name = "MTMPayment", required = true)
        protected BigDecimal mtmPayment;
        @XmlAttribute(name = "MTMReceived", required = true)
        protected BigDecimal mtmReceived;
        @XmlAttribute(name = "Base", required = true)
        protected int base;
        @XmlAttribute(name = "RolTotalContable", required = true)
        protected BigDecimal rolTotalContable;
        @XmlAttribute(name = "RdoMesContab", required = true)
        protected BigDecimal rdoMesContab;
        @XmlAttribute(name = "RdoDiarioContab", required = true)
        protected BigDecimal rdoDiarioContab;
        @XmlAttribute(name = "Vigentes", required = true)
        protected BigDecimal vigentes;
        @XmlAttribute(name = "Vencidos", required = true)
        protected BigDecimal vencidos;
        @XmlAttribute(name = "ComprasVigentes", required = true)
        protected BigDecimal comprasVigentes;
        @XmlAttribute(name = "VentasVigentes", required = true)
        protected BigDecimal ventasVigentes;
        @XmlAttribute(name = "DevTotal", required = true)
        protected BigDecimal devTotal;
        @XmlAttribute(name = "DevCob", required = true)
        protected BigDecimal devCob;
        @XmlAttribute(name = "DevPag", required = true)
        protected BigDecimal devPag;
        @XmlAttribute(name = "Plazo", required = true)
        protected int plazo;
        @XmlAttribute(name = "Dias")
        protected String dias;
        @XmlAttribute(name = "RdoBBA", required = true)
        protected BigDecimal rdoBBA;
        @XmlAttribute(name = "RdoBBANoDev", required = true)
        protected BigDecimal rdoBBANoDev;
        @XmlAttribute(name = "IdOperacion", required = true)
        protected int idOperacion;
        @XmlAttribute(name = "FechaProceso", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar fechaProceso;
        @XmlAttribute(name = "IdOperacionRelacionada", required = true)
        protected int idOperacionRelacionada;

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
         * Gets the value of the producto property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProducto() {
            return producto;
        }

        /**
         * Sets the value of the producto property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProducto(String value) {
            this.producto = value;
        }

        /**
         * Gets the value of the mercado property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMercado() {
            return mercado;
        }

        /**
         * Sets the value of the mercado property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMercado(String value) {
            this.mercado = value;
        }

        /**
         * Gets the value of the instrumento property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstrumento() {
            return instrumento;
        }

        /**
         * Sets the value of the instrumento property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstrumento(String value) {
            this.instrumento = value;
        }

        /**
         * Gets the value of the metodoFixing property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMetodoFixing() {
            return metodoFixing;
        }

        /**
         * Sets the value of the metodoFixing property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMetodoFixing(String value) {
            this.metodoFixing = value;
        }

        /**
         * Gets the value of the moneda property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoneda() {
            return moneda;
        }

        /**
         * Sets the value of the moneda property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoneda(String value) {
            this.moneda = value;
        }

        /**
         * Gets the value of the bibaPaga property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBIBAPaga() {
            return bibaPaga;
        }

        /**
         * Sets the value of the bibaPaga property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBIBAPaga(String value) {
            this.bibaPaga = value;
        }

        /**
         * Gets the value of the tasaFija property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getTasaFija() {
            return tasaFija;
        }

        /**
         * Sets the value of the tasaFija property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setTasaFija(BigDecimal value) {
            this.tasaFija = value;
        }

        /**
         * Gets the value of the tasaVariable property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTasaVariable() {
            return tasaVariable;
        }

        /**
         * Sets the value of the tasaVariable property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTasaVariable(String value) {
            this.tasaVariable = value;
        }

        /**
         * Gets the value of the monedaLiquidacion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMonedaLiquidacion() {
            return monedaLiquidacion;
        }

        /**
         * Sets the value of the monedaLiquidacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMonedaLiquidacion(String value) {
            this.monedaLiquidacion = value;
        }

        /**
         * Gets the value of the tipoOperacion property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTipoOperacion() {
            return tipoOperacion;
        }

        /**
         * Sets the value of the tipoOperacion property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTipoOperacion(String value) {
            this.tipoOperacion = value;
        }

        /**
         * Gets the value of the frecuencia property.
         * 
         */
        public int getFrecuencia() {
            return frecuencia;
        }

        /**
         * Sets the value of the frecuencia property.
         * 
         */
        public void setFrecuencia(int value) {
            this.frecuencia = value;
        }

        /**
         * Gets the value of the fechaCarga property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaCarga() {
            return fechaCarga;
        }

        /**
         * Sets the value of the fechaCarga property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaCarga(XMLGregorianCalendar value) {
            this.fechaCarga = value;
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
         * Gets the value of the banca property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBanca() {
            return banca;
        }

        /**
         * Sets the value of the banca property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBanca(String value) {
            this.banca = value;
        }

        /**
         * Gets the value of the gestorRiesgo property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGestorRiesgo() {
            return gestorRiesgo;
        }

        /**
         * Sets the value of the gestorRiesgo property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGestorRiesgo(String value) {
            this.gestorRiesgo = value;
        }

        /**
         * Gets the value of the estrategia property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEstrategia() {
            return estrategia;
        }

        /**
         * Sets the value of the estrategia property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEstrategia(String value) {
            this.estrategia = value;
        }

        /**
         * Gets the value of the officer property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfficer() {
            return officer;
        }

        /**
         * Sets the value of the officer property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfficer(String value) {
            this.officer = value;
        }

        /**
         * Gets the value of the cliNum property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCliNum() {
            return cliNum;
        }

        /**
         * Sets the value of the cliNum property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCliNum(String value) {
            this.cliNum = value;
        }

        /**
         * Gets the value of the raiz property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRaiz() {
            return raiz;
        }

        /**
         * Sets the value of the raiz property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRaiz(String value) {
            this.raiz = value;
        }

        /**
         * Gets the value of the cuenta property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCuenta() {
            return cuenta;
        }

        /**
         * Sets the value of the cuenta property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCuenta(String value) {
            this.cuenta = value;
        }

        /**
         * Gets the value of the sucursal property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSucursal() {
            return sucursal;
        }

        /**
         * Sets the value of the sucursal property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSucursal(String value) {
            this.sucursal = value;
        }

        /**
         * Gets the value of the cuit property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCuit() {
            return cuit;
        }

        /**
         * Sets the value of the cuit property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCuit(String value) {
            this.cuit = value;
        }

        /**
         * Gets the value of the contraparte property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContraparte() {
            return contraparte;
        }

        /**
         * Sets the value of the contraparte property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContraparte(String value) {
            this.contraparte = value;
        }

        /**
         * Gets the value of the numeroBoleto property.
         * 
         */
        public int getNumeroBoleto() {
            return numeroBoleto;
        }

        /**
         * Sets the value of the numeroBoleto property.
         * 
         */
        public void setNumeroBoleto(int value) {
            this.numeroBoleto = value;
        }

        /**
         * Gets the value of the cantidadVN property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getCantidadVN() {
            return cantidadVN;
        }

        /**
         * Sets the value of the cantidadVN property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setCantidadVN(BigDecimal value) {
            this.cantidadVN = value;
        }

        /**
         * Gets the value of the base1 property.
         * 
         */
        public int getBase1() {
            return base1;
        }

        /**
         * Sets the value of the base1 property.
         * 
         */
        public void setBase1(int value) {
            this.base1 = value;
        }

        /**
         * Gets the value of the base2 property.
         * 
         */
        public int getBase2() {
            return base2;
        }

        /**
         * Sets the value of the base2 property.
         * 
         */
        public void setBase2(int value) {
            this.base2 = value;
        }

        /**
         * Gets the value of the rendimientoUltimoPeriodo property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRendimientoUltimoPeriodo() {
            return rendimientoUltimoPeriodo;
        }

        /**
         * Sets the value of the rendimientoUltimoPeriodo property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRendimientoUltimoPeriodo(BigDecimal value) {
            this.rendimientoUltimoPeriodo = value;
        }

        /**
         * Gets the value of the rendimientoTotalHastaFechaActual property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRendimientoTotalHastaFechaActual() {
            return rendimientoTotalHastaFechaActual;
        }

        /**
         * Sets the value of the rendimientoTotalHastaFechaActual property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRendimientoTotalHastaFechaActual(BigDecimal value) {
            this.rendimientoTotalHastaFechaActual = value;
        }

        /**
         * Gets the value of the swapVigentesTasaFija property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSwapVigentesTasaFija() {
            return swapVigentesTasaFija;
        }

        /**
         * Sets the value of the swapVigentesTasaFija property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSwapVigentesTasaFija(BigDecimal value) {
            this.swapVigentesTasaFija = value;
        }

        /**
         * Gets the value of the swapVigentesTasaVariable property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getSwapVigentesTasaVariable() {
            return swapVigentesTasaVariable;
        }

        /**
         * Sets the value of the swapVigentesTasaVariable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setSwapVigentesTasaVariable(BigDecimal value) {
            this.swapVigentesTasaVariable = value;
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
         * Gets the value of the strikeRef property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getStrikeRef() {
            return strikeRef;
        }

        /**
         * Sets the value of the strikeRef property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setStrikeRef(BigDecimal value) {
            this.strikeRef = value;
        }

        /**
         * Gets the value of the mtmPayment property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMTMPayment() {
            return mtmPayment;
        }

        /**
         * Sets the value of the mtmPayment property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMTMPayment(BigDecimal value) {
            this.mtmPayment = value;
        }

        /**
         * Gets the value of the mtmReceived property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMTMReceived() {
            return mtmReceived;
        }

        /**
         * Sets the value of the mtmReceived property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMTMReceived(BigDecimal value) {
            this.mtmReceived = value;
        }

        /**
         * Gets the value of the base property.
         * 
         */
        public int getBase() {
            return base;
        }

        /**
         * Sets the value of the base property.
         * 
         */
        public void setBase(int value) {
            this.base = value;
        }

        /**
         * Gets the value of the rolTotalContable property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRolTotalContable() {
            return rolTotalContable;
        }

        /**
         * Sets the value of the rolTotalContable property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRolTotalContable(BigDecimal value) {
            this.rolTotalContable = value;
        }

        /**
         * Gets the value of the rdoMesContab property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRdoMesContab() {
            return rdoMesContab;
        }

        /**
         * Sets the value of the rdoMesContab property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRdoMesContab(BigDecimal value) {
            this.rdoMesContab = value;
        }

        /**
         * Gets the value of the rdoDiarioContab property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRdoDiarioContab() {
            return rdoDiarioContab;
        }

        /**
         * Sets the value of the rdoDiarioContab property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRdoDiarioContab(BigDecimal value) {
            this.rdoDiarioContab = value;
        }

        /**
         * Gets the value of the vigentes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVigentes() {
            return vigentes;
        }

        /**
         * Sets the value of the vigentes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVigentes(BigDecimal value) {
            this.vigentes = value;
        }

        /**
         * Gets the value of the vencidos property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVencidos() {
            return vencidos;
        }

        /**
         * Sets the value of the vencidos property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVencidos(BigDecimal value) {
            this.vencidos = value;
        }

        /**
         * Gets the value of the comprasVigentes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getComprasVigentes() {
            return comprasVigentes;
        }

        /**
         * Sets the value of the comprasVigentes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setComprasVigentes(BigDecimal value) {
            this.comprasVigentes = value;
        }

        /**
         * Gets the value of the ventasVigentes property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVentasVigentes() {
            return ventasVigentes;
        }

        /**
         * Sets the value of the ventasVigentes property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVentasVigentes(BigDecimal value) {
            this.ventasVigentes = value;
        }

        /**
         * Gets the value of the devTotal property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDevTotal() {
            return devTotal;
        }

        /**
         * Sets the value of the devTotal property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDevTotal(BigDecimal value) {
            this.devTotal = value;
        }

        /**
         * Gets the value of the devCob property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDevCob() {
            return devCob;
        }

        /**
         * Sets the value of the devCob property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDevCob(BigDecimal value) {
            this.devCob = value;
        }

        /**
         * Gets the value of the devPag property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getDevPag() {
            return devPag;
        }

        /**
         * Sets the value of the devPag property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setDevPag(BigDecimal value) {
            this.devPag = value;
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

        /**
         * Gets the value of the dias property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDias() {
            return dias;
        }

        /**
         * Sets the value of the dias property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDias(String value) {
            this.dias = value;
        }

        /**
         * Gets the value of the rdoBBA property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRdoBBA() {
            return rdoBBA;
        }

        /**
         * Sets the value of the rdoBBA property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRdoBBA(BigDecimal value) {
            this.rdoBBA = value;
        }

        /**
         * Gets the value of the rdoBBANoDev property.
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRdoBBANoDev() {
            return rdoBBANoDev;
        }

        /**
         * Sets the value of the rdoBBANoDev property.
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRdoBBANoDev(BigDecimal value) {
            this.rdoBBANoDev = value;
        }

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
         * Gets the value of the fechaProceso property.
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFechaProceso() {
            return fechaProceso;
        }

        /**
         * Sets the value of the fechaProceso property.
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFechaProceso(XMLGregorianCalendar value) {
            this.fechaProceso = value;
        }

        /**
         * Gets the value of the idOperacionRelacionada property.
         * 
         */
        public int getIdOperacionRelacionada() {
            return idOperacionRelacionada;
        }

        /**
         * Sets the value of the idOperacionRelacionada property.
         * 
         */
        public void setIdOperacionRelacionada(int value) {
            this.idOperacionRelacionada = value;
        }

    }

}
