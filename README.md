# Maven

```
<repositories>
	<repository>
		<id>jitpack.io</id>
		<url>https://jitpack.io</url>
	</repository>
</repositories>

<dependencies>
    <dependency>
        <groupId>com.github.relampagorojo93</groupId>
        <artifactId>RoyaleProtectionBlocksAPI</artifactId>
        <version>tag</version>
        <scope>provided</scope>
    </dependency>
</dependencies>
```

# Gradle

```
repositories {
	maven { url 'https://jitpack.io' }
}
dependencies {
    compileOnly "com.github.relampagorojo93:RoyaleProtectionBlocksAPI:tag"
}
```
