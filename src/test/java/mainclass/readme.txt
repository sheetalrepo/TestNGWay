Problem:
How can a manual team run testng project without setting up eclipse

Solution:
1. Run testng from main class
2. All path should be system specific not project specific i.e. C://
3. Export runnable jar
4. Create a folder > add jar + testng.xml + gecko driver
5. Create a batch file and include jar -jar abc.jar inside batch file
6. double click batch file and testng cases will get execute