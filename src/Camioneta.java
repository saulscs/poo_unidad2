class Camioneta extends Automovil {
    //Propiedades
    Integer capacidad;
    String  caracteristicas;
    String  traccion;

    //Definición del constructor
    public Camioneta(String marca, String modelo, Integer anio, Double precio, String tipo, Integer capacidad, String caracteristicas, String traccion){
        super(marca, modelo, anio, precio, tipo);
        this.capacidad = capacidad;
        this.caracteristicas = caracteristicas;
        this.traccion = traccion;
    }

    //Métodos del objeto
    void informacion(){
        System.out.println("\nMarca: " + marca +  "\nModelo: " + modelo + "\nCapacidad: " + capacidad + " Puertas" + "\nCaracteristicas: " + caracteristicas + "\nTracción: " + traccion);
    }

    void datosVehiculo(){
        System.out.println("\nAño: " + anio + "\nTipo: " + tipo );
    }

}
