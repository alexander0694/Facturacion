/*
 *   UNIANDES - PUYO
 *   Sistema de  Facturacion 2016
 *   Octavo Semestre
 *   Alexander Ulloa
 *   23/05/2016
 */
package Entidades;

/**
 *
 * @author Pc01
 */
public class clsCliente {
    private String _Ruc;
    private String _Nombre;
    private String _Direccion;
    private String _Telefono;
    
    
    public clsCliente()
    {
        
    }
    public clsCliente(String ruc, String nombre, String direccion,String telefono){
        this._Ruc=ruc;
        this._Nombre = nombre;
        this._Direccion=direccion;
        this._Telefono= telefono;
   }

    public String Ruc() {
        return _Ruc;
    }

    public void Ruc(String _Ruc) {
        this._Ruc = _Ruc;
    }

    public String Nombre() {
        return _Nombre;
    }

    public void Nombre(String _Nombre) {
       this._Nombre = _Nombre;
    }

    public String Direccion() {
        return _Direccion;
    }

    public void Direccion(String _Direccion) {
        this._Direccion = _Direccion;
    }

    public String Telefono() {
        return _Telefono;
    }

    public void Telefono(String _Telefono) {
        this._Telefono = _Telefono;
    }
    
    
}
