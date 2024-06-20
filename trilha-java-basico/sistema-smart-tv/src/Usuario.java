public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTV smartTV = new SmartTV();

        System.out.println("TV ligada? " + smartTV.ligada);
        System.out.println("Canal Atual: " + smartTV.canal);
        System.out.println("Volume Atual: " + smartTV.volume);

        smartTV.ligar();
        System.out.println("Novo Status -> TV ligada? " + smartTV.ligada);

        smartTV.aumentarVolume();
        System.out.println("Aumentando volume para: " + smartTV.volume);

    }
}
