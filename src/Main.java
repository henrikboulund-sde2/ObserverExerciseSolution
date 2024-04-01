public class Main {
    public static void main(String[] args)
    {
        Auctioneer auctioneer = new Auctioneer("Antique Watch");
        Bidder bidder1 = new Bidder("John");
        Bidder bidder2 = new Bidder("Alice");

        auctioneer.registerObserver(bidder1);
        auctioneer.registerObserver(bidder2);

        auctioneer.startAuction();
        auctioneer.placeBid(50.0f); // John places bid
        auctioneer.placeBid(60.0f); // Alice places bid
        auctioneer.placeBid(55.0f); // John places another bid
        auctioneer.endAuction();
    }
}
