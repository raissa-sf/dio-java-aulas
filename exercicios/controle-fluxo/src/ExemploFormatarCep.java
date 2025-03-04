class CepInvalidoException extends Exception {
    public CepInvalidoException() {
    }
}

public class ExemploFormatarCep {
    public static void main(String[] args) {

        try {
            String cepFormatado = formatarCep("23765064");
            System.out.println("CEP formatado: " + cepFormatado);
        } catch (CepInvalidoException e) {
          System.out.println("CEP inválido, precisa de 8 caracteres váidos");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "23.765-064";
    }
}
