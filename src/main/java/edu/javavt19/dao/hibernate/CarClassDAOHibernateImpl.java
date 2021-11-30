package edu.javavt19.dao.hibernate;

import edu.javavt19.dao.CarClassDAO;
import edu.javavt19.model.CarClass;
import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public class CarClassDAOHibernateImpl implements CarClassDAO {

    @Autowired
    private SessionFactory sessionFactory;

    private Session getCurrentSession() {
        return sessionFactory.getCurrentSession();
    }

    public void saveOrUpdate(CarClass item) {
        if (item.getIdClass() > 0) {
            //update
            getCurrentSession().merge(item);
        } else {
            //insert
            getCurrentSession().save(item);
        }

    }

    public void delete(int itemId) {
        CarClass carBrand = get(itemId);
        if (carBrand != null)
            getCurrentSession().delete(carBrand);
    }

    public CarClass get(int itemId) {
        CarClass carClass = (CarClass) getCurrentSession().get(CarClass.class, itemId);

        return carClass;
    }

    public List<CarClass> list() {
        Criteria criteria = getCurrentSession().createCriteria(CarClass.class);

        return criteria.list();
    }
}
