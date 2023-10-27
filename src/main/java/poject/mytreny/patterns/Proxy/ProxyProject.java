package poject.mytreny.patterns.Proxy;

public class ProxyProject implements Project{
    private String url;
    private RealRpoject realRpoject;

    public ProxyProject(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        if (realRpoject == null){
            realRpoject = new RealRpoject(url);
        }
        realRpoject.run();
    }
}
