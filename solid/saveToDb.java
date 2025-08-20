package solid;

public class saveToDb {
    Invoice invoice;

    public saveToDb(Invoice invoice){
        this.invoice=invoice;
        
    }
    public void saved(){
        System.out.println("Saved to DB");
    }
    
}
