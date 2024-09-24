enum Laptop
{
    //Macbook(5000),Thinkbook(2000),ROG(3000),DPS(1500);
    Macbook(5000),Thinkbook(2000),ROG,DPS(1500);

    private int price;
    private Laptop()
    {
        price = 1000;
    }

    private Laptop(int price) {
        this.price = price;
        System.out.println("In Laptop" + this.name());
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
public class EnumClass
{
    public static void main(String a[])
    {
       // Laptop lap = Laptop.Macbook;
       // System.out.println(lap.getPrize());

        for(Laptop lap : Laptop.values())
        {
            System.out.println(lap +" : " + lap.getPrice());
        }
        // Example of calling setPrice to modify the price of a specific laptop
        Laptop.Macbook.setPrice(5500);
        System.out.println("Updated price of Macbook: " + Laptop.Macbook.getPrice());

    }
}