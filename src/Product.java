public class Product {
    private int id;
    private String name;
    private double price;
    private int quantity;
    static int counter = 0;
    private int day;
    private int month;
    private int year;
     private Date mfcDate;

Product (String name, double price , int quantity,Date mfcDate) {
   this.id = counter++;
    this.name = name;
    this.price=price;
    this.quantity=quantity;

    this.mfcDate = mfcDate;
}
  public double getPrice() {
      return price;
}
 public void setPrice(double price) {
     this.price = price;
    }
    public int getQuantity() {
    return quantity;
    }
    public void setQuantity(int quantity){
    this.quantity = quantity;
    }
    public String getName() {
    return name;
    }
    public void setName(String name){
    this.name = name;
    }
    public int getId(){
    return id;
    }


    public Date getMfcDate() {
        return mfcDate;
    }

    public void setMfcDate(Date mfcDate) {
        this.mfcDate = mfcDate;
    }

public Product isLatest(Product p1, Product p2){
    Date temp = mfcDate.isRecent(p1.mfcDate,p2.mfcDate);
    return temp == p1.mfcDate?p1:p2;
}

    public String toString(){
    String productDetails = String.format("%4d\t%-21s%.2f\t%d\t%s",id,name,price,quantity,mfcDate);
    return productDetails;
    }
}