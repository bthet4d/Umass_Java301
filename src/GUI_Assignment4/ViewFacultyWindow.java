
package GUI_Assignment4;

import ClassHiearchy_Assignment3.DataContainer;
import ClassHiearchy_Assignment3.Faculty;
import java.awt.Component;
import javax.swing.table.DefaultTableModel;
import java.text.SimpleDateFormat;
import javax.swing.table.TableCellRenderer;
import javax.swing.table.TableColumnModel;
/**
 *
 * @author Bryan
 */
public class ViewFacultyWindow extends javax.swing.JFrame {

    private DataContainer container; 
    private DefaultTableModel tableModel;
    /**
     * Creates new form ViewFacultyWindow
     */
    public ViewFacultyWindow() {

        initComponents();
    }
    
    public ViewFacultyWindow(DataContainer container)
    {
        initComponents();
        this.container = container;
        SimpleDateFormat formatter = new SimpleDateFormat("MM-DD-YY");
        formatter.setLenient(false);
        

        // set the table model which holds the data
        
        String [] columnNames = {"Name", "Address", "Birth Date",
                                 "Termination Date", "Hire Date",
                                 "Status", "SSN", "Salary", "Classes"};
        tableModel = new DefaultTableModel(columnNames, 0);
        
        
        facultyTable.setModel(tableModel);
        facultyTable.setVisible(true);


        for (Faculty teachers : container.getTeachers()) {
            Object[] faculty = new Object[9];
            
            faculty[0] = teachers.getName();
            faculty[1] = teachers.getAddress();
            faculty[2] = formatter.format(teachers.getDateOfBirth().getTime());
            faculty[3] = formatter.format(teachers.getDateOfTermination().getTime());
            faculty[4] = formatter.format(teachers.getDateOfHire().getTime());

            if(teachers.getStatus()== 'f')
                faculty[5] = "full time";
            else if(teachers.getStatus() == 'p')
                faculty[5] = "part time";
            
            faculty[6] = teachers.getSSN();
            faculty[7] = teachers.getSalary();

            faculty[8] = teachers.getClasses().toString();
            
            // add the ojbect to the table
            tableModel.addRow(faculty);
        }
    
        //set table column widths to longest value
        final TableColumnModel columnModel = facultyTable.getColumnModel();
        for (int column = 0; column < facultyTable.getColumnCount(); column++) {
        int width = 50; // Min width
        for (int row = 0; row < facultyTable.getRowCount(); row++) {
            TableCellRenderer renderer = facultyTable.getCellRenderer(row, column);
            Component comp = facultyTable.prepareRenderer(renderer, row, column);
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

        facultyLabel = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        facultyTable = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        facultyLabel.setText("Faculty Members");

        facultyTable.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        facultyTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Name", "Address", "SSN", "Salary", "Status", "Birth Date", "Hire Date", "Termination Date"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        facultyTable.setFillsViewportHeight(true);
        jScrollPane1.setViewportView(facultyTable);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(facultyLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 1065, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(facultyLabel)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
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
            java.util.logging.Logger.getLogger(ViewFacultyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewFacultyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewFacultyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewFacultyWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewFacultyWindow().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel facultyLabel;
    private javax.swing.JTable facultyTable;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
