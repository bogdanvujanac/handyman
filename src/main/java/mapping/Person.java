package mapping;
import javax.persistence.*;

@Entity
@Table(name = "Person")
public class Person {
    @Id
    @Column(name = "id", nullable = false)
    private int Id;

    @Column(name = "name", nullable = false)
    private String Name;

    @Column(name = "surname", nullable = false)
    private String Surname;

    @Column(name = "email", nullable = true)
    private String Email;

    @Column(name = "password", nullable = false)
    private String Password;

    @Column(name = "username", nullable = false)
    private String Username;

    public Person() {}
}
