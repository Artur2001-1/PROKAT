package edu.javavt19.service;
import edu.javavt19.model.CarClass;
import java.util.List;

public interface CarClassService {

    void saveOrUpdate(CarClass item);

    void delete(int itemId);

    CarClass get(int itemId);

    List<CarClass> list();
}
