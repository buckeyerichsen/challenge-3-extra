public class Skills {
    private String skill;
    private String proficiency;

    public Skills() {
    }

    public Skills(String skill, String proficiency) {
        this.skill = skill;
        this.proficiency = proficiency;
    }

    public String getSkill() {
        return skill;
    }

    public void setSkill(String skill) {
        this.skill = skill;
    }

    public String getProficiency() {
        return proficiency;
    }

    public void setProficiency(String proficiency) {
        this.proficiency = proficiency;
    }
    public void displaytext3(){
        System.out.println(getSkill());
        System.out.println(getProficiency());
    }
}
