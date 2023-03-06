package ptutMusee.ptutMuseeBesancon.entity;


import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class MultimediaObj {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer MultimediaCat_id;

    // description complémentaire de l'objet
    @Column(nullable = true, unique=true)
    private String descriptionObj;

    //Photo trouvée via un URL
    @Column(nullable = true, unique=true)
    private String URL_photoObj;

    //Audio trouvé via un URL Youtube
    @Column(nullable = true, unique=true)
    private String URL_audioObj;

    //Video trouvée via un URL Youtube
    @Column(nullable = true, unique=true)
    private String URL_videoObj;

    // clé étrangere objet = OBLIGATOIRE
    @NonNull
    @ManyToOne(optional = false)
    Objet objet;
}