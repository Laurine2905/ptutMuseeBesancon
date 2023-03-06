package ptutMusee.ptutMuseeBesancon.entity;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class MultimediaCat {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MultimediaCat_id;

    // description complémentaire de la categorie
    @Column(nullable = true, unique=true)
    private String descriptionCat;

    //Photo trouvée via un URL
    @Column(nullable = true, unique=true)
    private String URL_photoCat;

    //Audio trouvé via un URL Youtube
    @Column(nullable = true, unique=true)
    private String URL_audioCat;

    //Video trouvée via un URL Youtube
    @Column(nullable = true, unique=true)
    private String URL_videoCat;

    // clé étrangere categorie = OBLIGATOIRE
    @NonNull
    @ManyToOne(optional = false)
    Categorie categorie;
}