public class User implements Observer
{
    private String username;

    public User(String username)
    {
        this.username = username;
    }
    @Override
    public void update(String message, String channelName)
    {
        System.out.println(username + " received a new message in channel '" + channelName + "': " + message);
    }
}
