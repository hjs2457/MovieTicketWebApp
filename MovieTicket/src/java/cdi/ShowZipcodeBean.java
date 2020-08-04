
package cdi;

import ejb.movieEJB;
import entity.Theater;
import java.util.List;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
//ShowZipcodeBean used by MainPage to display the ShowZipcode page and used by 
//ShowZipcode page to display the theaters at this zipcode in a data table
@Named(value = "showZipcodeBean")
@ApplicationScoped
public class ShowZipcodeBean {

    @EJB
    private movieEJB movieEJB;
    private int zipcode;
    
    public ShowZipcodeBean() {
    }

    public int getZipcode() {
        return zipcode;
    }

    public void setZipcode(int zipcode) {
        this.zipcode = zipcode;
    }
    
    public String showZipcode(int zipcode){
        String zipc = zipcode+"";
        if(zipc.length()==5){
            this.zipcode = zipcode;
            return "ShowZipcode";
        }else return "";
    }

    public List<Theater> getTheaterListForZipcode(){
        try{
            this.setZipcode(zipcode);
            return movieEJB.getTheatersForZipcode(zipcode);
        }catch(Exception e){
            return null;
        }
    }

}
