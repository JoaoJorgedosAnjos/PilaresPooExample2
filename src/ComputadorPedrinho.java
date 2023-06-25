public class ComputadorPedrinho {
    public static void main(String[] args) {
        //abrindo MSN Messenger
        System.out.println("MSN");
        MSNMessenger msn = new MSNMessenger();
        msn.enviarMensagem();
        msn.receberMensagem();

        System.out.println("FACEBOOK");
        FacebookMessenger fbm = new FacebookMessenger();
        fbm.enviarMensagem();
        fbm.enviarMensagem();

        System.out.println("TELEGRAM");
        Telegram tlg = new Telegram();
        tlg.enviarMensagem();
        tlg.enviarMensagem();
    }
}