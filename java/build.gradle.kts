plugins {
    id("java")
}

group = "kim.jihyun"
version = "1.0-SNAPSHOT"

repositories {
    mavenCentral()
}

dependencies {
    testImplementation(platform("org.junit:junit-bom:5.9.1"))
    testImplementation("org.junit.jupiter:junit-jupiter")
}

tasks.test {
    useJUnitPlatform {
        includeTags("includeTag")
        excludeTags("notIncludeTag")
    }
}

tasks.withType(JavaCompile::class) {
    options.encoding="UTF-8"
}