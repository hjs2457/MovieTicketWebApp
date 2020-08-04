
package ejb;

import javax.ejb.Stateless;
import entity.Theater;
import entity.Movie;
import entity.Showing;
import entity.Creditcard;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


//movieEJB is used to execute named queries against our movie db including getting lists of 
//Theaters, Movies, Showings for the cdi beans to use
@Stateless
public class movieEJB {

    @PersistenceContext(unitName = "MovieTicketPU")
    private EntityManager em;

    public void persist(Object object) {
        em.persist(object);
    }
    
    public List<Theater> findAllTheaters(){
        return em.createNamedQuery("Theater.findAll", Theater.class).getResultList();
    }
    
    public List<Movie> getMoviesForTheater(String name){
        return em.createNamedQuery("Theater.findShowingMovies", Movie.class)
                .setParameter("name", name).getResultList();
    }
    
    public List<Theater> getTheatersForZipcode(int zipcode){
        return em.createNamedQuery("Theater.findByZipcode", Theater.class)
                .setParameter("zipcode", zipcode).getResultList();
    }
    
    public Theater getTheater(String name){
        return em.createNamedQuery("Theater.findByName", Theater.class)
                .setParameter("name", name).getSingleResult();
    }
    
    public List<Showing> getShowingByName(String name){
        return em.createNamedQuery("Showing.findByName", Showing.class)
                .setParameter("name", name).getResultList();
    }
    
    public Creditcard getCreditcardByNumber(String number) throws Exception{
        return em.createNamedQuery("Creditcard.findByNumber", Creditcard.class)
                .setParameter("number", number).getSingleResult();
    }
    
}
