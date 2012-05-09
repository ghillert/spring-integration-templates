Spring Integration Maven Archetypes
=======================

# Introduction

This projects provides support for Maven Archetypes to allow you to easily create Spring Integration projects from the command line using Maven. The following archetypes are currently available:

* archetype-standalone-simple

# archetype-standalone-simple

In order to create a new project using the Standalone Simple archetype execute:

    $ mvn archetype:generate -DarchetypeGroupId=org.springframework.integration.templates.maven -DarchetypeArtifactId=archetype-standalone-simple -DarchetypeVersion=1.0.0.M1

You will be asked a few question such as:

    ...
    Define value for property 'groupId': : org.springintegration.demo
    Define value for property 'artifactId': : myartifact
    Define value for property 'version':  1.0-SNAPSHOT: : 
    Define value for property 'package':  org.springintegration.demo: : 
    Confirm properties configuration:
    groupId: a.b.c
    artifactId: d
    version: 1.0-SNAPSHOT
    package: a.b.c
    Y: :
    ...

Alternative, you can also provide the parameters via the initial command: 

    $ mvn archetype:generate -DarchetypeGroupId=org.springframework.integration.templates.maven -DarchetypeArtifactId=archetype-standalone-simple -DarchetypeVersion=1.0.0.M1 -DgroupId=org.springintegration.demo -DartifactId=myartifact

After the project has been created, you can CD into the project directory and start the Spring Integration appplication using:

    $ mvn clean package exec:java

# Resources

http://maven.apache.org/guides/mini/guide-creating-archetypes.html



 