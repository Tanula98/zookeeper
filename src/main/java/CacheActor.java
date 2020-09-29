import akka.actor.Props;

import java.util.Queue;

public class CacheActor {

    private Queue<String> serversQueue;


    static Props props() {
        return Props.create(CacheActor.class);
    }


}
