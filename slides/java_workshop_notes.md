
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







################################



