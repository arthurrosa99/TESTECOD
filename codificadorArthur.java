
    import java.time.LocalDate;

public class codificadorArthur implements Codificador {
    public String getNome() {
        return "Codificador Arthur";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 8, 11);
    }

    public int getNivelSeguranca() {
        return 1;
    }

    public String codifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c == 'A') {
                encoded.append((char) (c + 1)); // Regra para A
            } else if (c % 2 == 0) {
                encoded.append((char) (c * 2)); // Par
            } else {
                encoded.append((char) (c + 2)); // Ímpar
            }
        }

        return encoded.toString();
    }

    public String decodifica(String str) {
        StringBuilder encoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            
            if ((char) (c - 1) == 'A') {
                encoded.append((char) (c - 1));
            } else if (c % 2 == 0 ) {

                encoded.append((char) (c / 2));
            } else {
                encoded.append((char) (c - 2)); 
            }
        }

        return encoded.toString();
    }
}


