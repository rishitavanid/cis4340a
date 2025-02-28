/******************************************************************************
 * Rule 07. Exceptional Behavior (ERR)
 * ERR02-J. Prevent exceptions while logging data
 * Exceptions that are thrown while logging is in progress can prevent successful logging unless special care is taken. 
 * Failure to account for exceptions during the logging process can cause security vulnerabilities.
 *
 * Non-Compliant Code 
 *
 * try {
 *      // ...
 *      } catch (SecurityException se) {
 *       System.err.println(se);
 * // Recover from exception
 * }
 * 
 ******************************************************************************/

// Compliant Code 

try {
  // ...
} catch(SecurityException se) {
  logger.log(Level.SEVERE, se);
  // Recover from exception
}
