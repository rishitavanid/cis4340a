/******************************************************************************
 * Rule 02. Expressions (EXP)
 * XP00-J. Do Not Ignore Values Returned By Methods
 *
 * Non-Compliant Code 
 * 
 * public void deleteFile() {
 * File someFile = new File("someFileName.txt");
 * // Do something with someFile
 * someFile.delete();
 * }
 * 
 ******************************************************************************/

// Compliant Code 

public void deleteFile() {
    File someFile = new File("someFileName.txt");
    // Do something with someFile
    if (!someFile.delete()) {
        // Handle failure to delete the file
    }
}


