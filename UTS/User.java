import java.util.List;
import java.util.ArrayList;

    class User {
        private String email;
        private String password;
        private String fullname;
        private double balance;
        private ArrayList<Ticket> tickets;
        private int MAXTICKET;

        public User(String email, String password) {
            this.email = email;
            this.password = password;
            this.fullname = fullname;
            this.balance = balance;
            this.tickets = new ArrayList<>();
            this.MAXTICKET = MAXTICKET;
        }
    }