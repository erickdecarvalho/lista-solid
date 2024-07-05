package ISP;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ImpressoraImpl impressora = new ImpressoraImpl();
        ArrayList<Documento> documentos = new ArrayList<>();

        documentos.add(new Documento(1, "Documento id 1"));
        documentos.add(new Documento(2, "Documento id 2"));
        documentos.add(new Documento(3, "Documento id 3"));

        for (int i = 0; i < documentos.size(); i++) {
            impressora.imprimirDocumentos(i);
            impressora.escaneiarDocumento(i);
            impressora.faxearDocumento(i);
            System.out.println();
        }
    }
}
