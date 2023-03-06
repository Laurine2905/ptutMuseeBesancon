package ptutMusee.ptutMuseeBesancon.dao;

import jakarta.persistence.Tuple;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface SalleRepository extends JpaRepository<Salle, Integer> {


    // Liste de toutes les salles
    @Query("select Salle_nom "
            + "from Salle"
            + "order by Salle_nom")
    public List<Tuple> allSalles();
}