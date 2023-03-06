package ptutMusee.ptutMuseeBesancon.entity;

import jakarta.persistence.*;

import lombok.*;

// Un exemple d'entité
// On utilise Lombok pour auto-générer getter / setter / toString...
// cf. https://examples.javacodegeeks.com/spring-boot-with-lombok/
@Getter @Setter @NoArgsConstructor @RequiredArgsConstructor @ToString
@Entity // Une entité JPA
public class Objet {
    // Identifiant technique
    @Id  @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer Objet_id;

    // Nom de la catégorie = OBLIGATOIRE
    @Column(nullable = false, unique=true)
    @NonNull
    private String Objet_nom;

    // année d'invention
    @Column(nullable = true, unique=true)
    private Integer Objet_annee;

    // nom du créateur
    @Column(nullable = true, unique=true)
    private String Objet_createur;

    // pays d'origine
    @Column(nullable = true, unique=true)
    private String Objet_pays;

    //description de l'objet
    @Column(nullable = true, unique=true)
    private String Objet_description;

    // nombre de fois qu'on possede l'objet
    @Column(nullable = true, unique=true)
    private Integer nb_Possession;

    //Photo trouvée via un URL = OBLIGATOIRE
    @Column(nullable = false, unique=true)
    @NonNull
    private String Objet_photo;

    // clé étrangere categorie = OBLIGATOIRE
    @NonNull
    @ManyToOne(optional = false) // obligatoire, la clé étrangère ne doit pas être nulle
            Categorie categorie;

    // clé étrangere salle = OBLIGATOIRE
    @NonNull
    @ManyToOne(optional = false)
    Salle salle;
}