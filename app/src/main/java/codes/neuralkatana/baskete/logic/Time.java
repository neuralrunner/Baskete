package codes.neuralkatana.baskete.logic;

public class Time {
    private int pontuacaoTime;

    public Time(){
        this.pontuacaoTime = 0;
    }
    public Time(int pontuacao){
        this.pontuacaoTime = pontuacao;
    }
    public void tresPontos(){
        this.pontuacaoTime = this.pontuacaoTime+3;
    }
    public void doisPontos(){
        this.pontuacaoTime = this.pontuacaoTime+2;
    }
    public void tiroLivre(){
        this.pontuacaoTime++;
    }
    public int getPontuacaoTime(){
        return this.pontuacaoTime;
    }
}
