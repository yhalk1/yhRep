package pack;

public class ArrayInLoop {
    public static void main(String[] args) {

        String[] nameArray = new String[]{"Bob Marley", "Eminem", "Hulk", "Iron man"};
        for (String name: nameArray)
              {
            System.out.print("Name is: " + name);
            System.out.print(", ");
        }

    }
}
