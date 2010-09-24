
package client.ws.rytsa.general;

import java.math.BigDecimal;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.datatype.XMLGregorianCalendar;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the client.ws.rytsa.general package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _String_QNAME = new QName("http://tempuri.org/", "string");
    private final static QName _DateTime_QNAME = new QName("http://tempuri.org/", "dateTime");
    private final static QName _Decimal_QNAME = new QName("http://tempuri.org/", "decimal");
    private final static QName _UserAuthInfo_QNAME = new QName("http://tempuri.org/", "UserAuthInfo");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: client.ws.rytsa.general
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link GetVersionResponse }
     * 
     */
    public GetVersionResponse createGetVersionResponse() {
        return new GetVersionResponse();
    }

    /**
     * Create an instance of {@link GetByIDTiposSociedad }
     * 
     */
    public GetByIDTiposSociedad createGetByIDTiposSociedad() {
        return new GetByIDTiposSociedad();
    }

    /**
     * Create an instance of {@link GenerarAsientos }
     * 
     */
    public GenerarAsientos createGenerarAsientos() {
        return new GenerarAsientos();
    }

    /**
     * Create an instance of {@link SetConfiguracionpresentacionResponse }
     * 
     */
    public SetConfiguracionpresentacionResponse createSetConfiguracionpresentacionResponse() {
        return new SetConfiguracionpresentacionResponse();
    }

    /**
     * Create an instance of {@link GetVersion }
     * 
     */
    public GetVersion createGetVersion() {
        return new GetVersion();
    }

    /**
     * Create an instance of {@link GetByIDGruposEconomicosResponse }
     * 
     */
    public GetByIDGruposEconomicosResponse createGetByIDGruposEconomicosResponse() {
        return new GetByIDGruposEconomicosResponse();
    }

    /**
     * Create an instance of {@link CreateCalendariosResponse }
     * 
     */
    public CreateCalendariosResponse createCreateCalendariosResponse() {
        return new CreateCalendariosResponse();
    }

    /**
     * Create an instance of {@link SetImputacionCuentasComitentesWithBesesion }
     * 
     */
    public SetImputacionCuentasComitentesWithBesesion createSetImputacionCuentasComitentesWithBesesion() {
        return new SetImputacionCuentasComitentesWithBesesion();
    }

    /**
     * Create an instance of {@link GetAllLookUpPaises }
     * 
     */
    public GetAllLookUpPaises createGetAllLookUpPaises() {
        return new GetAllLookUpPaises();
    }

    /**
     * Create an instance of {@link GetWindowsThreadIdentity }
     * 
     */
    public GetWindowsThreadIdentity createGetWindowsThreadIdentity() {
        return new GetWindowsThreadIdentity();
    }

    /**
     * Create an instance of {@link GetAllPersonas }
     * 
     */
    public GetAllPersonas createGetAllPersonas() {
        return new GetAllPersonas();
    }

    /**
     * Create an instance of {@link GenerarSalidaContableResponse }
     * 
     */
    public GenerarSalidaContableResponse createGenerarSalidaContableResponse() {
        return new GenerarSalidaContableResponse();
    }

    /**
     * Create an instance of {@link GetByIDCategoriasImpuesto }
     * 
     */
    public GetByIDCategoriasImpuesto createGetByIDCategoriasImpuesto() {
        return new GetByIDCategoriasImpuesto();
    }

    /**
     * Create an instance of {@link ClearEjecucionProcesosResponse }
     * 
     */
    public ClearEjecucionProcesosResponse createClearEjecucionProcesosResponse() {
        return new ClearEjecucionProcesosResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpGruposEconomicos }
     * 
     */
    public GetAllLookUpGruposEconomicos createGetAllLookUpGruposEconomicos() {
        return new GetAllLookUpGruposEconomicos();
    }

    /**
     * Create an instance of {@link GetByIDGruposEconomicos }
     * 
     */
    public GetByIDGruposEconomicos createGetByIDGruposEconomicos() {
        return new GetByIDGruposEconomicos();
    }

    /**
     * Create an instance of {@link CreateProvincias }
     * 
     */
    public CreateProvincias createCreateProvincias() {
        return new CreateProvincias();
    }

    /**
     * Create an instance of {@link ArrayOfBEFeriados }
     * 
     */
    public ArrayOfBEFeriados createArrayOfBEFeriados() {
        return new ArrayOfBEFeriados();
    }

    /**
     * Create an instance of {@link EsDiaHabil }
     * 
     */
    public EsDiaHabil createEsDiaHabil() {
        return new EsDiaHabil();
    }

    /**
     * Create an instance of {@link ArrayOfBECategoriasImpuesto }
     * 
     */
    public ArrayOfBECategoriasImpuesto createArrayOfBECategoriasImpuesto() {
        return new ArrayOfBECategoriasImpuesto();
    }

    /**
     * Create an instance of {@link GetAllPaises }
     * 
     */
    public GetAllPaises createGetAllPaises() {
        return new GetAllPaises();
    }

    /**
     * Create an instance of {@link GetAllTablaMaestraResponse }
     * 
     */
    public GetAllTablaMaestraResponse createGetAllTablaMaestraResponse() {
        return new GetAllTablaMaestraResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBEDomicilios }
     * 
     */
    public ArrayOfBEDomicilios createArrayOfBEDomicilios() {
        return new ArrayOfBEDomicilios();
    }

    /**
     * Create an instance of {@link GetAllLookUpPersonasResponse }
     * 
     */
    public GetAllLookUpPersonasResponse createGetAllLookUpPersonasResponse() {
        return new GetAllLookUpPersonasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBEGruposEconomicos }
     * 
     */
    public ArrayOfBEGruposEconomicos createArrayOfBEGruposEconomicos() {
        return new ArrayOfBEGruposEconomicos();
    }

    /**
     * Create an instance of {@link BEProvincias }
     * 
     */
    public BEProvincias createBEProvincias() {
        return new BEProvincias();
    }

    /**
     * Create an instance of {@link GetByIDPersonasResponse }
     * 
     */
    public GetByIDPersonasResponse createGetByIDPersonasResponse() {
        return new GetByIDPersonasResponse();
    }

    /**
     * Create an instance of {@link UpdateAdministracionUsuarios }
     * 
     */
    public UpdateAdministracionUsuarios createUpdateAdministracionUsuarios() {
        return new UpdateAdministracionUsuarios();
    }

    /**
     * Create an instance of {@link DcGeneralResponse }
     * 
     */
    public DcGeneralResponse createDcGeneralResponse() {
        return new DcGeneralResponse();
    }

    /**
     * Create an instance of {@link SetInformacionAsientos }
     * 
     */
    public SetInformacionAsientos createSetInformacionAsientos() {
        return new SetInformacionAsientos();
    }

    /**
     * Create an instance of {@link DeleteProvinciasResponse }
     * 
     */
    public DeleteProvinciasResponse createDeleteProvinciasResponse() {
        return new DeleteProvinciasResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpLocalidades }
     * 
     */
    public GetAllLookUpLocalidades createGetAllLookUpLocalidades() {
        return new GetAllLookUpLocalidades();
    }

    /**
     * Create an instance of {@link UpdateCalendarios }
     * 
     */
    public UpdateCalendarios createUpdateCalendarios() {
        return new UpdateCalendarios();
    }

    /**
     * Create an instance of {@link GetAllEscritoriosResponse }
     * 
     */
    public GetAllEscritoriosResponse createGetAllEscritoriosResponse() {
        return new GetAllEscritoriosResponse();
    }

    /**
     * Create an instance of {@link GetDotNetThreadIdentity }
     * 
     */
    public GetDotNetThreadIdentity createGetDotNetThreadIdentity() {
        return new GetDotNetThreadIdentity();
    }

    /**
     * Create an instance of {@link ArrayOfBEParametros }
     * 
     */
    public ArrayOfBEParametros createArrayOfBEParametros() {
        return new ArrayOfBEParametros();
    }

    /**
     * Create an instance of {@link GetFechaSistema }
     * 
     */
    public GetFechaSistema createGetFechaSistema() {
        return new GetFechaSistema();
    }

    /**
     * Create an instance of {@link GetConexionStringContableResponse }
     * 
     */
    public GetConexionStringContableResponse createGetConexionStringContableResponse() {
        return new GetConexionStringContableResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBETiposDatosRegistral }
     * 
     */
    public ArrayOfBETiposDatosRegistral createArrayOfBETiposDatosRegistral() {
        return new ArrayOfBETiposDatosRegistral();
    }

    /**
     * Create an instance of {@link CreateProvinciasResponse }
     * 
     */
    public CreateProvinciasResponse createCreateProvinciasResponse() {
        return new CreateProvinciasResponse();
    }

    /**
     * Create an instance of {@link GetConfiguraciongeneral }
     * 
     */
    public GetConfiguraciongeneral createGetConfiguraciongeneral() {
        return new GetConfiguraciongeneral();
    }

    /**
     * Create an instance of {@link GetAllGruposEconomicosResponse }
     * 
     */
    public GetAllGruposEconomicosResponse createGetAllGruposEconomicosResponse() {
        return new GetAllGruposEconomicosResponse();
    }

    /**
     * Create an instance of {@link TipoDatetimeResponse }
     * 
     */
    public TipoDatetimeResponse createTipoDatetimeResponse() {
        return new TipoDatetimeResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpGruposEconomicosResponse }
     * 
     */
    public GetAllLookUpGruposEconomicosResponse createGetAllLookUpGruposEconomicosResponse() {
        return new GetAllLookUpGruposEconomicosResponse();
    }

    /**
     * Create an instance of {@link GetAllAdministracionUsuarios }
     * 
     */
    public GetAllAdministracionUsuarios createGetAllAdministracionUsuarios() {
        return new GetAllAdministracionUsuarios();
    }

    /**
     * Create an instance of {@link SetInterfaceSiopelResponse }
     * 
     */
    public SetInterfaceSiopelResponse createSetInterfaceSiopelResponse() {
        return new SetInterfaceSiopelResponse();
    }

    /**
     * Create an instance of {@link CreateTiposSociedadResponse }
     * 
     */
    public CreateTiposSociedadResponse createCreateTiposSociedadResponse() {
        return new CreateTiposSociedadResponse();
    }

    /**
     * Create an instance of {@link GetByIDFeriados }
     * 
     */
    public GetByIDFeriados createGetByIDFeriados() {
        return new GetByIDFeriados();
    }

    /**
     * Create an instance of {@link DCEstado }
     * 
     */
    public DCEstado createDCEstado() {
        return new DCEstado();
    }

    /**
     * Create an instance of {@link ObtnerFeriadosPorRangoFechaResponse }
     * 
     */
    public ObtnerFeriadosPorRangoFechaResponse createObtnerFeriadosPorRangoFechaResponse() {
        return new ObtnerFeriadosPorRangoFechaResponse();
    }

    /**
     * Create an instance of {@link ConsultaUltimoEstadoSistema }
     * 
     */
    public ConsultaUltimoEstadoSistema createConsultaUltimoEstadoSistema() {
        return new ConsultaUltimoEstadoSistema();
    }

    /**
     * Create an instance of {@link GetByIDFeriadosResponse }
     * 
     */
    public GetByIDFeriadosResponse createGetByIDFeriadosResponse() {
        return new GetByIDFeriadosResponse();
    }

    /**
     * Create an instance of {@link EsDiaHabilResponse }
     * 
     */
    public EsDiaHabilResponse createEsDiaHabilResponse() {
        return new EsDiaHabilResponse();
    }

    /**
     * Create an instance of {@link DeleteTiposSociedad }
     * 
     */
    public DeleteTiposSociedad createDeleteTiposSociedad() {
        return new DeleteTiposSociedad();
    }

    /**
     * Create an instance of {@link GenerarAsientosWithBESesion }
     * 
     */
    public GenerarAsientosWithBESesion createGenerarAsientosWithBESesion() {
        return new GenerarAsientosWithBESesion();
    }

    /**
     * Create an instance of {@link EnumWrapperGeneral }
     * 
     */
    public EnumWrapperGeneral createEnumWrapperGeneral() {
        return new EnumWrapperGeneral();
    }

    /**
     * Create an instance of {@link DeleteCategoriasImpuestoResponse }
     * 
     */
    public DeleteCategoriasImpuestoResponse createDeleteCategoriasImpuestoResponse() {
        return new DeleteCategoriasImpuestoResponse();
    }

    /**
     * Create an instance of {@link DeletePersonasResponse }
     * 
     */
    public DeletePersonasResponse createDeletePersonasResponse() {
        return new DeletePersonasResponse();
    }

    /**
     * Create an instance of {@link BEUsuarios }
     * 
     */
    public BEUsuarios createBEUsuarios() {
        return new BEUsuarios();
    }

    /**
     * Create an instance of {@link ArrayOfBEConfiguracionesUsuario }
     * 
     */
    public ArrayOfBEConfiguracionesUsuario createArrayOfBEConfiguracionesUsuario() {
        return new ArrayOfBEConfiguracionesUsuario();
    }

    /**
     * Create an instance of {@link GetDotNetThreadIdentityResponse }
     * 
     */
    public GetDotNetThreadIdentityResponse createGetDotNetThreadIdentityResponse() {
        return new GetDotNetThreadIdentityResponse();
    }

    /**
     * Create an instance of {@link UpdateTiposSociedad }
     * 
     */
    public UpdateTiposSociedad createUpdateTiposSociedad() {
        return new UpdateTiposSociedad();
    }

    /**
     * Create an instance of {@link BEPlantillasInformes }
     * 
     */
    public BEPlantillasInformes createBEPlantillasInformes() {
        return new BEPlantillasInformes();
    }

    /**
     * Create an instance of {@link UpdateFeriadosResponse }
     * 
     */
    public UpdateFeriadosResponse createUpdateFeriadosResponse() {
        return new UpdateFeriadosResponse();
    }

    /**
     * Create an instance of {@link UpdateConfiguracionesUsuario }
     * 
     */
    public UpdateConfiguracionesUsuario createUpdateConfiguracionesUsuario() {
        return new UpdateConfiguracionesUsuario();
    }

    /**
     * Create an instance of {@link GetByIDLookupPersonasResponse }
     * 
     */
    public GetByIDLookupPersonasResponse createGetByIDLookupPersonasResponse() {
        return new GetByIDLookupPersonasResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpParametros }
     * 
     */
    public GetAllLookUpParametros createGetAllLookUpParametros() {
        return new GetAllLookUpParametros();
    }

    /**
     * Create an instance of {@link DeleteConfiguracionesUsuarioResponse }
     * 
     */
    public DeleteConfiguracionesUsuarioResponse createDeleteConfiguracionesUsuarioResponse() {
        return new DeleteConfiguracionesUsuarioResponse();
    }

    /**
     * Create an instance of {@link BESesiones }
     * 
     */
    public BESesiones createBESesiones() {
        return new BESesiones();
    }

    /**
     * Create an instance of {@link GetByEscritorios }
     * 
     */
    public GetByEscritorios createGetByEscritorios() {
        return new GetByEscritorios();
    }

    /**
     * Create an instance of {@link BEDomicilios }
     * 
     */
    public BEDomicilios createBEDomicilios() {
        return new BEDomicilios();
    }

    /**
     * Create an instance of {@link CreateCalendarios }
     * 
     */
    public CreateCalendarios createCreateCalendarios() {
        return new CreateCalendarios();
    }

    /**
     * Create an instance of {@link GetAllLookUpTablaMaestra }
     * 
     */
    public GetAllLookUpTablaMaestra createGetAllLookUpTablaMaestra() {
        return new GetAllLookUpTablaMaestra();
    }

    /**
     * Create an instance of {@link DeleteDomiciliosResponse }
     * 
     */
    public DeleteDomiciliosResponse createDeleteDomiciliosResponse() {
        return new DeleteDomiciliosResponse();
    }

    /**
     * Create an instance of {@link ClearImputacionCuentasComitentes }
     * 
     */
    public ClearImputacionCuentasComitentes createClearImputacionCuentasComitentes() {
        return new ClearImputacionCuentasComitentes();
    }

    /**
     * Create an instance of {@link CreateFeriadosResponse }
     * 
     */
    public CreateFeriadosResponse createCreateFeriadosResponse() {
        return new CreateFeriadosResponse();
    }

    /**
     * Create an instance of {@link DeleteLocalidadesResponse }
     * 
     */
    public DeleteLocalidadesResponse createDeleteLocalidadesResponse() {
        return new DeleteLocalidadesResponse();
    }

    /**
     * Create an instance of {@link CreateFeriados }
     * 
     */
    public CreateFeriados createCreateFeriados() {
        return new CreateFeriados();
    }

    /**
     * Create an instance of {@link SetInformacionPrecios }
     * 
     */
    public SetInformacionPrecios createSetInformacionPrecios() {
        return new SetInformacionPrecios();
    }

    /**
     * Create an instance of {@link GetAllLookUpPersonas }
     * 
     */
    public GetAllLookUpPersonas createGetAllLookUpPersonas() {
        return new GetAllLookUpPersonas();
    }

    /**
     * Create an instance of {@link UpdateCategoriasImpuestoResponse }
     * 
     */
    public UpdateCategoriasImpuestoResponse createUpdateCategoriasImpuestoResponse() {
        return new UpdateCategoriasImpuestoResponse();
    }

    /**
     * Create an instance of {@link GetByIDTablaMaestraResponse }
     * 
     */
    public GetByIDTablaMaestraResponse createGetByIDTablaMaestraResponse() {
        return new GetByIDTablaMaestraResponse();
    }

    /**
     * Create an instance of {@link GetHttpContextUserIdentity }
     * 
     */
    public GetHttpContextUserIdentity createGetHttpContextUserIdentity() {
        return new GetHttpContextUserIdentity();
    }

    /**
     * Create an instance of {@link ArrayOfBEWithFK }
     * 
     */
    public ArrayOfBEWithFK createArrayOfBEWithFK() {
        return new ArrayOfBEWithFK();
    }

    /**
     * Create an instance of {@link GetConexionStringContable }
     * 
     */
    public GetConexionStringContable createGetConexionStringContable() {
        return new GetConexionStringContable();
    }

    /**
     * Create an instance of {@link GetByIDCalendariosResponse }
     * 
     */
    public GetByIDCalendariosResponse createGetByIDCalendariosResponse() {
        return new GetByIDCalendariosResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposDatosRegistral }
     * 
     */
    public GetAllLookUpTiposDatosRegistral createGetAllLookUpTiposDatosRegistral() {
        return new GetAllLookUpTiposDatosRegistral();
    }

    /**
     * Create an instance of {@link BEEstado }
     * 
     */
    public BEEstado createBEEstado() {
        return new BEEstado();
    }

    /**
     * Create an instance of {@link EliminarSalidaContableResponse }
     * 
     */
    public EliminarSalidaContableResponse createEliminarSalidaContableResponse() {
        return new EliminarSalidaContableResponse();
    }

    /**
     * Create an instance of {@link BECategoriasImpuesto }
     * 
     */
    public BECategoriasImpuesto createBECategoriasImpuesto() {
        return new BECategoriasImpuesto();
    }

    /**
     * Create an instance of {@link UpdateTiposImpuestoResponse }
     * 
     */
    public UpdateTiposImpuestoResponse createUpdateTiposImpuestoResponse() {
        return new UpdateTiposImpuestoResponse();
    }

    /**
     * Create an instance of {@link DcGeneralCollResponse }
     * 
     */
    public DcGeneralCollResponse createDcGeneralCollResponse() {
        return new DcGeneralCollResponse();
    }

    /**
     * Create an instance of {@link EliminarSalidaContable }
     * 
     */
    public EliminarSalidaContable createEliminarSalidaContable() {
        return new EliminarSalidaContable();
    }

    /**
     * Create an instance of {@link BEWithFK }
     * 
     */
    public BEWithFK createBEWithFK() {
        return new BEWithFK();
    }

    /**
     * Create an instance of {@link TipoDecimal }
     * 
     */
    public TipoDecimal createTipoDecimal() {
        return new TipoDecimal();
    }

    /**
     * Create an instance of {@link SetInformacionPreciosResponse }
     * 
     */
    public SetInformacionPreciosResponse createSetInformacionPreciosResponse() {
        return new SetInformacionPreciosResponse();
    }

    /**
     * Create an instance of {@link UpdatePaises }
     * 
     */
    public UpdatePaises createUpdatePaises() {
        return new UpdatePaises();
    }

    /**
     * Create an instance of {@link GetAllLookUpProvinciasResponse }
     * 
     */
    public GetAllLookUpProvinciasResponse createGetAllLookUpProvinciasResponse() {
        return new GetAllLookUpProvinciasResponse();
    }

    /**
     * Create an instance of {@link TipoDatetime }
     * 
     */
    public TipoDatetime createTipoDatetime() {
        return new TipoDatetime();
    }

    /**
     * Create an instance of {@link BEGruposEconomicos }
     * 
     */
    public BEGruposEconomicos createBEGruposEconomicos() {
        return new BEGruposEconomicos();
    }

    /**
     * Create an instance of {@link DcGeneralColl }
     * 
     */
    public DcGeneralColl createDcGeneralColl() {
        return new DcGeneralColl();
    }

    /**
     * Create an instance of {@link SetInformacionAsientosResponse }
     * 
     */
    public SetInformacionAsientosResponse createSetInformacionAsientosResponse() {
        return new SetInformacionAsientosResponse();
    }

    /**
     * Create an instance of {@link ClearClearInformacionAsientosResponse }
     * 
     */
    public ClearClearInformacionAsientosResponse createClearClearInformacionAsientosResponse() {
        return new ClearClearInformacionAsientosResponse();
    }

    /**
     * Create an instance of {@link CreatePersonasResponse }
     * 
     */
    public CreatePersonasResponse createCreatePersonasResponse() {
        return new CreatePersonasResponse();
    }

    /**
     * Create an instance of {@link UpdateTiposDocumento }
     * 
     */
    public UpdateTiposDocumento createUpdateTiposDocumento() {
        return new UpdateTiposDocumento();
    }

    /**
     * Create an instance of {@link ArrayOfBEUsuarios }
     * 
     */
    public ArrayOfBEUsuarios createArrayOfBEUsuarios() {
        return new ArrayOfBEUsuarios();
    }

    /**
     * Create an instance of {@link UpdateCategoriasImpuesto }
     * 
     */
    public UpdateCategoriasImpuesto createUpdateCategoriasImpuesto() {
        return new UpdateCategoriasImpuesto();
    }

    /**
     * Create an instance of {@link GetAllLookUpCalendariosResponse }
     * 
     */
    public GetAllLookUpCalendariosResponse createGetAllLookUpCalendariosResponse() {
        return new GetAllLookUpCalendariosResponse();
    }

    /**
     * Create an instance of {@link DeleteTiposImpuesto }
     * 
     */
    public DeleteTiposImpuesto createDeleteTiposImpuesto() {
        return new DeleteTiposImpuesto();
    }

    /**
     * Create an instance of {@link SetValuacionMTM }
     * 
     */
    public SetValuacionMTM createSetValuacionMTM() {
        return new SetValuacionMTM();
    }

    /**
     * Create an instance of {@link GetAllPaisesResponse }
     * 
     */
    public GetAllPaisesResponse createGetAllPaisesResponse() {
        return new GetAllPaisesResponse();
    }

    /**
     * Create an instance of {@link GetAllTiposImpuestoResponse }
     * 
     */
    public GetAllTiposImpuestoResponse createGetAllTiposImpuestoResponse() {
        return new GetAllTiposImpuestoResponse();
    }

    /**
     * Create an instance of {@link GenerarExportacionContable }
     * 
     */
    public GenerarExportacionContable createGenerarExportacionContable() {
        return new GenerarExportacionContable();
    }

    /**
     * Create an instance of {@link GenerarAsientosWithBESesionResponse }
     * 
     */
    public GenerarAsientosWithBESesionResponse createGenerarAsientosWithBESesionResponse() {
        return new GenerarAsientosWithBESesionResponse();
    }

    /**
     * Create an instance of {@link CreateTiposImpuestoResponse }
     * 
     */
    public CreateTiposImpuestoResponse createCreateTiposImpuestoResponse() {
        return new CreateTiposImpuestoResponse();
    }

    /**
     * Create an instance of {@link SetEjecucionProcesos }
     * 
     */
    public SetEjecucionProcesos createSetEjecucionProcesos() {
        return new SetEjecucionProcesos();
    }

    /**
     * Create an instance of {@link GetByIDTablaMaestra }
     * 
     */
    public GetByIDTablaMaestra createGetByIDTablaMaestra() {
        return new GetByIDTablaMaestra();
    }

    /**
     * Create an instance of {@link CreateTiposImpuesto }
     * 
     */
    public CreateTiposImpuesto createCreateTiposImpuesto() {
        return new CreateTiposImpuesto();
    }

    /**
     * Create an instance of {@link ArrayOfBETiposComprobante }
     * 
     */
    public ArrayOfBETiposComprobante createArrayOfBETiposComprobante() {
        return new ArrayOfBETiposComprobante();
    }

    /**
     * Create an instance of {@link GetConfiguracionesUsuarioResponse }
     * 
     */
    public GetConfiguracionesUsuarioResponse createGetConfiguracionesUsuarioResponse() {
        return new GetConfiguracionesUsuarioResponse();
    }

    /**
     * Create an instance of {@link TipoDecimalResponse }
     * 
     */
    public TipoDecimalResponse createTipoDecimalResponse() {
        return new TipoDecimalResponse();
    }

    /**
     * Create an instance of {@link GetConfiguracionesUsuario }
     * 
     */
    public GetConfiguracionesUsuario createGetConfiguracionesUsuario() {
        return new GetConfiguracionesUsuario();
    }

    /**
     * Create an instance of {@link CreateDomicilios }
     * 
     */
    public CreateDomicilios createCreateDomicilios() {
        return new CreateDomicilios();
    }

    /**
     * Create an instance of {@link ObtenerTodosProgresoProceso }
     * 
     */
    public ObtenerTodosProgresoProceso createObtenerTodosProgresoProceso() {
        return new ObtenerTodosProgresoProceso();
    }

    /**
     * Create an instance of {@link DeleteCalendariosResponse }
     * 
     */
    public DeleteCalendariosResponse createDeleteCalendariosResponse() {
        return new DeleteCalendariosResponse();
    }

    /**
     * Create an instance of {@link CreatePaises }
     * 
     */
    public CreatePaises createCreatePaises() {
        return new CreatePaises();
    }

    /**
     * Create an instance of {@link GetFechaSistemaResponse }
     * 
     */
    public GetFechaSistemaResponse createGetFechaSistemaResponse() {
        return new GetFechaSistemaResponse();
    }

    /**
     * Create an instance of {@link CreateDomiciliosResponse }
     * 
     */
    public CreateDomiciliosResponse createCreateDomiciliosResponse() {
        return new CreateDomiciliosResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpDomiciliosResponse }
     * 
     */
    public GetAllLookUpDomiciliosResponse createGetAllLookUpDomiciliosResponse() {
        return new GetAllLookUpDomiciliosResponse();
    }

    /**
     * Create an instance of {@link GetByIDDomiciliosResponse }
     * 
     */
    public GetByIDDomiciliosResponse createGetByIDDomiciliosResponse() {
        return new GetByIDDomiciliosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfAnyType }
     * 
     */
    public ArrayOfAnyType createArrayOfAnyType() {
        return new ArrayOfAnyType();
    }

    /**
     * Create an instance of {@link GetPlazoEntreFechasResponse }
     * 
     */
    public GetPlazoEntreFechasResponse createGetPlazoEntreFechasResponse() {
        return new GetPlazoEntreFechasResponse();
    }

    /**
     * Create an instance of {@link GetAllCalendarios }
     * 
     */
    public GetAllCalendarios createGetAllCalendarios() {
        return new GetAllCalendarios();
    }

    /**
     * Create an instance of {@link DeleteCategoriasImpuesto }
     * 
     */
    public DeleteCategoriasImpuesto createDeleteCategoriasImpuesto() {
        return new DeleteCategoriasImpuesto();
    }

    /**
     * Create an instance of {@link GetAllLocalidadesResponse }
     * 
     */
    public GetAllLocalidadesResponse createGetAllLocalidadesResponse() {
        return new GetAllLocalidadesResponse();
    }

    /**
     * Create an instance of {@link GuardarEscritorios }
     * 
     */
    public GuardarEscritorios createGuardarEscritorios() {
        return new GuardarEscritorios();
    }

    /**
     * Create an instance of {@link UpdateLocalidades }
     * 
     */
    public UpdateLocalidades createUpdateLocalidades() {
        return new UpdateLocalidades();
    }

    /**
     * Create an instance of {@link GetAllEstadoSistema }
     * 
     */
    public GetAllEstadoSistema createGetAllEstadoSistema() {
        return new GetAllEstadoSistema();
    }

    /**
     * Create an instance of {@link DeleteGruposEconomicosResponse }
     * 
     */
    public DeleteGruposEconomicosResponse createDeleteGruposEconomicosResponse() {
        return new DeleteGruposEconomicosResponse();
    }

    /**
     * Create an instance of {@link GetAllProvinciasResponse }
     * 
     */
    public GetAllProvinciasResponse createGetAllProvinciasResponse() {
        return new GetAllProvinciasResponse();
    }

    /**
     * Create an instance of {@link GetAllTiposImpuesto }
     * 
     */
    public GetAllTiposImpuesto createGetAllTiposImpuesto() {
        return new GetAllTiposImpuesto();
    }

    /**
     * Create an instance of {@link GetUltimoEstadoSistema }
     * 
     */
    public GetUltimoEstadoSistema createGetUltimoEstadoSistema() {
        return new GetUltimoEstadoSistema();
    }

    /**
     * Create an instance of {@link GetAllTiposSociedadResponse }
     * 
     */
    public GetAllTiposSociedadResponse createGetAllTiposSociedadResponse() {
        return new GetAllTiposSociedadResponse();
    }

    /**
     * Create an instance of {@link ClearInformacionPreciosResponse }
     * 
     */
    public ClearInformacionPreciosResponse createClearInformacionPreciosResponse() {
        return new ClearInformacionPreciosResponse();
    }

    /**
     * Create an instance of {@link GenerarExportacionContableResponse }
     * 
     */
    public GenerarExportacionContableResponse createGenerarExportacionContableResponse() {
        return new GenerarExportacionContableResponse();
    }

    /**
     * Create an instance of {@link GetAllTablaMaestra }
     * 
     */
    public GetAllTablaMaestra createGetAllTablaMaestra() {
        return new GetAllTablaMaestra();
    }

    /**
     * Create an instance of {@link ConsultaByIDEstadoSistema }
     * 
     */
    public ConsultaByIDEstadoSistema createConsultaByIDEstadoSistema() {
        return new ConsultaByIDEstadoSistema();
    }

    /**
     * Create an instance of {@link CerrarEstadoSistema }
     * 
     */
    public CerrarEstadoSistema createCerrarEstadoSistema() {
        return new CerrarEstadoSistema();
    }

    /**
     * Create an instance of {@link GetByIDParametrosResponse }
     * 
     */
    public GetByIDParametrosResponse createGetByIDParametrosResponse() {
        return new GetByIDParametrosResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposImpuestoResponse }
     * 
     */
    public GetAllLookUpTiposImpuestoResponse createGetAllLookUpTiposImpuestoResponse() {
        return new GetAllLookUpTiposImpuestoResponse();
    }

    /**
     * Create an instance of {@link ClearImputacionCuentasComitentesResponse }
     * 
     */
    public ClearImputacionCuentasComitentesResponse createClearImputacionCuentasComitentesResponse() {
        return new ClearImputacionCuentasComitentesResponse();
    }

    /**
     * Create an instance of {@link UpdateParametros }
     * 
     */
    public UpdateParametros createUpdateParametros() {
        return new UpdateParametros();
    }

    /**
     * Create an instance of {@link GetAllLookUpLocalidadesResponse }
     * 
     */
    public GetAllLookUpLocalidadesResponse createGetAllLookUpLocalidadesResponse() {
        return new GetAllLookUpLocalidadesResponse();
    }

    /**
     * Create an instance of {@link BEConfiguracionesUsuario }
     * 
     */
    public BEConfiguracionesUsuario createBEConfiguracionesUsuario() {
        return new BEConfiguracionesUsuario();
    }

    /**
     * Create an instance of {@link GetAllLookUpCategoriasImpuestoResponse }
     * 
     */
    public GetAllLookUpCategoriasImpuestoResponse createGetAllLookUpCategoriasImpuestoResponse() {
        return new GetAllLookUpCategoriasImpuestoResponse();
    }

    /**
     * Create an instance of {@link DeleteEscritoriosResponse }
     * 
     */
    public DeleteEscritoriosResponse createDeleteEscritoriosResponse() {
        return new DeleteEscritoriosResponse();
    }

    /**
     * Create an instance of {@link CreateLocalidades }
     * 
     */
    public CreateLocalidades createCreateLocalidades() {
        return new CreateLocalidades();
    }

    /**
     * Create an instance of {@link GetConfiguracionSistema }
     * 
     */
    public GetConfiguracionSistema createGetConfiguracionSistema() {
        return new GetConfiguracionSistema();
    }

    /**
     * Create an instance of {@link CreatePersonas }
     * 
     */
    public CreatePersonas createCreatePersonas() {
        return new CreatePersonas();
    }

    /**
     * Create an instance of {@link CalculoFecha }
     * 
     */
    public CalculoFecha createCalculoFecha() {
        return new CalculoFecha();
    }

    /**
     * Create an instance of {@link BEEscritorios }
     * 
     */
    public BEEscritorios createBEEscritorios() {
        return new BEEscritorios();
    }

    /**
     * Create an instance of {@link CreateTiposSociedad }
     * 
     */
    public CreateTiposSociedad createCreateTiposSociedad() {
        return new CreateTiposSociedad();
    }

    /**
     * Create an instance of {@link GetAllLocalidades }
     * 
     */
    public GetAllLocalidades createGetAllLocalidades() {
        return new GetAllLocalidades();
    }

    /**
     * Create an instance of {@link GetDACConfiguraciones }
     * 
     */
    public GetDACConfiguraciones createGetDACConfiguraciones() {
        return new GetDACConfiguraciones();
    }

    /**
     * Create an instance of {@link DeleteDomicilios }
     * 
     */
    public DeleteDomicilios createDeleteDomicilios() {
        return new DeleteDomicilios();
    }

    /**
     * Create an instance of {@link GetByIDProvincias }
     * 
     */
    public GetByIDProvincias createGetByIDProvincias() {
        return new GetByIDProvincias();
    }

    /**
     * Create an instance of {@link ClearEjecucionProcesos }
     * 
     */
    public ClearEjecucionProcesos createClearEjecucionProcesos() {
        return new ClearEjecucionProcesos();
    }

    /**
     * Create an instance of {@link DeletePersonas }
     * 
     */
    public DeletePersonas createDeletePersonas() {
        return new DeletePersonas();
    }

    /**
     * Create an instance of {@link BEEstadoSistema }
     * 
     */
    public BEEstadoSistema createBEEstadoSistema() {
        return new BEEstadoSistema();
    }

    /**
     * Create an instance of {@link GetAllLookUpProvincias }
     * 
     */
    public GetAllLookUpProvincias createGetAllLookUpProvincias() {
        return new GetAllLookUpProvincias();
    }

    /**
     * Create an instance of {@link BETiposImpuesto }
     * 
     */
    public BETiposImpuesto createBETiposImpuesto() {
        return new BETiposImpuesto();
    }

    /**
     * Create an instance of {@link ObtenerProgresoProcesoResponse }
     * 
     */
    public ObtenerProgresoProcesoResponse createObtenerProgresoProcesoResponse() {
        return new ObtenerProgresoProcesoResponse();
    }

    /**
     * Create an instance of {@link BETiposComprobante }
     * 
     */
    public BETiposComprobante createBETiposComprobante() {
        return new BETiposComprobante();
    }

    /**
     * Create an instance of {@link DeleteConfiguracionesUsuario }
     * 
     */
    public DeleteConfiguracionesUsuario createDeleteConfiguracionesUsuario() {
        return new DeleteConfiguracionesUsuario();
    }

    /**
     * Create an instance of {@link GetHttpContextUserIdentityResponse }
     * 
     */
    public GetHttpContextUserIdentityResponse createGetHttpContextUserIdentityResponse() {
        return new GetHttpContextUserIdentityResponse();
    }

    /**
     * Create an instance of {@link DCFechaCalendario }
     * 
     */
    public DCFechaCalendario createDCFechaCalendario() {
        return new DCFechaCalendario();
    }

    /**
     * Create an instance of {@link ArrayOfBEPlantillasInformes }
     * 
     */
    public ArrayOfBEPlantillasInformes createArrayOfBEPlantillasInformes() {
        return new ArrayOfBEPlantillasInformes();
    }

    /**
     * Create an instance of {@link CreateCategoriasImpuesto }
     * 
     */
    public CreateCategoriasImpuesto createCreateCategoriasImpuesto() {
        return new CreateCategoriasImpuesto();
    }

    /**
     * Create an instance of {@link DeleteProvincias }
     * 
     */
    public DeleteProvincias createDeleteProvincias() {
        return new DeleteProvincias();
    }

    /**
     * Create an instance of {@link GetByIDTiposImpuestoResponse }
     * 
     */
    public GetByIDTiposImpuestoResponse createGetByIDTiposImpuestoResponse() {
        return new GetByIDTiposImpuestoResponse();
    }

    /**
     * Create an instance of {@link GetByIDEstadoSistemaResponse }
     * 
     */
    public GetByIDEstadoSistemaResponse createGetByIDEstadoSistemaResponse() {
        return new GetByIDEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link SetEjecucionProcesosResponse }
     * 
     */
    public SetEjecucionProcesosResponse createSetEjecucionProcesosResponse() {
        return new SetEjecucionProcesosResponse();
    }

    /**
     * Create an instance of {@link GetPlazoEntreFechas }
     * 
     */
    public GetPlazoEntreFechas createGetPlazoEntreFechas() {
        return new GetPlazoEntreFechas();
    }

    /**
     * Create an instance of {@link SetInterfaceSiopel }
     * 
     */
    public SetInterfaceSiopel createSetInterfaceSiopel() {
        return new SetInterfaceSiopel();
    }

    /**
     * Create an instance of {@link BuscoProcesosEncadenados }
     * 
     */
    public BuscoProcesosEncadenados createBuscoProcesosEncadenados() {
        return new BuscoProcesosEncadenados();
    }

    /**
     * Create an instance of {@link UpdatePersonas }
     * 
     */
    public UpdatePersonas createUpdatePersonas() {
        return new UpdatePersonas();
    }

    /**
     * Create an instance of {@link GetAllLookUpParametrosResponse }
     * 
     */
    public GetAllLookUpParametrosResponse createGetAllLookUpParametrosResponse() {
        return new GetAllLookUpParametrosResponse();
    }

    /**
     * Create an instance of {@link GenerarSalidaContable }
     * 
     */
    public GenerarSalidaContable createGenerarSalidaContable() {
        return new GenerarSalidaContable();
    }

    /**
     * Create an instance of {@link CreateParametrosResponse }
     * 
     */
    public CreateParametrosResponse createCreateParametrosResponse() {
        return new CreateParametrosResponse();
    }

    /**
     * Create an instance of {@link AnularAperturaSistema }
     * 
     */
    public AnularAperturaSistema createAnularAperturaSistema() {
        return new AnularAperturaSistema();
    }

    /**
     * Create an instance of {@link BELocalidades }
     * 
     */
    public BELocalidades createBELocalidades() {
        return new BELocalidades();
    }

    /**
     * Create an instance of {@link GetByIDParametros }
     * 
     */
    public GetByIDParametros createGetByIDParametros() {
        return new GetByIDParametros();
    }

    /**
     * Create an instance of {@link GetByIDEstadoSistema }
     * 
     */
    public GetByIDEstadoSistema createGetByIDEstadoSistema() {
        return new GetByIDEstadoSistema();
    }

    /**
     * Create an instance of {@link GetByIDPlantillasInformes }
     * 
     */
    public GetByIDPlantillasInformes createGetByIDPlantillasInformes() {
        return new GetByIDPlantillasInformes();
    }

    /**
     * Create an instance of {@link BEConceptos }
     * 
     */
    public BEConceptos createBEConceptos() {
        return new BEConceptos();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposDocumentoResponse }
     * 
     */
    public GetAllLookUpTiposDocumentoResponse createGetAllLookUpTiposDocumentoResponse() {
        return new GetAllLookUpTiposDocumentoResponse();
    }

    /**
     * Create an instance of {@link GetUserIdentityResponse }
     * 
     */
    public GetUserIdentityResponse createGetUserIdentityResponse() {
        return new GetUserIdentityResponse();
    }

    /**
     * Create an instance of {@link BEPersonas }
     * 
     */
    public BEPersonas createBEPersonas() {
        return new BEPersonas();
    }

    /**
     * Create an instance of {@link DiasEntreFechasResponse }
     * 
     */
    public DiasEntreFechasResponse createDiasEntreFechasResponse() {
        return new DiasEntreFechasResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpDomicilios }
     * 
     */
    public GetAllLookUpDomicilios createGetAllLookUpDomicilios() {
        return new GetAllLookUpDomicilios();
    }

    /**
     * Create an instance of {@link ArrayOfBEEscritorios }
     * 
     */
    public ArrayOfBEEscritorios createArrayOfBEEscritorios() {
        return new ArrayOfBEEscritorios();
    }

    /**
     * Create an instance of {@link DiasEntreFechas }
     * 
     */
    public DiasEntreFechas createDiasEntreFechas() {
        return new DiasEntreFechas();
    }

    /**
     * Create an instance of {@link ArrayOfBETiposSociedad }
     * 
     */
    public ArrayOfBETiposSociedad createArrayOfBETiposSociedad() {
        return new ArrayOfBETiposSociedad();
    }

    /**
     * Create an instance of {@link GetDACConfiguracionesResponse }
     * 
     */
    public GetDACConfiguracionesResponse createGetDACConfiguracionesResponse() {
        return new GetDACConfiguracionesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBEProgresoProceso }
     * 
     */
    public ArrayOfBEProgresoProceso createArrayOfBEProgresoProceso() {
        return new ArrayOfBEProgresoProceso();
    }

    /**
     * Create an instance of {@link ConsultaEstadoSistemaResponse }
     * 
     */
    public ConsultaEstadoSistemaResponse createConsultaEstadoSistemaResponse() {
        return new ConsultaEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link GetByIDDomicilios }
     * 
     */
    public GetByIDDomicilios createGetByIDDomicilios() {
        return new GetByIDDomicilios();
    }

    /**
     * Create an instance of {@link UpdateTiposImpuesto }
     * 
     */
    public UpdateTiposImpuesto createUpdateTiposImpuesto() {
        return new UpdateTiposImpuesto();
    }

    /**
     * Create an instance of {@link DeleteTiposImpuestoResponse }
     * 
     */
    public DeleteTiposImpuestoResponse createDeleteTiposImpuestoResponse() {
        return new DeleteTiposImpuestoResponse();
    }

    /**
     * Create an instance of {@link BEParametros }
     * 
     */
    public BEParametros createBEParametros() {
        return new BEParametros();
    }

    /**
     * Create an instance of {@link BEFeriados }
     * 
     */
    public BEFeriados createBEFeriados() {
        return new BEFeriados();
    }

    /**
     * Create an instance of {@link ArrayOfBETiposDocumento }
     * 
     */
    public ArrayOfBETiposDocumento createArrayOfBETiposDocumento() {
        return new ArrayOfBETiposDocumento();
    }

    /**
     * Create an instance of {@link GetAllLookUpPlantillasInformes }
     * 
     */
    public GetAllLookUpPlantillasInformes createGetAllLookUpPlantillasInformes() {
        return new GetAllLookUpPlantillasInformes();
    }

    /**
     * Create an instance of {@link SetConfiguraciongeneralResponse }
     * 
     */
    public SetConfiguraciongeneralResponse createSetConfiguraciongeneralResponse() {
        return new SetConfiguraciongeneralResponse();
    }

    /**
     * Create an instance of {@link CreateTiposDocumento }
     * 
     */
    public CreateTiposDocumento createCreateTiposDocumento() {
        return new CreateTiposDocumento();
    }

    /**
     * Create an instance of {@link GetByIDCalendarios }
     * 
     */
    public GetByIDCalendarios createGetByIDCalendarios() {
        return new GetByIDCalendarios();
    }

    /**
     * Create an instance of {@link DeleteParametrosResponse }
     * 
     */
    public DeleteParametrosResponse createDeleteParametrosResponse() {
        return new DeleteParametrosResponse();
    }

    /**
     * Create an instance of {@link GetByIDProvinciasResponse }
     * 
     */
    public GetByIDProvinciasResponse createGetByIDProvinciasResponse() {
        return new GetByIDProvinciasResponse();
    }

    /**
     * Create an instance of {@link GetByIDPlantillasInformesResponse }
     * 
     */
    public GetByIDPlantillasInformesResponse createGetByIDPlantillasInformesResponse() {
        return new GetByIDPlantillasInformesResponse();
    }

    /**
     * Create an instance of {@link UpdateLocalidadesResponse }
     * 
     */
    public UpdateLocalidadesResponse createUpdateLocalidadesResponse() {
        return new UpdateLocalidadesResponse();
    }

    /**
     * Create an instance of {@link SetConfiguraciongeneral }
     * 
     */
    public SetConfiguraciongeneral createSetConfiguraciongeneral() {
        return new SetConfiguraciongeneral();
    }

    /**
     * Create an instance of {@link DCBase }
     * 
     */
    public DCBase createDCBase() {
        return new DCBase();
    }

    /**
     * Create an instance of {@link DeleteFeriadosResponse }
     * 
     */
    public DeleteFeriadosResponse createDeleteFeriadosResponse() {
        return new DeleteFeriadosResponse();
    }

    /**
     * Create an instance of {@link ClearClearInformacionAsientos }
     * 
     */
    public ClearClearInformacionAsientos createClearClearInformacionAsientos() {
        return new ClearClearInformacionAsientos();
    }

    /**
     * Create an instance of {@link GetByIDTiposDocumentoResponse }
     * 
     */
    public GetByIDTiposDocumentoResponse createGetByIDTiposDocumentoResponse() {
        return new GetByIDTiposDocumentoResponse();
    }

    /**
     * Create an instance of {@link DisponibilizacionFeriadosReq }
     * 
     */
    public DisponibilizacionFeriadosReq createDisponibilizacionFeriadosReq() {
        return new DisponibilizacionFeriadosReq();
    }

    /**
     * Create an instance of {@link DisponibilizacionFeriadosResponse }
     * 
     */
    public DisponibilizacionFeriadosResponse createDisponibilizacionFeriadosResponse() {
        return new DisponibilizacionFeriadosResponse();
    }

    /**
     * Create an instance of {@link GetByIDCategoriasImpuestoResponse }
     * 
     */
    public GetByIDCategoriasImpuestoResponse createGetByIDCategoriasImpuestoResponse() {
        return new GetByIDCategoriasImpuestoResponse();
    }

    /**
     * Create an instance of {@link GetByIDLookupPersonas }
     * 
     */
    public GetByIDLookupPersonas createGetByIDLookupPersonas() {
        return new GetByIDLookupPersonas();
    }

    /**
     * Create an instance of {@link GetAllDomiciliosResponse }
     * 
     */
    public GetAllDomiciliosResponse createGetAllDomiciliosResponse() {
        return new GetAllDomiciliosResponse();
    }

    /**
     * Create an instance of {@link GetByIDPersonas }
     * 
     */
    public GetByIDPersonas createGetByIDPersonas() {
        return new GetByIDPersonas();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposSociedad }
     * 
     */
    public GetAllLookUpTiposSociedad createGetAllLookUpTiposSociedad() {
        return new GetAllLookUpTiposSociedad();
    }

    /**
     * Create an instance of {@link GetAllParametrosResponse }
     * 
     */
    public GetAllParametrosResponse createGetAllParametrosResponse() {
        return new GetAllParametrosResponse();
    }

    /**
     * Create an instance of {@link SetImputacionCuentasComitentesWithBesesionResponse }
     * 
     */
    public SetImputacionCuentasComitentesWithBesesionResponse createSetImputacionCuentasComitentesWithBesesionResponse() {
        return new SetImputacionCuentasComitentesWithBesesionResponse();
    }

    /**
     * Create an instance of {@link GetByIDTiposImpuesto }
     * 
     */
    public GetByIDTiposImpuesto createGetByIDTiposImpuesto() {
        return new GetByIDTiposImpuesto();
    }

    /**
     * Create an instance of {@link GenerarSalidaContableWithBESesionResponse }
     * 
     */
    public GenerarSalidaContableWithBESesionResponse createGenerarSalidaContableWithBESesionResponse() {
        return new GenerarSalidaContableWithBESesionResponse();
    }

    /**
     * Create an instance of {@link CopiarFeriadosCalendarios }
     * 
     */
    public CopiarFeriadosCalendarios createCopiarFeriadosCalendarios() {
        return new CopiarFeriadosCalendarios();
    }

    /**
     * Create an instance of {@link ItemConfigSistema }
     * 
     */
    public ItemConfigSistema createItemConfigSistema() {
        return new ItemConfigSistema();
    }

    /**
     * Create an instance of {@link GetWindowsThreadIdentityResponse }
     * 
     */
    public GetWindowsThreadIdentityResponse createGetWindowsThreadIdentityResponse() {
        return new GetWindowsThreadIdentityResponse();
    }

    /**
     * Create an instance of {@link SetConfiguracionpresentacion }
     * 
     */
    public SetConfiguracionpresentacion createSetConfiguracionpresentacion() {
        return new SetConfiguracionpresentacion();
    }

    /**
     * Create an instance of {@link GetConfiguracionpresentacionResponse }
     * 
     */
    public GetConfiguracionpresentacionResponse createGetConfiguracionpresentacionResponse() {
        return new GetConfiguracionpresentacionResponse();
    }

    /**
     * Create an instance of {@link SetImputacionCuentasComitentes }
     * 
     */
    public SetImputacionCuentasComitentes createSetImputacionCuentasComitentes() {
        return new SetImputacionCuentasComitentes();
    }

    /**
     * Create an instance of {@link GetByIDPaises }
     * 
     */
    public GetByIDPaises createGetByIDPaises() {
        return new GetByIDPaises();
    }

    /**
     * Create an instance of {@link UpdatePaisesResponse }
     * 
     */
    public UpdatePaisesResponse createUpdatePaisesResponse() {
        return new UpdatePaisesResponse();
    }

    /**
     * Create an instance of {@link ClearInformacionPrecios }
     * 
     */
    public ClearInformacionPrecios createClearInformacionPrecios() {
        return new ClearInformacionPrecios();
    }

    /**
     * Create an instance of {@link GetAllLookUpCategoriasImpuesto }
     * 
     */
    public GetAllLookUpCategoriasImpuesto createGetAllLookUpCategoriasImpuesto() {
        return new GetAllLookUpCategoriasImpuesto();
    }

    /**
     * Create an instance of {@link GetByIDTiposSociedadResponse }
     * 
     */
    public GetByIDTiposSociedadResponse createGetByIDTiposSociedadResponse() {
        return new GetByIDTiposSociedadResponse();
    }

    /**
     * Create an instance of {@link UpdateConfiguracionesUsuarioResponse }
     * 
     */
    public UpdateConfiguracionesUsuarioResponse createUpdateConfiguracionesUsuarioResponse() {
        return new UpdateConfiguracionesUsuarioResponse();
    }

    /**
     * Create an instance of {@link UpdateDomicilios }
     * 
     */
    public UpdateDomicilios createUpdateDomicilios() {
        return new UpdateDomicilios();
    }

    /**
     * Create an instance of {@link AnularCierreSistema }
     * 
     */
    public AnularCierreSistema createAnularCierreSistema() {
        return new AnularCierreSistema();
    }

    /**
     * Create an instance of {@link GetAllTiposDocumentoResponse }
     * 
     */
    public GetAllTiposDocumentoResponse createGetAllTiposDocumentoResponse() {
        return new GetAllTiposDocumentoResponse();
    }

    /**
     * Create an instance of {@link CalculoFechaResponse }
     * 
     */
    public CalculoFechaResponse createCalculoFechaResponse() {
        return new CalculoFechaResponse();
    }

    /**
     * Create an instance of {@link GetConfiguracionSistemaResponse }
     * 
     */
    public GetConfiguracionSistemaResponse createGetConfiguracionSistemaResponse() {
        return new GetConfiguracionSistemaResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposDocumento }
     * 
     */
    public GetAllLookUpTiposDocumento createGetAllLookUpTiposDocumento() {
        return new GetAllLookUpTiposDocumento();
    }

    /**
     * Create an instance of {@link ArrayOfDCFechaCalendario }
     * 
     */
    public ArrayOfDCFechaCalendario createArrayOfDCFechaCalendario() {
        return new ArrayOfDCFechaCalendario();
    }

    /**
     * Create an instance of {@link GetAllTiposDocumento }
     * 
     */
    public GetAllTiposDocumento createGetAllTiposDocumento() {
        return new GetAllTiposDocumento();
    }

    /**
     * Create an instance of {@link GenerarAsientosResponse }
     * 
     */
    public GenerarAsientosResponse createGenerarAsientosResponse() {
        return new GenerarAsientosResponse();
    }

    /**
     * Create an instance of {@link DeleteFeriados }
     * 
     */
    public DeleteFeriados createDeleteFeriados() {
        return new DeleteFeriados();
    }

    /**
     * Create an instance of {@link GetAllFeriados }
     * 
     */
    public GetAllFeriados createGetAllFeriados() {
        return new GetAllFeriados();
    }

    /**
     * Create an instance of {@link BETablaMaestra }
     * 
     */
    public BETablaMaestra createBETablaMaestra() {
        return new BETablaMaestra();
    }

    /**
     * Create an instance of {@link BETiposDatosRegistral }
     * 
     */
    public BETiposDatosRegistral createBETiposDatosRegistral() {
        return new BETiposDatosRegistral();
    }

    /**
     * Create an instance of {@link DCWithID }
     * 
     */
    public DCWithID createDCWithID() {
        return new DCWithID();
    }

    /**
     * Create an instance of {@link GetAllTiposSociedad }
     * 
     */
    public GetAllTiposSociedad createGetAllTiposSociedad() {
        return new GetAllTiposSociedad();
    }

    /**
     * Create an instance of {@link BEWithID }
     * 
     */
    public BEWithID createBEWithID() {
        return new BEWithID();
    }

    /**
     * Create an instance of {@link ArrayOfBECalendarios }
     * 
     */
    public ArrayOfBECalendarios createArrayOfBECalendarios() {
        return new ArrayOfBECalendarios();
    }

    /**
     * Create an instance of {@link ClearValuacionMTM }
     * 
     */
    public ClearValuacionMTM createClearValuacionMTM() {
        return new ClearValuacionMTM();
    }

    /**
     * Create an instance of {@link BEConfiguraciongeneral }
     * 
     */
    public BEConfiguraciongeneral createBEConfiguraciongeneral() {
        return new BEConfiguraciongeneral();
    }

    /**
     * Create an instance of {@link GetAllLookUpPaisesResponse }
     * 
     */
    public GetAllLookUpPaisesResponse createGetAllLookUpPaisesResponse() {
        return new GetAllLookUpPaisesResponse();
    }

    /**
     * Create an instance of {@link UserAuthInfo }
     * 
     */
    public UserAuthInfo createUserAuthInfo() {
        return new UserAuthInfo();
    }

    /**
     * Create an instance of {@link UpdateProvinciasResponse }
     * 
     */
    public UpdateProvinciasResponse createUpdateProvinciasResponse() {
        return new UpdateProvinciasResponse();
    }

    /**
     * Create an instance of {@link GetConfiguraciongeneralResponse }
     * 
     */
    public GetConfiguraciongeneralResponse createGetConfiguraciongeneralResponse() {
        return new GetConfiguraciongeneralResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBEPaises }
     * 
     */
    public ArrayOfBEPaises createArrayOfBEPaises() {
        return new ArrayOfBEPaises();
    }

    /**
     * Create an instance of {@link UpdateDomiciliosResponse }
     * 
     */
    public UpdateDomiciliosResponse createUpdateDomiciliosResponse() {
        return new UpdateDomiciliosResponse();
    }

    /**
     * Create an instance of {@link GetAllCategoriasImpuestoResponse }
     * 
     */
    public GetAllCategoriasImpuestoResponse createGetAllCategoriasImpuestoResponse() {
        return new GetAllCategoriasImpuestoResponse();
    }

    /**
     * Create an instance of {@link GetAllFeriadosResponse }
     * 
     */
    public GetAllFeriadosResponse createGetAllFeriadosResponse() {
        return new GetAllFeriadosResponse();
    }

    /**
     * Create an instance of {@link DeletePaisesResponse }
     * 
     */
    public DeletePaisesResponse createDeletePaisesResponse() {
        return new DeletePaisesResponse();
    }

    /**
     * Create an instance of {@link SetValuacionMTMResponse }
     * 
     */
    public SetValuacionMTMResponse createSetValuacionMTMResponse() {
        return new SetValuacionMTMResponse();
    }

    /**
     * Create an instance of {@link GetAllDomicilios }
     * 
     */
    public GetAllDomicilios createGetAllDomicilios() {
        return new GetAllDomicilios();
    }

    /**
     * Create an instance of {@link UpdateGruposEconomicos }
     * 
     */
    public UpdateGruposEconomicos createUpdateGruposEconomicos() {
        return new UpdateGruposEconomicos();
    }

    /**
     * Create an instance of {@link UpdateTiposSociedadResponse }
     * 
     */
    public UpdateTiposSociedadResponse createUpdateTiposSociedadResponse() {
        return new UpdateTiposSociedadResponse();
    }

    /**
     * Create an instance of {@link BuscoProcesosEncadenadosResponse }
     * 
     */
    public BuscoProcesosEncadenadosResponse createBuscoProcesosEncadenadosResponse() {
        return new BuscoProcesosEncadenadosResponse();
    }

    /**
     * Create an instance of {@link DeleteCalendarios }
     * 
     */
    public DeleteCalendarios createDeleteCalendarios() {
        return new DeleteCalendarios();
    }

    /**
     * Create an instance of {@link DeleteEscritorios }
     * 
     */
    public DeleteEscritorios createDeleteEscritorios() {
        return new DeleteEscritorios();
    }

    /**
     * Create an instance of {@link GetUltimoEstadoSistemaResponse }
     * 
     */
    public GetUltimoEstadoSistemaResponse createGetUltimoEstadoSistemaResponse() {
        return new GetUltimoEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link CreateCategoriasImpuestoResponse }
     * 
     */
    public CreateCategoriasImpuestoResponse createCreateCategoriasImpuestoResponse() {
        return new CreateCategoriasImpuestoResponse();
    }

    /**
     * Create an instance of {@link GetByEscritoriosResponse }
     * 
     */
    public GetByEscritoriosResponse createGetByEscritoriosResponse() {
        return new GetByEscritoriosResponse();
    }

    /**
     * Create an instance of {@link GetAllEstadoSistemaResponse }
     * 
     */
    public GetAllEstadoSistemaResponse createGetAllEstadoSistemaResponse() {
        return new GetAllEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpPlantillasInformesResponse }
     * 
     */
    public GetAllLookUpPlantillasInformesResponse createGetAllLookUpPlantillasInformesResponse() {
        return new GetAllLookUpPlantillasInformesResponse();
    }

    /**
     * Create an instance of {@link ConsultaEstadoSistema }
     * 
     */
    public ConsultaEstadoSistema createConsultaEstadoSistema() {
        return new ConsultaEstadoSistema();
    }

    /**
     * Create an instance of {@link UpdateConfiguracionSistemaResponse }
     * 
     */
    public UpdateConfiguracionSistemaResponse createUpdateConfiguracionSistemaResponse() {
        return new UpdateConfiguracionSistemaResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpTablaMaestraResponse }
     * 
     */
    public GetAllLookUpTablaMaestraResponse createGetAllLookUpTablaMaestraResponse() {
        return new GetAllLookUpTablaMaestraResponse();
    }

    /**
     * Create an instance of {@link BEBase }
     * 
     */
    public BEBase createBEBase() {
        return new BEBase();
    }

    /**
     * Create an instance of {@link GenerarSalidaContableWithBESesion }
     * 
     */
    public GenerarSalidaContableWithBESesion createGenerarSalidaContableWithBESesion() {
        return new GenerarSalidaContableWithBESesion();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposImpuesto }
     * 
     */
    public GetAllLookUpTiposImpuesto createGetAllLookUpTiposImpuesto() {
        return new GetAllLookUpTiposImpuesto();
    }

    /**
     * Create an instance of {@link CreateTiposDocumentoResponse }
     * 
     */
    public CreateTiposDocumentoResponse createCreateTiposDocumentoResponse() {
        return new CreateTiposDocumentoResponse();
    }

    /**
     * Create an instance of {@link GetUserIdentity }
     * 
     */
    public GetUserIdentity createGetUserIdentity() {
        return new GetUserIdentity();
    }

    /**
     * Create an instance of {@link ObtenerProgresoProceso }
     * 
     */
    public ObtenerProgresoProceso createObtenerProgresoProceso() {
        return new ObtenerProgresoProceso();
    }

    /**
     * Create an instance of {@link GetAllCalendariosResponse }
     * 
     */
    public GetAllCalendariosResponse createGetAllCalendariosResponse() {
        return new GetAllCalendariosResponse();
    }

    /**
     * Create an instance of {@link CreateLocalidadesResponse }
     * 
     */
    public CreateLocalidadesResponse createCreateLocalidadesResponse() {
        return new CreateLocalidadesResponse();
    }

    /**
     * Create an instance of {@link GuardarEscritoriosResponse }
     * 
     */
    public GuardarEscritoriosResponse createGuardarEscritoriosResponse() {
        return new GuardarEscritoriosResponse();
    }

    /**
     * Create an instance of {@link BEProgresoProceso }
     * 
     */
    public BEProgresoProceso createBEProgresoProceso() {
        return new BEProgresoProceso();
    }

    /**
     * Create an instance of {@link GetConfiguracionpresentacion }
     * 
     */
    public GetConfiguracionpresentacion createGetConfiguracionpresentacion() {
        return new GetConfiguracionpresentacion();
    }

    /**
     * Create an instance of {@link BECalendarios }
     * 
     */
    public BECalendarios createBECalendarios() {
        return new BECalendarios();
    }

    /**
     * Create an instance of {@link UpdateTiposDocumentoResponse }
     * 
     */
    public UpdateTiposDocumentoResponse createUpdateTiposDocumentoResponse() {
        return new UpdateTiposDocumentoResponse();
    }

    /**
     * Create an instance of {@link CreateGruposEconomicos }
     * 
     */
    public CreateGruposEconomicos createCreateGruposEconomicos() {
        return new CreateGruposEconomicos();
    }

    /**
     * Create an instance of {@link DeleteTiposSociedadResponse }
     * 
     */
    public DeleteTiposSociedadResponse createDeleteTiposSociedadResponse() {
        return new DeleteTiposSociedadResponse();
    }

    /**
     * Create an instance of {@link GetAllCategoriasImpuesto }
     * 
     */
    public GetAllCategoriasImpuesto createGetAllCategoriasImpuesto() {
        return new GetAllCategoriasImpuesto();
    }

    /**
     * Create an instance of {@link GetDiaHabil }
     * 
     */
    public GetDiaHabil createGetDiaHabil() {
        return new GetDiaHabil();
    }

    /**
     * Create an instance of {@link BEPaises }
     * 
     */
    public BEPaises createBEPaises() {
        return new BEPaises();
    }

    /**
     * Create an instance of {@link ClearValuacionMTMResponse }
     * 
     */
    public ClearValuacionMTMResponse createClearValuacionMTMResponse() {
        return new ClearValuacionMTMResponse();
    }

    /**
     * Create an instance of {@link ObtenerTodosProgresoProcesoResponse }
     * 
     */
    public ObtenerTodosProgresoProcesoResponse createObtenerTodosProgresoProcesoResponse() {
        return new ObtenerTodosProgresoProcesoResponse();
    }

    /**
     * Create an instance of {@link DeleteTiposDocumentoResponse }
     * 
     */
    public DeleteTiposDocumentoResponse createDeleteTiposDocumentoResponse() {
        return new DeleteTiposDocumentoResponse();
    }

    /**
     * Create an instance of {@link AnularCierreSistemaResponse }
     * 
     */
    public AnularCierreSistemaResponse createAnularCierreSistemaResponse() {
        return new AnularCierreSistemaResponse();
    }

    /**
     * Create an instance of {@link BEConfiguracionpresentacion }
     * 
     */
    public BEConfiguracionpresentacion createBEConfiguracionpresentacion() {
        return new BEConfiguracionpresentacion();
    }

    /**
     * Create an instance of {@link GetAllGruposEconomicos }
     * 
     */
    public GetAllGruposEconomicos createGetAllGruposEconomicos() {
        return new GetAllGruposEconomicos();
    }

    /**
     * Create an instance of {@link ArrayOfBEProvincias }
     * 
     */
    public ArrayOfBEProvincias createArrayOfBEProvincias() {
        return new ArrayOfBEProvincias();
    }

    /**
     * Create an instance of {@link CreatePaisesResponse }
     * 
     */
    public CreatePaisesResponse createCreatePaisesResponse() {
        return new CreatePaisesResponse();
    }

    /**
     * Create an instance of {@link CreateGruposEconomicosResponse }
     * 
     */
    public CreateGruposEconomicosResponse createCreateGruposEconomicosResponse() {
        return new CreateGruposEconomicosResponse();
    }

    /**
     * Create an instance of {@link DcGeneral }
     * 
     */
    public DcGeneral createDcGeneral() {
        return new DcGeneral();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposSociedadResponse }
     * 
     */
    public GetAllLookUpTiposSociedadResponse createGetAllLookUpTiposSociedadResponse() {
        return new GetAllLookUpTiposSociedadResponse();
    }

    /**
     * Create an instance of {@link GetAllTiposComprobanteResponse }
     * 
     */
    public GetAllTiposComprobanteResponse createGetAllTiposComprobanteResponse() {
        return new GetAllTiposComprobanteResponse();
    }

    /**
     * Create an instance of {@link GetDiaHabilResponse }
     * 
     */
    public GetDiaHabilResponse createGetDiaHabilResponse() {
        return new GetDiaHabilResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBELocalidades }
     * 
     */
    public ArrayOfBELocalidades createArrayOfBELocalidades() {
        return new ArrayOfBELocalidades();
    }

    /**
     * Create an instance of {@link BETiposDocumento }
     * 
     */
    public BETiposDocumento createBETiposDocumento() {
        return new BETiposDocumento();
    }

    /**
     * Create an instance of {@link SetImputacionCuentasComitentesResponse }
     * 
     */
    public SetImputacionCuentasComitentesResponse createSetImputacionCuentasComitentesResponse() {
        return new SetImputacionCuentasComitentesResponse();
    }

    /**
     * Create an instance of {@link DeleteLocalidades }
     * 
     */
    public DeleteLocalidades createDeleteLocalidades() {
        return new DeleteLocalidades();
    }

    /**
     * Create an instance of {@link UpdateParametrosResponse }
     * 
     */
    public UpdateParametrosResponse createUpdateParametrosResponse() {
        return new UpdateParametrosResponse();
    }

    /**
     * Create an instance of {@link GetAllLookUpTiposDatosRegistralResponse }
     * 
     */
    public GetAllLookUpTiposDatosRegistralResponse createGetAllLookUpTiposDatosRegistralResponse() {
        return new GetAllLookUpTiposDatosRegistralResponse();
    }

    /**
     * Create an instance of {@link UpdatePersonasResponse }
     * 
     */
    public UpdatePersonasResponse createUpdatePersonasResponse() {
        return new UpdatePersonasResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBEConceptos }
     * 
     */
    public ArrayOfBEConceptos createArrayOfBEConceptos() {
        return new ArrayOfBEConceptos();
    }

    /**
     * Create an instance of {@link GetAllConceptosResponse }
     * 
     */
    public GetAllConceptosResponse createGetAllConceptosResponse() {
        return new GetAllConceptosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBETiposImpuesto }
     * 
     */
    public ArrayOfBETiposImpuesto createArrayOfBETiposImpuesto() {
        return new ArrayOfBETiposImpuesto();
    }

    /**
     * Create an instance of {@link DeleteTiposDocumento }
     * 
     */
    public DeleteTiposDocumento createDeleteTiposDocumento() {
        return new DeleteTiposDocumento();
    }

    /**
     * Create an instance of {@link UpdateFeriados }
     * 
     */
    public UpdateFeriados createUpdateFeriados() {
        return new UpdateFeriados();
    }

    /**
     * Create an instance of {@link GetAllLookUpCalendarios }
     * 
     */
    public GetAllLookUpCalendarios createGetAllLookUpCalendarios() {
        return new GetAllLookUpCalendarios();
    }

    /**
     * Create an instance of {@link CopiarFeriadosCalendariosResponse }
     * 
     */
    public CopiarFeriadosCalendariosResponse createCopiarFeriadosCalendariosResponse() {
        return new CopiarFeriadosCalendariosResponse();
    }

    /**
     * Create an instance of {@link DeleteParametros }
     * 
     */
    public DeleteParametros createDeleteParametros() {
        return new DeleteParametros();
    }

    /**
     * Create an instance of {@link GetAllAdministracionUsuariosResponse }
     * 
     */
    public GetAllAdministracionUsuariosResponse createGetAllAdministracionUsuariosResponse() {
        return new GetAllAdministracionUsuariosResponse();
    }

    /**
     * Create an instance of {@link ConsultaByIDEstadoSistemaResponse }
     * 
     */
    public ConsultaByIDEstadoSistemaResponse createConsultaByIDEstadoSistemaResponse() {
        return new ConsultaByIDEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link UpdateProvincias }
     * 
     */
    public UpdateProvincias createUpdateProvincias() {
        return new UpdateProvincias();
    }

    /**
     * Create an instance of {@link GetAllPersonasResponse }
     * 
     */
    public GetAllPersonasResponse createGetAllPersonasResponse() {
        return new GetAllPersonasResponse();
    }

    /**
     * Create an instance of {@link GetByIDTiposDocumento }
     * 
     */
    public GetByIDTiposDocumento createGetByIDTiposDocumento() {
        return new GetByIDTiposDocumento();
    }

    /**
     * Create an instance of {@link GetByIDLocalidadesResponse }
     * 
     */
    public GetByIDLocalidadesResponse createGetByIDLocalidadesResponse() {
        return new GetByIDLocalidadesResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBEPersonas }
     * 
     */
    public ArrayOfBEPersonas createArrayOfBEPersonas() {
        return new ArrayOfBEPersonas();
    }

    /**
     * Create an instance of {@link GetByIDLocalidades }
     * 
     */
    public GetByIDLocalidades createGetByIDLocalidades() {
        return new GetByIDLocalidades();
    }

    /**
     * Create an instance of {@link CreateParametros }
     * 
     */
    public CreateParametros createCreateParametros() {
        return new CreateParametros();
    }

    /**
     * Create an instance of {@link BETiposSociedad }
     * 
     */
    public BETiposSociedad createBETiposSociedad() {
        return new BETiposSociedad();
    }

    /**
     * Create an instance of {@link AbrirEstadoSistemaResponse }
     * 
     */
    public AbrirEstadoSistemaResponse createAbrirEstadoSistemaResponse() {
        return new AbrirEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link DeletePaises }
     * 
     */
    public DeletePaises createDeletePaises() {
        return new DeletePaises();
    }

    /**
     * Create an instance of {@link GetByIDPaisesResponse }
     * 
     */
    public GetByIDPaisesResponse createGetByIDPaisesResponse() {
        return new GetByIDPaisesResponse();
    }

    /**
     * Create an instance of {@link GetAllEscritorios }
     * 
     */
    public GetAllEscritorios createGetAllEscritorios() {
        return new GetAllEscritorios();
    }

    /**
     * Create an instance of {@link UpdateConfiguracionSistema }
     * 
     */
    public UpdateConfiguracionSistema createUpdateConfiguracionSistema() {
        return new UpdateConfiguracionSistema();
    }

    /**
     * Create an instance of {@link ArrayOfBEEstadoSistema }
     * 
     */
    public ArrayOfBEEstadoSistema createArrayOfBEEstadoSistema() {
        return new ArrayOfBEEstadoSistema();
    }

    /**
     * Create an instance of {@link GetAllParametros }
     * 
     */
    public GetAllParametros createGetAllParametros() {
        return new GetAllParametros();
    }

    /**
     * Create an instance of {@link AbrirEstadoSistema }
     * 
     */
    public AbrirEstadoSistema createAbrirEstadoSistema() {
        return new AbrirEstadoSistema();
    }

    /**
     * Create an instance of {@link UpdateCalendariosResponse }
     * 
     */
    public UpdateCalendariosResponse createUpdateCalendariosResponse() {
        return new UpdateCalendariosResponse();
    }

    /**
     * Create an instance of {@link AnularAperturaSistemaResponse }
     * 
     */
    public AnularAperturaSistemaResponse createAnularAperturaSistemaResponse() {
        return new AnularAperturaSistemaResponse();
    }

    /**
     * Create an instance of {@link GetAllConceptos }
     * 
     */
    public GetAllConceptos createGetAllConceptos() {
        return new GetAllConceptos();
    }

    /**
     * Create an instance of {@link ConsultaUltimoEstadoSistemaResponse }
     * 
     */
    public ConsultaUltimoEstadoSistemaResponse createConsultaUltimoEstadoSistemaResponse() {
        return new ConsultaUltimoEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link DisponibilizacionFeriados }
     * 
     */
    public DisponibilizacionFeriados createDisponibilizacionFeriados() {
        return new DisponibilizacionFeriados();
    }

    /**
     * Create an instance of {@link CerrarEstadoSistemaResponse }
     * 
     */
    public CerrarEstadoSistemaResponse createCerrarEstadoSistemaResponse() {
        return new CerrarEstadoSistemaResponse();
    }

    /**
     * Create an instance of {@link GetAllProvincias }
     * 
     */
    public GetAllProvincias createGetAllProvincias() {
        return new GetAllProvincias();
    }

    /**
     * Create an instance of {@link UpdateAdministracionUsuariosResponse }
     * 
     */
    public UpdateAdministracionUsuariosResponse createUpdateAdministracionUsuariosResponse() {
        return new UpdateAdministracionUsuariosResponse();
    }

    /**
     * Create an instance of {@link GetAllTiposComprobante }
     * 
     */
    public GetAllTiposComprobante createGetAllTiposComprobante() {
        return new GetAllTiposComprobante();
    }

    /**
     * Create an instance of {@link ObtnerFeriadosPorRangoFecha }
     * 
     */
    public ObtnerFeriadosPorRangoFecha createObtnerFeriadosPorRangoFecha() {
        return new ObtnerFeriadosPorRangoFecha();
    }

    /**
     * Create an instance of {@link UpdateGruposEconomicosResponse }
     * 
     */
    public UpdateGruposEconomicosResponse createUpdateGruposEconomicosResponse() {
        return new UpdateGruposEconomicosResponse();
    }

    /**
     * Create an instance of {@link ArrayOfBETablaMaestra }
     * 
     */
    public ArrayOfBETablaMaestra createArrayOfBETablaMaestra() {
        return new ArrayOfBETablaMaestra();
    }

    /**
     * Create an instance of {@link DeleteGruposEconomicos }
     * 
     */
    public DeleteGruposEconomicos createDeleteGruposEconomicos() {
        return new DeleteGruposEconomicos();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link String }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "string")
    public JAXBElement<String> createString(String value) {
        return new JAXBElement<String>(_String_QNAME, String.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "dateTime")
    public JAXBElement<XMLGregorianCalendar> createDateTime(XMLGregorianCalendar value) {
        return new JAXBElement<XMLGregorianCalendar>(_DateTime_QNAME, XMLGregorianCalendar.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link BigDecimal }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "decimal")
    public JAXBElement<BigDecimal> createDecimal(BigDecimal value) {
        return new JAXBElement<BigDecimal>(_Decimal_QNAME, BigDecimal.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link UserAuthInfo }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://tempuri.org/", name = "UserAuthInfo")
    public JAXBElement<UserAuthInfo> createUserAuthInfo(UserAuthInfo value) {
        return new JAXBElement<UserAuthInfo>(_UserAuthInfo_QNAME, UserAuthInfo.class, null, value);
    }

}
