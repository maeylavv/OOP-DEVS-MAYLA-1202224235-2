package src;
public class Konser {
    // TODO: Create Private Attribute of Konser (Band Name, Date, Location, Ticket Price) then Create Setter and Getter
    private String BandName;
    private int Date;
    private String Location;
    private double TicketPrice;

// Setter

public void setBandName (String BandName){
    this.BandName = BandName;
}

public void setDate (int Date){
    this.Date = Date;
}

public void setLocation (String Location){
    this.Location = Location;
}

public void setTicketPrice (double TicketPrice){
    this.TicketPrice = TicketPrice;
}

// Getter

public String getBandName(){
    return BandName;
}

public int getDate(){
    return Date;
}

public String getLocation(){
    return Location;
}

public double getTicketPrice(){
    return TicketPrice;
   }
}