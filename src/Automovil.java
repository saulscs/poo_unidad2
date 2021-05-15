public class Automovil {
     Integer Id;
     Integer anio;
     Double precio;
     String tipo;
     String marca;
     String modelo;

     //Definimos el contructor.
    public Automovil(String marca, String modelo, Integer anio, Double precio, String tipo){
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.precio = precio;
        this.tipo = tipo;

    }
}
