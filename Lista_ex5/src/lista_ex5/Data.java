
package lista_ex5;

public class Data {
    //atributos
    private int dia;
    private int mes;
    private int ano;
    
    
    //construtor

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }
    
    //metodos

    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public String getData(){
        return dia + "/" + mes + "/" + ano;
    }

    @Override
    public String toString() {
        return "Data{" + "dia=" + dia + ", mes=" + mes + ", ano=" + ano + '}';
    }
    
}
