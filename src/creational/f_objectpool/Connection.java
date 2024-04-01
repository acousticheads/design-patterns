package creational.f_objectpool;

public class Connection implements AutoCloseable {

    private int connectionId;
    private boolean inUse;

    public Connection(int connectionId, boolean inUse) {
        this.connectionId = connectionId;
        this.inUse = inUse;
    }

    public int getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(int connectionId) {
        this.connectionId = connectionId;
    }

    public boolean isInUse() {
        return inUse;
    }

    public void setInUse(boolean inUse) {
        this.inUse = inUse;
    }

    @Override
    public void close() throws Exception {
        this.setInUse(false);
    }
}
