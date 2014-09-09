
#################################

- Welcome and introduction
- My self - worked with gradle for 2-3 years. Especially android.
- Ask for experience in the audience
- What do people expect to get out of the workshop
- Motivation - Be able to migrate from Maven to Gradle

- Build tools introduction. (Ant, Maven, Gradle)
- Gradle introduction


################################


Task 1 - Setup and installation

Download from: http://www.gradle.org/downloads
Unzip
Add gradle to PATH


###############################



Topics:
Gradle version (2.0)
Gradle wrapper
Gradle init (Migrate from Maven pom.xml to build.gradle)
Incremental build
Build scripts
Tasks
Plugins
Testing
Dependency management
Multi-Project builds

Bonus or extras
- Publishing artifacts?

################################

Essential Files and Directories

build.gradle
The build script(s).

settings.gradle
Defines the project structure. Mostly useful for multi-project builds.

build/
The default build output directory.

################################

Essential Commands

gradle tasks
Shows which tasks are available.

gradle clean
Deletes any build outputs.

gradle build
Performs a "full" build.

gradle clean build
Performs a "full" clean build. Not the same as gradle build clean.




################################


Buildscript:
The buildScript block determines which plugins, task classes, and other classes are available for use in the rest of the build script. Without a buildScript block, you can use everything that ships with Gradle out-of-the-box. If you additionally want to use third-party plugins, task classes, or other classes (in the build script!), you have to specify the corresponding dependencies in the buildScript block.

###############################

Tasks:

- Getting started.
Download and install gradle.
Play around, gradle add to path:  export PATH=~/gradle_home/bin:$PATH
gradle tasks, gradle --help


- Look at the output structure.


Task 2)
Create a simple java unit test and build and test it with gradle
Get familiar with the default sources


Task 3) 
Migrate an existing Maven project to be build to gradle. (Restify)
Verify that it runs.

Task 4) 
Migrate an existing Maven project to gradle using gradle init (in incubation), DropWizard


Task 5)
Create a custom task to copy output to a seperate location

Task 6)
Getting to know the gradle wrapper

Task 7) 
Task dependency

Task 8)
Multi-Project builds



################

EXSTRA:

# Install java 8
sudo add-apt-repository ppa:webupd8team/java
sudo apt-get update
sudo apt-get install oracle-java8-installer

# Change java version

