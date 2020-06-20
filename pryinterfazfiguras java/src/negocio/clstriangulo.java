
package negocio;

public class clstriangulo implements figura {
    private float _lado1;
    private float _lado2;
    private float _lado3;

    public clstriangulo(float _lado1, float _lado2, float _lado3) {
        this._lado1 = _lado1;
        this._lado2 = _lado2;
        this._lado3 = _lado3;
    }

    public float getLado1() {
        return _lado1;
    }

    public void setLado1(float _lado1) {
        this._lado1 = _lado1;
    }

    public float getLado2() {
        return _lado2;
    }

    public void setLado2(float _lado2) {
        this._lado2 = _lado2;
    }

    public float getLado3() {
        return _lado3;
    }

    public void setLado3(float _lado3) {
        this._lado3 = _lado3;
    }   
    
    // metodos
    
    public float semiperimetro(){
        return (float)(_lado1+_lado2+_lado3)/2;
        
    }
    // nombres de metodos que se repiten en las subclases
    @Override
    public float area(){
        return (float)(Math.sqrt(semiperimetro()*((semiperimetro()-_lado1)*(semiperimetro()-_lado2)*(semiperimetro()-_lado3))));
    }

    @Override
    public float perimetro() {
        return (float)(_lado1+_lado2+_lado3);
    }
    
    public boolean estriangulo(){
         return(_lado1+_lado2>_lado3&&_lado2+_lado3>_lado1&&_lado1+_lado3>_lado2);
            
         
         }

    @Override
    public String tipo() {
     String tipo = "Es un triangulo";
     if (estriangulo()){
         if(_lado1 ==_lado2 &&_lado2 ==_lado3) tipo = "Equilatero";
         else if(_lado1==_lado2 || _lado2==_lado3 || _lado1 ==_lado3) tipo = "Isosceles";
         else if (_lado1*_lado1==_lado2*_lado2+_lado3*_lado3||_lado2*_lado2 ==_lado1*_lado1+_lado3*_lado3 || _lado3*_lado3 == _lado1*_lado1+_lado2*_lado2) tipo = " " ;
         }
        return tipo ;
     
    }
}
    

