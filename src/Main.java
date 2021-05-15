public class Main {
    public static void main(String[] args){

        //Llamamos a los objetos, donde les pasamos las propiedades y acceder al metodo para poder mostar la información
        Sedan sedan = new Sedan("Toyota", "Corolla", 2021, 300.000, "Sedan", 4, "Color blanco", "No" );
        sedan.informacion();
        sedan.datosVehiculo();

        Compacto compacto = new Compacto("Volkswagen", "Polo", 2020, 200.000, "Compacto", 4, "Color azul", "No" );
        compacto.informacion();
        compacto.datosVehiculo();

        Camioneta camioneta = new Camioneta("Ford", "Pick up", 2022, 500.000, "Camioneta", 6, "Color Negro", "Si");
        camioneta.informacion();
        camioneta.datosVehiculo();
    }
}
