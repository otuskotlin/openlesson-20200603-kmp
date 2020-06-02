group = "org.example"
version = "1.0-SNAPSHOT"

allprojects {
    repositories {
        google()
        jcenter()
        mavenCentral()
        maven("http://repository.jetbrains.com/all")
    }
}
