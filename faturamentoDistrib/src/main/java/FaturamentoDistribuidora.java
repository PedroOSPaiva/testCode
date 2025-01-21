import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.InputStream;
import java.util.List;

public class FaturamentoDistribuidora {

    static class Faturamento {
        private int dia;
        private double valor;

        // Getters e Setters
        public int getDia() {
            return dia;
        }

        public void setDia(int dia) {
            this.dia = dia;
        }

        public double getValor() {
            return valor;
        }

        public void setValor(double valor) {
            this.valor = valor;
        }
    }

    public static void main(String[] args) {
        try {
            // Carregar o arquivo JSON do diretório resources
            ObjectMapper mapper = new ObjectMapper();
            InputStream inputStream = FaturamentoDistribuidora.class.getResourceAsStream("/faturamento.json");

            if (inputStream == null) {
                throw new RuntimeException("Arquivo faturamento.json não encontrado no diretório resources.");
            }

            List<Faturamento> faturamentos = mapper.readValue(inputStream, new TypeReference<List<Faturamento>>() {});

            double menorValor = Double.MAX_VALUE;
            double maiorValor = Double.MIN_VALUE;
            double somaValores = 0.0;
            int diasComFaturamento = 0;

            // Calcular menor, maior e soma dos valores
            for (Faturamento f : faturamentos) {
                if (f.getValor() > 0) { // Ignorar dias sem faturamento
                    menorValor = Math.min(menorValor, f.getValor());
                    maiorValor = Math.max(maiorValor, f.getValor());
                    somaValores += f.getValor();
                    diasComFaturamento++;
                }
            }

            // Calcular média mensal
            double mediaMensal = somaValores / diasComFaturamento;

            // Contar dias acima da média mensal
            int diasAcimaMedia = 0;
            for (Faturamento f : faturamentos) {
                if (f.getValor() > mediaMensal) {
                    diasAcimaMedia++;
                }
            }

            // Exibir resultados
            System.out.println("Menor valor de faturamento: R$ " + menorValor);
            System.out.println("Maior valor de faturamento: R$ " + maiorValor);
            System.out.println("Número de dias acima da média mensal: " + diasAcimaMedia);

        } catch (Exception e) {
            System.err.println("Erro: " + e.getMessage());
        }
    }
}
