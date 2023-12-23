public class Cashier extends Bioskop {
    // TO DO : Create a method to print ticket
    public void printTicket(User user) {
        boolean isBooked = false;
        for(int i = 0; i < super.seats.length; i++){
            for(int j = 0; j <super.seats[i].length; j++){
                if(!((i == 0 & j == 2) || (i == 1 & j == 5) || (i == 3 & j == 7))){
                    if(super.seats[i][j]==1){
                        isBooked = true;
                        System.out.println("Printing Ticket...");
                        System.out.println("==================");
                        System.out.println("Name : " + user.getName());
                        System.out.println("Phone Number :" + user.getnoHandPhone());
                        System.out.println("Seat :" + seats);
                        System.out.println("Enjoy the movie!");
                    }

                }
            
            }
        }
    }

    
}

