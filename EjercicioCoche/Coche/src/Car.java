public class Car {
    //Atributos
    private String brand;
    private String model;
    private int year;
    private boolean isOn;


    //Getter, Setters y constructor

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Car(String brand, int year, String model) {
        this.brand = brand;
        this.year = year;
        this.model = model;
        this.isOn = false;
    }


    //Funciones

    public boolean startEngine(){
        if(this.isOn){
            System.err.println("El coche ya está encendido");
        }else {
            this.isOn = true;
            System.err.println("Enciendo el coche" + this.brand + " " + this.model + " " + this.year);
        }

        return  this.isOn;
    }

    public  boolean stopEngine() {
        if (!this.isOn){
            System.err.println("El coche ya está encendido");
        }else {
            this.isOn = false;
            System.err.println("Enciendo el coche" + this.brand + " " + this.model+ " " + this.year);
        }
        return this.isOn;
    }

}


