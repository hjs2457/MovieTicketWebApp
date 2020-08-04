
package cdi;

import ejb.movieEJB;
import entity.Creditcard;
import entity.Movie;
import entity.Theater;
import java.util.ArrayList;
import javax.ejb.EJB;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
//-PaymentBean used by ShowTheaterBean to show the Payment page, used by Payment page to validate the inputs and 
//show the Approve page and finally used by the Approve page to display information 
@Named(value = "paymentBean")
@ApplicationScoped
public class PaymentBean {

    @EJB
    private movieEJB movieEJB;
    
    private Creditcard creditcard;

    private String time;
    private String showday;
    
    private Movie movie;
    private Theater theater;
    
    private String number;
    private String securitycode;
    private String expdate;
    
    private int numTickets;
    private int price;
    
    private String result;

    public PaymentBean() {
    }
    
    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getSecuritycode() {
        return securitycode;
    }

    public void setSecuritycode(String securitycode) {
        this.securitycode = securitycode;
    }

    public String getExpdate() {
        return expdate;
    }

    public void setExpdate(String expdate) {
        this.expdate = expdate;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getShowday() {
        return showday;
    }

    public void setShowday(String showday) {
        this.showday = showday;
    }

    public Movie getMovie() {
        return movie;
    }

    public void setMovie(Movie movie) {
        this.movie = movie;
    }

    public Theater getTheater() {
        return theater;
    }

    public void setTheater(Theater theater) {
        this.theater = theater;
    }

    public int getNumTickets() {
        return numTickets;
    }

    public void setNumTickets(int numTickets) {
        this.numTickets = numTickets;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
    
    public String showPayment(String time, Movie m, Theater t){
        this.time = time;
        this.movie = m;
        this.theater = t;
        numTickets = 1;
        price = numTickets * 10;
        return "Payment";
    }
    
    public Creditcard getCreditcardByNumber(String number) throws Exception{
        return movieEJB.getCreditcardByNumber(number);
    }
    
    public String validate(){
        ArrayList<String> days = new ArrayList<String>();
        days.add("SUNDAY");
        days.add("MONDAY");
        days.add("TUESDAY");
        days.add("WEDNESDAY");
        days.add("THURSDAY");
        days.add("FRIDAY");
        days.add("SATURDAY");
        try{
            creditcard = this.getCreditcardByNumber(number);
            if(creditcard==null){
                result="Credit card information is invalid or number of tickets is not a positive integer or day is invalid";
                return "";
            }
            else if(creditcard!=null && 
                    creditcard.getExpdate().equals(expdate) && 
                    creditcard.getSecuritycode().equals(securitycode) && 
                    numTickets>0 && 
                    days.contains(showday.toUpperCase())){
                showday = showday.toUpperCase();
                result="";
                price = 10*numTickets;
                return "Approve";
            }
            else{
                result="Credit card information is invalid or number of tickets is not a positive integer or day is invalid";
                return "";
            }
        }catch(Exception e){
            result="Credit card information is invalid or number of tickets is not a positive integer or day is invalid";
            return "";
        }
    }    
}
