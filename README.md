# objectify_guestbook_eclipse

eclipse version of the guestbook appengine example.  
- eclipse
- non-maven
- appengine

original maven version: https://cloud.google.com/appengine/docs/java/gettingstarted/usingdatastore


this details the steps to create the project.

1. create the project using appengine plugin on eclipse

2. add objectify.jar and guava.jar into web-inf/jar/ folder.  add these jar to classpath (on eclipse, select project->properties->java build path->library.  and add the two jar files)

3. all the other steps are same as detailed in https://cloud.google.com/appengine/docs/java/gettingstarted/usingdatastore
