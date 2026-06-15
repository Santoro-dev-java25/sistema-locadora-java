package ESTUDOSJAVA.Projects;
import ESTUDOSJAVA.Projects.CategoriaVeiculo;
public class Veiculo {


    private String placa;
    private String modelo;
    private String marca;
    private int ano;
    private double precoDiaria;
    private CategoriaVeiculo categoria;

    public Veiculo(String placa, String modelo, String marca, int ano,Double precoDiaria,CategoriaVeiculo categoria){
        this.placa = placa;
        this.modelo = modelo;
        this.marca = marca;
        this.ano = ano;
        this.precoDiaria = precoDiaria;
        this.categoria = categoria;
    }
    public String getModelo(){
        return modelo;
    }
    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
    public Integer getAno(){
        return ano;
    }
    public Double getPrecoDiaria(){
        return precoDiaria;
    }
    public CategoriaVeiculo getCategoria(){
        return categoria;
    }
    public String toString(){
        return "Modelo: "+ modelo + ","+
                "Marca: "+ marca+ ","+
                "Placa: "+ placa + ","+
                "Ano: "+ ano + ","+
                "Preco diaria: "+ precoDiaria+","+
                "Categoria: "+ categoria;

    }
}
