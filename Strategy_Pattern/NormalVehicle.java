package Strategy_Pattern;

public class NormalVehicle extends Vehicle{
    public NormalVehicle(){
        super(new Normaldrive());
    }
}
