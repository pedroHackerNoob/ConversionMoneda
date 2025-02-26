package mx.itson.edu.conversionmoneda.test;

import mx.itson.edu.conversionmoneda.config.Opciones;

public class Integracion {
    Opciones opciones = new Opciones();
    public void iniciar() {
        banner();
        opciones.operarMonedaDinero();
        //automatizar
//        iniciar();
    }
    private void banner(){
        System.out.println("""
                #     #                                    #     # #     # ###### \s
                ##   ##  ####  #    # ###### #   #         #     # #     # #     #\s
                # # # # #    # ##   # #       # #          #     # #     # #     #\s
                #  #  # #    # # #  # #####    #           ####### #     # ###### \s
                #     # #    # #  # # #        #           #     # #     # #     #\s
                #     # #    # #   ## #        #           #     # #     # #     #\s
                #     #  ####  #    # ######   #           #     #  #####  ###### \s
                                                   #######           \s""");
    }
}
