import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
    
        return "Hello" + name  + ", how are you today";
    }

    public String dateAnnoucement(){
        
        Date date = new Date();
        return "This is the new" + date + ". Im going to master what I am doing starting today"; 

    }

    public String respndBeforeAlexis(String conversation){
        return conversation;
    }


}