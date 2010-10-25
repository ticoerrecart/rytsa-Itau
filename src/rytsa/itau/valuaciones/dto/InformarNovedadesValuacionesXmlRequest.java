package rytsa.itau.valuaciones.dto;

import java.util.ArrayList;
import java.util.List;

public class InformarNovedadesValuacionesXmlRequest {

	String fechaProceso;
	String codFormula;
	List<RequestData> requestDataList = new ArrayList<RequestData>();

	public void addRequestData(RequestData rd){
		this.requestDataList.add(rd);
	}
	
	public String getFechaProceso() {
		return fechaProceso;
	}

	public void setFechaProceso(String fechaProceso) {
		this.fechaProceso = fechaProceso;
	}

	public String getCodFormula() {
		return codFormula;
	}

	public void setCodFormula(String codFormula) {
		this.codFormula = codFormula;
	}

	public List<RequestData> getRequestDataList() {
		return requestDataList;
	}

	public void setRequestDataList(List<RequestData> requestDataList) {
		this.requestDataList = requestDataList;
	}

}
