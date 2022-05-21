package model;

public class Battery {
     
    private String name;
    private double voltage;
    private double cost;
    private double capacity;

    public Battery(String name, double voltage, double cost, double capacity){
        this.name = name;
        this.voltage = voltage;
        this.cost = cost;
        this.capacity = capacity;
    }

    public double getVoltage() {
        return voltage;
    }

    public double getCost() {
        return cost;
    }

    public double getCapacity() {
        return capacity;
    }

    public String getName() {
        return name;
    }


    public String toString(){
        return "Bateria no recargable."+"\nNombre: "+name+"\nCosto de vida útil: 0 \n";
    }
    

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @param voltage the voltage to set
     */
    public void setVoltage(double voltage) {
        this.voltage = voltage;
    }

    /**
     * @param cost the cost to set
     */
    public void setCost(double cost) {
        this.cost = cost;
    }

    /**
     * @param capacity the capacity to set
     */
    public void setCapacity(double capacity) {
        this.capacity = capacity;
    }

}
