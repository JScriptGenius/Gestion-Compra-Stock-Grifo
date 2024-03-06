package Controlador;

import Vista.*;
import DAO.*;
import Procesos.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.print.*;
import java.util.logging.Logger;

public class CC_Reporte extends MouseAdapter implements Printable{
    
    IU_Reporte vista;
    DAO_GenerarSolicitud crud;
    
    public CC_Reporte(IU_Reporte repor) {
        vista=repor;
        vista.jlblBUSCAR.addMouseListener(this);
        vista.jlblIMPRIMIR.addMouseListener(this);
        vista.jlblLIMPIAR.addMouseListener(this);
        vista.setTitle("REPORTE");
        vista.setLocationRelativeTo(null);
        vista.setVisible(true);
    }
    
    public int print(Graphics graphics, PageFormat pageFormat, int pageIndex) throws PrinterException {

        if (pageIndex > 0) {
            return NO_SUCH_PAGE;
        }

        Graphics2D g2d = (Graphics2D)graphics;
        g2d.translate(pageFormat.getImageableX() + 30, pageFormat.getImageableY() + 30);
        g2d.scale(0.8,0.8);
        
        vista.jpanFACTURA.printAll(graphics);

        return PAGE_EXISTS;
    }

    @Override
    public void mouseClicked(MouseEvent me){
        
        if(me.getSource()==vista.jlblBUSCAR){
         
            int ID = Integer.parseInt(vista.jtxtidsolicitud.getText());
            
            crud = new DAO_GenerarSolicitud();
            crud.obtenerDatosReporte(vista.jlblID, 
                    vista.jlblproveedor,
                    vista.jlblcombustible,
                    vista.jlbltanque,
                    vista.jlblcantidad,
                    vista.jlblfecha,ID);
        }
        
        if(me.getSource() == vista.jlblIMPRIMIR){
           
            try {
                PrinterJob job = PrinterJob.getPrinterJob();
                job.setPrintable(this);
                boolean top = job.printDialog();
                    
                if(top){
                    job.print();
                }
            } catch (PrinterException ex) {
                Logger.getLogger(ex.getMessage());
            }    
        }
        
        if(me.getSource() == vista.jlblLIMPIAR){
           ProcesosGenerarSolicitud.limpiarEntradasReporte(vista);
        }
    }
}
