package poject.mytreny.patterns.Proxy;

public class ProjectRunnerClient {
    public static void main(String[] args) {
        Project project = new ProxyProject("https://www.poject.mytreny/real");
        project.run();
    }
}
