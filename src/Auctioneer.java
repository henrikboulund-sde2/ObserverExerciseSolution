import java.util.ArrayList;
import java.util.List;

public class Auctioneer
{
    private String itemName;
    private float currentBid;
    private List<Observer> bidders;

    public Auctioneer(String itemName)
    {
        this.itemName = itemName;
        this.currentBid = 0.0f;
        this.bidders = new ArrayList<>();
    }

    public void registerObserver(Observer o)
    {
        bidders.add(o);
    }

    public void removeObserver(Observer o)
    {
        bidders.remove(o);
    }

    public void notifyObservers()
    {
        for (Observer bidder : bidders)
        {
            bidder.update(itemName, currentBid);
        }
    }

    public void startAuction()
    {
        System.out.println("Auction started for item: " + itemName);
    }

    public void placeBid(float bid)
    {
        if (bid > currentBid)
        {
            currentBid = bid;
            System.out.println("New bid placed: $" + bid);
            notifyObservers();
        } else
        {
            System.out.println("Bid must be higher than current bid: $" + currentBid);
        }
    }

    public void endAuction()
    {
        System.out.println("Auction ended for item: " + itemName);
        System.out.println("Sold to the highest bidder for $" + currentBid);
        notifyObservers();
    }
}
