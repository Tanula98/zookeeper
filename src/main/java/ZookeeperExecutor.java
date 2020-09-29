import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

public class ZookeeperExecutor implements Watcher {
    private ZooKeeper zoo;

    @Override
    public void process(WatchedEvent watchedEvent) {

    }
}
