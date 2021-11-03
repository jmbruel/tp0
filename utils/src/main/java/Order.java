import java.util.List;
import java.util.LinkedList;

public class Order {

    private List<Drink> contents = new LinkedList<>();

    private String owner;
    public void setOwner(String who) { this.owner = who; }

    private String recipient;
    public void setRecipient(String who) { this.recipient = who; }

    public List<Drink> getDrinks() { return contents; }    

    @Override
    public String toString() {
        return "Order: " + owner + " / " + recipient + " / { " + contents + "}";
    }

    static class Drink {
        public Drink(String name){ this.name = name; }
        private String name;
        public String getName() { return name; }
        @Override public String toString() { return name; }
    }
    
}


