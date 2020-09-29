import akka.actor.ActorRef;
import akka.actor.ActorSystem;
import akka.http.javadsl.Http;
import akka.http.javadsl.server.Route;
import akka.http.javadsl.model.HttpRequest;
import akka.http.javadsl.model.HttpResponse;



public class GetServer {

    private final ActorRef cacheActor;

    GetServer(ActorSystem system) {
        cacheActor = system.actorOf(CacheActor.props(), "cacheActor");
    }

    public ActorRef getCacheActor() {
        return cacheActor;
    }

    

}
