/**
 * 
 */
package ar.edu.unlp.info.oo2.OO2_ej7_file;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FileSystemTest {
	
	Archivo java;
	Archivo python;
	Archivo vscode;
	Directorio escritorio;
	Directorio directorioVacio;
	Directorio lenguajes;

	@BeforeEach
	void setUp() throws Exception {
		java = new Archivo("java", 10);
		python = new Archivo("python", 10);
		vscode = new Archivo("vscode", 11);
		
		lenguajes = new Directorio("lenguajes");
		escritorio = new Directorio("escritorio");
		directorioVacio = new Directorio("directorioVacio");
		
		lenguajes.agregarElemento(java);
		lenguajes.agregarElemento(python);
		lenguajes.agregarElemento(vscode);
		escritorio.agregarElemento(lenguajes);
		escritorio.agregarElemento(vscode);
		
	}
    @Test
    public void testTamanoTotalOcupado() {
        assertEquals(106, escritorio.tamanoTotalOcupado());    
        assertEquals(32, directorioVacio.tamanoTotalOcupado()); 
    }
    @Test
    public void testArchivoMasGrande() {
        assertEquals(vscode, escritorio.archivoMasGrande());  
        assertEquals(null, directorioVacio.archivoMasGrande());  
    }
    @Test
    public void testArchivoMasNuevo() {
        assertEquals(java, escritorio.archivoMasNuevo());     
        //no tengo forma de testear porque todos los objetos 
        //se crean en la misma fecha en formato "2024-04-21"
        assertEquals(null, directorioVacio.archivoMasNuevo());   
    }
    @Test
    public void testbuscar(){
    	assertEquals(lenguajes, escritorio.buscar("lenguajes")); 
    	assertEquals(escritorio, escritorio.buscar("escritorio"));   
    	assertEquals(python, escritorio.buscar("python")); 
    	assertEquals(vscode, escritorio.buscar("vscode"));
    	assertEquals(java, escritorio.buscar("java"));
    	assertEquals(null, escritorio.buscar("javA"));   
    }
    @Test
    public void testbuscarTodos(){
    	List<FileSystem> listaEscritorio = new ArrayList<FileSystem>();
    	listaEscritorio.add(escritorio);
    	List<FileSystem> listaVscode = new ArrayList<FileSystem>();
    	listaVscode.add(vscode);
    	listaVscode.add(vscode);
    	List<FileSystem> listaJava = new ArrayList<FileSystem>();
    	listaJava.add(java);
    	List<FileSystem> listaVacia = new ArrayList<FileSystem>();
    	assertEquals(listaVscode, escritorio.buscarTodos("vscode"));
    	assertEquals(listaJava, escritorio.buscarTodos("java"));
    	assertEquals(listaVacia, escritorio.buscarTodos("javA"));
    	assertEquals(listaEscritorio, escritorio.buscarTodos("escritorio")); 
    }
    @Test
    public void testListadoDeContenido(){
    	System.out.println(escritorio.listadoDeContenido(""));
    	assertEquals("/escritorio\n"
    			+ "/escritorio/lenguajes\n"
    			+ "/escritorio/lenguajes/java\n"
    			+ "/escritorio/lenguajes/python\n"
    			+ "/escritorio/lenguajes/vscode\n"
    			+ "/escritorio/vscode\n", escritorio.listadoDeContenido("")); 
        
    	
    }
}
