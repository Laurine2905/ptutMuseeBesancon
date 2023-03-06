package ptutMusee.ptutMuseeBesancon.dao;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategorieRepository extends JpaRepository<Categorie, Integer> {


    // Liste de toutes les categories
    @Query("select Categorie_nom "
            + "from Categorie"
            + "order by Categorie_nom")
    public List<Tuple> allCategorie();
}