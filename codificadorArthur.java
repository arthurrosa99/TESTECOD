
    import java.time.LocalDate;

public class CodificadorArthur implements Codificador {
    public String getNome() {
        return "Codificador Arthur";
    }

    public LocalDate getDataCriacao() {
        return LocalDate.of(2025, 3, 13);
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
        StringBuilder decoded = new StringBuilder();

        for (char c : str.toCharArray()) {
            // Para descobrir qual regra foi aplicada, precisamos testar
            if ((char) (c - 1) == 'A') {
                decoded.append((char) (c - 1)); // Inverso de +1 no 'A'
            } else if (c % 2 == 0 && c / 2 >= 32) { 
                // Possível inverso de multiplicar por 2
                decoded.append((char) (c / 2));
            } else {
                decoded.append((char) (c - 2)); // Inverso de +2
            }
        }

        return decoded.toString();
    }
}

}
