import java.util.ArrayList;
import java.util.List;

public class Channel
{
    private String channelName;
    private List<Observer> subscribers;

    public Channel(String channelName)
    {
        this.channelName = channelName;
        this.subscribers = new ArrayList<>();
    }

    public void registerObserver(Observer o)
    {
        subscribers.add(o);
    }

    public void removeObserver(Observer o)
    {
        subscribers.remove(o);
    }

    public void notifyObservers(String message, String channelName)
    {
        for (Observer subscriber : subscribers)
        {
            subscriber.update(message, channelName);
        }
    }

    public void postMessage(String message)
    {
        System.out.println("Message posted to channel '" + channelName + "': " + message);
        notifyObservers(message, channelName);
    }
}
