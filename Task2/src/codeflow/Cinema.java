package codeflow;

public class Cinema {
    String[][] seats;

    // Række 0, sæde 0 er altid reserveret til direktøren og skal derfor have værdien X
    // Sæder, der ikke er reserveret, har værdien "O"
    public Cinema(int rows, int seats) {
        this.seats = new String[rows][seats];
        for (int i = 0; i<rows; i++){
            for(int j = 0; j<seats; j++){
                this.seats[i][j]="0";
            }
        }
        this.seats[0][0] = "X"; // N - denne linje stod over array constructor på linje 9, men jeg har byttet dem om, så den nu står på 10
    }

    public int getRows() {
        return seats[0].length; // N har indsat [0] efter seat.
    }

    public int getSeats() {
        return seats[0].length;
    }

    // If the seat is not yet reserved, it's value is O.
    // In that case, change the value to X and return true.
    // If the seat is already reserved, return false.
    public boolean reserve(int row, int seat) {
        row -= 1;
        seat -= 1;//rækker går fra 0-19 hvilket ikke er optimalt. Jeg minuser/decrement derfor.
        if (seats[row][seat].equals("0")) {
            seats[row][seat] = "X";
            return true;
        }
        return false;
    }

    public boolean cancelReservation(int row, int seat) {
        row = row-1;
        seat -= 1;//rækker går fra 0-19 hvilket ikke er optimalt. Jeg minuser/decrement derfor.
        if (seats[row][seat].equals("X")) {
            seats[row][seat] = "0";
            return true;
        }
        return false;
    }

    public String toString() {
        String result = ""; //"null" er slettet. Den er en værdi.
        for (int i = 0; i < seats.length; i++) {
            result += "|";
            for (int j = 0; j < seats[i].length; j++) {
                result += seats[i][j] + "|";
            }
            result += "\n";
        }
        return result;
    }
}