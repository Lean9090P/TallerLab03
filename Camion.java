package Empresa_de_transporte;

import java.util.Vector;
import Empresa_de_transporte.Flete;

public class Camion {
	private int _codigoCamion;
	private String _patente;
	private String _descripcion;
	private boolean _estado;
	public Sucursal _unnamed_Sucursal_;
	public Vector<Flete> _unnamed_Flete_ = new Vector<Flete>();

	public int getCodigoCamion() {
		return this._codigoCamion;
	}

	public void setCodigoCamion(int aCodigoCamion) {
		this._codigoCamion = aCodigoCamion;
	}

	public String getPatente() {
		return this._patente;
	}

	public void setPatente(String aPatente) {
		this._patente = aPatente;
	}

	public String getDescripcion() {
		return this._descripcion;
	}

	public void setDescripcion(String aDescripcion) {
		this._descripcion = aDescripcion;
	}

	public boolean getEstado() {
		return this._estado;
	}

	public void setEstado(boolean aEstado) {
		this._estado = aEstado;
	}
}