public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private int ROWS = 5;
    
    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private int SEATS_PER_ROWS = 10;
    
    // TO DO: Create 2 dimensional array to store seat reservation status
    public int [][] seats = new int [ROWS][SEATS_PER_ROWS];
   
    
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
        seats[0][2] = 1;
        seats[1][5] = 1;
        seats[3][7] = 1;
       
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        for(int i = 0; i < ROWS; i++){
            for(int j = 0; j < SEATS_PER_ROWS; j++){
                 System.out.println(seats[i][j]);
            }
            System.out.println();
        }

    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        if (seats[ROWS][SEATS_PER_ROWS] == 0){
            seats[ROWS][SEATS_PER_ROWS] = 1;
            System.out.println("Seat booked successfully" + (ROWS + 1) + "," + (SEATS_PER_ROWS + 1));
        }else{
            System.out.println("Error" + (ROWS + 1) + "," + (SEATS_PER_ROWS) + "already booked");
        }
        
    }
}