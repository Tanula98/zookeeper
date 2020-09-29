import akka.actor.ActorRef;
import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.List;

public class ZookeeperExecutor implements Watcher {
    private ZooKeeper zoo;

    ZookeeperExecutor(ActorRef cacheActor, int serverPort) throws IOException, KeeperException, InterruptedException {
        zoo = new ZooKeeper("127.0.0.1:2181", 5000, this);


        //собираем адрес текущего сервера
        String serverUrl = "http://" + "localhost" + ":" + serverPort;

        //регистрируемся в зоокипере
        zoo.create(
                
        );

    }


    @Override
    public void process(WatchedEvent watchedEvent) {
        try {
            List<String> serversNodes = zoo.getChildren("/servers", this);

        } catch (KeeperException | InterruptedException e) {
            e.printStackTrace();

        }
    }
}
