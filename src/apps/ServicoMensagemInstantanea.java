package apps;/* Classe pai
Os serviços de mensagem são classes filhas que herdam os atributos da classe pai.
Abstração: A classe pai não sabe como as coisas acontecem. Quem vai dizer como funcionam são as classes filhas.
No caso a classe pai define que para ser um serviço de mensagem precisam enviar e receber mensagem
Cada classe filha que tiver esse método vai fazer o método/processo do seu próprio jeito
*/

public abstract class ServicoMensagemInstantanea {
    public abstract void enviarMensagem();
    public abstract void receberMensagem();

    //mais um método que todos os filhos deverão implementar
    protected abstract void salvarHistoricoMensagem();
    //somente os filhos conhecem este método
    protected void validarConectadoInternet() {
        System.out.println("Validando se está conectado a internet");
    }
}

