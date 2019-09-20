public class Experience {
    private String company;
    private String title;
    private String start;
    private String end;
    private String description;

    public Experience() {
    }

    public Experience(String company, String title, String start, String end, String description) {
        this.company = company;
        this.title = title;
        this.start = start;
        this.end = end;
        this.description = description;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getStart() {
        return start;
    }

    public void setStart(String start) {
        this.start = start;
    }

    public String getEnd() {
        return end;
    }

    public void setEnd(String end) {
        this.end = end;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
    public void displaytext2(){
        System.out.println(getCompany());
        System.out.println(getTitle());
        System.out.println(getStart());
        System.out.println(getEnd());
        System.out.println(getDescription());
    }
}
