package ISP;

public class ImpressoraImpl implements Impressora, Scanner, Fax{
    @Override
    public void faxearDocumento(Integer idDocumento) {
        System.out.println("Enviando fax para: " + idDocumento);
    }
    @Override
    public void imprimirDocumentos(Integer idDocumento) {
        System.out.println("Imprimindo documento: " + idDocumento);
    }

    @Override
    public void escaneiarDocumento(Integer idDocumento) {
        System.out.println("Escaneando documento");
    }
}
