import java.util.Date;
public class AlfredQuotes {

    public String basicGreeting() {
        return "Hello, lovely to see you. How are you?";
    }

    public String guestGreeting(String name) {
    
        return "Hello" + name  + ", how are you today";
    }
    public String getCurrentDate() {
        Date date = new Date();
        return "Current date is: " + date;
    }
    public String greetEnglish(String name) {
        return "Hello, " + name;
        
    }
    public String greetSpanish(String name) {
        return "Hola, " + name;
        
    }
    public String greetSpanish(String name, String curse, int age) {
        return "Hola, " + name + curse + age;
        
    }

    public String dateAnnoucement(){
        
        Date date = new Date();
        return "This is the current date " + date + ". Im going to master what I am doing starting today"; 

    }

    public String respndBeforeAlexis(String conversation){
        return conversation;
    
    }



}