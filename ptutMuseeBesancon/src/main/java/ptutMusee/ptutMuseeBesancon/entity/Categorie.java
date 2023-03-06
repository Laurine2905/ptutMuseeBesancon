package ptutMusee.ptutMuseeBesancon.entity;


import jakarta.persistence.*;

import lombok.*;

import java.util.ArrayList;
import java.util.List;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Categorie {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Categorie_id;

    // Nom de la catégorie = OBLIGATOIRE
    @Column(nullable = false, unique=true)
    @NonNull
    private String Categorie_nom;

    // description de la categorie
    @Column(nullable = true, unique=true)
    private String Categorie_description;

    //Photo trouvée via un URL = OBLIGATOIRE
    @Column(nullable = false, unique=true)
    @NonNull
    private String Categorie_photo;

    // il y a 0* objets dans une categorie
    @OneToMany(mappedBy="categorie")
    @ToString.Exclude // On ne veut pas inclure la liste des objets dans le toString
    private List<Objet> objets = new ArrayList<>();
}
