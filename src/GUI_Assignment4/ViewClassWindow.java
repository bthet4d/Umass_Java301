

package GUI_Assignment4;

import ClassHiearchy_Assignment3.Classroom;
import ClassHiearchy_Assignment3.DataContainer;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;

/**
 *
 * @author Bryan
 */
public class ViewClassWindow extends javax.swing.JFrame {
    
    DataContainer container;
    private DefaultTableModel tableModel;

    /**
     * Creates new form ViewClassWindow
     */
    public ViewClassWindow() {
        initComponents();
    }
    
    public ViewClassWindow(DataContainer container){
        
        initComponents();
        this.container = container;
        
        //Creat the table to hold classroom data
        String [] columnNames = {"Class Name", "Room Number", "status"};
        tableModel = new DefaultTableModel(columnNames, 0);
        
        classTable.setModel(tableModel);
        classTable.setVisible(true);
        for(Classroom room : container.getClassrooms())
        {
            char status;
            Object [] classrooms = new Object [3];
            classrooms[0] = room.getClassName();
            classrooms[1] = room.getClassroomNumber();
            status = room.getClassroomStatus();
            if(status == 'c')
                classrooms[2] = "Classroom";
            else if(status == 'l')
                classrooms[2] = "Lab";
            else
                classrooms[2] = "Lecture Hall";
            
            tableModel.addRow(classrooms);
        }
        final TableColumnModel columnModel = classTable.getColumnModel();
        for (int column = 0; column < classTable.getColumnCount(); column++) {
            int width = 50; // Min width
            for (int row = 0; row < classTable.getRowCount(); row++) {
                TableCellRenderer renderer = classTable.getCellRenderer(row, column);
                Component comp = classTable.prepareRenderer(renderer, row, column);
                width = Math.max(comp.getPreferredSize().width, width);
        }
        columnModel.getColumn(column).setPreferredWidth(width);
    }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        classPanel = new javax.swing.JScrollPane();
        classTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Classes Available");

        classTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        classPanel.setViewportView(classTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 380, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(classPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 246, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ViewClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewClassWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewClassWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane classPanel;
    private javax.swing.JTable classTable;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
