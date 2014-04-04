package dosna.osn.actor;

import java.util.TreeSet;

/**
 * Each actor will have many connections, here we keep track of these connections.
 *
 * @author Joshua Kissoon
 * @since 20140403
 */
public class ConnectionManager
{

    /**
     * A set of relationships of this actor;
     * we keep this set of relationships in sorted order.
     */
    private TreeSet<Relationship> connections;
    private transient Actor actor;

    /**
     * Blank constructor to be used by Serializer
     */
    public ConnectionManager()
    {

    }

    /**
     * This constructor is called when creating a new ConnectionManager object
     */
    private ConnectionManager(final Actor actor)
    {
        this.actor = actor;
        this.connections = new TreeSet<>();
    }

    /**
     * We wrap the ConnectionManager constructor that creates a new ConnectionManager object to make it explicit.
     *
     * @param actor The actor who owns this ConnectionManager object
     *
     * @return A new ConnectionManager object
     */
    public static ConnectionManager createNew(final Actor actor)
    {
        return new ConnectionManager(actor);
    }

}
