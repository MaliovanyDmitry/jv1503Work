
package uits.jv1503.hometask11;


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class App {
    static String sortKey = "priority";
    
    public static void main(String[] args) {
        
        //Tickets t1 = new Tickets("Mary J.", "Piter P.", Tickets.TypeOfApplications.TECHNICAL_QUESTIONS, 
                //Tickets.Priority.THIRD, "I do not understand anything");
        //Tickets t2 = new Tickets("Nensi S.", "Sid W.", Tickets.TypeOfApplications.PROPOSALS_AND_SUGGESTIONS, 
                //Tickets.Priority.FIRST, "Can I borrow your cocaine?");
        //Tickets t3 = new Tickets("Peter P.", "Barak O.", Tickets.TypeOfApplications.QUESTIONS_ABOUT_THE_GAMEPLAY, 
                //Tickets.Priority.SECOND, "Moooom, he plays unfair!");        
        
        List<Tickets> listTickets = new ArrayList<>();
        listTickets.add(new Tickets("Mary J.", "Piter P.", Tickets.TypeOfApplications.TECHNICAL_QUESTIONS, 
                Tickets.Priority.THIRD, "I do not understand anything"));
        listTickets.add(new Tickets("Nensi S.", "Sid W.", Tickets.TypeOfApplications.PROPOSALS_AND_SUGGESTIONS, 
                Tickets.Priority.FIRST, "Can I borrow your cocaine?"));
        listTickets.add(new Tickets("Peter P.", "Barak O.", Tickets.TypeOfApplications.QUESTIONS_ABOUT_THE_GAMEPLAY, 
                Tickets.Priority.SECOND, "Moooom, he plays unfair!"));
        
        //System.out.println(listTickets.toString());
        Collections.sort(listTickets, sort);

        for (Tickets person : listTickets) {
            System.out.println(person);
        }
        
    }
    
    static Comparator<Tickets> sort = new Comparator<Tickets>() {
        @Override
        public int compare(Tickets o1, Tickets o2) {
            switch (sortKey) {
                case "priority":
                    return o1.priority.compareTo(o2.priority);
                case "client":
                    return o1.client.compareTo(o2.client);
                case "consultant":
                    return o1.consultant.compareTo(o2.consultant);
                case "type":
                    return o1.type.compareTo(o2.type);
                default:
                    return 0;
            }
        }
    };

}
    

    
    
    
    

