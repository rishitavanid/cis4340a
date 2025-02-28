/******************************************************************************
 * Rule 09. Locking (LCK)
 * LCK10-J. Use a correct form of the double-checked locking idiom
 * The double-checked locking idiom is a software design pattern used to reduce the overhead of acquiring a lock by first testing the locking criterion 
 * without actually acquiring the lock. 
 
 ******************************************************************************/

public final class Client {
  private final Lock lock = new ReentrantLock();
 
  public void doSomething(File file) {
    InputStream in = null;
    try {
      in = new FileInputStream(file);
      lock.lock();
 
      // Perform operations on the open file
 
      lock.unlock();
    } catch (FileNotFoundException x) {
      // Handle exception
    } finally {
      if (in != null) {
        try {
          in.close();
        } catch (IOException x) {
          // Handle exception
        } 
      }
    }
  }
}

