
package reto2;


public class Usuario {
    //atributos
    public String nombreUsuario;
    public int identificacion;
    public int edad;
    public String area;
    public String email;
    public double IBC;
    public double aportesSalud;
    public double aportesPension;
    public double aportesARL;
    public float salario;
    public boolean esJefe;
    public double descuento;
    
    //constructor
    public Usuario (String nombreUsuario,int identificacion, String email, int edad, String area, boolean esJefe){
        this.nombreUsuario = nombreUsuario;
        this.identificacion = identificacion;
        this.email = email;
        this.edad = edad;
        this.area = area;
        this.esJefe = esJefe;
        
        calcularSalario();
        
    }
    
    
    
    //metodos
    public void calcularSalario(){
        if (esJefe==true && area == "desarrollo"){
            salario = 4500000 + 2500000;
            descuento = salario * 0.03;
            IBC = salario * 0.40;
            aportesSalud = IBC * 0.125;
            aportesPension = IBC * 0.16;
            aportesARL = IBC *0.005;
        }
        else if (area == "desarrollo"){
            salario = 4500000;
            descuento = salario * 0.03;
            IBC = salario * 0.40;
            aportesSalud = IBC * 0.125;
            aportesPension = IBC * 0.16;
            aportesARL = IBC *0.005;
            }
        else if (esJefe==true && area == "administrativa"){
            salario = 3500000 + 3000000;
            descuento = salario * 0.03;
            IBC = salario * 0.40;
            aportesSalud = IBC * 0.125;
            aportesPension = IBC * 0.16;
            aportesARL = IBC *0.005;
        }
        else if (area == "administrativa"){
            salario = 3500000;
            IBC = salario * 0.40;
            aportesSalud = IBC * 0.125;
            aportesPension = IBC * 0.16;
            aportesARL = IBC *0.005;
            }
        salario=salario+(float)(-aportesSalud-aportesPension-aportesARL-descuento);
    }
    public void info(){
        System.out.println("Nombre: "+nombreUsuario); 
        System.out.println("Identificacion: "+identificacion);
        System.out.println("Edad: "+edad);
        System.out.println("Area: "+area);
        System.out.println("Email: "+email);
        System.out.println("IBC: "+IBC);
        System.out.println("Aportes salud: "+aportesSalud);
        System.out.println("Aportes pension: "+aportesPension);
        System.out.println("Aportes ARL: "+aportesARL);
        System.out.println("Neto a pagar: "+salario);
    }
}
