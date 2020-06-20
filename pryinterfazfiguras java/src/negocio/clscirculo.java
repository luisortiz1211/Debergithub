
package negocio;


public class clscirculo implements figura {
    private float _radio;

    public clscirculo(float _radio) {
        this._radio = _radio;
    }

    public float getRadio() {
        return _radio;
    }

    public void setRadio(float _radio) {
        this._radio = _radio;
    }
    // nombres de metodos que se repiten en las subclases
    
    public float area(){
        return (float)(_radio*_radio*Math.PI);
    }
    public float perimetro(){
        return (float)(_radio* 2*Math.PI);
    }

    @Override
    public String tipo() {
        return "No definido para circulo";
    }
    
}
