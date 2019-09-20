import java.util.ArrayList;
import java.util.Scanner;

public class JobApp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input3;
        String input2;
        String input;
        String name;
        String email;
        String degree;
        String major;
        String college;
        String grad;
        String company;
        String title;
        String start;
        String end;
        String description;
        String skill;
        String rating;
        int counter = 1;
        int counter2 = 1;
        int counter3 = 1;
        ArrayList<Education> education1 = new ArrayList<>();
        ArrayList<Experience> experience1 = new ArrayList<>();
        ArrayList<Skills> skills1 = new ArrayList<>();

        System.out.println("Thank you for applying at the Krusty Krab! please enter information so we can get you started and making me money ARG ARG ARG!!!!");

        Person person = new Person();
        System.out.println("please enter your name");
        name = sc.nextLine();
        person.setName(name);

        System.out.println("please enter your email");
        email = sc.nextLine();
        person.setEmail(email);

        while(true){
            Education education = new Education();
            System.out.println("please enter educational backround.  if none enter none");
            System.out.println("please enter any degree type " + counter);
            degree = sc.nextLine();
            education.setDegree(degree);

            System.out.println("what was your major? " + counter);
            major = sc.nextLine();
            education.setMajor(major);

            System.out.println("what was your college/university name? " + counter);
            college = sc.nextLine();
            education.setCollege(college);

            System.out.println("what year did you graduate? " + counter);
            grad = sc.nextLine();
            education.setGraduation(grad);

            education1.add(education);
            System.out.println("would you like to enter in any more education? if not, please type stop.  otherwise enter any key to continue");
            input = sc.nextLine();
            if(input.equalsIgnoreCase("stop")){
                break;
            }
            counter = counter + 1;





        }

        System.out.println("please enter in work experience");

        while(true) {
            Experience experience = new Experience();

            System.out.println("what was the name of your company? " + counter2);
            company = sc.nextLine();
            experience.setCompany(company);

            System.out.println("what was your job title? " + counter2);
            title = sc.nextLine();
            experience.setTitle(title);

            System.out.println("when did you start this job? " + counter2);
            start = sc.nextLine();
            experience.setStart(start);

            System.out.println("when did you end this job? " + counter2);
            end = sc.nextLine();
            experience.setEnd(end);

            System.out.println("how would you describe this job? " + counter2);
            description = sc.nextLine();
            experience.setDescription(description);

            experience1.add(experience);

            System.out.println("would you like to add any more experience? if no type stop otherwise type any key");
            input2 = sc.nextLine();
            if(input2.equalsIgnoreCase("stop")){
                break;
            }
            counter2 = counter2 + 1;


        }
        System.out.println("please enter any skills you may have");
        while(true){
            Skills skill2 = new Skills();
            System.out.println("what is the name of your skill? " + counter3);
            skill = sc.nextLine();
            skill2.setSkill(skill);

            System.out.println("please enter the rating/proficieny of skill " + counter3);
            rating = sc.nextLine();
            skill2.setProficiency(rating);

            skills1.add(skill2);

            System.out.println("would you like to add any other skills? if no type stop otherwise type any key");
            input3 = sc.nextLine();
            if(input3.equalsIgnoreCase("stop")){
                break;
            }
            counter3 = counter3 + 1;



        }
        person.displaytext();
        counter =1;
        for(Education education : education1){
            System.out.println("Education " + counter);
            education.displaytext1();

            counter = counter + 1;

        }
        counter2 =1;
        for(Experience experience : experience1){
            System.out.println("Experience " + counter2);
            experience.displaytext2();

            counter2 = counter2 + 1;
        }
        counter3 =1;
        for(Skills skills : skills1){
            System.out.println("Skills " + counter3);
            skills.displaytext3();

            counter3 = counter3 + 1;
        }

    }
}
