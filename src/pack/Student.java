package pack;

public class Student {
    private String name;
    private int rating;

    public Student(){}

    public Student (String name, int rating){
        this.name = name;
        this.rating = rating;
    }

    public String getName() { return name;}
    public void setName(String name) { this.name = name; }

    public int getRating() { return rating; }
    public void setRating(int rating) { this.rating = rating;}


    public static boolean betterStudent (int rate1, int rate2){
        if (rate1 > rate2){
            return true;
        }
        return false;

    }

    public void toStringus (){
      System.out.println(String.format("Student name is %s  and rating is %d", this.getName(), this.getRating()));
    }

    public void changeRating(){
        this.rating = rating + 11;
        System.out.println("New rating of " + this.getName() +" is: " + this.rating);

    }

        public static void main (String[] args){
        Student st1 = new Student("John", 12);
        Student st2 = new Student("Kolya", 10);
        Student st3 = new Student("Dorko", 5);

            double average =(st1.getRating()+st2.getRating()+st3.getRating())/3;
            System.out.println("Average rating is " +average);
            st1.toStringus();
            st1.changeRating();
            st2.toStringus();
            st2.changeRating();
            st3.toStringus();
            st3.changeRating();

            double newAverage =(st1.getRating()+st2.getRating()+st3.getRating())/3;
            System.out.println("New average rating is " +newAverage);

            System.out.println("Student " + st1.getName()+ " is better? - " + betterStudent(st1.getRating(), st2.getRating()));



        }
}
