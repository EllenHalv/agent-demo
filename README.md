## Demo of Java Agent with dynamic loading

Simple example of a Java Agent using VirtualMachine API to merge two programs to one single JVM process.

### How to use

1. First off you want to generate a JAR-file and change the path in Agent.java to your JAR-file path.
2. Secondly you will start Main.java and copy the PID from the terminal, then paste it into Agent.java to attatch the VM to the current JVM process.
3. Then you can run 'Agent.main()' and the two programs are now merged to the same JVM process.

### Credits

Created following Rafael Winterhalters demo: https://www.youtube.com/watch?v=ShSjzru4kZA
