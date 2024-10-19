package cat.tecnocampus.filterChain;

public class Request {
    private String request;

    public Request(String request) {
        this.request = request;
    }

    public String getRequest() {
        return request;
    }

    public void concatRequest(String request) {
        this.request += request;
    }
}
