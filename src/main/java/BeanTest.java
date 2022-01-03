import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        ArrayList<Author> team = new ArrayList<>();
        Author author = new Author();
        author.setId(5);
        author.setFirstName("Destiney");
        author.setLastName("Rodney");

        Author author1 = new Author();
        author1.setId(6);
        author1.setFirstName("Noah");
        author1.setLastName("Boston");

        team.add(author);
        team.add(author1);

        for(Author name : team) {
            System.out.println(name.getFirstName());
            System.out.println(name.getLastName());
        }
        System.out.println();

    }
}
