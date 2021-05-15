class Sedan extends Automovil {
    Integer capacidad;
    String  caracteristicas;
    String  descapotable;

    public Sedan(String marca, String modelo, Integer anio, Double precio, String tipo, Integer capacidad, String caracteristicas, String descapotable){
        super(marca, modelo, anio, precio, tipo);
        this.capacidad = capacidad;
        this.caracteristicas = caracteristicas;
        this.descapotable = descapotable;
    }

    void informacion(){
        System.out.println("\nMarca: " + marca +  "\nModelo: " + modelo + "\nCapacidad: " + capacidad + " Puertas" + "\nCaracteristicas: " + caracteristicas + "\nDescapotable: " + descapotable);
    }

    void datosVehiculo(){
        System.out.println("\nAño: " + anio + "\nTipo: " + tipo );
    }

}
