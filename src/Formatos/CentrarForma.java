package Formatos;

import java.awt.Dimension;
import javax.swing.*;

public class CentrarForma {
    
    public static void CPanel(JDesktopPane descp,JInternalFrame ifrm){
        Dimension desktopSize = descp.getSize();
        Dimension jifSize = ifrm.getSize();
        ifrm.setLocation((desktopSize.width - jifSize.width)/2,(desktopSize.height - jifSize.height)/2);
    }
}
