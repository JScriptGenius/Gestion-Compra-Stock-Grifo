package Principal;

import Controlador.*;
import Vista.*;

public class Main {
    
    public static IU_Reporte iu_rport;
    public static CC_Reporte cc_rport;
    
    public static IU_RegistrarCombustible iu_rc;
    public static CC_RegistrarCombustible cc_rc;

    public static IU_RegistrarTanque iu_rt;
    public static CC_RegistrarTanque cc_rt;

    public static IU_RegistrarProveedor iu_rprov;
    public static CC_RegistrarProveedor cc_rprov;

    public static IU_GenerarSolicitud iu_gs;
    public static CC_GenerarSolicitud cc_gs;

    public static IU_RecogerPedido iu_rp;
    public static CC_RecogerPedido cc_rp;

    public static IU_RecepcionarPedido iu_rped;
    public static CC_RecepcionarPedido cc_rped;

    public static IU_CerrarCompra iu_ccom;
    public static CC_CerrarCompra cc_ccom;

    public static IU_GestionarTanque iu_gt;
    public static CC_GestionarTanque cc_gt;

    public static IU_MenuPrincipal iu_mp;
    public static CC_MenuPrincipal cc_mp;

    public static IU_Registrarse iu_reg;
    public static CC_Registrarte cc_reg;

    public static IU_IniciarSesion iu_log;
    public static CC_IniciarSesion cc_log;

    public static void main(String[] args) {

        iu_log = new IU_IniciarSesion();
        cc_log = new CC_IniciarSesion(iu_log);
    }
}
