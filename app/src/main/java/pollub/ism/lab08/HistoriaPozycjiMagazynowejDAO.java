package pollub.ism.lab08;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface HistoriaPozycjiMagazynowejDAO {

    @Insert
    public void insert(HistoriaPozycjiMagazynowej item);

    @Update
    void update(HistoriaPozycjiMagazynowej item);

    @Query("SELECT * FROM Historia WHERE ITEM= :selectedItem")
    List<HistoriaPozycjiMagazynowej> findUpdatesByItemName(String selectedItem);

    @Query("SELECT COUNT(*) FROM Historia")
    int size();

    @Query("SELECT * FROM Historia")
    List<HistoriaPozycjiMagazynowej> findAll();
}
