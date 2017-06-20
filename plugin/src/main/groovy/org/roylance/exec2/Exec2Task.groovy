package org.roylance.exec2

import com.roylance.exec2.Exec2Utilities
import org.gradle.api.DefaultTask
import org.gradle.api.tasks.TaskAction

class Exec2Task extends DefaultTask {
    String workingDir = System.getProperty("user.dir");
    String commandLine = "";
    String args = "";

    @TaskAction
    def run() {
        println Exec2Utilities.INSTANCE.executeProcess(
                workingDir,
                commandLine,
                args)
    }
}
