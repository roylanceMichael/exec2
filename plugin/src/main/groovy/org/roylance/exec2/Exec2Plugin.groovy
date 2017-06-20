package org.roylance.exec2

import org.gradle.api.Plugin
import org.gradle.api.Project

class Exec2Plugin implements Plugin<Project> {
    @Override
    void apply(Project project) {
        project.task('exec2', type:Exec2Task)
    }
}
