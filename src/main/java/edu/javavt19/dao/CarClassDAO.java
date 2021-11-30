package edu.javavt19.dao;

import edu.javavt19.model.CarClass;
import java.util.List;

public interface CarClassDAO{

    void saveOrUpdate(CarClass item);

    void delete(int itemId);

    CarClass get(int itemId);

    List<CarClass> list();

}

