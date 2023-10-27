package poject.mytreny.patterns.Proxy;

public class RealRpoject implements Project{
    private String url;

    public RealRpoject(String url) {
        this.url = url;
        load();
    }

    public void load(){
        System.out.println("Loading project from " + url +"...");
    }

    @Override
    public void run() {
        System.out.println("Running project " + url + "...");
    }
}
