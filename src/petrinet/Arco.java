
package petrinet;

/**
 *
 * @author miguel
 */
public class Arco {
    public static final int PLAZA_A_TRANS = 0;
    public static final int TRANS_A_PLAZA = 1;
    private String plaza;
    private String transicion;
    private int peso;
    private int direccion;
    private int px;
    private int py;
    private int tx;
    private int ty;

    public void setDireccion(int direccion) {
        this.direccion = direccion;
    }

    public void setPx(int px) {
        this.px = px;
    }

    public void setPy(int py) {
        this.py = py;
    }

    public void setTx(int tx) {
        this.tx = tx;
    }

    public void setTy(int ty) {
        this.ty = ty;
    }
    

    public Arco() {
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    public int getDireccion() {
        return direccion;
    }

    public int getPx() {
        return px;
    }

    public int getPy() {
        return py;
    }

    public int getTx() {
        return tx;
    }

    public int getTy() {
        return ty;
    }

    public String getPlaza() {
        return plaza;
    }

    public void setPlaza(String plaza) {
        this.plaza = plaza;
    }

    public String getTransicion() {
        return transicion;
    }

    public void setTransicion(String transicion) {
        this.transicion = transicion;
    }
    
    
}
