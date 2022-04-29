package model;

public class RechargeableBattery extends Battery implements Rechargeable{


    public final static char BATTERY_LITIO = 'l';
    public final static char BATTERY_NIQUEL_CADIO = 'n';
    public final static double FACTOR_LITIO = 0.92;
    public final static double FACTOR_NIQUEL_CADIO = 0.80;

    
    private int chargerNumber;
    private char type;
    
    public RechargeableBattery(String name, double voltage, double cost, double capacity, int chargerNumber, char type) {
        super(name, voltage, cost, capacity);
        this.chargerNumber = chargerNumber;
        this.type = type;
    }

    //costo * voltaje * capacidad / (1000 * número usos * factor de uso)
    //l = 0.92
    //n = 0.8
    @Override
    public double calculateUsefulLifeCost() {

        double total = 0;

        if(type =='l'){
            total = (super.getCost()*super.getVoltage()* super.getCapacity())/(1000*chargerNumber*FACTOR_LITIO);
        } else {
            total = (super.getCost()*super.getVoltage()* super.getCapacity())/(1000*chargerNumber*FACTOR_NIQUEL_CADIO);
        }

        return total;
    }

    public String toString(){
        return "Bateria recargable.\nNombre: "+super.getName()+"\nCosto de vida útil: "+ calculateUsefulLifeCost()+"\n";
    }

}
