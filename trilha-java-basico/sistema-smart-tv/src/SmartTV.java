public class SmartTV{
boolean ligada=false;
int canal = 1;
int volume = 25;

public void ligar(){
    ligada=true;
}

public void deligar(){
    ligada=false;
}

public void aumentarVolume(){
    volume++;
}


public void diminuirVolume(){
    volume--;
}


}