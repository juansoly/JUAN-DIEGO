package paquete_ejercicio_2;

public class veiculo {


  String marca;
  String modelo;
  double precio;

  public veiculo(String marca, String modelo, double precio) {

    this.marca = marca;
    this.modelo = modelo;
    this.precio = precio;
  }

  public double getPrecio() {
    return precio;
  }



  public void mostrardatos(){
    System.out.println("marca  :"+marca);
    System.out.println("modelo  :"+modelo);
    System.out.println("precio  :"+precio);
  }
}

