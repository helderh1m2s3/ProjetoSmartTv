
public class SmartTv {

    boolean ligada = false;
    int canal = 3;
    int volume = 15;

    public void Ligar() 
    {
        ligada = true;
    }

    public void Desligar() 
    {
        ligada = false;
    }

    public int aumentarVolume() 
    {
        volume++;
        return volume;
    }

    public int diminuirVolume() 
    {
        volume--;
        return volume;
    }

    public void mudarCanal(int novoCanal) 
    {
        canal = novoCanal;
    }
    public void aumentarCanal() 
    {
        canal++;
    }

    public void diminuirCanal() 
    {
        canal--;
    }
}