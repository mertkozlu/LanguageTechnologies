package language.technologies.dto.requests;

public class CreateProgrammingLanguagesRequest {
    private String name;

    public CreateProgrammingLanguagesRequest() {
    }

    public CreateProgrammingLanguagesRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}
