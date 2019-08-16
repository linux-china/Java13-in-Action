Java 13
=======

# Features

* JEP 350: Dynamic CDS Archives

```
     java -XX:ArchiveClassesAtExit=hello.jsa -cp hello.jar Hello
```
        
* 351:	ZGC: Uncommit Unused Memory
* 353:	Reimplement the Legacy Socket API

     * More maintainable & modern implementation
     * Not using stack as I/O buffer, Using NIO native code
     * Ready for new Java Concurrency Models. Fiber
     * 123% better performance than old
  
* 354:	Switch Expressions (Preview)

     * Introduce a new form of switch label, "case L ->"

* 355:	Text Blocks (Preview): formatted API
* 

# References

* JDK 13 RoadMap: https://openjdk.java.net/projects/jdk/13/
* Reimplement the Legacy Socket API: https://openjdk.java.net/jeps/353
* Support for Java 13 Preview Features in IntelliJ IDEA 2019.2: https://blog.jetbrains.com/idea/2019/07/support-for-java-13-preview-features-in-intellij-idea-2019-2/
* What’s New in Java 13: https://app.pluralsight.com/library/courses/whats-new-in-java-13/table-of-contents
