
public class Invoice {
    Car car;
    int quantity;

    Invoice(Car car,int quantity){
        this.car=car;
        this.quantity=quantity;
    }

    public int price(){
        return (this.quantity)*(car.price);
    }
}
