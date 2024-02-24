public class AlfredTest {
    public static void main(String[] args){
        AlfredQuotes alfredBot = new AlfredQuotes();
        
        String testGreeting = alfredBot.basicGreeting();
        String testGuestGreeting = alfredBot.guestGreeting(" Alonzo");
        String testDate = alfredBot.dateAnnoucement();
        String testAlexis = alfredBot.respndBeforeAlexis("They wanted me to write something snarky");
        String testEnglish = alfredBot.greetEnglish("Teonna");
        System.out.println(testGreeting);
        System.out.println(testGuestGreeting);
        System.out.println(testDate);
        System.out.println(testAlexis);
        System.out.println(testEnglish);


    }
    
}