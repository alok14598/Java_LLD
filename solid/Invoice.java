package solid;

public class Invoice {
    Marker marker;
    int quantity;

    public Invoice(Marker marker, int quantity){
        this.marker=marker;
        this.quantity=quantity;
    }

    public int calculateprice(){
        return this.quantity*(marker.price);
    }
}
