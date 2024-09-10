package paquete_ejercicio_2;

import java.util.Scanner;

public class main {
    public  static  void main(String[]args){
        veiculo[]Veiculos= {

                new veiculo("toyota", "2015", 4000),
                new veiculo("suzuki", "2022", 3800),
                new veiculo("nissan", "2007", 1500)



        };
        for (veiculo veiculo : Veiculos){
            if(veiculo.getPrecio()>=2500 && veiculo.getPrecio()<=4000){
                veiculo.mostrardatos();
            }
        }



    }
}
