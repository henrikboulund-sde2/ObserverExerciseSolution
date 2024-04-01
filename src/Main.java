public class Main {
    public static void main(String[] args)
    {
        Channel sportsChannel = new Channel("Sports");
        Channel newsChannel = new Channel("News");

        User user1 = new User("Alice");
        User user2 = new User("Bob");

        sportsChannel.registerObserver(user1);
        sportsChannel.registerObserver(user2);

        newsChannel.registerObserver(user2);

        sportsChannel.postMessage("New match update: Team A scored a goal!");
        newsChannel.postMessage("Breaking news: Earthquake reported in Region X");
    }
}
