class Compacto extends Automovil {
    Integer capacidad;
    String  caracteristicas;


    public Compacto(String marca, String modelo, Integer anio, Double precio, String tipo, Integer capacidad, String caracteristicas, String descapotable){
        super(marca, modelo, anio, precio, tipo);
        this.capacidad = capacidad;
        this.caracteristicas = caracteristicas;
    }

    void informacion(){
        System.out.println("\nMarca: " + marca +  "\nModelo: " + modelo + "\nCapacidad: " + capacidad + " Puertas" + "\nCaracteristicas: " + caracteristicas );
    }

    void datosVehiculo(){
        System.out.println("\nAño: " + anio + "\nTipo: " + tipo );
    }

}
