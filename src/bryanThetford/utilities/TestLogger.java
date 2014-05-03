/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bryanThetford.utilities;

/**
 *
 * @author Bryan
 */
public class TestLogger {

   public static void main(String[] args) {
        // ----------------------------------------------------------------
        // Test #1 - Test disable/enable logging
        System.out.println("Testing disable/enable logging");
        System.out.println("You should see four messages:");
        Logger.setDetailDebug();
        Logger.disableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Test failed, this should not print!");
        Logger.logWarning("Test failed, this should not print!");
        Logger.logError("Test failed, this should not print!");

        Logger.enableLogging();
        Logger.logDebug("Message #1");
        Logger.logInfo("Message #2");
        Logger.logWarning("Message #3");
        Logger.logError("Message #4");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #2 - Test Debug Detail
        System.out.println("Testing Debug Detail");
        System.out.println("You should see four messages:");
        Logger.setDetailDebug();
        Logger.enableLogging();
        Logger.logDebug("Message #1");
        Logger.logInfo("Message #2");
        Logger.logWarning("Message #3");
        Logger.logError("Message #4");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #3 - Test Info Detail
        System.out.println("Testing Info Detail");
        System.out.println("You should see three messages:");
        Logger.setDetailInfo();
        Logger.enableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Message #1");
        Logger.logWarning("Message #2");
        Logger.logError("Message #3");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #4 - Test Warning Detail
        System.out.println("Testing Warning Detail");
        System.out.println("You should see two messages:");
        Logger.setDetailWarning();
        Logger.enableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Test failed, this should not print!");
        Logger.logWarning("Message #1");
        Logger.logError("Message #2");
        // ----------------------------------------------------------------

        // ----------------------------------------------------------------
        // Test #5 - Test Error Detail
        System.out.println("Testing Error Detail");
        System.out.println("You should see one messages:");
        Logger.setDetailError();
        Logger.enableLogging();
        Logger.logDebug("Test failed, this should not print!");
        Logger.logInfo("Test failed, this should not print!");
        Logger.logWarning("Test failed, this should not print!");
        Logger.logError("Message #1");
        // ----------------------------------------------------------------

    }
}