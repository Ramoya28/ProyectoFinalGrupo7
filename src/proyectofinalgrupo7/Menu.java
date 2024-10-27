package proyectofinalgrupo7;

import javax.swing.JOptionPane;

public class Menu {

    public void MenuPrincipal() {

        boolean continuar = true;
        int opcion;

        while (continuar) {

            opcion = Integer.parseInt(JOptionPane.showInputDialog("******************* Menú Principal *******************\n\n"
                    + "1) Configuración inicial\n"
                    + "2) Atención al cliente\n"
                    + "3) Reportes\n"
                    + "4) Salir del Programa\n\n"));

            switch (opcion) {
                case 1:
                    MenuAtencionCliente();
                    break;

                case 2:
                    ConfigInicial();
                    break;
                case 3:
                    MenuReportes();
                    break;
                case 4:
                    continuar = false;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error opcion invalida");
                    break;
            }

        }

    }

    private void ConfigInicial() {

        JOptionPane.showMessageDialog(null, "Funcion en desarrollo");

    }

    private void MenuAtencionCliente() {

        JOptionPane.showMessageDialog(null, "Funcion en desarrollo");

    }

    private void MenuReportes() {

        JOptionPane.showMessageDialog(null, "Funcion en desarrollo");

    }

}
