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
public class clsProveedor {
    private String _Ruc;
    private String _Nombre;
    private String _razonSocial;
    private String _Direccion;
    private String _Telefono;

    public clsProveedor() {
    }

    public clsProveedor(String _Ruc, String _Nombre, String _razonSocial, String _Direccion, String _Telefono) {
        this._Ruc = _Ruc;
        this._Nombre = _Nombre;
        this._razonSocial = _razonSocial;
        this._Direccion = _Direccion;
        this._Telefono = _Telefono;
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

    public String RazonSocial() {
        return _razonSocial;
    }

    public void RazonSocial(String _razonSocial) {
        this._razonSocial = _razonSocial;
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
