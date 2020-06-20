
package negocio;


public class clspoligonoreg implements figura {
    private float _lado;
    private float _apotema;
    private int _num1;

    public clspoligonoreg(float _lado, float _apotema, int _num1) {
        this._lado = _lado;
        this._apotema = _apotema;
        this._num1 = _num1;
    }

    public float getLado() {
        return _lado;
    }

    public void setLado(float lado) {
        this._lado = lado;
    }

    public float getApotema() {
        return _apotema;
    }

    public void setApotema(float apotema) {
        this._apotema = apotema;
    }

    public int getNum1() {
        return _num1;
    }

    public void setNum1(int num1) {
        this._num1 = num1;
    }

    // nombres de metodos que se repiten en las subclases
       
    @Override
    public float area() {
        return (perimetro()*_apotema)/2;
        }

    @Override
    public float perimetro() {
        return (_num1*_lado);
    }

    @Override
    public String tipo() {
        String tipo = "Poligono regular mayor a 12 lados ";
         switch(_num1){
         case 5:
             tipo = "Pentagono";
             break;
         case 6:
             tipo = "Hexagono";
             break;
         case 7:
             tipo = "Eptagono";
             break;
         case 8:
             tipo = "Octagonp";
             break;
         case 9:
             tipo = "Nonagono";
             break;
         case 10:
             tipo = "Decagono";
             break;
         case 11:
             tipo = "Endecagono";
             break;
         case 12:
             tipo = "Dodecagono";
             break;
        }
          return tipo;         
    }
    
}
