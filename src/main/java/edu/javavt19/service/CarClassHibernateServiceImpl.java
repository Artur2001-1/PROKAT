package edu.javavt19.service;
import edu.javavt19.dao.CarClassDAO;
import edu.javavt19.model.CarClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;
@Service("carClassHibernateService")
@Transactional(readOnly=false, value = "hibernateTransactionManager")

/**
 * класс CarClass для Hibernate
 */
public class CarClassHibernateServiceImpl implements CarClassService {
    @Autowired
    @Qualifier("getCarClassHibernateDAO")
    private CarClassDAO carClassDAO;

    /**
     *  Добавляет новый brand машины в базу данных или обновляет существующий.
     * @param item - Элемент, который необходимо добавить или обновить.
     */
    public void saveOrUpdate(CarClass item) {
        carClassDAO.saveOrUpdate(item);
    }

    /**
     *  Удаляет brand по id из базы данных.
     * @param itemId - id элемента brand для удаления
     */
    public void delete(int itemId) {
        carClassDAO.delete(itemId);
    }

    /**
     *  Возвращает элемент из таблицы brand.
     * @param itemId - id элемента brand.
     */
    public CarClass get(int itemId) {
        return carClassDAO.get(itemId);
    }

    /**
     *  Метод для возврата всех элементов таблицы brand
     *  @return List объектов brand
     */
    public List<CarClass> list() {
        return carClassDAO.list();
    }
}

