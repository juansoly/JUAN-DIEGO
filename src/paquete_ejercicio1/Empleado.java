package paquete_ejercicio1;


    // Definición de la clase Empleado
    class Empleado {
         String nombre;
         int edad;
         double salario;


        public Empleado(String nombre, int edad, double salario) {
            this.nombre = nombre;
            this.edad = edad;
            this.salario = salario;
        }


        public String getNombre() {
            return nombre;
        }

        public int getEdad() {
            return edad;
        }

        public double getSalario() {
            return salario;
        }


        public void aumentarSalario() {
            if (this.salario < 3000) {
                this.salario *= 1.10;
            }
        }
        public void mostrarDatos(){
            System.out.println("EL nombre del trabajdar es :"+nombre);
            System.out.println("La edad del trabajador es :"+edad);
            System.out.println("EL sueldo del trabajador es :"+salario);


        }



        }






