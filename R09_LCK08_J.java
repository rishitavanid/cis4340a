/******************************************************************************
 * Rule 09. Locking (LCK)
 * LCK10-J. Use a correct form of the double-checked locking idiom
 * The double-checked locking idiom is a software design pattern used to reduce the overhead of acquiring a lock by first testing the locking criterion 
 * without actually acquiring the lock. 
 * 
 * Non-Compliant Code 
 * public final class Client {
 * private final Lock lock = new ReentrantLock();
 * public void doSomething(File file) {
 *  InputStream in = null;
 *   try {
 *    in = new FileInputStream(file);
 *     lock.lock();
 *     // Perform operations on the open file
 *   } catch (FileNotFoundException fnf) {
 *     // Forward to handler
 *   } finally {
 *     lock.unlock();
 *     if (in != null) {
 *       try {
 *         in.close();
 *       } catch (IOException e) {
 *         // Forward to handler
 *       }
 *     }
 *   }
 * }
 * }
 * 
 ******************************************************************************/

// Compliant Code 
public final class Client {
  private final Lock lock = new ReentrantLock();
 
  public void doSomething(File file) {
    InputStream in = null;
    lock.lock();
    try {
      in = new FileInputStream(file);
      // Perform operations on the open file
    } catch (FileNotFoundException fnf) {
      // Forward to handler
    } finally {
      lock.unlock();
 
      if (in != null) {
        try {
          in.close();
        } catch (IOException e) {
          // Forward to handler
        }
      }
    }
  }
}
