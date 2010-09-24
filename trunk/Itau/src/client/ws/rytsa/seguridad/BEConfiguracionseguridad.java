
package client.ws.rytsa.seguridad;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for BEConfiguracionseguridad complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BEConfiguracionseguridad">
 *   &lt;complexContent>
 *     &lt;extension base="{http://tempuri.org/}BEWithID">
 *       &lt;sequence>
 *         &lt;element name="UltimaActualizacion" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TimeOutExtensionSesion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="TimeOutInicialSesion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CantidadPasswordsHistoricas" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="DiasCambioPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CantidadIntentosMaximo" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CantidadAlfabeticosPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CantidadNumericosPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ConsideraCantidadCaracteres" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ConsideraMinimoLargoPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CantidadMinimoLargoPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ConsideraMaxCantCaractConsec" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CantidadMaxCaractConsec" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Maximodiasinactividad" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Tipologin" use="required" type="{http://tempuri.org/}TipoLogin" />
 *       &lt;attribute name="TimeOutAplicacion" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="MaximaAntiguedadSesiones" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Usuarioinvalidopassword" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MuestraBannerLogin" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BannerLogin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TipoUsuarioLogin" use="required" type="{http://tempuri.org/}TipoUsuarioLogin" />
 *       &lt;attribute name="Muestraultimosintentoslogin" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Muestraultimoslogininicio" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Consideracambiopassusuarioproc" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CantidadMayusculasPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CantidadMinusculasPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="CantidadSimbolosPassword" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="URLSesionExpirada" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BEConfiguracionseguridad", propOrder = {
    "ultimaActualizacion"
})
public class BEConfiguracionseguridad
    extends BEWithID
{

    @XmlElement(name = "UltimaActualizacion")
    protected byte[] ultimaActualizacion;
    @XmlAttribute(name = "TimeOutExtensionSesion", required = true)
    protected int timeOutExtensionSesion;
    @XmlAttribute(name = "TimeOutInicialSesion", required = true)
    protected int timeOutInicialSesion;
    @XmlAttribute(name = "CantidadPasswordsHistoricas", required = true)
    protected int cantidadPasswordsHistoricas;
    @XmlAttribute(name = "DiasCambioPassword", required = true)
    protected int diasCambioPassword;
    @XmlAttribute(name = "CantidadIntentosMaximo", required = true)
    protected int cantidadIntentosMaximo;
    @XmlAttribute(name = "CantidadAlfabeticosPassword", required = true)
    protected int cantidadAlfabeticosPassword;
    @XmlAttribute(name = "CantidadNumericosPassword", required = true)
    protected int cantidadNumericosPassword;
    @XmlAttribute(name = "ConsideraCantidadCaracteres", required = true)
    protected boolean consideraCantidadCaracteres;
    @XmlAttribute(name = "ConsideraMinimoLargoPassword", required = true)
    protected boolean consideraMinimoLargoPassword;
    @XmlAttribute(name = "CantidadMinimoLargoPassword", required = true)
    protected int cantidadMinimoLargoPassword;
    @XmlAttribute(name = "ConsideraMaxCantCaractConsec", required = true)
    protected boolean consideraMaxCantCaractConsec;
    @XmlAttribute(name = "CantidadMaxCaractConsec", required = true)
    protected int cantidadMaxCaractConsec;
    @XmlAttribute(name = "Maximodiasinactividad", required = true)
    protected int maximodiasinactividad;
    @XmlAttribute(name = "Tipologin", required = true)
    protected TipoLogin tipologin;
    @XmlAttribute(name = "TimeOutAplicacion", required = true)
    protected int timeOutAplicacion;
    @XmlAttribute(name = "MaximaAntiguedadSesiones", required = true)
    protected int maximaAntiguedadSesiones;
    @XmlAttribute(name = "Usuarioinvalidopassword", required = true)
    protected boolean usuarioinvalidopassword;
    @XmlAttribute(name = "MuestraBannerLogin", required = true)
    protected boolean muestraBannerLogin;
    @XmlAttribute(name = "BannerLogin")
    protected String bannerLogin;
    @XmlAttribute(name = "TipoUsuarioLogin", required = true)
    protected TipoUsuarioLogin tipoUsuarioLogin;
    @XmlAttribute(name = "Muestraultimosintentoslogin", required = true)
    protected int muestraultimosintentoslogin;
    @XmlAttribute(name = "Muestraultimoslogininicio", required = true)
    protected boolean muestraultimoslogininicio;
    @XmlAttribute(name = "Consideracambiopassusuarioproc", required = true)
    protected boolean consideracambiopassusuarioproc;
    @XmlAttribute(name = "CantidadMayusculasPassword", required = true)
    protected int cantidadMayusculasPassword;
    @XmlAttribute(name = "CantidadMinusculasPassword", required = true)
    protected int cantidadMinusculasPassword;
    @XmlAttribute(name = "CantidadSimbolosPassword", required = true)
    protected int cantidadSimbolosPassword;
    @XmlAttribute(name = "URLSesionExpirada")
    protected String urlSesionExpirada;

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
     * Gets the value of the timeOutExtensionSesion property.
     * 
     */
    public int getTimeOutExtensionSesion() {
        return timeOutExtensionSesion;
    }

    /**
     * Sets the value of the timeOutExtensionSesion property.
     * 
     */
    public void setTimeOutExtensionSesion(int value) {
        this.timeOutExtensionSesion = value;
    }

    /**
     * Gets the value of the timeOutInicialSesion property.
     * 
     */
    public int getTimeOutInicialSesion() {
        return timeOutInicialSesion;
    }

    /**
     * Sets the value of the timeOutInicialSesion property.
     * 
     */
    public void setTimeOutInicialSesion(int value) {
        this.timeOutInicialSesion = value;
    }

    /**
     * Gets the value of the cantidadPasswordsHistoricas property.
     * 
     */
    public int getCantidadPasswordsHistoricas() {
        return cantidadPasswordsHistoricas;
    }

    /**
     * Sets the value of the cantidadPasswordsHistoricas property.
     * 
     */
    public void setCantidadPasswordsHistoricas(int value) {
        this.cantidadPasswordsHistoricas = value;
    }

    /**
     * Gets the value of the diasCambioPassword property.
     * 
     */
    public int getDiasCambioPassword() {
        return diasCambioPassword;
    }

    /**
     * Sets the value of the diasCambioPassword property.
     * 
     */
    public void setDiasCambioPassword(int value) {
        this.diasCambioPassword = value;
    }

    /**
     * Gets the value of the cantidadIntentosMaximo property.
     * 
     */
    public int getCantidadIntentosMaximo() {
        return cantidadIntentosMaximo;
    }

    /**
     * Sets the value of the cantidadIntentosMaximo property.
     * 
     */
    public void setCantidadIntentosMaximo(int value) {
        this.cantidadIntentosMaximo = value;
    }

    /**
     * Gets the value of the cantidadAlfabeticosPassword property.
     * 
     */
    public int getCantidadAlfabeticosPassword() {
        return cantidadAlfabeticosPassword;
    }

    /**
     * Sets the value of the cantidadAlfabeticosPassword property.
     * 
     */
    public void setCantidadAlfabeticosPassword(int value) {
        this.cantidadAlfabeticosPassword = value;
    }

    /**
     * Gets the value of the cantidadNumericosPassword property.
     * 
     */
    public int getCantidadNumericosPassword() {
        return cantidadNumericosPassword;
    }

    /**
     * Sets the value of the cantidadNumericosPassword property.
     * 
     */
    public void setCantidadNumericosPassword(int value) {
        this.cantidadNumericosPassword = value;
    }

    /**
     * Gets the value of the consideraCantidadCaracteres property.
     * 
     */
    public boolean isConsideraCantidadCaracteres() {
        return consideraCantidadCaracteres;
    }

    /**
     * Sets the value of the consideraCantidadCaracteres property.
     * 
     */
    public void setConsideraCantidadCaracteres(boolean value) {
        this.consideraCantidadCaracteres = value;
    }

    /**
     * Gets the value of the consideraMinimoLargoPassword property.
     * 
     */
    public boolean isConsideraMinimoLargoPassword() {
        return consideraMinimoLargoPassword;
    }

    /**
     * Sets the value of the consideraMinimoLargoPassword property.
     * 
     */
    public void setConsideraMinimoLargoPassword(boolean value) {
        this.consideraMinimoLargoPassword = value;
    }

    /**
     * Gets the value of the cantidadMinimoLargoPassword property.
     * 
     */
    public int getCantidadMinimoLargoPassword() {
        return cantidadMinimoLargoPassword;
    }

    /**
     * Sets the value of the cantidadMinimoLargoPassword property.
     * 
     */
    public void setCantidadMinimoLargoPassword(int value) {
        this.cantidadMinimoLargoPassword = value;
    }

    /**
     * Gets the value of the consideraMaxCantCaractConsec property.
     * 
     */
    public boolean isConsideraMaxCantCaractConsec() {
        return consideraMaxCantCaractConsec;
    }

    /**
     * Sets the value of the consideraMaxCantCaractConsec property.
     * 
     */
    public void setConsideraMaxCantCaractConsec(boolean value) {
        this.consideraMaxCantCaractConsec = value;
    }

    /**
     * Gets the value of the cantidadMaxCaractConsec property.
     * 
     */
    public int getCantidadMaxCaractConsec() {
        return cantidadMaxCaractConsec;
    }

    /**
     * Sets the value of the cantidadMaxCaractConsec property.
     * 
     */
    public void setCantidadMaxCaractConsec(int value) {
        this.cantidadMaxCaractConsec = value;
    }

    /**
     * Gets the value of the maximodiasinactividad property.
     * 
     */
    public int getMaximodiasinactividad() {
        return maximodiasinactividad;
    }

    /**
     * Sets the value of the maximodiasinactividad property.
     * 
     */
    public void setMaximodiasinactividad(int value) {
        this.maximodiasinactividad = value;
    }

    /**
     * Gets the value of the tipologin property.
     * 
     * @return
     *     possible object is
     *     {@link TipoLogin }
     *     
     */
    public TipoLogin getTipologin() {
        return tipologin;
    }

    /**
     * Sets the value of the tipologin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoLogin }
     *     
     */
    public void setTipologin(TipoLogin value) {
        this.tipologin = value;
    }

    /**
     * Gets the value of the timeOutAplicacion property.
     * 
     */
    public int getTimeOutAplicacion() {
        return timeOutAplicacion;
    }

    /**
     * Sets the value of the timeOutAplicacion property.
     * 
     */
    public void setTimeOutAplicacion(int value) {
        this.timeOutAplicacion = value;
    }

    /**
     * Gets the value of the maximaAntiguedadSesiones property.
     * 
     */
    public int getMaximaAntiguedadSesiones() {
        return maximaAntiguedadSesiones;
    }

    /**
     * Sets the value of the maximaAntiguedadSesiones property.
     * 
     */
    public void setMaximaAntiguedadSesiones(int value) {
        this.maximaAntiguedadSesiones = value;
    }

    /**
     * Gets the value of the usuarioinvalidopassword property.
     * 
     */
    public boolean isUsuarioinvalidopassword() {
        return usuarioinvalidopassword;
    }

    /**
     * Sets the value of the usuarioinvalidopassword property.
     * 
     */
    public void setUsuarioinvalidopassword(boolean value) {
        this.usuarioinvalidopassword = value;
    }

    /**
     * Gets the value of the muestraBannerLogin property.
     * 
     */
    public boolean isMuestraBannerLogin() {
        return muestraBannerLogin;
    }

    /**
     * Sets the value of the muestraBannerLogin property.
     * 
     */
    public void setMuestraBannerLogin(boolean value) {
        this.muestraBannerLogin = value;
    }

    /**
     * Gets the value of the bannerLogin property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBannerLogin() {
        return bannerLogin;
    }

    /**
     * Sets the value of the bannerLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBannerLogin(String value) {
        this.bannerLogin = value;
    }

    /**
     * Gets the value of the tipoUsuarioLogin property.
     * 
     * @return
     *     possible object is
     *     {@link TipoUsuarioLogin }
     *     
     */
    public TipoUsuarioLogin getTipoUsuarioLogin() {
        return tipoUsuarioLogin;
    }

    /**
     * Sets the value of the tipoUsuarioLogin property.
     * 
     * @param value
     *     allowed object is
     *     {@link TipoUsuarioLogin }
     *     
     */
    public void setTipoUsuarioLogin(TipoUsuarioLogin value) {
        this.tipoUsuarioLogin = value;
    }

    /**
     * Gets the value of the muestraultimosintentoslogin property.
     * 
     */
    public int getMuestraultimosintentoslogin() {
        return muestraultimosintentoslogin;
    }

    /**
     * Sets the value of the muestraultimosintentoslogin property.
     * 
     */
    public void setMuestraultimosintentoslogin(int value) {
        this.muestraultimosintentoslogin = value;
    }

    /**
     * Gets the value of the muestraultimoslogininicio property.
     * 
     */
    public boolean isMuestraultimoslogininicio() {
        return muestraultimoslogininicio;
    }

    /**
     * Sets the value of the muestraultimoslogininicio property.
     * 
     */
    public void setMuestraultimoslogininicio(boolean value) {
        this.muestraultimoslogininicio = value;
    }

    /**
     * Gets the value of the consideracambiopassusuarioproc property.
     * 
     */
    public boolean isConsideracambiopassusuarioproc() {
        return consideracambiopassusuarioproc;
    }

    /**
     * Sets the value of the consideracambiopassusuarioproc property.
     * 
     */
    public void setConsideracambiopassusuarioproc(boolean value) {
        this.consideracambiopassusuarioproc = value;
    }

    /**
     * Gets the value of the cantidadMayusculasPassword property.
     * 
     */
    public int getCantidadMayusculasPassword() {
        return cantidadMayusculasPassword;
    }

    /**
     * Sets the value of the cantidadMayusculasPassword property.
     * 
     */
    public void setCantidadMayusculasPassword(int value) {
        this.cantidadMayusculasPassword = value;
    }

    /**
     * Gets the value of the cantidadMinusculasPassword property.
     * 
     */
    public int getCantidadMinusculasPassword() {
        return cantidadMinusculasPassword;
    }

    /**
     * Sets the value of the cantidadMinusculasPassword property.
     * 
     */
    public void setCantidadMinusculasPassword(int value) {
        this.cantidadMinusculasPassword = value;
    }

    /**
     * Gets the value of the cantidadSimbolosPassword property.
     * 
     */
    public int getCantidadSimbolosPassword() {
        return cantidadSimbolosPassword;
    }

    /**
     * Sets the value of the cantidadSimbolosPassword property.
     * 
     */
    public void setCantidadSimbolosPassword(int value) {
        this.cantidadSimbolosPassword = value;
    }

    /**
     * Gets the value of the urlSesionExpirada property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getURLSesionExpirada() {
        return urlSesionExpirada;
    }

    /**
     * Sets the value of the urlSesionExpirada property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setURLSesionExpirada(String value) {
        this.urlSesionExpirada = value;
    }

}
