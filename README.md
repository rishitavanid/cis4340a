# CIS4340 Lab 02 - Tracking Java Security Weaknesses Using GitHub  

## Objective  
This project aims to identify and fix **Java security vulnerabilities** based on the **SEI CERT Oracle Coding Standard for Java**. The repository contains **10 Java programs**—5 **mandatory vulnerabilities** and 5 **user-selected vulnerabilities**. Each vulnerability is tracked through **GitHub version control**.

---

## Assignment Overview  
1. **Upload the non-compliant (vulnerable) code first** and commit it to the repository.  
2. **Edit the file to fix the vulnerability** and commit the corrected version in a separate branch.  
3. **Merge the fix into `main`**, ensuring GitHub tracks all changes.  
4. **Submit the GitHub repository link via WebCourses**.

---

## Repository Structure  
cis4340-security-vulnerabilities

R00_IDS03_J.java # Rule 00: Do not log unsanitized user input

R01_DCL00_J.java # Rule 00: Prevent class initialization cycles

R02_XP00_J.java  # Rule 02: Do not ignore values returned by methods

R03_NUM03_J.java # Rule 03: Use integer types that can fully represent unsigned data

R04_STR03_J.java # Rule 04: Do not encode noncharacter data as a string

R05_OBJ03_J.java # Rule 05: Prevent heap pollution

R06_MET01_J.java # Rule 06: Never use assertions to validate method arguments

R07_ERR02_J.java # Prevent exceptions while logging data

R08_VNA03_J.java # Do not assume that a group of calls to independently atomic methods is atomic

R09_LCK08_J.java # Use a correct form of the double-checked locking idiom

README.md # Documentation for the assignment

---

## SEI CERT Oracle Coding Standard Vulnerabilities  

### Mandatory Vulnerabilities**  
| Rule No. | Rule Description | Filename |  
|----------|-----------------|----------|  
| 00 | Do not log unsanitized user input | `R00_IDS03_J.java` |  
| 02 | Do not ignore values returned by methods | `R02_XP00_J.java` |  
| 03 | Use integer types that can fully represent unsigned data | `R03_NUM03_J.java` |  
| 04 | Do not encode noncharacter data as a string | `R04_STR03_J.java` |  
| 06 | Never use assertions to validate method arguments | `R06_MET01_J.java` |

### User-Selected Vulnerabilities**  
In addition to the **5 mandatory vulnerabilities**, the repository contains **5 additional vulnerabilities**, each selected from a **different rule set**.  

---

## Instructions for GitHub Tracking  

1. **Create a new repository on GitHub** (private).  
2. **Upload the non-compliant code** in a branch named `edits`.  
3. **Merge `edits` into `master`** to track the initial version.  
4. **Fix the vulnerability** in master branch, ensuring the corrected version replaces the vulnerable code.

---

