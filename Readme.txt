EJB
-movieEJB is used to execute named queries against our movie db including getting lists of Theaters, Movies, Showings for the cdi beans to use

CDI beans
-ShowZipcodeBean used by MainPage to display the ShowZipcode page and used by ShowZipcode page to display the theaters at this zipcode in a data table
-ShowTheaterBean used by ShowZipcode page to display the ShowTheater page and used by ShowTheater page to display the movies at this theater in a data table
-PaymentBean used by ShowTheaterBean to show the Payment page, used by Payment page to validate the inputs and show the Approve page and finally used by the Approve page to display information 

Entity classes
-Movie has a title (primary key), description, rating, and length
-Theater has a name (primary key), location, address and zipcode
-Showing has an id (primary key), name, title, and listimes
-Creditcard has a number, securitycode and expdate

JSF Pages
-MainPage displays the main page to enter a zipcode and images of "showing now" movies with CSS styling
-ShowZipcode displays the theaters in a data table and images of "coming soon" movies with CSS styling
-ShowTheater displays the movies at the theater in a data table and links for each time to go to the payment page
-Payment displays form to enter payment information and other details
-Approve displays digital receipt of transaction including theater, movie, and transaction information and a button to go back to the home page
