package InterfazGrafica;

import Celdas.CeldaJButton;
import Celdas.TipoDeCelda;
import ManejadoresControladores.ManejadorAnimales;
import ManejadoresControladores.ManejadorOpciones;
import ManejadoresControladores.ManejadorSiembras;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class OpcionesGrama extends javax.swing.JFrame {

    ManejadorOpciones manejadorOpciones;
    ManejadorAnimales manejadorAnimales = new ManejadorAnimales();
    ManejadorSiembras manejadorSiembras = new ManejadorSiembras();

    public OpcionesGrama(CeldaJButton celdaCliqueada, TipoDeCelda tipoDeCelda) {
        initComponents();
        this.setLocation(430, 480);
        manejadorAnimales.iniciarCerdito(cerditoItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorAnimales.iniciarGallina(galiinaItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorAnimales.iniciarOveja(ovejaItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorAnimales.iniciarVaca(vacaItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorSiembras.iniciarMaiz(maizItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorSiembras.iniciarManzano(manzanaItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorSiembras.iniciarTomate(tomateItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
        manejadorSiembras.iniciarZanahoria(zanahoriaItem, tipoDeCelda, celdaCliqueada, vidaObjetojLabel, nombreObjetojLabel, imagenObjerojLabel);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        semillasjPopUp = new javax.swing.JPopupMenu();
        zanahoriaItem = new javax.swing.JMenuItem();
        manzanaItem = new javax.swing.JMenuItem();
        tomateItem = new javax.swing.JMenuItem();
        maizItem = new javax.swing.JMenuItem();
        animalesjPopUp = new javax.swing.JPopupMenu();
        cerditoItem = new javax.swing.JMenuItem();
        ovejaItem = new javax.swing.JMenuItem();
        vacaItem = new javax.swing.JMenuItem();
        galiinaItem = new javax.swing.JMenuItem();
        vidaObjetojLabel = new javax.swing.JLabel();
        nombreObjetojLabel = new javax.swing.JLabel();
        imagenObjerojLabel = new javax.swing.JLabel();
        imagenVidajLabel = new javax.swing.JLabel();
        colocarAnimaljButton = new javax.swing.JButton();
        plantarSemillajButton = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        semillasjPopUp.setInvoker(plantarSemillajButton);

        zanahoriaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenZanahoria.png"))); // NOI18N
        zanahoriaItem.setText("Zanahoria");
        semillasjPopUp.add(zanahoriaItem);

        manzanaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenManzana.png"))); // NOI18N
        manzanaItem.setText("Manzana");
        semillasjPopUp.add(manzanaItem);

        tomateItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenTomate.png"))); // NOI18N
        tomateItem.setText("Tomate");
        semillasjPopUp.add(tomateItem);

        maizItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenMaiz.png"))); // NOI18N
        maizItem.setText("Maiz");
        semillasjPopUp.add(maizItem);

        animalesjPopUp.setInvoker(colocarAnimaljButton);

        cerditoItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenCerdito.png"))); // NOI18N
        cerditoItem.setText("Cerdito");
        animalesjPopUp.add(cerditoItem);

        ovejaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenOveja.png"))); // NOI18N
        ovejaItem.setText("Oveja");
        animalesjPopUp.add(ovejaItem);

        vacaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenVaca.png"))); // NOI18N
        vacaItem.setText("Vaca");
        animalesjPopUp.add(vacaItem);

        galiinaItem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenGallina.png"))); // NOI18N
        galiinaItem.setText("Gallina");
        animalesjPopUp.add(galiinaItem);

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        vidaObjetojLabel.setForeground(new java.awt.Color(0, 0, 0));
        vidaObjetojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(vidaObjetojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 110, 130, 40));

        nombreObjetojLabel.setForeground(new java.awt.Color(0, 0, 0));
        nombreObjetojLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        getContentPane().add(nombreObjetojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 160, 130, 40));
        getContentPane().add(imagenObjerojLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, 40, 40));

        imagenVidajLabel.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/imagenVida.png"))); // NOI18N
        getContentPane().add(imagenVidajLabel, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 40, 40));

        colocarAnimaljButton.setBackground(new java.awt.Color(0,0,0,0));
        colocarAnimaljButton.setForeground(new java.awt.Color(0, 0, 0));
        colocarAnimaljButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpcionesBoton.png"))); // NOI18N
        colocarAnimaljButton.setText("Colocar Animal");
        colocarAnimaljButton.setBorder(null);
        colocarAnimaljButton.setComponentPopupMenu(animalesjPopUp);
        colocarAnimaljButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        colocarAnimaljButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                colocarAnimaljButtonMouseReleased(evt);
            }
        });
        getContentPane().add(colocarAnimaljButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 60, 195, 40));

        plantarSemillajButton.setBackground(new java.awt.Color(0,0,0,0));
        plantarSemillajButton.setForeground(new java.awt.Color(0, 0, 0));
        plantarSemillajButton.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpcionesBoton.png"))); // NOI18N
        plantarSemillajButton.setText("Plantar Semilla");
        plantarSemillajButton.setBorder(null);
        plantarSemillajButton.setComponentPopupMenu(semillasjPopUp);
        plantarSemillajButton.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        plantarSemillajButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                plantarSemillajButtonMouseReleased(evt);
            }
        });
        getContentPane().add(plantarSemillajButton, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 10, 195, 40));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/FondoOpciones.png"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 213, 353));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void plantarSemillajButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_plantarSemillajButtonMouseReleased
        semillasjPopUp.setVisible(true);
        semillasjPopUp.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_plantarSemillajButtonMouseReleased

    private void colocarAnimaljButtonMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_colocarAnimaljButtonMouseReleased
        animalesjPopUp.setVisible(true);
        animalesjPopUp.setLocation(evt.getXOnScreen(), evt.getYOnScreen());
    }//GEN-LAST:event_colocarAnimaljButtonMouseReleased

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPopupMenu animalesjPopUp;
    private javax.swing.JMenuItem cerditoItem;
    private javax.swing.JButton colocarAnimaljButton;
    private javax.swing.JMenuItem galiinaItem;
    private javax.swing.JLabel imagenObjerojLabel;
    private javax.swing.JLabel imagenVidajLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenuItem maizItem;
    private javax.swing.JMenuItem manzanaItem;
    private javax.swing.JLabel nombreObjetojLabel;
    private javax.swing.JMenuItem ovejaItem;
    private javax.swing.JButton plantarSemillajButton;
    private javax.swing.JPopupMenu semillasjPopUp;
    private javax.swing.JMenuItem tomateItem;
    private javax.swing.JMenuItem vacaItem;
    private javax.swing.JLabel vidaObjetojLabel;
    private javax.swing.JMenuItem zanahoriaItem;
    // End of variables declaration//GEN-END:variables
}
