import java.util.ArrayList;

public class BeanTest {
    public static void main(String[] args) {
        ArrayList<Author> home = new ArrayList<>();
        Author author = new Author();
        author.setId(5);
        author.setFirstName("Destiney");
        author.setLastName("Rodney");

        Author author1 = new Author();
        author1.setId(6);
        author1.setFirstName("Noah");
        author1.setLastName("Boston");

        home.add(author);
        home.add(author1);

        Album fame = new Album();

        fame.setId(3);
        fame.setName("Chris");
        System.out.println(fame.getName());

        for(Author name : home) {
            System.out.println(name.getFirstName());
            System.out.println(name.getLastName());
        }
        System.out.println();

    }
}
