/*
 *   UNIANDES - PUYO
 *   Sistema de  Facturacion 2016
 *   Octavo Semestre
 *   Alexander Ulloa
 *   23/05/2016
 */
package Entidades;
import java.util.Date;
/**
 *
 * @author Pc01
 */
public class clsFactura {
 private int _Id;
 private String _cliente;
 private Date fncha;
 private float _Subtotal;
 private float _iva ;
 private float _total;

    public clsFactura() {
    }

    public clsFactura(int _Id, String _cliente, Date fncha, float _Subtotal, float _iva, float _total) {
        this._Id = _Id;
        this._cliente = _cliente;
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

    public String Cliente() {
        return _cliente;
    }

    public void Cliente(String _cliente) {
        this._cliente = _cliente;
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
