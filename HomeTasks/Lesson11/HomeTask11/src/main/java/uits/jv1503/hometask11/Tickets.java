
package uits.jv1503.hometask11;

public class Tickets {
    
    String client;
    String consultant;
    TypeOfApplications type;
    Priority priority;
    String application;
    
    public enum TypeOfApplications{
        QUESTIONS_ABOUT_THE_GAMEPLAY, TECHNICAL_QUESTIONS, PROPOSALS_AND_SUGGESTIONS;
    }
    
    public enum Priority{
        FIRST, SECOND, THIRD;
    }

    public Tickets(String client, String consultant, TypeOfApplications type, Priority priority, String application) {
        this.client = client;
        this.consultant = consultant;
        this.type = type;
        this.priority = priority;
        this.application = application;
    }

    public String getClient() {
        return client;
    }

    public String getConsultant() {
        return consultant;
    }

    public TypeOfApplications getType() {
        return type;
    }

    public Priority getPriority() {
        return priority;
    }

    public String getApplication() {
        return application;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public void setConsultant(String consultant) {
        this.consultant = consultant;
    }

    public void setType(TypeOfApplications type) {
        this.type = type;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public void setApplication(String application) {
        this.application = application;
    }

    @Override
    public String toString() {
        return "Ticket: [client : " + this.client + ", consultant : " + this.consultant + 
                ", type of applications : " + this.type + ", priority : " + this.priority +
                ", application : " + this.application + "]\n";
    }
    
    
}
