package ResponsesRK;

import io.restassured.response.Response;

public class StatesResponse {
    private Response response;

    public StatesResponse(Response response) {
        this.response = response;
    }

    public Response getResponse() {
        return response;
    }

    public void setResponse(Response response) {
        this.response = response;
    }

    public int getListOfStatesSize(){
        return this.response.jsonPath().getList("id").size();
    }
}
