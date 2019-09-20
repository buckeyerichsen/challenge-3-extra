public class Education {
    private String degree;
    private String major;
    private String college;
    private String graduation;

    public Education() {
    }

    public Education(String degree, String major, String college, String graduation) {
        this.degree = degree;
        this.major = major;
        this.college = college;
        this.graduation = graduation;
    }

    public String getDegree() {
        return degree;
    }

    public void setDegree(String degree) {
        this.degree = degree;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public String getCollege() {
        return college;
    }

    public void setCollege(String college) {
        this.college = college;
    }

    public String getGraduation() {
        return graduation;
    }

    public void setGraduation(String graduation) {
        this.graduation = graduation;
    }
    public void displaytext1(){
        System.out.println(getCollege());
        System.out.println(getDegree());
        System.out.println(getMajor());
        System.out.println(getGraduation());
    }
}
