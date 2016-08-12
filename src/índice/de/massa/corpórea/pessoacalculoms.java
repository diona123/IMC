package índice.de.massa.corpórea;

import javax.swing.JOptionPane;

public class pessoacalculoms {

    public static void main(String args[]) {
        IMC a = new IMC();

        float ResultadoIMC;
        
        String Sexo = JOptionPane.showInputDialog("Digite o Sexo");
        String sexo = String.parseString(Sexo);

        String Peso = JOptionPane.showInputDialog("Digite o Peso");
        float peso = Float.parseFloat(Peso);
        
        String Altura = JOptionPane.showInputDialog("Digite a Altura");
        float altura = Float.parseFloat(Altura);
        
        
        
        ResultadoIMC = a.CalculoImc(peso, altura);
        System.out.println(ResultadoIMC);

        if (Sexo = 'Masculino'){
            if (ResultadoIMC <= 20.7) {
            System.out.println("Abaixo do peso");
            }
            if (ResultadoIMC >= 26.4) {
            System.out.println("Acima do peso");
            }
        }
        if (Sexo = "Feminino"){
            if (ResultadoIMC <= 19.1) {
            System.out.println("Abaixo do peso");
            }
            if (ResultadoIMC >= 25.8) {
            System.out.println("Acima do peso");
            }
        }
         
        if (18.5 < ResultadoIMC && ResultadoIMC <= 25) {
            System.out.println("Peso normal");
        }

        if (25 < ResultadoIMC && ResultadoIMC <= 30);
        System.out.println("Acima do peso normal");

        if (ResultadoIMC > 30) {
            System.out.println("Obsidade");
        }

    }
}
