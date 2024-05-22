package org.example;

import com.sun.tools.attach.AgentInitializationException;
import com.sun.tools.attach.AgentLoadException;
import com.sun.tools.attach.AttachNotSupportedException;
import com.sun.tools.attach.VirtualMachine;

import java.io.IOException;

public class Agent {
    // Note that the 'agentmain' method has a String parameter instead of a standard main method with an array parameter.
    public static void agentmain(String agentargs) throws InterruptedException {
        while (!Thread.interrupted()) {
            Thread.sleep(2_000);
            System.out.println("Hello Agent!");
        }
    }

    // Here we use VirtualMachine API to merge two programs/JAR-files to one JVM process.
    public static void main(String[] args) throws AgentLoadException, IOException, AgentInitializationException, AttachNotSupportedException {
        VirtualMachine vm = VirtualMachine.attach("279892"); // Change this id to match your PID
        try {
            vm.loadAgent("C:/Users/ellen/IdeaProjects/agent-demo/target/agent-demo-1.0-SNAPSHOT.jar");
        } finally {
            vm.detach();
        }
    }
}
