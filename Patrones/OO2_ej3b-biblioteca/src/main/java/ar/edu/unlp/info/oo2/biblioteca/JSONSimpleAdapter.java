package ar.edu.unlp.info.oo2.biblioteca;

import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JSONSimpleAdapter extends VoorheesExporter {
	private JSONArray jsonArray;
	private JSONObject jsonObj;

	@SuppressWarnings("unchecked")
	private JSONObject objAJSON(Socio socio) {
		jsonObj = new JSONObject();
		jsonObj.put("nombre", socio.getNombre());
		jsonObj.put("email", socio.getEmail());
		jsonObj.put("legajo",socio.getLegajo());
		return jsonObj;
	}

	@SuppressWarnings("unchecked")
	public String exportar(List<Socio> socios) {
		jsonArray = new JSONArray();
		for (Socio socio : socios) {
			jsonArray.add(this.objAJSON(socio));
		}
	//	System.out.println(jsonArray.toJSONString());
		return jsonArray.toJSONString();
	}


}