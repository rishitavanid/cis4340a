/******************************************************************************
 * Rule 02. Expressions (EXP)
 * XP00-J. Do Not Ignore Values Returned By Methods
 *
 ******************************************************************************/

public void deleteFile() {
  File someFile = new File("someFileName.txt");
  // Do something with someFile
  someFile.delete();
}

