
package petrinet;


public class Plaza {
    
    private String nombrePlaza;
    private int marca;
    private int x;
    private int y;

    public Plaza(String nombrePlaza, int marca, int x, int y) {
        this.nombrePlaza = nombrePlaza;
        this.marca = marca;
        this.x = x;
        this.y = y;
    }

    public Plaza() {
        
    }
   
    
    public String getNombrePlaza(){
        return nombrePlaza;
    }
    
    public int getMarca(){
        return marca;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
    
    public void setNombrePlaza(String nombre){
        this.nombrePlaza = nombre;
    }
    
    public void setMarca(int marca){
        this.marca = marca;
    } 

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }
    
    
}
