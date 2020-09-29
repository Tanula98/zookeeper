import akka.actor.ActorRef;
import akka.actor.ActorSystem;

public class GetServer {

    private final ActorRef cacheActor;

    GetServer(ActorSystem system){
        cacheActor = system.actorOf(CacheActor.props(),);
    }
}
