Project to practice testng





# How to run TestNG xml from maven commands
mvn clean test -DsuiteXmlFile=demo.xml          Eclipse
mvn clean test -DsuiteXmlFile="demo.xml"        IntelliJ
mvn clean test -Dsurefire.suiteXmlFiles=testng2.xml
mvn clean install -DskipTests                 | Test will complile but will not run
mvn clean install -Dmaven.test.skip=true      | Test will not complile + not run
mvn clean install -DskipTests=true -Djib.skip=true
mvn clean verify -Dprofile=profile_name

Report : target/surefire-reports/index.html       | Only when run via cmd line



# How to make sure Build is in green successful in case Test cases failed
<plugin>
				<groupId>org.apache.maven.plugins</groupId>
				<artifactId>maven-surefire-plugin</artifactId>
				<version>3.0.0</version>
				<configuration>
						<testFailureIgnore>true</testFailureIgnore>//this will make sure mvn build is in Green in case some test case get failed
				</configuration>
</plugin>


#Custom reporter
https://rationaleemotions.wordpress.com/2015/08/24/what-are-data-providers-in-testng/
http://stackoverflow.com/questions/3945769/how-to-disable-testng-test-based-on-a-condition
http://stackoverflow.com/questions/33476985/how-to-skip-or-ignore-execution-of-tests-in-testng
http://blog.xebia.com/conditionally-running-tests-in-testng/
https://examples.javacodegeeks.com/enterprise-java/testng/testng-listeners-example/
http://test-this.ro/selenium-testng-customizing-tests-at-runtime-with-iannotationtransformer/
