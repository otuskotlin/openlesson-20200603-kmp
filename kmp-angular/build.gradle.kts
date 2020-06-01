plugins {
  id("com.github.node-gradle.node") version "2.2.4"
  id("com.crowdproj.plugins.jar2npm") version "2.0.0"
}

node {
  download = true
}

dependencies {
  implementation(project(":kmp-common"))
}

tasks {
  val ngBuild by creating(com.moowork.gradle.node.npm.NpxTask::class) {
    dependsOn(yarnSetup)
    dependsOn(jar2npm)
    command = "ng"
    setArgs(listOf("build"))
  }
  val ngStart by creating(com.moowork.gradle.node.npm.NpxTask::class) {
    dependsOn(ngBuild)
    command = "ng"
    setArgs(listOf("serve"))
  }


}


