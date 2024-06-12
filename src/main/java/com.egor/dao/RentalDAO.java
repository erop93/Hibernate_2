package com.egor.dao;

import com.egor.domain.Rental;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;


public class RentalDAO extends GenericDAO<Rental> {
    public RentalDAO(SessionFactory sessionFactory) {
        super(Rental.class, sessionFactory);
    }

    public Rental getAnyUnreturnedRental() {
        Query<Rental> query = getCurrentSession().
                createQuery("SELECT r FROM Rental r WHERE r.returnDate is null", Rental.class);
        query.setMaxResults(1);
        return query.getSingleResult();
    }
}
