
public class StoreDB {
    Invoice invoice;

    StoreDB(Invoice invoice){
        this.invoice=invoice;
    }

    public void savetoDb(){
        //code for saving DB
    }
}


interface InvoiceDao{
    public void save(Invoice invoice);
}

class DatabsaseStore implements InvoiceDao{
    @Override
    public void Save(Invoice invoice){
        //logic for saving to databse
    }
}

class FileStorage implements InvoiceDao{
    @Override
    public void Save(Invoice invoice){
        //logic to store in file
    }
}