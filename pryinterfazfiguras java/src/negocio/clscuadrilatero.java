
package negocio;

public class clscuadrilatero implements figura {
    private float _largo;
    private float _ancho;

    public clscuadrilatero(float _largo, float _ancho) {
        this._largo = _largo;
        this._ancho = _ancho;
    }

    public float largo() { //getlargo
        return _largo;
    }

    public void largo(float largo) { //setlargo
        this._largo = largo;
    }

    public float ancho() { // getAncho
        return _ancho;
    }

    public void ancho(float ancho) { //setAncho
        this._ancho = ancho;
    }
    
    // nombres de metodos que se repiten en las subclases
    
    @Override
    public float area(){
        return (_largo*_ancho);
    }
    @Override
    public float perimetro(){
        return (2*_largo + 2*_ancho);
    }
    
    public boolean cuadrado(){
        return _largo ==_ancho ;
    }

    @Override
    public String tipo() {
        if(cuadrado()){
            return "Cuadrado";
        }else{
            return "Rectangulo";
        }    
    }
    
    
    
    
}
