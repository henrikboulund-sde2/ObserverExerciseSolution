public class Bidder implements Observer
{
    private String name;

    public Bidder(String name) {
        this.name = name;
    }

    public void update(String itemName, float currentBid) {
        System.out.println(name + " - Current highest bid for item " + itemName + ": $" + currentBid);
    }
}
