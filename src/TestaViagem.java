
public class TestaViagem {
    
    public static void main(String[] args){
        Viagem minhaViagem;
        minhaViagem = new Viagem();
        minhaViagem.nome = "Raissa";
        minhaViagem.destino = "Brasilia";
        minhaViagem.poltrona = 25;
        minhaViagem.valorPassagem = 200.5;
        
       System.out.println("Valor da passagem: "+ minhaViagem.valorPassagem);
    }
}
