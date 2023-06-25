package apps;

//Facebook
public class FacebookMessenger extends ServicoMensagemInstantanea {
    public void enviarMensagem() {
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }
    public void receberMensagem() {
        System.out.println("Recebendo mensagem pelo Facebook Messenger");
        salvarHistoricoMensagem();
    }

    @Override
    protected void salvarHistoricoMensagem() {
        System.out.println("Histórico salvo Facebook");
    }
}