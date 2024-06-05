package ar.edu.unlp.info.oo2.accesobd;

import java.util.Collection;
import java.util.List;

public class DatabaseProxy implements DatabaseAccess {
    private DatabaseAccess database;
    private String password;
    private Boolean loged;

    public DatabaseProxy(DatabaseAccess db, String p) {
        super();
        this.password = p;
        this.loged = false;
        
        this.database = db;
//      TODO: duda, la teoria del patron proxy es "envolver" a un objeto y asi poder ejecutar codigo antes o despues
//      ¿como se envuelve ese objeto? pasandolo por parametro o iniciandolo adentro del proxy?
//      como lo lei en teoria me suena a que se pasa por parametro y no asi:
//      this.database = new DatabaseRealAccess();
        
    }
    
    public void login(String p) {
    	this.loged= (p == this.password);
    }
    
    public void logout() {
    	this.loged= false;
    }
    
    @Override
    public Collection<String> getSearchResults(String queryString) {
    	if (this.loged == false){
    		throw new RuntimeException("No estas logueado.");
    	}else {
    		return this.database.getSearchResults(queryString);
    	}
    }

    @Override
    public int insertNewRow(List<String> rowData) {
    	if (this.loged == false){
    		throw new RuntimeException("No estas logueado.");
    	}else {
    		return this.database.insertNewRow(rowData);
    	}
    }


}