@Entity
@Table(name = "Employe")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "TypeE", discriminatorType = DiscriminatorType.STRING)
@DiscriminatorValue("Employe")
public class Employe implements Serializable {
    // ...
}
