package ESTUDOSJAVA.Projects;
import ESTUDOSJAVA.Projects.Veiculo;
import  ESTUDOSJAVA.Projects.Reserva;

import java.util.ArrayList;
import java.util.List;

public class Locadora {

    private List<Veiculo> veiculos;
    private List<Reserva> reservas;

    public Locadora(){
        this.veiculos = new ArrayList<>();
        this.reservas = new ArrayList<>();
    }
    public void cadastrarVeiculo(Veiculo veiculo){
        veiculos.add(veiculo);
    }
    public void realizarReserva(Reserva reserva){
        reservas.add(reserva);
    }
    public void listar(){
        System.out.println("---VEICULOS CADASTRADOS---");
        for(Veiculo V : veiculos){
            System.out.println(V);
        }
        System.out.println("---RESERVAS REALIZADAS---");
        for(Reserva R : reservas){
            System.out.println(R);
        }
    }

}
