import akka.actor.AbstractActor;
import akka.actor.Props;

import java.util.Queue;

public class CacheActor extends AbstractActor {

    private Queue<String> serversQueue;


    static Props props() {
        return Props.create(CacheActor.class);
    }


    @Override
    public Receive createReceive() {
        return Receive. ;
    }
}
