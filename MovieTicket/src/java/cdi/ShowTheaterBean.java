
package cdi;

import ejb.movieEJB;
import entity.Movie;
import entity.Showing;
import entity.Theater;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.faces.context.FacesContext;
//ShowTheaterBean used by ShowZipcode page to display the ShowTheater page and used by ShowTheater 
//page to display the movies at this theater in a data table
@Named(value = "showTheaterBean")
@ApplicationScoped
public class ShowTheaterBean {

    @EJB
    private movieEJB movieEJB;
    private Theater theater;
    private List<Movie> movies;
    private List<Showing> showings;
    private List<String> times;
    
    public ShowTheaterBean() {    
    }
    
    public Theater getTheater() {
        return theater;
    }
    
    public void setTheater(Theater theater) {
        this.theater = theater;
    }
    
    public String showTheater(Theater theater){
        this.theater=theater;
        return "ShowTheater";
    }
    
    public String backToTheater(){
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params =
                fc.getExternalContext().getRequestParameterMap();
        String name = params.get("name");
        theater = movieEJB.getTheater(name);
        return "ShowTheater";
    }
    
    public List<Movie> getMovieListForTheater(){
        return movieEJB.getMoviesForTheater(theater.getName());
    }    
    
    public void getShowingForName(){
        showings = movieEJB.getShowingByName(theater.getName());
        times = new ArrayList<String>();
        for(Showing s : showings){
            times.add(s.getListtimes());
        }
    }
    
    public List<String> getTimesForTitle(String title){
        getShowingForName();
        List<String> timesfortitle;
        for(Showing s : showings){
            if(s.getTitle().equals(title)){
                timesfortitle = Arrays.asList(s.getListtimes().split("!"));
                return timesfortitle;
            }
        }
        return null;
    }
    
    
    public String showPayment(){
        FacesContext fc = FacesContext.getCurrentInstance();
        Map<String,String> params =
                fc.getExternalContext().getRequestParameterMap();
        String name = params.get("name");
        theater = movieEJB.getTheater(name);
        return "Payment";
    }
    
    
    
    
}
