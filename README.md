# Eclipse Dirigible™ 

[![Build Status](https://img.shields.io/jenkins/s/https/ci.eclipse.org/dirigible/job/dirigible-nightly.svg?maxAge=2592000)](https://ci.eclipse.org/dirigible/job/dirigible-nightly/)
[![Build Status](https://secure.travis-ci.org/eclipse/dirigible.png)](http://travis-ci.org/eclipse/dirigible)
[![Eclipse License](http://img.shields.io/badge/license-Eclipse-brightgreen.svg)](https://github.com/eclipse/dirigible/blob/master/LICENSE)
[![Download Dirigible](https://img.shields.io/badge/download-releases-green.svg)](http://download.eclipse.org/dirigible/)
[![Maven Central](https://img.shields.io/maven-central/v/org.eclipse.dirigible/dirigible-server-all.svg)](https://search.maven.org/#search%7Cga%7C1%7Corg.eclipse.dirigible)
[![GitHub contributors](https://img.shields.io/github/contributors/eclipse/dirigible.svg)](https://github.com/eclipse/dirigible/graphs/contributors)
[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Feclipse%2Fdirigible.svg?type=shield)](https://app.fossa.io/projects/git%2Bgithub.com%2Feclipse%2Fdirigible?ref=badge_shield)


**Eclipse Dirigible** is an Integrated Development Environment as a Service (IDEaaS) for dynamic applications. It provides both development tools and runtime environment.

<p align="center">
  <img src="https://github.com/eclipse/dirigible/blob/master/logo/dirigible-logo-symbol.png" width="60%" alt="dirigible logo"/>
</p>

> Enjoy Programming Like Never Before

From the end user's perspective (developer), Dirigible runs directly in the browser, therefore does not require any downloads or installations.

From the service provider's perspective (PaaS/SaaS), Dirigible packs all required components in a self-contained software bundle that can be deployed in any Java-based web server, such as Tomcat, Jetty, JBoss.

Dirigible supports access to RDBMS via JDBC. Currently supported versions for RDBMS are HANA, MaxDB, Sybase ASE, PostgreSQL, MySQL, H2, and Derby.

Dirigible promotes the In-System Programing development model, where you make dynamic alteration of the live system. To provide the self-contained bundle serving all the needed features for a business application, Dirigible packs various engines such as ActiveMQ, Quartz, Lucene, Flowable, Mylyn, Rhino, V8 and others.

The project started as an internal SAP initiative to address the extension and adaption use-cases related to SOA and Enterprise Services.

- [Try](#trial)
- [Get Started](#get-started)
	- [Download](#download)
	- [Build](#build)
	- [Run](#run)
		- [Desktop](#desktop)
		- [Tomcat](#tomcat)
		- [CloudFoundry](#cloudfoundry)
- [Additional Information](#additional-information)
	- [License](#license)
	- [Contributors](#contributors)
	- [References](#references)
		
## Instant Trial

You can try the sandbox instance to have a quick look on the functionality you are interested [http://trial.dirigible.io](http://trial.dirigible.io).

## Get Started

### Download

The "fast-track" - you can download the precompiled binaries produced from the Hudson builds from [http://download.eclipse.org/dirigible](http://download.eclipse.org/dirigible) and skip the build section.

Nevertheless, we highly recommend building the binaries from source in order to have all experimental features that are not available in the releases.

### Build

##### Prerequisites

- [Git](http://git-scm.com/)
- [Maven 3.5.x](http://maven.apache.org/docs/3.5.3/release-notes.html)


##### Steps

1. Clone the [project repository - master branch](https://github.com/eclipse/dirigible/tree/master) or [download the latest 3.x sources](https://github.com/eclipse/dirigible/archive/master.zip).
2. Go to the root folder.
3. Build the project with:

        mvn clean install

The build should pass successfully. The produced WAR files under target sub-folder `releng` are ready to be deployed. There are separated deployable artifacts (WAR files) depending on the usage type. There is also an executable JAR file under the `releng/desktop-all/target` folder with name like `dirigible-desktop-all-3.1.4.jar`


### Run

#### Desktop

##### Steps

1. Take the JAR file you have built in the previous step e.g. `dirigible-desktop-all-3.1.4.jar`.
2. Execute from command line

	java -jar dirigible-desktop-all-3.1.4.jar
	
3. Open a web browser and go to:

        http://localhost:8080


#### Tomcat

The Tomcat specific WAR files can be deployed on [Tomcat](http://tomcat.apache.org/) web container. In this case the built-in Derby database is used.

More information about how to deploy on Tomcat can be found [here](http://tomcat.apache.org/tomcat-8.0-doc/appdev/deployment.html).

##### Steps

1. Take the WAR file you have built in the previous step `ROOT.war`.
2. Configure Users store:

        <tomcat-users>
                <role rolename="Developer"/>
                <role rolename="Operator"/>
                <role rolename="Everyone"/>
                <user username="dirigible" password="dirigible" roles="Developer,Operator,Everyone"/>
        </tomcat-users>

3. Open a web browser and go to:

        http://localhost:8080

4. Login with dirigible/dirigible.


#### Docker

##### Prerequisites

- [Install Docker](https://docs.docker.com/engine/installation/)

##### Steps
      
1. Pull the already built container from Docker Hub

        docker pull dirigiblelabs/dirigible-trial
        
2. Start the container

        docker run -p 8888:8080 dirigiblelabs/dirigible-trial <&- &

3. Open a web browser and go to:

        http://localhost:8888/
        
4. Optionally you can enhance and customize the Dockerfile from [here](https://github.com/eclipse/dirigible/blob/master/org.eclipse.dirigible/org.eclipse.dirigible.parent/releng/docker/)

## Additional Information

### License

This project is copyrighted by [SAP SE](http://www.sap.com/) and is available under the [Eclipse Public License v 1.0](https://www.eclipse.org/legal/epl-v10.html). See [LICENSE.txt](LICENSE.txt) and [NOTICE.txt](NOTICE.txt) for further details.


[![FOSSA Status](https://app.fossa.io/api/projects/git%2Bgithub.com%2Feclipse%2Fdirigible.svg?type=large)](https://app.fossa.io/projects/git%2Bgithub.com%2Feclipse%2Fdirigible?ref=badge_large)

### Contributors

If you like to contribute to Dirigible, please read the [Contributor's guide](CONTRIBUTING.md).

### References

- Project Home
[http://www.dirigible.io](http://www.dirigible.io)

- Help Portal
[http://help.dirigible.io](http://www.dirigible.io/help) 

- Samples
[http://samples.dirigible.io](http://samples.dirigible.io)

- Trial Instance
[http://trial.dirigible.io](http://trial.dirigible.io) or [http://dirigible.eclipse.org](http://dirigible.eclipse.org)

- Mailing List
[https://dev.eclipse.org/mailman/listinfo/dirigible-dev](https://dev.eclipse.org/mailman/listinfo/dirigible-dev)

- Issues
[https://github.com/eclipse/dirigible/issues](https://github.com/eclipse/dirigible/issues)

