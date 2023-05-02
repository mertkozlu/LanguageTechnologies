package language.technologies.business.responses;

public class GetAllSubTechnologyResponse {
    private String name;

    public GetAllSubTechnologyResponse() {
    }

    public GetAllSubTechnologyResponse(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
