package PracticasSemana1;

public class Juguete {
    public String especie;
    public int piezas;

    public int getPiezas() {  return piezas;  }
    public String getEspecie() {  return especie;  }

    public boolean setPiezas(int piezas){
        if(piezas > 0){
            this.piezas = piezas;
            return true;
        } else
            return false;
    }

    public boolean setEspecie(String especie){
        if(!especie.isEmpty()){
            this.especie = especie;
            return true;
        } else return false;
    }
}


