public class CinemaTicket {
    static String cinemaName = "Cinema City";
    String filmTitle;
    int row;
    int seat;
    double price;



    public CinemaTicket(String filmtitle, int row, int seat, double price){
        this.filmTitle = filmtitle;
        this.row=row;
        this.seat=seat;
        this.price=price;

    }
@Override
public String toString() {
    return "----------------\nCinema: %s\nFilm title: %s\nRow: %s\nSeat: %s\nPrice: %s\n----------------".formatted(cinemaName, filmTitle, row, seat, price);
      
}
public static void main(String[] args) {
    CinemaTicket ticket1 = new CinemaTicket("Star wars", 7, 36, 25.69);
    CinemaTicket ticket2 = new CinemaTicket("Fast and Furious 13", 3, 46, 36.99);
    System.out.println(ticket1.toString()+ticket2.toString());
}
}