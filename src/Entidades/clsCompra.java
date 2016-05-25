/*
 *   UNIANDES - PUYO
 *   Sistema de  Facturacion 2016
 *   Octavo Semestre
 *   Alexander Ulloa
 *   23/05/2016
 */
package Entidades;
import java.util.Date;

public class clsCompra {
 private int _Id;
 private String _proveedor;
 private Date fncha;
 private float _Subtotal = 0;
 private float _iva = 0 ;
 private float _total = 0;

 public clsCompra(){
     
 }

    public clsCompra(int _Id, String _proveedor, Date fncha, float _Subtotal, float _iva, float _total) {
        this._Id = _Id;
        this._proveedor = _proveedor;
        this.fncha = fncha;
        this._Subtotal = _Subtotal;
        this._iva = _iva;
        this._total = _total;
    }

    public int Id() {
        return _Id;
    }

    public void Id(int _Id) {
        this._Id = _Id;
    }

    public String Proveedor() {
        return _proveedor;
    }

    public void Proveedor(String _proveedor) {
        this._proveedor = _proveedor;
    }

    public Date Fncha() {
        return fncha;
    }

    public void Fncha(Date fncha) {
        this.fncha = fncha;
    }

    public float Subtotal() {
        return _Subtotal;
    }

    public void Subtotal(float _Subtotal) {
        this._Subtotal = _Subtotal;
    }

    public float Iva() {
        return _iva;
    }

    public void Iva(float _iva) {
        this._iva = _iva;
    }

    public float Total() {
        return _total;
    }

    public void Total(float _total) {
        this._total = _total;
    }

    
}
