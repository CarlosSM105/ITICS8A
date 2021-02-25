package menuop;
//menu de opciones de promedio de 3 calificaciones
import javax.swing.JOptionPane;
public class MenuOp {

    public static void main(String[] args) {
        
        int opcion=0;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("<<<<<<<<<menu>>>>>>>>>>"
                    +"\n1.-promedio de 3 calificaciones"
                    +"\n2.-tabla de multiplicar de un número"
                    +"\n3.-imprimir del 1 al 100"
                    +"\n4.-salir"));
            switch(opcion){
                case 1:
                    int cal1,cal2,cal3;
                    JOptionPane.showMessageDialog(null, "serie");
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "serie");
                    break;
                case 3:
                    JOptionPane.showMessageDialog(null, "serie");
                    break;
                case 4:
                    JOptionPane.showMessageDialog(null, "serie");
                    break;
                
                default: 
                    JOptionPane.showMessageDialog(null, "serie");
                    break;
            }
        }while(opcion !=4);
    }
    
}
