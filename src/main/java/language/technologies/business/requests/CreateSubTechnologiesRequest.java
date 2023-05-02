package language.technologies.business.requests;

public class CreateSubTechnologiesRequest {
    private String name;

    public CreateSubTechnologiesRequest() {
    }

    public CreateSubTechnologiesRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
