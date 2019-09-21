package modelo;
import java.awt.HeadlessException;
import java.io.*;
import java.util.StringTokenizer;
import java.util.Vector;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import controlador.Item;
import java.util.Scanner;

public class ArchivoItem {
    private static Scanner x;
    Vector vPrincipal = new Vector();
    
    public static void escribirItem(String cod, String cat, String est, String fec, String mar, String nom, String stock, String ubi){
        try{
            File f=new File("src/modelo/item.txt");
            FileWriter fw;
            BufferedWriter bw;
            fw=new FileWriter(f,true);
            bw = new BufferedWriter(fw);
            bw.write(cod+"%"+nom+"%"+mar+"%"+cat+"%"+stock+"%"+est+"%"+ubi+"%"+fec);
            bw.newLine();
            bw.close();
            fw.close();
        }
        catch(Exception e){
            System.out.println(e);
        }
    }
    
    public static void borrarItem(String removeTerm){
        String tempFile = "src/modelo/temp.txt";
        File oldFile = new File("src/modelo/item.txt");
        File newFile = new File(tempFile);
        
        String currentLine;
        String data[];
        
        try {
            
            FileWriter fw = new FileWriter(tempFile,true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            
            FileReader fr = new FileReader("src/modelo/item.txt");
            BufferedReader br = new BufferedReader(fr);
            
            while ((currentLine = br.readLine()) != null){
                data = currentLine.split("%");
                if(!data[0].equalsIgnoreCase(removeTerm)){
                    pw.println(currentLine);
                }
            }
            
            pw.flush();
            pw.close();
            fr.close();
            br.close();
            bw.close();
            fw.close();
            
            oldFile.delete();
            File dump = new File("src/modelo/item.txt");
            newFile.renameTo(dump);
            
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error");
        }
        
    }
    
    
    public DefaultTableModel mostrarInv(){
        Vector cabeceras = new Vector();
        cabeceras.addElement("Codigo");
        cabeceras.addElement("Nombre");
        cabeceras.addElement("Marca");
        cabeceras.addElement("Categoria");
        cabeceras.addElement("Stock");
        cabeceras.addElement("Estado");
        cabeceras.addElement("Ubicacion");
        cabeceras.addElement("Fecha");
        DefaultTableModel modelo = new DefaultTableModel(cabeceras,0);
        try{
            File f = new File("src/modelo/item.txt");
            if(f.exists())
            {
                FileReader fr = new FileReader(f);
                BufferedReader br = new BufferedReader(fr);
                String linea;
                while((linea = br.readLine()) != null)
                {
                    StringTokenizer dato = new StringTokenizer(linea,"%");
                    Vector x = new Vector();
                    while(dato.hasMoreTokens())
                    {
                        x.addElement(dato.nextToken());
                    }
                    modelo.addRow(x);
                }
                fr.close();
                br.close();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "No se encontraron items");
            }
        }
        catch (IOException | HeadlessException e)
        {
            System.out.println(e);
        }
        return modelo;
    }
}
