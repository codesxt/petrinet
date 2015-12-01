
package petrinet;

/**
 *
 * @author miguel
 */
public class Transicion {
    private String nombreTransicion;
    private int x;
    private int y;

    public Transicion() {
        
    }

    public String getNombreTransicion() {
        return nombreTransicion;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setNombreTransicion(String nombreTransicion) {
        this.nombreTransicion = nombreTransicion;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
