package ESTUDOSJAVA.Projects;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import ESTUDOSJAVA.Projects.Veiculo;
import ESTUDOSJAVA.Projects.Reserva;
import ESTUDOSJAVA.Projects.StatusReserva;
import ESTUDOSJAVA.Projects.Cliente;
import ESTUDOSJAVA.Projects.CategoriaVeiculo;
import ESTUDOSJAVA.Projects.Pagamento;
import ESTUDOSJAVA.Projects.Locadora;
import java.util.Date;
public class SistemasDeCarros {
        static void main(String[] args) throws ParseException {
            Scanner leitor = new Scanner(System.in);
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
            Locadora locadora = new Locadora();

            System.out.println("===SISTEMA DE LOCADORA DE VEICULOS===");
            System.out.println();
            System.out.print("Digite o nome do cliente: ");
            String nome = leitor.nextLine();
            System.out.print("Digite o Cpf: ");
            String cpf = leitor.nextLine();
            System.out.print("Digite o telefone: ");
            String telefone = leitor.nextLine();
            System.out.print("Digite o email: ");
            String email = leitor.nextLine();
            Cliente cliente = new Cliente(nome,cpf,telefone,email);
            System.out.println();

            System.out.print("Digite a placa do veiculo: ");
            String placa = leitor.nextLine();
            System.out.print("Digite a marca: ");
            String marca = leitor.nextLine();
            System.out.print("Digite o modelo: ");
            String modelo = leitor.nextLine();
            System.out.print("Digite o ano: ");
            int ano = leitor.nextInt();
            System.out.print("Digite o preco da diaria: ");
            double diaria = leitor.nextDouble();
            leitor.nextLine();
            System.out.print("Categoria (SUV/INTERMEDIARIO/ECONOMICO/LUXO): ");
            String categoria = leitor.nextLine().toUpperCase();
            CategoriaVeiculo categoriaReal = CategoriaVeiculo.valueOf(categoria);
            Veiculo veiculo = new Veiculo(placa,modelo,marca,ano,diaria,categoriaReal);
            System.out.println();
            locadora.cadastrarVeiculo(veiculo);



            System.out.print("Digite a data de inicio (dd/MM/yyyy): ");
            String dataInicial = leitor.nextLine();
            Date dataInicialOficial =   sdf.parse(dataInicial);
            System.out.print("Digite a data final ( dd/MM/yyyy): ");
            String dataFinal = leitor.nextLine();
            Date dataFinalOficial = sdf.parse(dataFinal);
            long totalDias = ((dataFinalOficial.getTime() - dataInicialOficial.getTime()) / 1000);
            totalDias = totalDias/86400;
            System.out.println();

            System.out.println("===PAGAMENTO===");
            System.out.print("Forma de pagamento: ");
            String forma_Pagamento = leitor.nextLine();
            double pagamentoTotal = totalDias * diaria;
            System.out.println("valor: "+ pagamentoTotal);
            System.out.print("Confirmar pagamento (SIM/NAO): ");
            String confirmar_Pagamento = leitor.nextLine().toUpperCase();
            Pagamento pagamento = new Pagamento(pagamentoTotal,forma_Pagamento);
            if(confirmar_Pagamento.equals("SIM")){
                pagamento.confirmarPagamento();
                Reserva reserva_Concluida = new Reserva(dataInicialOficial,dataFinalOficial,totalDias,veiculo,cliente,pagamento,StatusReserva.CONFIRMADA);
                locadora.realizarReserva(reserva_Concluida);
                System.out.println();
                System.out.println("===PAGAMENTO CONFIRMADO===");
                System.out.println();
                System.out.println("===RESUMO DA RESERVA===");
                System.out.println(reserva_Concluida);
                System.out.println("Obrigado , "+ nome + "!" + " Boa viagem");


            }else{
                StatusReserva status =StatusReserva.PENDENTE;
                Reserva reserva_Pendente = new Reserva(dataInicialOficial,dataFinalOficial,totalDias,veiculo,cliente,pagamento,status);
                locadora.realizarReserva(reserva_Pendente);
                System.out.println();
                System.out.println("===PAGAMENTO PENDENTE===");
                System.out.println();
                System.out.println("===RESUMO DA RESERVA===");
                System.out.println(reserva_Pendente);



            }







        }
    }
